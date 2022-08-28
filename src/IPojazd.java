public interface IPojazd {
    public void ruszaj();
    public void zatrzymaj();
    public String getNazwa();

    public void setNazwa(String nazwa);

    public double getCena();

    public void setCena(double cena);

    public int getRocznik();

    public void setRocznik(int rocznik);

    public static int getIlosc(){return Pojazd.ilosc;};

    public int getId();
}
