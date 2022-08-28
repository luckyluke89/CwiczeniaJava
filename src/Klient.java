public class Klient extends Osoba{
    float srodki;
    public Klient(float srodki, String imie, String nazwisko){
        Osoba.ilosc++;
        this.id = ilosc;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.srodki = srodki;
    }

    public float getSrodki() {
        return srodki;
    }

    public void setSrodki(float srodki) {
        this.srodki = srodki;
    }
}
