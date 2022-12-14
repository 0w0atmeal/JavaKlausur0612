import java.util.ArrayList;

public class App {
    static ArrayList<Medium> medien;
    static ArrayList<Schallplatte> schallplatten;
    static ArrayList<Kunde> kunden;
    public static void main(String[] args) throws Exception {
        
        setMedien(new ArrayList<Medium>());
        setSchallplatten(new ArrayList<Schallplatte>());
        demoTest();
        testWarnungen();
        zeigeMedien();
        ueberschreibeAusleihe(false); //alle Medien werden auf "nicht ausgeliehen" gesetzt (ausgelagert in ueberschreibeAusleihe) 
        aendereSchallplatten(true); //alle Schallplatten dürfen wieder ausgeliehen werden (ausgelagert in aendereSchallplatten)
    }

    public static void demoTest(){ //Ausleihe in Methode demoTest ausgelagert

        Kunde k1 = new Kunde("Lina", "El Bergui", 1234, 15, 0);
        Kunde k2 = new Kunde("Dieter", "Schmidt", 234523456, 18, 6);
        Kunde k3 = new Kunde("Peter", "Müller", 4, 3789, 6);

        kunden.add(k1);
        kunden.add(k2);
        kunden.add(k3);

        Schallplatte s1 = new Schallplatte("Platzhalter", 0, 2, false, true);
        Schallplatte s2 = new Schallplatte("Platzhalter3", 0, 3, false, false);
        DVD d1 = new DVD("Platzhalter2", 12, 122, false, false);
        DVD d2 = new DVD("Platzhalter3", 18, 122, false, false);
        BluRay b1 = new BluRay("Platzhalter5", 0, 144, false, false);
        BluRay b2 = new BluRay("Plathalter6", 0, 155, false, false);
        BluRay b3 = new BluRay("fbvjsbkvli", 0, 0, false, false);
        BluRay b4 = new BluRay("dkgoslekö", 0, 0, false, false);


        medien.add(s1);
        medien.add(s2);
        medien.add(d1);
        medien.add(d2);
        medien.add(b1);
        medien.add(b2);
        medien.add(b3);
        medien.add(b4);

        Medium[] ausgelieheneMedien = new Medium[5];
        ausgelieheneMedien[0] = s1;
        ausgelieheneMedien[1] = s2;
        ausgelieheneMedien[2] = d1;
        ausgelieheneMedien[3] = d2;
        ausgelieheneMedien[4] = b1;
        ausgelieheneMedien[5] = b2; //ein sechstes Medium kann aufgrund des Arrays nicht ausgeliehen werden

        for(Medium ausgeliehenesMedium : ausgelieheneMedien){ // Abfrage von Alter und Verleihbarkeitsstatus
            if(ausgeliehenesMedium.getFsk() >  k1.getAlter()){
                System.out.println("Fsk nicht erfüllt");
            }
            if(ausgeliehenesMedium.getDarfVerleihen() == false){
                System.out.println("Schallplatte nicht ausleihbar");
            }
            else{
                System.out.println("Ausleihe erfolgreich");
            }
        }

        schallplatten.add(s1);
        schallplatten.add(s2);
    }

    public static void testWarnungen(){ //nachdem zuerst die Basiskriterien für eine Ausleihe überprüft wurden, wird jetzt der Kunde auf Warnungen überprüft
        for(Kunde kunde : getKunden()){
            if(kunde.getVerwarnungen() > 5){
                System.out.println(kunde.getVorname() + " " + kunde.getNachname() + " darf nichts mehr ausleihen!!!");
            }
        }
    }

    public static void zeigeMedien(){ //alle Medien werden nummeriert in einer Liste untereinander ausgegeben
        int i = 1;
        for(Medium medien : getMedien()){
            System.out.print(i + ". ");
            medien.meineDaten();
            i++;
        }
    }

    public static void ueberschreibeAusleihe(boolean Wert){
        for(Medium medien : getMedien()){
            medien.setAusgeliehen(Wert);
        }
        System.out.println("Ausleihe überschrieben!");
    }

    public static void aendereSchallplatten(boolean Wertt){
        
        for(Schallplatte schallplatten : getSchallplatten()){
            schallplatten.setDarfVerleihen(Wertt);
        }
        System.out.println("Alle Schallplatten zurückgesetzt");
    }

    public static void setMedien(ArrayList<Medium> medien) {
        App.medien = medien;
    }
    public static ArrayList<Medium> getMedien() {
        return medien;
    }

    public static void setSchallplatten(ArrayList<Schallplatte> schallplatten) {
        App.schallplatten = schallplatten;
    }
    public static ArrayList<Schallplatte> getSchallplatten() {
        return schallplatten;
    }

    public static void setKunden(ArrayList<Kunde> kunden) {
        App.kunden = kunden;
    }
    public static ArrayList<Kunde> getKunden() {
        return kunden;
    }

}
