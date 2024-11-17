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
            option = sc.nextInt();
            sc.nextLine(); // Puffer leeren

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
                    sc.nextLine(); // Puffer leeren

                    caesar.verschluesseln();
                    System.out.println("Verschlüsselte Nachricht: " + caesar.getGt());
                    break;
                case 2:
                    System.out.println("Gebe die verschlüsselte Nachricht ein:");
                    caesar.setGt(sc.nextLine());

                    System.out.print("Gebe den Schlüssel ein:");
                    caesar.setS(sc.nextInt());
                    sc.nextLine(); // Puffer leeren

                    caesar.entschluesseln();
                    System.out.println("Entschlüsselte Nachricht: " + caesar.getKt());
                    break;
                default:
                    System.out.println("Ungültige Option, bitte wähle erneut.");
            }
        } while (option != 0);

        sc.close();
    }
}