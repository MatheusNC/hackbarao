import bairro.Morador;
import mapa.Bairro;
import sistema.Menu;

public class Main {
    public static void main(String[] args) {
        Morador morador = new Morador();
        Bairro bairro = new Bairro();
        Menu menu = new Menu();


        if (morador.cadastrarMorador())
            if (bairro.cadastrarBairro())
                morador.setBairro(bairro);

        menu.setMorador(morador);
        menu.selecionarMenu();
    }
}
