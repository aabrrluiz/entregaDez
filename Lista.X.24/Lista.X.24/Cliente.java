public class Cliente {
    private String nome;
    private int tempoEspera;

    public Cliente(String nome) {
        this.nome = nome;
        this.tempoEspera = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void incrementarTempoEspera() {
        tempoEspera++;
    }
}