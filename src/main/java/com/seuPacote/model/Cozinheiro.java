package com.seuPacote.model;

public class Cozinheiro {
    private int id;
    private String prepararPedido;

    public Cozinheiro(int id, String prepararPedido) {
        this.id = id;
        this.prepararPedido = prepararPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrepararPedido() {
        return prepararPedido;
    }

    public void setPrepararPedido(String prepararPedido) {
        this.prepararPedido = prepararPedido;
    }

    @Override
    public String toString() {
        return "Cozinheiro [ID=" + id + ", PrepararPedido=" + prepararPedido + "]";
    }
}
