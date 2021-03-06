package br.com.alura;

import br.com.alura.dao.TesteHttpDAO;
import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Curso;
import br.com.alura.modelo.Turma;
import br.com.alura.servico.AlunoServico;
import br.com.alura.servico.TurmaServico;

import java.io.IOException;
import java.net.URISyntaxException;
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
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {

        AlunoServico alunoServico = new AlunoServico();
        TurmaServico turmaServico = new TurmaServico();
        TesteHttpDAO dao = new TesteHttpDAO();

        var alunos = alunoServico.listar().stream()
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

        Optional<Aluno> alunoRecuperado = alunoServico.listarPorCpf(000L)
                .or(() -> alunoServico.listarPorCpf(1111L))
                .or(() -> alunoServico.listarPorCpf(89232443232L));

        System.out.println("aluno recuperado = "+alunoRecuperado.get());

        //http
        dao.testaConexaoHttp();
        dao.testaConexaoHttp2();
    }
}
