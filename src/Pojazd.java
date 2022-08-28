public class Pojazd {
    static int ilosc;
    int id;
    String nazwa;
    double cena;
    int rocznik;

    public Pojazd(){}

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

    public static int getIlosc() {
        return ilosc;
    }

    public int getId() {
        return id;
    }
}
