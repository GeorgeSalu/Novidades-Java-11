package br.com.alura;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Curso;
import br.com.alura.modelo.Turma;
import br.com.alura.servico.AlunoServico;
import br.com.alura.servico.TurmaServico;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author george on 29/12/2019
 * @project Novidades-Java-11
 */
public class Principal {
    public static void main(String[] args) {

        AlunoServico alunoServico = new AlunoServico();
        TurmaServico turmaServico = new TurmaServico();

        List<String> alunos = alunoServico.listar().stream()
                    .flatMap(a -> Stream.ofNullable(a.getNome()))
                    .map(s -> s.toUpperCase())
                    .collect(Collectors.toList());

        System.out.println(alunos);

        Map<Curso, List<Turma>> turmasPorCurso = turmaServico.listar().stream()
                .filter(a -> LocalDate.of(2019,06,10).equals(a.getInicio()))
                .collect(Collectors.groupingBy(Turma::getCurso));

        System.out.println("Relacao de turmas por curso "+turmasPorCurso);


        Map<Curso, List<Turma>> turmasPorCursoData = turmaServico.listar().stream()
                .collect(Collectors.groupingBy(Turma::getCurso,
                        Collectors.filtering(a -> a.getInicio().equals(LocalDate.of(2019,01,04)), Collectors.toList())));

        System.out.println(turmasPorCursoData);

        //Optional
        Optional<Aluno> aluno = alunoServico.listarPorCpf(892324432L);
        aluno.ifPresentOrElse(System.out::println,
                () -> System.out.println("Nao a aluno cadastrado"));

    }
}
