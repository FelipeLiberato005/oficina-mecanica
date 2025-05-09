package br.com.oficinamecanica.model;

public class Mecanico {
    private String nome;
    private String especialidade;
    private String telefone;

    public Mecanico(String nome, String especialidade, String telefone) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }


    public String getTelefone(){
        return telefone;
    }
}


