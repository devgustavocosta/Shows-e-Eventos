public class Ingresso {
    private String nome;
    private String cpf;
    private Evento evento;
    private ECategoriaIngresso eIngresso;

    public Ingresso(String nome, String cpf, Evento evento, ECategoriaIngresso eIngresso) {
        this.nome = nome;
        this.cpf = cpf;
        this.evento = evento;
        this.eIngresso = eIngresso;
    }

    public void mostraResumo() {
        System.out.println("\n ------------- RESUMO DA COMPRA -------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Evento: " + this.evento.getNome());
        System.out.println("Data evento: " + this.evento.getData());
        System.out.println(" ----------------------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Evento getEvento() {
        return evento;
    }

    public ECategoriaIngresso getEIngresso() {
        return eIngresso;
    }
}
