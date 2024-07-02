package sistema.iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void iniciarMusica() {
        System.out.println("Iniciando reprodução da música.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    }

    @Override
    public void selecionarFaixa(String faixa) {
        System.out.println("Faixa selecionada: " + faixa);
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para: " + numero);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void novaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void recarregarPagina() {
        System.out.println("Página recarregada.");
    }
}
