package mapa;

import java.util.Scanner;

public class Bairro {
    private String coordenada;
    private String cidade;
    private String nome;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    public String getURLCoordenada() { return "www.google.com/search?q="+coordenada; }

    public boolean cadastrarBairro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a sua cidade: ");
        this.cidade = sc.nextLine();
        System.out.println("Seu bairro: ");
        this.nome = sc.nextLine();
        System.out.println("Por favor, insira a coordenada do bairro(SEM ESPAÇOS): ");
        this.coordenada = sc.nextLine();

        return true;
    }
}
