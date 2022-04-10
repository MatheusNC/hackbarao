package bairro;

import mapa.Bairro;

import java.util.Scanner;

public class Morador {
    private String nome;
    private String sobrenome;
    private String endereco;
    private int numeroEndereco;
    private String complemento;
    private Bairro bairro;
    private double cep;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {return this.nome + ' ' + this.sobrenome; }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public double getCep() {
        return cep;
    }

    public void setCep(double cep) {
        this.cep = cep;
    }

    public boolean cadastrarMorador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Gerenciamento dos Bairros");
        System.out.println("Bem-vindo morador! Qual é seu nome: ");
        this.nome = scanner.nextLine();
        System.out.println("Sobrenome: ");
        this.sobrenome = scanner.nextLine();
        System.out.println("Seu endereço: ");
        this.endereco = scanner.nextLine();
        System.out.println("Número:");
        this.numeroEndereco = scanner.nextInt();
        System.out.println("Seu CEP:");
        this.cep = scanner.nextDouble();

        System.out.println("Cadastro realizado com sucesso!");

        return true;
    }
}
