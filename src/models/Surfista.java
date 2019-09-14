package models;

public class Surfista {

    private String nome, nickname, nacionalidade;
    private int idade;

    public Surfista() {

    }

    public Surfista(String nome, String nickname, int idade, String nacionalidade) {
        this.nome = nome;
        this.nickname = nickname;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
