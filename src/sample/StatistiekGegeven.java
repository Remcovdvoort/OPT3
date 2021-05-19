package sample;

import java.util.ArrayList;

public class StatistiekGegeven {


        ArrayList<Account> accounts = new ArrayList<>();
        private String naam;



        public void afspraakKlaar(Account ac) {
            accounts.add(ac);
        }

        public void afspraakNietKlaar(Account ac) {
            accounts.remove(ac);
        }

        public void melding() {
            for (Account ac : accounts) {
                ac.update();
            }
        }
        public void upload(String naam){
            this.naam = naam;
            melding();
        }
    }

