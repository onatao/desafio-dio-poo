package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;


    public Mentoria() {

    }

    @Override
    public double calcularXp() {
        return xp_padrao + 20d;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nTitulo da mentoria: " + this.getTitulo() +
                "\nDescrição da mentoria: " + this.getDescricao() +
                "\nData: " + this.getData() +
                "\nXP recebido: " + this.calcularXp();
    }
}
