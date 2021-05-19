package sample;

public class Account {
    private String naam;
    private StatistiekGegeven statistiek = new StatistiekGegeven();

    public Account(String naam) {
        this.naam = naam;
    }

    public void update() {
        System.out.println("Hey " + naam + " je afspraak is afgevinkt");
    }

    public void bepaaldeMelding(StatistiekGegeven sta) {
        statistiek = sta;
    }


}



       // public boolean isAfgevinkt() {
            //return afgevinkt;
      //  }

       // public boolean isAnalyse() {
          //  return analyse;
     //  }
    //}
//}
