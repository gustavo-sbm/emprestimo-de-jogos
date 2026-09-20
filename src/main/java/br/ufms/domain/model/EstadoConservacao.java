package br.ufms.domain.model;

public enum EstadoConservacao {
    NOVO("Novo"),
    EXCELENTE("Excelente"),
    BOM("Bom"),
    REGULAR("Regular"),
    DANIFICADO("Danificado");

    private final String descricao;

    EstadoConservacao(String descricao){
        this.descricao = descricao;

    }
}
