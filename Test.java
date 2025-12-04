public class Test {
    public static void main() {
        RegistroColloqui registro = new RegistroColloqui();

        Colloquio c1 = new Colloquio("Deyae", "Nawal", "4IE", 1);
        Colloquio c2 = new Colloquio("Giacomo", "Roberto", "4IE", 2);
        Colloquio c3 = new Colloquio("Ilario", "Pamela", "4IE", 3);

        registro.aggiungiColloquio(c1);
        registro.aggiungiColloquio(c2);
        registro.aggiungiColloquio(c3);

        System.out.println("Cerca genitore 'Marco': " + registro.cercaGenitore("Marco"));
        System.out.println("Cerca genitore 'Pamela': " + registro.cercaGenitore("Pamela"));

        registro.fineColloquio(3);
        System.out.println("Cerca genitore 'Pamela' dopo fine colloquio: " + registro.cercaGenitore("Pamela"));
        System.out.println("Cerca genitore 'Roberto' dopo fine colloquio: " + registro.cercaGenitore("Roberto"));
    }
}