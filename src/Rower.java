public class Rower extends Pojazd implements IPojazd{

    int iloscKol;
    public Rower(String rodzaj, String nazwa, double cena, int rocznik, int iloscKol){
        Pojazd.ilosc++;
        this.id = ilosc;
        this.nazwa = nazwa;
        this.cena = cena;
        this.rocznik = rocznik;
        this.iloscKol = iloscKol;
    }

    @Override
    public void ruszaj() {
        System.out.println("Rower ruszył");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Rower zatrzymał się");
    }

    public int getIloscKol() {
        return iloscKol;
    }

    public void setIloscKol(int iloscKol) {
        this.iloscKol = iloscKol;
    }
}
