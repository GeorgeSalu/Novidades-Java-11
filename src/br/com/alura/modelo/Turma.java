package br.com.alura.modelo;

import java.time.LocalDate;
import java.util.List;

/**
 * @author george on 29/12/2019
 * @project Novidades-Java-11
 */
public class Turma {

    private LocalDate inicio;
    private LocalDate fim;
    private Curso curso;
    private List<Aluno> alunos;

    public Turma(LocalDate inicio, LocalDate fim, Curso curso, List<Aluno> alunos) {
        this.inicio = inicio;
        this.fim = fim;
        this.curso = curso;
        this.alunos = alunos;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "inicio=" + inicio +
                ", fim=" + fim +
                ", curso=" + curso +
                ", alunos=" + alunos +
                '}';
    }
}
