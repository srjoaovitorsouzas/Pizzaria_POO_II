package com.seuPacote.model;

public class Cliente {
    private int id;
    private String fazerPedido;
    private double pagar;
    private String avaliar;

    public Cliente(int id, String fazerPedido, double pagar, String avaliar) {
        this.id = id;
        this.fazerPedido = fazerPedido;
        this.pagar = pagar;
        this.avaliar = avaliar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFazerPedido() {
        return fazerPedido;
    }

    public void setFazerPedido(String fazerPedido) {
        this.fazerPedido = fazerPedido;
    }

    public double getPagar() {
        return pagar;
    }

    public void setPagar(double pagar) {
        this.pagar = pagar;
    }

    public String getAvaliar() {
        return avaliar;
    }

    public void setAvaliar(String avaliar) {
        this.avaliar = avaliar;
    }

    @Override
    public String toString() {
        return "Cliente [ID=" + id + ", FazerPedido=" + fazerPedido + ", Pagar=" + pagar + ", Avaliar=" + avaliar + "]";
    }
}