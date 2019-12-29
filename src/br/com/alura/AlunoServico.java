package br.com.alura;

import java.util.ArrayList;
import java.util.List;

/**
 * @author george on 29/12/2019
 * @project Novidades-Java-11
 */
public class AlunoServico {

    Aluno joao = new Aluno("Joao", 89232443232L);
    Aluno fernanda = new Aluno("Fernanda", 23243434233L);

    public List<Aluno> listar() {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(joao);
        alunos.add(fernanda);

        return alunos;
    }

}
