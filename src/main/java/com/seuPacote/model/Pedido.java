package com.seuPacote.model;

public class Pedido {
    private int id;
    private String pedido;
    private double preco;
    private String codPedido;

    public Pedido(int id, String pedido, double preco, String codPedido) {
        this.id = id;
        this.pedido = pedido;
        this.preco = preco;
        this.codPedido = codPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    @Override
    public String toString() {
        return "Pedido [ID=" + id + ", Pedido=" + pedido + ", Preço=" + preco + ", CodPedido=" + codPedido + "]";
    }
}
