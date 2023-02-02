import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(c1);
        System.out.println(c1);
        System.out.println(m1);


    }
}