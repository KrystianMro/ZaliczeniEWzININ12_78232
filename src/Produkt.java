public class Produkt {

    public int id;
    public String nazwa;
    public Producent producent;
    public String gatunek;
    public double zawartoscAlkoholu;
    public double cena;


    public Produkt(int id, String nazwa, Producent producent, String gatunek,
                   double zawartoscAlkoholu, double cena) {
        this.id = id;
        this.nazwa = nazwa;
        this.producent = producent;
        this.gatunek = gatunek;
        this.zawartoscAlkoholu = zawartoscAlkoholu;
        this.cena = cena;
    }


    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Producent getProducent() {
        return producent;
    }

    public String getGatunek() {
        return gatunek;
    }

    public double getZawartoscAlkoholu() {
        return zawartoscAlkoholu;
    }

    public double getCena() {
        return cena;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public void setZawartoscAlkoholu(double zawartoscAlkoholu) {
        this.zawartoscAlkoholu = zawartoscAlkoholu;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


    @Override
    public String toString() {
        return "Produkt{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", producent=" + producent +
                ", gatunek='" + gatunek + '\'' +
                ", zawartoscAlkoholu=" + zawartoscAlkoholu +
                ", cena=" + cena +
                '}';
    }
}
