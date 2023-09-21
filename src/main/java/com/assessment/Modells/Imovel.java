package com.assessment.Modells;

import java.util.ArrayList;
import java.util.List;

import com.assessment.Enumerations.TipoImovelEnum;
import com.assessment.Exceptions.ImovelNotNullOrEmptyException;

public class Imovel {
    
    private String registro;
    private String nome;
    Endereco endereco;
    private TipoImovelEnum tipo;
    private float valorAluguel;
    private List<ContratoAluguel> listaContratos;
    
    public Imovel(String registro, String nome, Endereco endereco, TipoImovelEnum tipo, float valorAluguel)
            throws ImovelNotNullOrEmptyException {

        if(registro == null || registro.trim().isEmpty())
            throw new ImovelNotNullOrEmptyException("O parâmetro registro não pode ser nulo ou vazio.");
        else
            this.registro = registro;

        if(nome == null || nome.trim().isEmpty())
            throw new ImovelNotNullOrEmptyException("O parâmetro nome do imovel não pode ser nulo ou vazio.");
        else
            this.nome = nome;

        if(endereco == null)
            throw new ImovelNotNullOrEmptyException("O parâmetro endereco não pode ser nulo ou vazio.");
        else
            this.endereco = endereco;

        this.tipo = tipo;

        if(valorAluguel <= 0)
            throw new ImovelNotNullOrEmptyException("O parâmetro valor do aluguel não pode ser nulo ou vazio.");
        else
            this.valorAluguel = valorAluguel;

        this.listaContratos = new ArrayList<ContratoAluguel>();
    }


    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public TipoImovelEnum getTipo() {
        return tipo;
    }
    public void setTipo(TipoImovelEnum tipo) {
        this.tipo = tipo;
    }
    public float getValorAluguel() {
        return valorAluguel;
    }
    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    public List<ContratoAluguel> getListaContratos() {
        return this.listaContratos;
    }

    public void addContratos(ContratoAluguel contrato){
        this.listaContratos.add(contrato);
    }

    @Override
    public String toString(){
        return "Imovel: " + getNome() + "\nEndereço:\n" + getEndereco();
    }
}
