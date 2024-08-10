package com.seuPacote.model;

public class Administrador {
    private int id;
    private String senha;

    public Administrador(int id, String senha) {
        this.id = id;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Administrador [ID=" + id + ", Senha=" + senha + "]";
    }
}
