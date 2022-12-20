public class Schallplatte extends Medium{ //erbt von Medium
    
    boolean darfVerleihen;

    public Schallplatte(String titel, int fsk, int laenge, boolean ausgeliehen, boolean darfVerleihen){
        super(titel, fsk, laenge, ausgeliehen);
        setDarfVerleihen(darfVerleihen);
    }

    public void setDarfVerleihen(boolean darfVerleihen) {
        this.darfVerleihen = darfVerleihen;
    }

    public boolean getDarfVerleihen() {
        return darfVerleihen;
    }

    public void meineDaten(){
        System.out.println(getTitel() + " " + getFsk() + " " + getLaenge() + " " + getDarfVerleihen());
    }

}
