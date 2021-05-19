package sample;

import java.util.ArrayList;



public class StatistiekGegeven {


        ArrayList<Account> afspraken = new ArrayList<>();
        private String naam;

    public void afspraakKlaar(Account ac) {
            afspraken.remove(ac);
        }

        public void afspraakNietKlaar(Account ac) {
            afspraken.add(ac);
        }

        public void melding() {
            for (Account ac : afspraken) {
                ac.update();
            }
        }
        public void upload(String naam){
            this.naam = naam;
            melding();
        }
    }

