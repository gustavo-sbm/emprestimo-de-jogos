package br.ufms.domain.model;

import br.ufms.domain.util.Validador;

import java.time.LocalDate;
import java.util.UUID;

public class Categoria {
    private final String id;
    private String nome;
    private LocalDate dataCadastro;
    private LocalDate dataAlteracao;

    public Categoria(String nome){
        this.id = UUID.randomUUID().toString();
        setNome(nome);
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Validador.validarNomeSimples(nome);
        this.nome = nome;
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

