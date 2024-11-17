public class Caesar {
    // Attribute
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
     * Verwendung des Schlüssels (schluessel) nach der Caesar-Methode und
     * speichert das Ergebnis im geheimen Text (gt). Dabei werden nur
     * Großbuchstaben verschlüsselt.
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
            }

            result += ch;
        }

        gt = result;
    }


    /**
     * Die Methode entschluesseln() entschlüsselt den geheimen Text (gt) unter
     * Verwendung des Schlüssels (schluessel) nach der Caesar-Methode und
     * speichert das Ergebnis im Klartext (kt). Dabei werden nur Großbuchstaben
     * entschlüsselt.
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
     * Hilfsmethode zur Umwandlung eines Zahlenwerts in den entsprechenden Buchstaben
     * (nach ASCII-Tabelle).
     *
     * @param pWert der Zahlenwert
     * @return der entsprechende Buchstabe
     */
    private char zahlenZuBuchstaben(int pWert) {
        return (char) (pWert + 'A');
    }

    /**
     * Hilfsmethode zur Umwandlung eines Buchstaben in den entsprechenden Zahlenwert
     * (nach ASCII-Tabelle).
     *
     * @param pWert der Buchstabe
     * @return der entsprechende Zahlenwert
     */
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