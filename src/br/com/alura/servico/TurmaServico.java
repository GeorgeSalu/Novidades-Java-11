package br.com.alura.servico;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Curso;
import br.com.alura.modelo.Turma;

import java.time.LocalDate;
import java.util.List;

/**
 * @author george on 29/12/2019
 * @project Novidades-Java-11
 */
public class TurmaServico {

    AlunoServico alunoServico = new AlunoServico();
    CursoServico cursoServico = new CursoServico();

    public List<Turma> listar() {
        return List.of(
               new Turma(LocalDate.of(2019,06,10), LocalDate.of(2019, 06, 17), cursoServico.listar().get(0), alunoServico.listar()),
                new Turma(LocalDate.of(2019,06,18), LocalDate.of(2019, 06, 17), cursoServico.listar().get(0), alunoServico.listar())
        );
    }

}
