package ba.unsa.etf.rs.tut4;

import ba.unsa.etf.rs.tut4.Racun.StavkaRacuna;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacunTest {

    @Test
    void test1() {
        Racun r = new Racun();
        r.dodajStavku(new Artikal("HLB", "Hljeb", 1.1), 2);
        r.dodajStavku(new Artikal("JAJ", "Jaje", 0.25), 5);
        assertEquals(3.45, r.ukupanIznos());
    }

    @Test
    void testPrazno() {
        Racun r = new Racun();
        assertEquals(0, r.ukupanIznos());
    }
    @Test
    void getArtikli(){
        Racun.StavkaRacuna artikli = new Racun.StavkaRacuna(new Artikal("PVD","Proizvod",7.8),5);
        assertEquals(new Artikal("PVD","Proizvod",7.8),artikli.getArtikli());
    }
    @Test
    void getKolicina(){
        Racun.StavkaRacuna artikli = new Racun.StavkaRacuna(new Artikal("TV","LCD",550.0),5);
        assertEquals(5,artikli.getKolicina());
    }
    @Test
    void setArtikli(){
        Racun.StavkaRacuna artikli = new Racun.StavkaRacuna(new Artikal("PVD","Proizvod",7.8),15);
        artikli.setArtikli(new Artikal("Laptop","LG",800.0));
        assertEquals(new Artikal("Laptop","LG",800.0),artikli.getArtikli());
    }
    @Test
    void setKolicina(){
        Racun.StavkaRacuna artikli = new Racun.StavkaRacuna(new Artikal("MP4","MP4",569.7),9);
        artikli.setKolicina(13);
        assertEquals(13,artikli.getKolicina());
    }
    @Test
    void GetSetCijena(){
        Racun.StavkaRacuna artikli = new Racun.StavkaRacuna(new Artikal("HLB", "Hljeb", 1.1), 2);
        artikli.getArtikli().setCijena(2);
        assertEquals(2, artikli.getArtikli().getCijena());
    }
    @Test
    void GetSetCij(){
        Racun racun = new Racun();
        racun.setId(1);
        racun.setCijena(2.5);
        assertEquals(1, racun.getId());
        assertEquals(2.5, racun.getCijena());
    }
    @Test
    void ToString(){
        Racun racun = new Racun();
        racun.setId(1);
        racun.setCijena(2.5);

        assertEquals("Racun{id=1, cijena=2.5}", racun.toString());
    }

    }

