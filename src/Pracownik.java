public class Pracownik extends Osoba{
    public static enum stanowiska {Sprzedawca,Wydawca};
    stanowiska stanowisko;
    double prowizja;

    public Pracownik(stanowiska stanowisko, double prowizja, String imie, String nazwisko){
        Osoba.ilosc++;
        this.id = ilosc;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.prowizja = prowizja;
        this.stanowisko=stanowisko;
    }

    public stanowiska getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(stanowiska stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getProwizja() {
        return prowizja;
    }

    public void setProwizja(double prowizja) {
        this.prowizja = prowizja;
    }
}
