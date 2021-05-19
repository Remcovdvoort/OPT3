package sample;

public class GeplandeAfspraak extends AfspraakSituatie {
    @Override
    public void beginAfspraak(){
        System.out.println("Uw afspraak begint nu.");
    }

    @Override
    public void eindAfspraak() {
        System.out.println("Uw afspraak eindigt nu.");
    }
}
