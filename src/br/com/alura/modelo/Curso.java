package br.com.alura.modelo;

/**
 * @author george on 29/12/2019
 * @project Novidades-Java-11
 */
public class Curso {

    public String nome;
    public String ementa;
    public String cargaHoraria;

    public Curso(String nome, String ementa, String cargaHoraria) {
        this.nome = nome;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", ementa='" + ementa + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                '}';
    }
}
