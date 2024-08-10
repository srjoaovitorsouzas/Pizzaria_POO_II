package com.seuPacote.model;

public class CadastrarFuncionario {
    private int id;
    private String cadastroFuncionario;

    public CadastrarFuncionario(int id, String cadastroFuncionario) {
        this.id = id;
        this.cadastroFuncionario = cadastroFuncionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCadastroFuncionario() {
        return cadastroFuncionario;
    }

    public void setCadastroFuncionario(String cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
    }

    @Override
    public String toString() {
        return "CadastrarFuncionario [ID=" + id + ", CadastroFuncionario=" + cadastroFuncionario + "]";
    }
}
