import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTitulo("Curso de Java");
        c1.setDescricao("descrição do curso de Java");
        c1.setCarga_horaria(40);

        Curso c2 = new Curso();
        c2.setTitulo("Curso de JavaScript");
        c2.setDescricao("descrição do curso de JavaScript");
        c2.setCarga_horaria(20);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria de Python");
        m1.setDescricao("descrição da mentoria de Python");
        m1.setData(LocalDate.now()); // LocalDate.now <- atribui a data atual

       /* System.out.println(c1);
        System.out.println(c1);
        System.out.println(m1); */

        Bootcamp b1 = new Bootcamp();
        b1.setNome("Bootcamp Java Developer");
        b1.setDescricao("descrição do Bootcamp");
        b1.getConteudos().add(c1);
        b1.getConteudos().add(c2);
        b1.getConteudos().add(m1);

        Dev d1 = new Dev();
        d1.setNome("Nathan");
        d1.inscreverBootcamp(b1);
        System.out.println("Conteúdos inscritos Nathan: " + d1.getConteudosInscritos());
        d1.progredir();
        System.out.println("Conteúdos inscritos Nathan: " + d1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Nathan: " + d1.getConteudosConcluidos());

        System.out.println("-----------------------------");

        Dev d2 = new Dev();
        d2.setNome("Arthur");
        d2.inscreverBootcamp(b1);
        System.out.println("Conteúdos inscritos Arthur: " + d2.getConteudosInscritos());
        d1.progredir();
        System.out.println("Conteúdos inscritos Arthur: " + d2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Arthur: " + d2.getConteudosConcluidos());



    }
}