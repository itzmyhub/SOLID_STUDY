package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DadosPessoais {
        private String nome;
        private String cpf;
        private BigDecimal salario;

        public DadosPessoais(String nome, String cpf, BigDecimal salario) {
            this.nome = nome;
            this.cpf = cpf;
            this.salario = salario;
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return this.cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public BigDecimal getSalario() {
            return this.salario;
        }

        public void setSalario(BigDecimal salario) {
            this.salario = salario;
        }
}
