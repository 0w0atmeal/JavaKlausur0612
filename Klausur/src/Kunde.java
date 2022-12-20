public class Kunde extends Mensch{ //erbt von Mensch
    
    int kundennummer;
    int alter;
    int verwarnungen;


    public Kunde(String vorname, String nachname, int kundennummer, int alter, int verwarnungen){
        super(vorname, nachname);
        setKundennummer(kundennummer);
        setAlter(alter);
        setVerwarnungen(verwarnungen);
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
    public int getKundennummer() {
        return kundennummer;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public int getAlter() {
        return alter;
    }
    public void setVerwarnungen(int verwarnungen) {
        this.verwarnungen = verwarnungen;
    }
    public int getVerwarnungen() {
        return verwarnungen;
    }

    
}
