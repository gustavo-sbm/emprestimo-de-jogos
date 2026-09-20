package br.ufms.domain.model;

public enum StatusExemplar {
    DISPONIVEL("Disponivel"),
    EMPRESTADO("Emprestado"),
    RESERVADO("Reservado"),
    MANUTENCAO("Manutenção"),
    INDISPONIVEL("Indisponivel");

    private final String descricao;

    StatusExemplar(String descricao){
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }
}
