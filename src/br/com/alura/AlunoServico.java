package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author george on 29/12/2019
 * @project Novidades-Java-11
 */
public class AlunoServico {

    Aluno joao = new Aluno("Joao", 89232443232L);
    Aluno fernanda = new Aluno("Fernanda", 23243434233L);
    Aluno aluno = new Aluno(null, 232434354L);

    public List<Aluno> listar() {
        List<Aluno> alunos = List.of(joao, fernanda, aluno);
        return alunos;
    }

}
