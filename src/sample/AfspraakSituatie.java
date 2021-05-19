package sample;

public abstract class AfspraakSituatie {
    public abstract void beginAfspraak();
    public abstract void eindAfspraak();


    public final void afspraak(){
        beginAfspraak();
        eindAfspraak();
    }
}
