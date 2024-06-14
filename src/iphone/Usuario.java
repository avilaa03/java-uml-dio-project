package iphone;

public class Usuario {

    public static void main(String[] args) {
        Iphone xSmax = new Iphone();
        xSmax.ligar("11970707070");
        xSmax.atender();
        xSmax.recusar();
        xSmax.exibirPagina("google");
    }
}
