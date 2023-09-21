package com.assessment.Enumerations;

public enum TipoImovelEnum {
    COMERCIAL("Comercial"),
    RESIDENCIAL("Residencial");

    private final String descricao;

    TipoImovelEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
