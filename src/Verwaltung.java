import java.util.Scanner;

public class Verwaltung {

    public static void Scanner(String[] Args) {
        Scanner sc = new Scanner(System.in);
        //eingabe wird durch den scanner "wahrgenommen", dieser wird initialisiert

        System.out.println("Gebe eine Nachricht zum verschlüsseln ein:");
        String Kt = sc.nextLine();
        //user input (zu Verschlüsselende Zeichenkette)
        System.out.print("Gebe den Schlüssel ein:");
        int s = sc.nextInt();
        //Verschiebung durch CAESAR
        String GT = verschluesseln(Kt, Schuessel);

        System.out.println("verschlüsselte Nachricht: " + GT);

        sc.close();
    }
}
