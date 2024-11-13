//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ceasar {
    private int s;
    private String gt;

    private String kt;

    private int Ascii;
    public void verschluesseln()
    {
        for (int i = 0; i < kt.length(); i++)
        //wir gehen durch die Zeichenkette
        {
            char b = kt.charAt(i);
            //Extraktion des Zeichens an der aktuellen Position i der Zeichenkette
            if (Character.isLetter(b))
            //Überprüft, ob das aktuelle Zeichen ein Buchstabe ist(Optional
            {
                b = (char) ((((b - 'a') + s + 26) % 26) + 'a');
                //  Diese Zeile verschlüsselt den Buchstaben b durch Verschiebung
                //  seines ASCII-Wertes basierend auf dem angegebenen Schlüssel.
                //  Sie stellt sicher, dass das Ergebnis innerhalb des Alphabets bleibt,
                //  indem es modulo 26 gerechnet und anschließend wieder in einen Buchstaben konvertiert wird.
            }

    }

    public void entschluesseln()
    {


    }

    public char zahlenZuBuchstaben(int pWert)
    {


        return 0;
    }

    public  int buchstabenZuZahlen(char pWert)
    {


        return 0;
    }






    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getKt() {
        return kt;
    }

    public void setKt(String kt) {
        this.kt = kt;
    }

    public int getAscii() {
        return Ascii;
    }

    public void setAscii(int ascii) {
        Ascii = ascii;
    }
}