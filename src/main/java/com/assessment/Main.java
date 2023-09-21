package com.assessment;

import com.assessment.Enumerations.TipoImovelEnum;
import com.assessment.Exceptions.ClienteNotNullOrEmptyException;
import com.assessment.Exceptions.ContratoAluguelNotNullOrEmptyException;
import com.assessment.Exceptions.ImovelNotNullOrEmptyException;
import com.assessment.Modells.Cliente;
import com.assessment.Modells.ContratoAluguel;
import com.assessment.Modells.Endereco;
import com.assessment.Modells.Imovel;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args)
            throws ImovelNotNullOrEmptyException,
            ClienteNotNullOrEmptyException,
            ContratoAluguelNotNullOrEmptyException {
        Imovel imovel = new Imovel("2512", "Imovel A",
                new Endereco("Dona Balá", "Rua", 810, "-", "Matozinhos", "MG", "35720-000"),
                TipoImovelEnum.RESIDENCIAL, 1200);
        System.out.println(imovel.toString());
        imovel.addContratos(new ContratoAluguel(imovel,
                new Cliente("Paulo", "31 93618-0068", "paulo.hsantos@al.infnet.edu.br"),
                LocalDateTime.of(2023, 9, 21, 15, 0, 0),
                LocalDateTime.of(2023, 9, 28, 15, 0, 0)));
        System.out.println(imovel.getListaContratos());

        ContratoAluguel Contrato = new ContratoAluguel(imovel,
                new Cliente("Paulo", "31 93618-0068", "paulo.hsantos@al.infnet.edu.br"),
                LocalDateTime.of(2023, 9, 21, 15, 0, 0),
                LocalDateTime.of(2023, 9, 28, 15, 0, 0));

        Cliente Paulo = new Cliente("Paulo", "31 93618-0068", "paulohsantos@mail.com");
        Paulo.addContrato(Contrato);
        Paulo.addContrato(Contrato);
        System.out.println(Paulo.calcularValorTotalContratos());
    }
}