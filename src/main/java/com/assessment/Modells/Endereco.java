package com.assessment.Modells;

public class Endereco {

    private String logradouro;
    private String tipoLogradouro;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
    
    public Endereco(String logradouro, String tipoLogradouro, int numero, String complemento, String cidade, String estado, String cep) {

        if(logradouro == null || logradouro.trim().isEmpty())
            throw new IllegalArgumentException("O parâmetro logradouro não pode ser nulo ou vazio.");
        else
            this.logradouro = logradouro;

        if(tipoLogradouro == null || tipoLogradouro.trim().isEmpty())
            throw new IllegalArgumentException("O parâmetro tipo de logradouro tipo de logradouro não pode ser nulo ou vazio.");
        else
            this.tipoLogradouro = tipoLogradouro;

        if(numero <= 0)
            throw new IllegalArgumentException("O parâmetro numero numero não pode ser nulo ou vazio.");
        else
            this.numero = numero;

        if(complemento == null || complemento.trim().isEmpty())
            throw new IllegalArgumentException("O parâmetro complemento não pode ser nulo ou vazio.");
        else
            this.complemento = complemento;

        if(cidade == null || cidade.trim().isEmpty())
            throw new IllegalArgumentException("O parâmetro cidade não pode ser nulo ou vazio.");
        else
            this.cidade = cidade;

        if(estado == null || estado.trim().isEmpty())
            throw new IllegalArgumentException("O parâmetro estado não pode ser nulo ou vazio.");
        else
            this.estado = estado;

        if(cep == null || cep.trim().isEmpty())
            throw new IllegalArgumentException("O parâmetro CEP não pode ser nulo ou vazio.");
        else
            this.cep = cep;

    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString(){
        return "Logradouro: " + getTipoLogradouro() + " " +getLogradouro() +
                "\nNumero: " + getNumero() + "\nComplemento: " + getComplemento() +
                "\nCidade: " + getCidade() + "\nEstado: " + getEstado() + " - \nCEP: " + getCep();
    }
}
