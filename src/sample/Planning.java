package sample;

public class Planning {
    private boolean datumAfspraak;
    private int positiefAantalMinuten;
    private boolean vakjeAangevinkt;

    public Planning (boolean datumAfspraak, int positiefAantalMinuten, boolean vakjeAangevinkt){
        this.datumAfspraak = datumAfspraak;
        this.positiefAantalMinuten = positiefAantalMinuten;
        this.vakjeAangevinkt = vakjeAangevinkt;
    }

    public boolean kloppendePlanning (boolean datum, int getal, boolean vakje){
        return (datum ==datumAfspraak) ^ ((getal > positiefAantalMinuten) & (vakje == vakjeAangevinkt));
    }
}

