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

                    System.out.print("Gebe den Schlüssel ein:");
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