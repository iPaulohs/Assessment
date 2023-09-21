package com.assessment.Modells;

import com.assessment.Exceptions.ClienteNotNullOrEmptyException;

public class Fisica extends Cliente{

    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

        public Fisica(String nome, String telefone, String email, String CPF)
                throws ClienteNotNullOrEmptyException{

        super(nome, telefone, email);

        if(CPF == null ||  CPF.trim().isEmpty())
            throw new ClienteNotNullOrEmptyException("O parâmetro CPF não pode ser nulo ou vazio.");
        else
            this.CPF = CPF;
    }
}
