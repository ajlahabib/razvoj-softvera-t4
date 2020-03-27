package ba.unsa.etf.rs.tut4;

import java.util.ArrayList;

public class Racun {
    private int id;
    private double cijena;
    static class StavkaRacuna{
        public Artikal artikli;
       private Integer kolicina;

        public StavkaRacuna(Artikal artikli, Integer kolicina) {
            this.artikli = artikli;
            this.kolicina = kolicina;
        }

        public Artikal getArtikli() {
            return artikli;
        }

        public void setArtikli(Artikal artikli) {
            this.artikli = artikli;
        }

        public Integer getKolicina() {
            return kolicina;
        }

        public void setKolicina(Integer kolicina) {
            this.kolicina = kolicina;
        }
    }

    public Racun(int id, double cijena) {
        this.id = id;
        this.cijena = cijena;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Racun{" +
                "id=" + id +
                ", cijena=" + cijena +
                '}';
    }

    private ArrayList<StavkaRacuna> stavkeRacuna;

    public Racun() {
        stavkeRacuna = new ArrayList<>();
    }

    public void dodajStavku(Artikal artikal, int i) {
        stavkeRacuna.add(new StavkaRacuna(artikal,i));

    }

    public double ukupanIznos() {
        double suma=0;
        for(StavkaRacuna stavkaRacuna: stavkeRacuna){
            suma+=stavkaRacuna.getKolicina() * stavkaRacuna.artikli.getCijena();

        }
        return suma;
    }
}
