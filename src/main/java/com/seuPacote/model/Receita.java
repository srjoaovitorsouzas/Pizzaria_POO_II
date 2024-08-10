package com.seuPacote.model;

public class Receita {
    private int id;
    private String recIngredPizza;
    private String suco;

    public Receita(int id, String recIngredPizza, String suco) {
        this.id = id;
        this.recIngredPizza = recIngredPizza;
        this.suco = suco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecIngredPizza() {
        return recIngredPizza;
    }

    public void setRecIngredPizza(String recIngredPizza) {
        this.recIngredPizza = recIngredPizza;
    }

    public String getSuco() {
        return suco;
    }

    public void setSuco(String suco) {
        this.suco = suco;
    }

    @Override
    public String toString() {
        return "Receita [ID=" + id + ", RecIngredPizza=" + recIngredPizza + ", Suco=" + suco + "]";
    }
}
