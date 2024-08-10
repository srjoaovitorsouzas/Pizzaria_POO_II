package com.seuPacote.model;

public class Financas {
    private int id;
    private double lucro;
    private double gastos;

    public Financas(int id, double lucro, double gastos) {
        this.id = id;
        this.lucro = lucro;
        this.gastos = gastos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    @Override
    public String toString() {
        return "Financas [ID=" + id + ", Lucro=" + lucro + ", Gastos=" + gastos + "]";
    }
}
