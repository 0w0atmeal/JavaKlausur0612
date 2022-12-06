public class CD extends Medium {
    
    String cdTyp;

    public CD(String titel, int fsk, int laenge, boolean ausgeliehen, String cdTyp){
        super(titel, fsk, laenge, ausgeliehen);
        setCdTyp(cdTyp);
    }

    public void setCdTyp(String cdTyp) {
        this.cdTyp = cdTyp;
    }
    public String getCdTyp() {
        return cdTyp;
    }

    public void meineDaten(){
        System.out.println(getTitel() + " " + getFsk() + " " + getLaenge() + " " + getCdTyp());
    }
}
