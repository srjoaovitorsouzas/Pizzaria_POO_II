package com.seuPacote.model;

public class Insumos {
    private int id;
    private String nomeMarca;
    private int quantidade;
    private int avisoInsumoMinimo;

    public Insumos(int id, String nomeMarca, int quantidade, int avisoInsumoMinimo) {
        this.id = id;
        this.nomeMarca = nomeMarca;
        this.quantidade = quantidade;
        this.avisoInsumoMinimo = avisoInsumoMinimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getAvisoInsumoMinimo() {
        return avisoInsumoMinimo;
    }

    public void setAvisoInsumoMinimo(int avisoInsumoMinimo) {
        this.avisoInsumoMinimo = avisoInsumoMinimo;
    }

    @Override
    public String toString() {
        return "Insumos [ID=" + id + ", NomeMarca=" + nomeMarca + ", Quantidade=" + quantidade + ", AvisoInsumoMinimo=" + avisoInsumoMinimo + "]";
    }
}
