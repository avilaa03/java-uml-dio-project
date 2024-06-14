package iphone;

import iphone.cellphone.Cellphone;
import iphone.ipod.Musica;
import iphone.webbrowser.WebBrowser;
import iphone.ipod.iPod;
import iphone.webbrowser.WebPage;

public class Iphone implements Cellphone, iPod, WebBrowser {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando pelo iPhone no número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo iPhone");
    }

    @Override
    public void recusar() {
        System.out.println("Recusando pelo iPhone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando pelo iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando pelo iPhone");
    }

    @Override
    public Musica selecionarMusica(String musica) {
        Musica musicaProcurada = new Musica(musica);
        return musicaProcurada;
    }

    @Override
    public WebPage exibirPagina(String url) {
        WebPage exibir = new WebPage(url);
        return exibir;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba pelo iPhone");
    }

    @Override
    public WebPage atualizarPagina() {
        String url = "A mesma URL que está na página";
        WebPage exibir = new WebPage(url);
        return exibir;
    }
}
