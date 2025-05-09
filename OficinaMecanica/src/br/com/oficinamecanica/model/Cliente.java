package br.com.oficinamecanica.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private List<Veiculo> veiculos;

    public Cliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.veiculos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail(){
        return email;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
}
