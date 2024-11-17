public class Caesar {

    private String gt; // verschlüsselter Text
    private String kt; // Klartext
    private int s;

    /**
     * Der Konstruktor initialisiert den Klartext und Geheimtext mit leeren Strings
     * und den Schlüssel mit 0.
     */
    public Caesar() {
        this.gt = "";
        this.kt = "";
        this.s = 0;
    }

    /**
     * Die Methode verschluesseln() verschlüsselt den Klartext (kt) unter
     * Verwendung des Schlüssels (s) nach der Caesar-Methode und
     * speichert das Ergebnis im geheimen Text (gt).
     */
    public void verschluesseln() {
        if (kt == null || s == 0) {
            gt = kt;
            return;
        }

        String result = "";

        for (int i = 0; i < kt.length(); i++) {
            char ch = Character.toUpperCase(kt.charAt(i));

            if (Character.isUpperCase(ch)) {
                ch = zahlenZuBuchstaben((buchstabenZuZahlen(ch) + s) % 26);

                /*
                *
                * Das Modulo 26 sorgt dafür, dass sich der Index
                * im Bereich von 0 bis 25 (also innerhalb des Alphabets) bleibt.
                * Wenn der Index größer als 25 wird, fängt er wieder von 0 an
                */
            }

            result += ch;
        }

        gt = result;
    }


    /**
     * Die Methode entschluesseln() entschlüsselt den geheimen Text (gt) unter
     * Verwendung des Schlüssels (schluessel) nach der Caesar-Methode und
     * speichert das Ergebnis im Klartext (kt).
     */
    public void entschluesseln() {
        if (gt == null || s == 0) {
            kt = gt;
            return;
        }

        String result = "";

        for (int i = 0; i < gt.length(); i++) {
            char ch = Character.toUpperCase(gt.charAt(i));


            if (Character.isUpperCase(ch)) {
                ch = zahlenZuBuchstaben((buchstabenZuZahlen(ch) - s + 26) % 26);
            }

            result += ch;
        }

        kt = result;
    }

    /**
     * Methode zur Umwandlung eines Zahlenwerts in den entsprechenden Buchstaben
     *
     * @param pWert der Zahlenwert (Alphabet Index 0=A 1=B...)
     * @return der entsprechende Buchstabe
     */
    private char zahlenZuBuchstaben(int pWert) {
        return (char) (pWert + 'A');
    }



    private int buchstabenZuZahlen(char pWert) {
        return pWert - 'A';
    }

    // Getter und Setter Methoden

    /**
     * Gibt den verschlüsselten Text (geheimen Text) zurück.
     *
     * @return der verschlüsselte Text
     */
    public String getGt() {
        return gt;
    }

    /**
     * Setzt den verschlüsselten Text (geheimen Text).
     *
     * @param pGt der zu setzende verschlüsselte Text
     */
    public void setGt(String pGt) {
        gt = pGt;
    }

    /**
     * Gibt den unverschlüsselten Text (Klartext) zurück.
     *
     * @return der unverschlüsselte Text
     */
    public String getKt() {
        return kt;
    }

    /**
     * Setzt den unverschlüsselten Text (Klartext).
     *
     * @param pKt der zu setzende unverschlüsselte Text
     */
    public void setKt(String pKt) {
        kt = pKt;
    }

    /**
     * Gibt den Schlüssel für die Caesar-Verschlüsselung zurück.
     *
     * @return der Schlüssel
     */
    public int getS() {
        return s;
    }

    /**
     * Setzt den Schlüssel für die Caesar-Verschlüsselung.
     *
     */
    public void setS(int s) {
        this.s = s;
    }
}