package br.com.oficinamecanica.model;

import java.time.LocalDateTime;

public class Agendamento {
    private Veiculo veiculo;
    private Servico servico;
    private Mecanico mecanico;
    private LocalDateTime dataHora;

    public Agendamento(Veiculo veiculo, Servico servico, Mecanico mecanico, LocalDateTime dataHora) {
        this.veiculo = veiculo;
        this.servico = servico;
        this.mecanico = mecanico;
        this.dataHora = dataHora;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
