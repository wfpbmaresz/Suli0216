
package intezmeny;

public class Egyetem {
    private String nev;
    private String varos;

    public Egyetem(String nev, String varos) {
        this.nev = nev;
        this.varos = varos;
    }

    @Override
    public String toString() {
        return "Egyetem:" + "nev=" + nev + ", varos=" + varos;
    }
    
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }
          
    public String getVaros() {
        return varos;
    }
  
    public void setVaros(String varos) {
        this.varos = varos;
    }
    
}
