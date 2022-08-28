public class Samochod extends Pojazd implements IPojazd{

    public Samochod(String rodzaj, String nazwa, double cena, int rocznik){
        Pojazd.ilosc++;
        this.id = ilosc;
        this.nazwa = nazwa;
        this.cena = cena;
        this.rocznik = rocznik;
    }



    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    @Override
    public void ruszaj() {
        System.out.println("Samochód ruszył");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Samochód zatrzymał się");
    }
}
