package entities;

import entities.enums.StatusDoPedido;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private LocalDateTime momento;
    private StatusDoPedido statusDoPedido;
    private Cliente cliente;

    private List<ItemDoPedido> itensDoPedido = new ArrayList<>();

    public Pedido(LocalDateTime momento, StatusDoPedido statusDoPedido, Cliente cliente) {
        this.momento = momento;
        this.statusDoPedido = statusDoPedido;
        this.cliente = cliente;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
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
