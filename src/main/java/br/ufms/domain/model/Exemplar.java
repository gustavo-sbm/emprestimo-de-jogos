package br.ufms.domain.model;

import java.time.LocalDate;
import java.util.UUID;

public class Exemplar {
    private final String id;
    private String codigo;
    private String jogoId;
    private StatusExemplar status;
    private EstadoConservacao conservacao;
    private LocalDate dataCadastro;
    private LocalDate dataAlteracao;

    public Exemplar(
            String codigo,
            String jogoId,
            EstadoConservacao conservacao,
            StatusExemplar status
            ) {
        this.id = UUID.randomUUID().toString();
        setCodigo(codigo);
        setJogoId(jogoId);
        setConservacao(conservacao);
        setStatus(status);

    }

    public String getId() { return id; }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getJogoId() {
        return jogoId;
    }

    public void setJogoId(String jogoId) {
        this.jogoId = jogoId;
    }

    public StatusExemplar getStatus() {
        return status;
    }

    public void setStatus(StatusExemplar status) {
        this.status = status;
    }

    public EstadoConservacao getConservacao() {
        return conservacao;
    }

    public void setConservacao(EstadoConservacao conservacao) {
        this.conservacao = conservacao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDate dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
}
