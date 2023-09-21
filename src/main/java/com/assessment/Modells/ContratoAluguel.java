package com.assessment.Modells;

import com.assessment.Exceptions.ContratoAluguelNotNullOrEmptyException;

import java.time.LocalDateTime;

public class ContratoAluguel {

    private Imovel imovel;
    private Cliente cliente;
    private LocalDateTime dataInicio;
    private LocalDateTime dataTermino;

    public ContratoAluguel(Imovel imovel, Cliente cliente, LocalDateTime dataInicio, LocalDateTime dataTermino)
            throws ContratoAluguelNotNullOrEmptyException {

        if(imovel == null)
            throw new ContratoAluguelNotNullOrEmptyException("O parâmetro imóvel não pode ser nulo ou vazio.");
        else
            this.imovel = imovel;

        if(cliente == null)
            throw new ContratoAluguelNotNullOrEmptyException("O parâmetro cliente não pode ser nulo ou vazio.");
        else
            this.cliente = cliente;

        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public LocalDateTime getDataTermino() {
        return dataTermino;
    }

    @Override
    public String toString(){
        return "Imovel," + imovel.getEndereco() + "," + imovel.getTipo();
    }
}
