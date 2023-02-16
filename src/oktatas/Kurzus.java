
package oktatas;


public class Kurzus {
    private String nev;
    private Oktato oktato;

    public Kurzus(String nev, Oktato oktato) {
        this.nev = nev;
        this.oktato = oktato;
    }

    public String getNev() {
        return nev;
    }

    public Oktato getOktato() {
        return oktato;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setOktato(Oktato oktato) {
        this.oktato = oktato;
    }

    @Override
    public String toString() {
        return "Kurzus neve:" + nev + ", oktato adatai:" + oktato;
    }
    
    
}
