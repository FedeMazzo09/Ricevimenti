public class Test {
    public static void main() {
        RegistroColloqui registro1 = new RegistroColloqui("Mastroianni");

        Colloquio c1 = new Colloquio("Deyae", "Nawal", "4IE", 1);
        Colloquio c2 = new Colloquio("Giacomo", "Roberto", "4IE", 2);
        Colloquio c3 = new Colloquio("Ilario", "Pamela", "4IE", 3);

        registro1.aggiungiColloquio(c1);
        registro1.aggiungiColloquio(c2);
        registro1.aggiungiColloquio(c3);

        System.out.println("Cerca genitore 'Marco': " + registro1.cercaGenitore("Marco"));
        System.out.println("Cerca genitore 'Pamela': " + registro1.cercaGenitore("Pamela"));

        registro1.fineColloquio(3);
        System.out.println("Cerca genitore 'Pamela' dopo fine colloquio: " + registro1.cercaGenitore("Pamela"));
        System.out.println("Cerca genitore 'Roberto' dopo fine colloquio: " + registro1.cercaGenitore("Roberto"));
    }
}