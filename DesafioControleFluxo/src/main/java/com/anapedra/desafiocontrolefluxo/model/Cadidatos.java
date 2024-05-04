package com.anapedra.desafiocontrolefluxo.model;



import java.io.Serializable;
import java.util.Objects;

public class Cadidatos implements Serializable {
    private static final long serialVersionUID = 1L;


    private String nome;
    private Integer idade;
    private Double salarioPretendido;


    public Cadidatos() {
    }

    public Cadidatos( String nome, Integer idade, Double salarioPretendido) {

        this.nome = nome;
        this.idade = idade;
        this.salarioPretendido = salarioPretendido;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalarioPretendido() {
        return salarioPretendido;
    }

    public void setSalarioPretendido(Double salarioPretendido) {
        this.salarioPretendido = salarioPretendido;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cadidatos cadidatos = (Cadidatos) o;
        return Objects.equals(getNome(), cadidatos.getNome()) && Objects.equals(getIdade(), cadidatos.getIdade()) && Objects.equals(getSalarioPretendido(), cadidatos.getSalarioPretendido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getIdade(), getSalarioPretendido());
    }

    @Override
    public String toString() {
        return "Cadidatos{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salarioPretendido=" + salarioPretendido +
                '}';
    }
}
