import java.util.*;

public class BazaDanych {

    public List<Produkt> produkty;

    public BazaDanych() {
        produkty = new ArrayList<>();

}


    public void BazaDanych() {
        produkty = new ArrayList<>();
    }





    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }


    public void edytujProdukt(Produkt produkt) {
        int index = produkty.indexOf(produkt);
        if (index != -1) {
            produkty.set(index, produkt);
        }
    }


    public void usunProdukt(Produkt produkt) {
        produkty.remove(produkt);
    }


    public List<Produkt> pobierzWszystkieProdukty() {
        return new ArrayList<>(produkty);
    }


    public Produkt pobierzProduktPoId(int id) {
        for (Produkt produkt : produkty) {
            if (produkt.getId() == id) {
                return produkt;
            }
        }
        return null;
    }


    public List<Produkt> pobierzProduktyPoProducencie(Producent producent) {
        List<Produkt> produktyProducenta = new ArrayList<>();
        for (Produkt produkt : produkty) {
            if (produkt.getProducent().equals(producent)) {
                produktyProducenta.add(produkt);
            }
        }
        return produktyProducenta;
    }


    public List<Produkt> pobierzProduktyPoGatunku(String gatunek) {
        List<Produkt> produktyGatunku = new ArrayList<>();
        for (Produkt produkt : produkty) {
            if (produkt.getGatunek().equals(gatunek)) {
                produktyGatunku.add(produkt);
            }
        }
        return produktyGatunku;
    }
}
