package com.anapedra.desafiocontrolefluxo.model;


import java.io.Serializable;
import java.util.Objects;


public class ProcessoCeletivo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String descricao;
    private Double minOfertaSalario;
    private Double maxOfertaSalario;
    private Integer numeroVagas;
    private Integer minIdade;
    private Integer maxIdade;
    private Integer numMaxCandidatos;





    public ProcessoCeletivo() {
    }

    public ProcessoCeletivo(String descricao, Double minOfertaSalario, Double maxOfertaSalario,
                            Integer numeroVagas, Integer minIdade, Integer maxIdade, Integer numMaxCandidatos) {

        this.descricao = descricao;
        this.minOfertaSalario = minOfertaSalario;
        this.maxOfertaSalario = maxOfertaSalario;
        this.numeroVagas = numeroVagas;
        this.minIdade = minIdade;
        this.maxIdade = maxIdade;
        this.numMaxCandidatos = numMaxCandidatos;
    }



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getMinOfertaSalario() {
        return minOfertaSalario;
    }

    public void setMinOfertaSalario(Double minOfertaSalario) {
        this.minOfertaSalario = minOfertaSalario;
    }

    public Double getMaxOfertaSalario() {
        return maxOfertaSalario;
    }

    public void setMaxOfertaSalario(Double maxOfertaSalario) {
        this.maxOfertaSalario = maxOfertaSalario;
    }

    public Integer getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(Integer numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public Integer getMinIdade() {
        return minIdade;
    }

    public void setMinIdade(Integer minIdade) {
        this.minIdade = minIdade;
    }

    public Integer getMaxIdade() {
        return maxIdade;
    }

    public void setMaxIdade(Integer maxIdade) {
        this.maxIdade = maxIdade;
    }

    public Integer getNumMaxCandidatos() {
        return numMaxCandidatos;
    }

    public void setNumMaxCandidatos(Integer numMaxCandidatos) {
        this.numMaxCandidatos = numMaxCandidatos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessoCeletivo that = (ProcessoCeletivo) o;
        return Objects.equals(getDescricao(), that.getDescricao()) && Objects.equals(getMinOfertaSalario(), that.getMinOfertaSalario()) && Objects.equals(getMaxOfertaSalario(), that.getMaxOfertaSalario()) && Objects.equals(getNumeroVagas(), that.getNumeroVagas()) && Objects.equals(getMinIdade(), that.getMinIdade()) && Objects.equals(getMaxIdade(), that.getMaxIdade()) && Objects.equals(getNumMaxCandidatos(), that.getNumMaxCandidatos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao(), getMinOfertaSalario(), getMaxOfertaSalario(), getNumeroVagas(), getMinIdade(), getMaxIdade(), getNumMaxCandidatos());
    }

    @Override
    public String toString() {
        return "ProcessoCeletivo{" +
                "descricao='" + descricao + '\'' +
                ", minOfertaSalario=" + minOfertaSalario +
                ", maxOfertaSalario=" + maxOfertaSalario +
                ", numeroVagas=" + numeroVagas +
                ", minIdade=" + minIdade +
                ", maxIdade=" + maxIdade +
                ", numMaxCandidatos=" + numMaxCandidatos +
                '}';
    }
}
