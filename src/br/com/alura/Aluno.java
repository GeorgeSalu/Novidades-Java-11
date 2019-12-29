package br.com.alura;

/**
 * @author george on 29/12/2019
 * @project Novidades-Java-11
 */
public class Aluno {

    public Aluno(String nome, Long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    private String nome;
    private Long cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
