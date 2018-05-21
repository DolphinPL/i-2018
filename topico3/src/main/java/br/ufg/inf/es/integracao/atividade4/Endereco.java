/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade4;

import java.util.List;

/**
 * Classe que cria uma instância de um endereço.
 */
public class Endereco {

    private List<LinhaEndereco> linhaEndereco;
    private Data dataInicio;
    private Data dataFim;
    private String bairro;
    private String distrito;
    private int codigoMunicipio;
    private String estado;
    private String cep;
    private String caixaPostal;
    private String pais;
    private String tipo;

    /**
     * Método de acesso ao atributo Linha de endereço.
     */
    public List<LinhaEndereco> getLinhaEndereco() {
        return linhaEndereco;
    }

    /**
     * Método de acesso ao atributo linha de endereço.
     */
    public void setLinhaEndereco(List<LinhaEndereco> linhaEndereco) {
        this.linhaEndereco = linhaEndereco;
    }

    /**
     * Método de acesso ao atributo data de inicio.
     */
    public Data getDataInicio() {
        return dataInicio;
    }

    /**
     * Método de acesso ao atributo data de inicio.
     */
    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Método de acesso ao atributo data de fim.
     */
    public Data getDataFim() {
        return dataFim;
    }

    /**
     * Método de acesso ao atributo data de fim.
     */
    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * Método de acesso ao atributo bairro.
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Método de acesso ao atributo bairro.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Método de acesso ao atributo distrito.
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Método de acesso ao atributo distrito.
     */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /**
     * Método de acesso ao atributo código do municipio.
     */
    public int getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Método de acesso ao atributo código do municipio.
     */
    public void setCodigoMunicipio(int codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    /**
     * Método de acesso ao atributo estado.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método de acesso ao atributo estado.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método de acesso ao atributo cep.
     */
    public String getCep() {
        return cep;
    }

    /**
     * Método de acesso ao atributo cep.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Método de acesso ao atributo caixa postal.
     */
    public String getCaixaPostal() {
        return caixaPostal;
    }

    /**
     * Método de acesso ao atributo caixa postal.
     */
    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    /**
     * Método de acesso ao atributo país.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Método de acesso ao atributo país.
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Método de acesso ao atributo tipo.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método de acesso ao atributo tipo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
