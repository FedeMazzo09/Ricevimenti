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

    void aggiungiColloquio(Colloquio c) {
        int turno = c.getTurno();
        if (!isOccupato(turno)) {
            registro[turno - 1] = c;
        } else {
            boolean aggiunto = false;
            for (int i = 0; i < registro.length; i++) {
                if (registro[i] == null) {
                    registro[i] = c;
                    aggiunto = true;
                    throw new SlotOccupatoException("Slot occupato, colloquio aggiunto al primo slot libero: " + (i + 1));
                }
            }
            if (!aggiunto) {
                throw new SlotEsauritiException("Slot esauriti, impossibile aggiungere il colloquio.");
            }
        }
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
