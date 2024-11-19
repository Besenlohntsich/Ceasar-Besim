import java.util.InputMismatchException;
import java.util.Scanner;

public class Verwaltung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caesar caesar = new Caesar();
        int option;

        do {
            System.out.println("Wähle eine Option:");
            System.out.println("0 - Beenden");
            System.out.println("1 - Verschlüsseln");
            System.out.println("2 - Entschlüsseln");

            //verhindert crash durch eingabe einen falschen datentyps
            while (true) {
                try {
                    option = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ungültige Eingabe. Bitte eine Zahl eingeben.");
                    sc.next();
                }
            }


            switch (option) {
                case 0:
                    //spiegelt den wert von option wider und vergleicht diesen
                    System.out.println("Programm wird beendet.");
                    break;
                case 1:
                    System.out.println("Gebe eine Nachricht zum Verschlüsseln ein:");
                    caesar.setKt(sc.nextLine());

                    System.out.print("Gebe den Schlüssel ein:");
                    caesar.setS(sc.nextInt());
                    sc.nextLine();

                    caesar.verschluesseln();
                    System.out.println("Verschlüsselte Nachricht: " + caesar.getGt());
                    break;
                case 2:
                    System.out.println("Gebe die verschlüsselte Nachricht ein:");
                    caesar.setGt(sc.nextLine());

                    System.out.print("Gebe eine zahl als Schlüssel ein:");
                    caesar.setS(sc.nextInt());
                    sc.nextLine();

                    caesar.entschluesseln();
                    System.out.println("Entschlüsselte Nachricht: " + caesar.getKt());
                    break;
                default:
                    System.out.println("Ungültige Option, bitte wähle erneut.");
            }
        } while (option != 0);
        //ruft alles unter dem do wieder auf, wenn option ungleich 0 ist
        sc.close();
    }
}
/*switch (expression):
Der expression-Teil wird einmal ausgewertet und sein Wert wird mit den case-Labels verglichen.

Jeder case-Zweig vergleicht den Wert des Ausdrucks mit dem angegebenen Wert (value).
Wenn eine Übereinstimmung gefunden wird, werden die zugehörigen Anweisungen (Statements) ausgeführt.

        break:
Die break-Anweisung beendet den switch-Block.
        Ohne break würden die nachfolgenden case-Zweige ebenfalls ausgeführt (Fall-Through).
default:

Der default-Zweig ist optional.
Falls keine der case-Bedingungen erfüllt ist, wird der default-Zweig ausgeführt.
Er sollte am Ende des switch-Statements stehen.
*/