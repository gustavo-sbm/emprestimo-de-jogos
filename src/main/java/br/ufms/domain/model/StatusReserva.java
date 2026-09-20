package br.ufms.domain.model;

public enum StatusReserva {
    ATIVA("Ativa"),
    ATENDIDA("Atendida"),
    CANCELADA("Cancelada"),
    EXPIRADA("Expirada");

    private final String descricao;

    StatusReserva(String descricao){
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }
}
