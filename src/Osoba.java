public class Osoba {
    static int ilosc;
    int id;
    String imie;
    String nazwisko;
    public Osoba(){}

    public int getId() {
        return id;
    }

    public static int getIlosc() {
        return ilosc;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
