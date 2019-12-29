package br.com.alura.servico;

import br.com.alura.modelo.Curso;

import java.util.List;

/**
 * @author george on 29/12/2019
 * @project Novidades-Java-11
 */
public class CursoServico {

    Curso java = new Curso("java OO","Conceitos basicos de OO", "12 horas");
    Curso spring = new Curso("Spring", "Novidades do spring", "12 horas");
    Curso ejb = new Curso("EJB", "EJB avancado", "16 horas");

    public List<Curso> listar() {
        List<Curso> cursos = List.of(java, spring, ejb);
        return cursos;
    }

}
