package br.com.alura;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author george on 29/12/2019
 * @project Novidades-Java-11
 */
public class Principal {
    public static void main(String[] args) {

        AlunoServico alunoServico = new AlunoServico();

        List<String> alunos = alunoServico.listar().stream()
                    .flatMap(a -> Stream.ofNullable(a.getNome()))
                    .map(s -> s.toUpperCase())
                    .collect(Collectors.toList());

        System.out.println(alunos);
    }
}
