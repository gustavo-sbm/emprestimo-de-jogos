package br.ufms.domain.model;

public enum StatusEmprestimo {
    ATIVO("Ativo"),
    ATRASADO("Atrasado"),
    FINALIZADO("Finalizado"),
    CANCELADO("Cancelado");

    private final String descricao;

    StatusEmprestimo(String descricao){
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }
}
