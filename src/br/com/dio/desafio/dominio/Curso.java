package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int carga_horaria;


    public Curso() {

    }

    @Override
    public double calcularXp() {
        return xp_padrao * getCarga_horaria();
    }


    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    @Override
    public String toString() {
        return "\nTitulo do curso: " + this.getTitulo() +
               "\nDescrição do curso: " + this.getDescricao() +
               "\nCarga horária: " + this.getCarga_horaria() +
               "\nXP recebido: " + this.calcularXp();
    }
}

