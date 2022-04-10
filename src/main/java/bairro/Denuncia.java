package bairro;

import java.util.Scanner;

public class Denuncia {
    private String tipoDenuncia;
    private String comentario;
    private String endereco;
    private boolean ativo;
    private Morador morador;

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getTipoDenuncia() {
        return tipoDenuncia;
    }

    public void setTipoDenuncia(String tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public boolean cadastrarDenuncia(Morador morador) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de denúncia: ");
        this.tipoDenuncia = sc.nextLine();
        System.out.println("Digite o comentário: ");
        this.comentario = sc.nextLine();
        System.out.println("Digite o endereço: ");
        this.endereco = sc.nextLine();
        this.morador = morador;

        System.out.println("Denúncia realizada com sucesso!");

        return true;
    }

    public void getDenuncia() {
        System.out.println(this.getTipoDenuncia());
        System.out.println(this.getComentario());
        System.out.println(this.getEndereco());
    }
}
