package iphone.webbrowser;

public interface WebBrowser {
    public WebPage exibirPagina(String url);

    public void adicionarNovaAba();

    public WebPage atualizarPagina();
}
