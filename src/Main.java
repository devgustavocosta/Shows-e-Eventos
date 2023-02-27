import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {
        Evento evento = new Evento("Rock in Rio", 400, 500, LocalDateTime.now());
        Ingresso ingresso = new Ingresso("Gustavo", "000.000.000-00", evento, ECategoriaIngresso.VIP);

        ingresso.mostraResumo();
        ingresso.getEIngresso().imprimeValorDoIngresso(evento);
        ingresso.getEvento().venderIngresso(ingresso);
        ingresso.getEvento().mostraTotalDeIngressosVendidos();
    }
}
