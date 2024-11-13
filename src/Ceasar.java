//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ceasar {
    private int s;
    private String gt;
    private String kt;
    public void verschluesseln()
    {
        char[] textArray = kt.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            if (Character.isLetter(textArray[i])) {
                if (Character.isUpperCase(textArray[i])) {
                    textArray[i] = (char) ('A' + (textArray[i] - 'A' + s) % 26);
                } else {
                    textArray[i] = (char) ('a' + (textArray[i] - 'a' + s) % 26);
                }
            }
        }
        gt = new String(textArray);

    }

    public void entschluesseln()
    {


    }

    public char zahlenZuBuchstaben(int pWert)
    {
        return (char) (pWert + 'a');
        //maybe falsch
    }

    public int getAscii(char pWert) {
        return (int) pWert;
    }

    public  int buchstabenZuZahlen(char pWert)
    {

        return Character.isUpperCase(pWert) ? pWert - 'A' : pWert - 'a';


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

    public void setKt(String kt) {
        this.kt = kt;
    }
}