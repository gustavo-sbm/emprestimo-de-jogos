package br.ufms.domain.model;

import br.ufms.domain.util.Validador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Emprestimo {
    private final String id;
    private String usuarioId;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataDevolucao;
    private String observacoes;
    private StatusEmprestimo statusEmprestimo;
    private List<Exemplar> exemplares;
    private LocalDate dataCadastro;
    private LocalDate dataAlteracao;

    public Emprestimo(
                      String usuarioId,
                      LocalDate dataEmprestimo,
                      LocalDate dataPrevistaDevolucao,
                      LocalDate dataDevolucao,
                      StatusEmprestimo statusEmprestimo,
                      List<Exemplar> exemplares
                      ) {
        this.id = UUID.randomUUID().toString();
        setUsuarioId(usuarioId);
        setDataEmprestimo(dataEmprestimo);
        setDataPrevistaDevolucao(dataPrevistaDevolucao);
        setDataDevolucao(dataDevolucao);
        setStatusEmprestimo(statusEmprestimo);
        this.exemplares = new ArrayList<>(exemplares);
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    public void addExemplar(Exemplar exemplar) {
        this.exemplares.add(exemplar);
    }

    public String getId(){return this.id;}

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        Validador.validarDescricao(observacoes);
        this.observacoes = observacoes;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public StatusEmprestimo getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(StatusEmprestimo statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
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

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }
}
