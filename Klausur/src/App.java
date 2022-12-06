import java.util.ArrayList;

public class App {
    static ArrayList<Medium> medien;
    static ArrayList<Schallplatte> schallplatten;
    public static void main(String[] args) throws Exception {
        setMedien(new ArrayList<Medium>());
        setSchallplatten(new ArrayList<Schallplatte>());
        demoTest();
        zeigeMedien();
        ueberschreibeMedien(false);
        aendereSchallplatten(false);
    }

    public static void demoTest(){

    }

    public static void zeigeMedien(){
        int i = 1;
        for(Medium medien : getMedien()){
            System.out.print(i + ". ");
            medien.meineDaten();
            i++;
        }
    }

    public static void ueberschreibeMedien(boolean Wert){
        for(Medium medien : getMedien()){
            medien.setAusgeliehen(Wert);
        }
        System.out.println("Medien überschrieben!");
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

}
