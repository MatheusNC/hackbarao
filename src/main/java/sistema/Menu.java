package sistema;

import bairro.Denuncia;
import bairro.Morador;
import bairro.Noticia;
import mapa.Alerta;
import mapa.Bairro;

import java.util.Scanner;

public class Menu {
    private Morador morador;
    private Bairro bairro;
    private Noticia noticia;

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Noticia getNoticia() {
        return noticia;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }

    public void selecionarMenu() {
        Denuncia denuncia = new Denuncia();
        Alerta alerta = new Alerta();
        Scanner scanner = new Scanner(System.in);
        boolean confirm = true;

        do {
            System.out.println(this.morador.getNomeCompleto() + " o que deseja fazer? ");
            System.out.println("1 - Visualizar mapa | 2 - Fazer denúncia | 3 - Visualizar suas denúncias");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("URL do mapa: " + this.morador.getBairro().getURLCoordenada());
                    break;
                case 2:
                    denuncia.cadastrarDenuncia(this.morador);
                    alerta.setTipoAlerta(denuncia.getTipoDenuncia());
                    alerta.setDenuncia(denuncia);
                    break;
                case 3:
                    System.out.println("Suas denúncias: ");
                    if (denuncia.getMorador() == this.morador) {
                        denuncia.getDenuncia();
                    }
                    break;
            }
            System.out.println("Deseja continuar? (true ou false)");
            if (scanner.nextBoolean())
                confirm = true;
            else
                confirm = false;
        } while (confirm == true);
    }
}
