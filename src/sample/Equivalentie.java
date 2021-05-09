package sample;

public class Equivalentie {
    private String beperking;
    private String melding;


    public Equivalentie(String beperking, String melding) {
        this.beperking = beperking;
        this.melding = melding;
    }

    public String meldingKiezen() {
        if (beperking.equals("ADD")) {
            return melding = "Rustgevende melding";
        }
        if (beperking.equals("Autisme")) {
            return melding = "Korte woorden melding";
        }
        if (beperking.equals("Blind")) {
            return melding = "Hardop voorlees melding";
        }
        if (beperking.equals("Kleurenblind")) {
            return melding = "Kleurencontrast melding";
        }

        else {
            return melding = "Geen melding";
        }
    }
}


