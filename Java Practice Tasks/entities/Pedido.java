package entities;

import entities.enums.StatusDoPedido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private LocalDateTime momentoPedido;
    private StatusDoPedido statusDoPedido;
    private Cliente cliente;

    private List<ItemDoPedido> itensDoPedido = new ArrayList<>();

    public Pedido(LocalDateTime momentoPedido, StatusDoPedido statusDoPedido, Cliente cliente) {
        this.momentoPedido = momentoPedido;
        this.statusDoPedido = statusDoPedido;
        this.cliente = cliente;
    }

    public LocalDateTime getMomentoPedido() {
        return momentoPedido;
    }

    public void setMomentoPedido(LocalDateTime momentoPedido) {
        this.momentoPedido = momentoPedido;
    }

    public StatusDoPedido getStatusDoPedido() {
        return statusDoPedido;
    }

    public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
        this.statusDoPedido = statusDoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemDoPedido> getItensDoPedido() {
        return itensDoPedido;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append("Sumario do pedido: " + "\n");
        sb.append("Momento do pedido: ");
        sb.append(momentoPedido.format(DateTimeFormatter.ofPattern("dd/MM/yyyy kk:mm:ss")) + "\n");
        sb.append("Status do pedido: ");
        sb.append(statusDoPedido + "\n");
        sb.append("Cliente: " + cliente.getNomeCliente() + " " + cliente.getAniversarioCliente() + " - " + cliente.getEmailCliente() + "\n");
        sb.append("Itens do pedido: " + "\n");

        for (ItemDoPedido item : itensDoPedido) {
            sb.append(item.toString() + "\n");
        }

        sb.append("Preço total: " + total());
        return sb.toString();
    }

    public void addPedido(ItemDoPedido itemDoPedido) {
        itensDoPedido.add(itemDoPedido);
    }

    public void removerPedido(ItemDoPedido itemDoPedido) {
        itensDoPedido.remove(itemDoPedido);
    }

    public Double total() {
        double soma = 0;

        for (ItemDoPedido itemDoPedido : itensDoPedido) {
            soma += itemDoPedido.subTotal();
        }

        return soma;
    }
}
