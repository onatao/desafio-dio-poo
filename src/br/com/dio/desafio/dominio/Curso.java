package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo, descricao;
    private int carga_horaria;


    public Curso() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String toString() {
        return "\nTitulo do curso: " + this.getTitulo() +
               "\nDescrição do curso: " + this.getDescricao() +
               "\nCarga horária: " + this.getCarga_horaria();
    }
}

