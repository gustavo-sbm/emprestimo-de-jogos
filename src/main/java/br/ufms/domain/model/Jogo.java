package br.ufms.domain.model;

import br.ufms.domain.util.Validador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Jogo {
    private final String id;
    private List<Categoria> categorias;
    private String nome;
    private String descricao;
    private int numeroMinimoJogadores;
    private int numeroMaximoJogadores;
    private int idadeMinima;
    private int duracaoMinima;
    private int duracaoMaxima;
    private Integer anoLancamento;
    private String editora;
    private boolean ativo;
    private LocalDate dataCadastro;
    private LocalDate dataAlteracao;

    public Jogo(
            String nome,
            String descricao,
            int numeroMaximoJogadores,
            int numeroMinimoJogadores,
            int idadeMinima,
            int duracaoMaxima,
            int duracaoMinima,
            List<Categoria> categorias
    ){
        this.id = UUID.randomUUID().toString();
        setNome(nome);
        setDescricao(descricao);
        setNumeroMaximoJogadores(numeroMaximoJogadores);
        setNumeroMinimoJogadores(numeroMinimoJogadores);
        setIdadeMinima(idadeMinima);
        setDuracaoMaxima(duracaoMaxima);
        setDuracaoMinima(duracaoMinima);
        setAtivo(true);
        this.categorias = new ArrayList<>(categorias);
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void addCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }

    public String getId() { return this.id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Validador.validarTitulo(nome);
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        Validador.validarDescricao(descricao);
        this.descricao = descricao;
    }

    public int getNumeroMinimoJogadores() {
        return numeroMinimoJogadores;
    }

    public void setNumeroMinimoJogadores(int numeroMinimoJogadores) {
        Validador.validarNegativo(numeroMinimoJogadores);
        this.numeroMinimoJogadores = numeroMinimoJogadores;
    }

    public int getNumeroMaximoJogadores() {
        return numeroMaximoJogadores;
    }

    public void setNumeroMaximoJogadores(int numeroMaximoJogadores) {
        Validador.validarNegativo(numeroMaximoJogadores);
        this.numeroMaximoJogadores = numeroMaximoJogadores;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        Validador.validarNegativo(idadeMinima);
        this.idadeMinima = idadeMinima;
    }

    public int getDuracaoMaxima() {
        return duracaoMaxima;
    }

    public void setDuracaoMaxima(int duracaoMaxima) {
        Validador.validarNegativo(duracaoMaxima);
        this.duracaoMaxima = duracaoMaxima;
    }

    public int getDuracaoMinima() {
        return duracaoMinima;
    }

    public void setDuracaoMinima(int duracaoMinima) {
        Validador.validarNegativo(duracaoMinima);
        this.duracaoMinima = duracaoMinima;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        if (anoLancamento != null) {
            Validador.validarNegativo(anoLancamento);
        }
        this.anoLancamento = anoLancamento;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        Validador.validarTitulo(editora);
        this.editora = editora;
    }

    public LocalDate getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDate dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
