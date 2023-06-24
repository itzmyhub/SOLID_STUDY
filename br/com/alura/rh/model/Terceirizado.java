package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(String nome, String cpf, BigDecimal salario, String empresa) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, salario);
        this.empresa = empresa;
    }


}
