public class Test {
    public static void main() {
        RegistroColloqui registro = new RegistroColloqui();

        Colloquio c1 = new Colloquio("Mario Rossi", "Giovanni Rossi", "3A", 1);
        Colloquio c2 = new Colloquio("Luca Bianchi", "Marco Bianchi", "3B", 2);
        Colloquio c3 = new Colloquio("Anna Verdi", "Francesca Verdi", "3C", 3);
        Colloquio c4 = new Colloquio("Giulia Neri", "Alessandro Neri", "3D", 4);

        registro.aggiungiColloquio(c1);
        registro.aggiungiColloquio(c2);
        registro.aggiungiColloquio(c3);
        registro.aggiungiColloquio(c4);

        System.out.println("Cerca genitore 'Marco Bianchi': " + registro.cercaGenitore("Marco Bianchi"));
        System.out.println("Cerca genitore 'Mario Rossi': " + registro.cercaGenitore("Mario Rossi"));

        registro.fineColloquio(2);
    }
}
