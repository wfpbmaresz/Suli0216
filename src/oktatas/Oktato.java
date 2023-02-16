
package oktatas;

import intezmeny.Vegzettseg;

public class Oktato {
    private String nev;
    private Vegzettseg vegzettseg;

    public Oktato(String nev, Vegzettseg vegzettseg) {
        this.nev = nev;
        this.vegzettseg = vegzettseg;
    }

    public String getNev() {
        return nev;
    }

    public Vegzettseg getVegzettseg() {
        return vegzettseg;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setVegzettseg(Vegzettseg vegzettseg) {
        this.vegzettseg = vegzettseg;
    }

    @Override
    public String toString() {
        return nev + "-" + vegzettseg;
    }
    
    
    
    
    
    
}
