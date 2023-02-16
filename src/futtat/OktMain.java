package futtat;

import intezmeny.Egyetem;
import intezmeny.Vegzettseg;
import oktatas.Kurzus;
import oktatas.Oktato;

public class OktMain {
    static Kurzus[] kurzusok = new Kurzus[3];
    
    static int varosbanVegzettek(String varos){
        int db=0;
        
        for (int i = 0; i < kurzusok.length; i++) {
            if(kurzusok[i].getOktato().getVegzettseg().getEgyetem().getVaros().equals(varos))
                db++;
        }
        
        return db;
    }
    
    public static void main(String[] args) {
       Egyetem bme = new Egyetem("BME", "Budapest");
       Egyetem pannon = new Egyetem("Pannon","Veszprém");
       Egyetem miskolci = new Egyetem("Miskolci Egyetem","Miskolc");
       Egyetem corvinus = new Egyetem("Corvinus Egyetem","Budapest");
       
       Vegzettseg v1= new Vegzettseg("Villamosmérnök",bme);
       Vegzettseg v2= new Vegzettseg("Programozó",pannon);
       Vegzettseg v3= new Vegzettseg("Traktoros",miskolci);
       Vegzettseg v4= new Vegzettseg("Közgazdaságtan",corvinus);
       
       Oktato o1=new Oktato("Jáger Attila",v1);
       Oktato o2=new Oktato("Sallai András",v3);
       Oktato o3=new Oktato("Kukor Ica",v4);
       
       kurzusok[0]= new Kurzus("Asztali alkalmazások",o1);
       kurzusok[1]= new Kurzus("Webprogramozás",o2);
       kurzusok[2]= new Kurzus("Munkáltatói ismeretek",o3);
       
        for (int i = 0; i < kurzusok.length; i++) {
            System.out.println(kurzusok[i]);
        }
        
       System.out.println("Budapesten végzett oktatók: " +varosbanVegzettek("Budapest")+" fő");
       System.out.println("Miskolcon végzett oktatók: " +varosbanVegzettek("Miskolc")+" fő");
       System.out.println("Veszprémben végzett oktatók: " +varosbanVegzettek("Veszprém")+" fő");

    }
    
}
