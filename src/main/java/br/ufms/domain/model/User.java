package br.ufms.domain.model;

import br.ufms.domain.util.Validador;

import java.time.LocalDate;
import java.util.UUID;

public class User {
    private final String id;
    private String nome;
    private String email;
    private String telefone;
    private Status status;
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;
    private LocalDate dataAlteracao;

    public User(
            String nome,
            String email,
            String telefone,
            LocalDate dataNascimento
    ) {
        this.id = UUID.randomUUID().toString();
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setDataNascimento(dataNascimento);
        setDataCadastro(LocalDate.now());
        setDataAlteracao(null);
        this.status = Status.ATIVO;
    }

    public String getId(){ return this.id; }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Validador.validarNome(nome);
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Validador.validarEmail(email);
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        Validador.validarTelefone(telefone);
        this.telefone = telefone;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        Validador.validarIdade(dataNascimento, 0);
        this.dataNascimento = dataNascimento;
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
