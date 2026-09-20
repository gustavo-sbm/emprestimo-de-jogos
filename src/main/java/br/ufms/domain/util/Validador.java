package br.ufms.domain.util;

import java.time.LocalDate;
import java.time.Period;

public class Validador {

    public static void validarNomeSimples(String nome){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O nome não pode ser vazio");

        }

        nome = nome.trim();
        String regex = "^[A-Za-zÀ-ÖØ-öø-ÿ\\s&-]{2,50}$";

        if (!nome.matches(regex) || nome.length() > 255) {
            throw new IllegalArgumentException("Nome inválido.");
        }

    }

    public static void validarDescricao(String descricao){
        if(descricao == null || descricao.isBlank()){
            throw new IllegalArgumentException("A descrição não pode ser vazia");

        }

        descricao = descricao.trim();
        if(descricao.length()>255){
            throw new IllegalArgumentException("A descrição não pode passar de 255 caracteres");
        }
    }

    public static void validarNegativo(int numero){
        if(numero<0){
            throw new IllegalArgumentException("O valor não pode ser negativo");
        }
    }

    public static void validarNome(String nome){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O nome não pode ser vazio");

        }

        nome = nome.trim();
        String regex = "[a-zA-ZÀ-ÿ]+(\\s+[a-zA-ZÀ-ÿ]+)+";

        if (!nome.matches(regex) || nome.length() > 255) {
            throw new IllegalArgumentException("Nome inválido. Digite o nome completo (até 255 caracteres).");
        }
    }

    public static void validarTelefone(String telefone){
        if(telefone == null || telefone.isBlank()){
            throw new IllegalArgumentException("O telefone não pode ser vazio");
        }

        telefone = telefone.trim();
        String regex = "^(?:\\+?55\\s?)?(?:\\(?[1-9][0-9]\\)?[\\s-]?)?(?:9[0-9]{4}|[2-8][0-9]{3})[\\s-]?[0-9]{4}$";

        if(!telefone.matches(regex)){
            throw new IllegalArgumentException(("Telefone inválido"));
        }
    }

    public static void validarCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("O CPF não pode ser vazio");
        }

        cpf = cpf.trim().replaceAll("[.\\-]", "");

        if (!cpf.matches("^\\d{11}$") || cpf.matches("^(\\d)\\1{10}$")) {
            throw new IllegalArgumentException("CPF inválido");
        }

        for (int j = 9; j <= 10; j++) {
            int soma = 0;
            for (int i = 0; i < j; i++) {
                soma += (cpf.charAt(i) - '0') * (j + 1 - i);
            }
            int digito = (soma * 10) % 11;
            if (digito == 10) {
                digito = 0;
            }
            if (digito != cpf.charAt(j) - '0') {
                throw new IllegalArgumentException("CPF inválido");
            }
        }
    }

    public static void validarEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("O e-mail não pode ser vazio");
        }

        email = email.trim();
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        if (!email.matches(regex)) {
            throw new IllegalArgumentException("E-mail inválido");
        }

    }

    public static void validarIdade(LocalDate dataNascimento, int idadeMinima) {
        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();
        validarIdade(idade, idadeMinima);
    }

    public static void validarIdade(int idade, int idadeMinima) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa");
        }
        if (idade < idadeMinima) {
            throw new IllegalArgumentException("É necessário ter ao menos " + idadeMinima + " anos");
        }
        if (idade > 120) {
            throw new IllegalArgumentException("Idade inválida");
        }
    }

    public static void validarTitulo(String titulo){
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O título não pode ser vazio");
        }
        String t = titulo.trim();
        if (t.length() < 2 || t.length() > 120) {
            throw new IllegalArgumentException("O título deve ter entre 2 e 120 caracteres");
        }
    }
}
