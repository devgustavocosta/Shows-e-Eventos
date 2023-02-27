import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private double valorUnico;
    private int capacidadeMaxima;
    private LocalDateTime data;
    private List<Ingresso> ingressos = new ArrayList<>();
    private static final String SEPARADOR = " ----------------------------------------------";

    public Evento(String nome, double valorUnico, int capacidadeMaxima, LocalDateTime data) {
        this.nome = nome;
        this.valorUnico = valorUnico;
        this.capacidadeMaxima = capacidadeMaxima;
        this.data = data;
    }

    public void venderIngresso(Ingresso ingresso) {
        if (capacidadeMaxima <= 1000) {
            ingressos.add(ingresso);
            System.out.println(SEPARADOR);
            System.out.println("Ingresso vendido!");
        } else {
            System.out.println(SEPARADOR);
            System.out.println("Capacidade lotada!");
        }
    }

    public void mostraTotalDeIngressosVendidos() {
        System.out.println(SEPARADOR);
        System.out.println("Total de ingressos vendidos: " + ingressos.size());
    }

    public String getNome() {
        return nome;
    }

    public double getValorUnico() {
        return valorUnico;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public LocalDateTime getData() {
        return data;
    }
}
