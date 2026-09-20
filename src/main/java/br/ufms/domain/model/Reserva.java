package br.ufms.domain.model;

import br.ufms.domain.util.Validador;

import java.time.LocalDate;
import java.util.UUID;

public class Reserva {
    private final String id;
    private String usuarioId;
    private String jogoId;
    private LocalDate dataReserva;
    private StatusReserva status;
    private LocalDate dataAtendimento;
    private LocalDate dataCancelamento;
    private String observacoes;

    public Reserva(
            String usuarioId,
            String jogoId,
            LocalDate dataReserva,
            StatusReserva status,
            LocalDate dataAtendimento,
            LocalDate dataCancelamento
    ) {
        this.id = UUID.randomUUID().toString();
        setUsuarioId(usuarioId);
        setJogoId(jogoId);
        setDataReserva(dataReserva);
        setStatus(status);
        setDataAtendimento(dataAtendimento);
        setDataCancelamento(dataCancelamento);
    }


    public String getId() {
        return id;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getJogoId() {
        return jogoId;
    }

    public void setJogoId(String jogoId) {
        this.jogoId = jogoId;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    public LocalDate getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDate dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public LocalDate getDataCancelamento() {
        return dataCancelamento;
    }

    public void setDataCancelamento(LocalDate dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public String getObservacoes() {

        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        Validador.validarDescricao(observacoes);
        this.observacoes = observacoes;
    }
}
