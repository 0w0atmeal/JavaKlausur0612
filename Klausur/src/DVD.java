public class DVD extends Medium {
    
    boolean inFullHD;

    public DVD(String titel, int fsk, int laenge, boolean ausgeliehen, boolean inFullHD){
        super(titel, fsk, laenge, ausgeliehen);
        setInFullHD(inFullHD);
    }
    

    public void setInFullHD(boolean inFullHD) {
        this.inFullHD = inFullHD;
    }

    public boolean getInFullHD() {
        return inFullHD;
    }

    public void meineDaten(){
        System.out.println(getTitel() + " " + getFsk() + " " + getLaenge() + " " + getInFullHD());
    }
    
}
