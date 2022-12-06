public abstract class Medium {
    String titel;
    int fsk;
    int laenge;
    boolean ausgeliehen;

    public Medium(String titel, int fsk, int laenge, boolean ausgeliehen){
        setFsk(fsk);
        setLaenge(laenge);
        setTitel(titel);
        setAusgeliehen(ausgeliehen);
    }

   public void setFsk(int fsk) {
       this.fsk = fsk;
   }
   public void setLaenge(int laenge) {
       this.laenge = laenge;
   }
   public void setTitel(String titel) {
       this.titel = titel;
   }
   public int getFsk() {
       return fsk;
   }
   public int getLaenge() {
       return laenge;
   }
   public String getTitel() {
       return titel;
   }
   public void setAusgeliehen(boolean ausgeliehen) {
       this.ausgeliehen = ausgeliehen;
   }
   public boolean getAusgeliehen() {
    return ausgeliehen;
}
  

   public abstract void meineDaten();




}
