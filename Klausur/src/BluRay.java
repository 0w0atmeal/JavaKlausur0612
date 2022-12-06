public class BluRay extends Medium {
    
    boolean in3D;

    public BluRay(String titel, int fsk, int laenge, boolean ausgeliehen, boolean in3D){
        super(titel, fsk, laenge, ausgeliehen);
        setIn3D(in3D);
    }

    public void setIn3D(boolean in3d) {
        in3D = in3d;
    }

    public boolean getIn3D() {
        return in3D;
    }

    public void meineDaten(){
        System.out.println(getTitel() + " " + getFsk() + " " + getLaenge() + " " + getIn3D());
    }
    
}
