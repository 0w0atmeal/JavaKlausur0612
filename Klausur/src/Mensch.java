public class Mensch { //Oberklasse Mensch um redundanten Code zu vermeiden
    String vorname; 
    String nachname;

    public Mensch(String vorname, String nachname){
        setNachname(nachname);
        setVorname(vorname);
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public String getVorname() {
        return vorname;
    }
}
