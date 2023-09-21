package com.assessment.Modells;

import com.assessment.Exceptions.ClienteNotNullOrEmptyException;
import com.assessment.Interfaces.IContabil;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Cliente implements IContabil {

    private String nome;
    private String telefone;
    private String email;
    private List<ContratoAluguel> listaContratos;
    public Cliente(String nome, String telefone, String email)
            throws ClienteNotNullOrEmptyException {

        if(nome == null || nome.trim().isEmpty())
            throw new ClienteNotNullOrEmptyException("O parâmetro nome não pode ser nulo ou vazio.");
        else
            this.nome = nome;

        if(telefone == null || telefone.trim().isEmpty())
            throw new ClienteNotNullOrEmptyException("O parâmetro telefone não pode ser nulo ou vazio.");
        else
            this.telefone = telefone;

        if(email == null || email.trim().isEmpty())
            throw new ClienteNotNullOrEmptyException("O parâmetro email não pode ser nulo ou vazio.");
        else
            this.email = email;

        this.listaContratos = new ArrayList<ContratoAluguel>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public List<ContratoAluguel> getListaContratos() {
        return listaContratos;
    }
    public void addContrato(ContratoAluguel contrato) {
        this.listaContratos.add(contrato);
    }

    public String calcularValorTotalContratos() {
        int numeroDeContratos = this.listaContratos.size();
        float valorTotalAlugueis = 0;

        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        if (numeroDeContratos > 0) {
            for (ContratoAluguel listaContrato : this.listaContratos) {
                valorTotalAlugueis += listaContrato.getImovel().getValorAluguel();
            }
        }
        return "O valor total dos contratos do cliente " + getNome() + " é: " + formatoMoeda.format(valorTotalAlugueis);
    }
}
