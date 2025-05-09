package br.com.oficinamecanica.model;

public class Veiculo {
    private String placa;
    private String modelo;
    private Cliente cliente;

    public Veiculo(String placa, String modelo, Cliente cliente) {
        this.placa = placa;
        this.modelo = modelo;
        this.cliente = cliente;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
