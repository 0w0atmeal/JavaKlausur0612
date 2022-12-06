public class Kunde extends Mensch{
    
    int kundennummer;


    public Kunde(String vorname, String nachname, int kundennummer){
        super(vorname, nachname);
        setKundennummer(kundennummer);
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
    public int getKundennummer() {
        return kundennummer;
    }

    
}
