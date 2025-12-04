public class Colloquio {
    private String nomeStudente;
    private String nomeGenitore;
    private String classe;
    private int turno;

    public Colloquio(String nomeStudente, String nomeGenitore, String classe, int turno) {
        this.nomeStudente = nomeStudente;
        this.nomeGenitore = nomeGenitore;
        this.classe = classe;
        this.turno = turno;
    }

    public int getTurno() {
        return turno;
    }

    public String getNomeGenitore() {
        return nomeGenitore;
    }
}