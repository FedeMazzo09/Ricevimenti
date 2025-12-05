public class RegistroColloqui {
    private Colloquio[] registro;
    private String docente;

    public RegistroColloqui(String docente) {
        registro = new Colloquio[4];
        this.docente = docente;
    }

    boolean isOccupato(int turno) {
        return registro[turno - 1] != null;
    }

    boolean aggiungiColloquio(Colloquio c) {
        int turno = c.getTurno();
        if (!isOccupato(turno)) {
            registro[turno - 1] = c;
            return true;
        } else {
            for (int i = 0; i < registro.length; i++) {
                if (registro[i] == null) {
                    registro[i] = c;
                    return true;
                }
            }
        }
        return false;
    }

    boolean fineColloquio(int turno) {
        if (isOccupato(turno)) {
            registro[turno - 1] = null;
            return true;
        }
        return false;
    }

    boolean cercaGenitore(String nomeGenitore) {
        for (Colloquio c : registro) {
            if (c != null && c.getNomeGenitore().equals(nomeGenitore)) {
                return true;
            }
        }
        return false;
    }
}
