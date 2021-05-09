package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EquivalentieklassenTest {
    @Test
    void equivalentieklassen(){
        Equivalentie eq1 = new Equivalentie("ADD", "Rustgevende melding");
        Equivalentie eq2 = new Equivalentie("Autisme", "korte woorden melding");
        Equivalentie eq3 = new Equivalentie("Blind", "Hardop voorlees melding");
        Equivalentie eq4 = new Equivalentie("Kleurenblind", "Kleurencontrast melding");

        assertEquals("Rustgevende melding", eq1.meldingKiezen());
        assertEquals("Korte woorden melding", eq2.meldingKiezen());
        assertEquals("Hardop voorlees melding", eq3.meldingKiezen());
        assertEquals("Kleurencontrast melding", eq4.meldingKiezen());


    }
}
