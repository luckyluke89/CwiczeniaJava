import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class CwiczeniaJava {
    public static void main(String[] args){
        ArrayList<Pracownik> kadra = new ArrayList<Pracownik>();
        kadra.add(new Pracownik(Pracownik.stanowiska.Sprzedawca,0.10d,"Adam","Nowak"));
        kadra.add(new Pracownik(Pracownik.stanowiska.Sprzedawca,0.20d,"Jan","Kowalski"));
        kadra.add(new Pracownik(Pracownik.stanowiska.Wydawca,0.05d,"Robert","Cichocki"));

        ArrayList<Klient> klientela = new ArrayList<Klient>();
        klientela.add(new Klient(725123.22F, "Krzysztof","Kozłowski"));
        klientela.add(new Klient(34212.22F, "Jacek","Cichy"));
        klientela.add(new Klient(123421.22F, "Marta","Ciesielska"));

        ArrayList<IPojazd> flota = new ArrayList<IPojazd>();
        flota.add(new Samochod("Osobowy", "Audi", 2341410.23D, 1940));
        flota.add(new Samochod("Osobowy", "Mercedes", 234523.23D, 1999));
        flota.add(new Samochod("Dostawczy", "Scoda", 2341410.23D, 2012));
        flota.add(new Rower("Góral", "Merida", 2310.23D, 2012,2));
        flota.add(new Rower("Szosowy", "Cross", 4239.23D, 2017,2));

        for(Pracownik kadrowicz : kadra){
            System.out.println(kadrowicz.getId()+" "+kadrowicz.getImie()+" "+kadrowicz.getNazwisko()+" "+kadrowicz.getStanowisko()+" "+kadrowicz.getProwizja()+"");
        }
        System.out.println("");
        for(Klient klientowicz : klientela){
            System.out.println(klientowicz.getId()+" "+klientowicz.getImie()+" "+klientowicz.getNazwisko()+" "+klientowicz.getSrodki());
        }
        System.out.println("");
        for(IPojazd flotek  : flota){
            System.out.println(flotek.getId()+" "+flotek.getNazwa()+" "+flotek.getCena()+" "+flotek.getRocznik());
        }
        System.out.println("");

        flota.get(2).ruszaj();
        flota.get(3).ruszaj();
    }
}
