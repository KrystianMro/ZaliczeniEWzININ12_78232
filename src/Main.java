
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Produkt produkt = new Produkt(1, "Wódka Żubrówka", new Producent(123, "Żubrówka", "Polska"), "wódka", 40.0, 29.99);


        System.out.println("Nazwa produktu: " + produkt.getNazwa());
        System.out.println("Zawartość alkoholu: " + produkt.getZawartoscAlkoholu() + "%");
        System.out.println("Producent: " + produkt.getProducent().getNazwa());


        produkt.setCena(32.99);
        produkt.setGatunek("wódka premium");


        System.out.println("Nowa cena: " + produkt.getCena());
        System.out.println("Zaktualizowany gatunek: " + produkt.getGatunek());
    }
}

class Producent {

    private int id;
    private String nazwa;
    private String kraj;

    // Konstruktor
    public Producent(int id, String nazwa, String kraj) {
        this.id = id;
        this.nazwa = nazwa;
        this.kraj = kraj;
    }


    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getKraj() {
        return kraj;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setKraj(String kraj) {
        Producent producent = this;
    }
}


