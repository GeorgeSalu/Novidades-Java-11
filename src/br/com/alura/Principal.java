package br.com.alura;

/**
 * @author george on 29/12/2019
 * @project Novidades-Java-11
 */
public class Principal {
    public static void main(String[] args) {

        AlunoServico alunoServico = new AlunoServico();
        alunoServico.listar().stream().forEach(System.out::println);

    }
}
