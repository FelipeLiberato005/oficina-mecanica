package br.com.oficinamecanica;
import br.com.oficinamecanica.model.Cliente;
import br.com.oficinamecanica.model.Veiculo;
import br.com.oficinamecanica.model.Mecanico;
import br.com.oficinamecanica.model.Servico;
import br.com.oficinamecanica.model.Agendamento;
import java.time.LocalDateTime;

    //criando classe do main quem vai receber os valores do agendamento
    //exemplo: nome do cliente; modelo e placa do veiculo; nome do mecanico; e o serviço que sera executado pelo mecanico
public class Main {
    public static void main(String[] args) {
        // Estou criando um cliente
        Cliente cliente = new Cliente("Felipe Liberato", "123.456.789-00", "2411486827", "felipeliberato22@gmail.com");
        // Estou criando um veiculo que vai estar ligado ao cliente
        Veiculo veiculo = new Veiculo("HET-132", "Meriva", cliente);
        cliente.adicionarVeiculo(veiculo);
        //Criando o mecanico que fara reparo do veiculo
        Mecanico mecanico = new Mecanico("Memphis Depay", "Motor", "543.678.112-00");
        //Criando um serviço
        Servico servico = new Servico("Troca de óleo", 150.0);
        //Criando o agendamento do reparo
        Agendamento agendamento = new Agendamento(
            veiculo,
            servico,
            mecanico,
            LocalDateTime.now()
        );
        // Fazendo exbir os dados para realizar o agendamento
        System.out.println(" Agendar Trabalho");
        System.out.println("Cliente: " + cliente.getNome() + " - " + cliente.getCpf() + " - " + cliente.getTelefone() + " - " + cliente.getEmail());
        System.out.println("Veículo: " + veiculo.getModelo() + " - " + veiculo.getPlaca());
        System.out.println("Mecânico: " + mecanico.getNome() + " (Especialidade: " + mecanico.getEspecialidade() + ")" + " - " + mecanico.getTelefone());
        System.out.println("Serviço: " + servico.getDescricao() + " - R$" + servico.getPreco());
        System.out.println("Data do agendamento: " + agendamento.getDataHora());
    }
}
