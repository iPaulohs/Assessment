package com.assessment.Modells;

import com.assessment.Exceptions.ClienteNotNullOrEmptyException;

public class Juridica extends Cliente{
    
    private String CNPJ;

    public Juridica(String nome, String telefone, String email, String CNPJ)
            throws ClienteNotNullOrEmptyException {

        super(nome, telefone, email);

        if(CNPJ == null || CNPJ.trim().isEmpty())
            throw new ClienteNotNullOrEmptyException("O parâmetro CNPJ não pode ser nulo ou vazio.");
        else
            this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
}
