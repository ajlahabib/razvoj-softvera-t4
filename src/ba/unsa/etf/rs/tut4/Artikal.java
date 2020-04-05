package ba.unsa.etf.rs.tut4;

import java.util.ArrayList;
import java.util.Objects;

public class Artikal {
    private String sifra;
    private String naziv;
    private double cijena;

    public Artikal() { }

    public Artikal(String artikal) {
        String[] attribs = artikal.split(",");
        setSifra(attribs[0]);
        setNaziv(attribs[1]);
        setCijena(Double.parseDouble(attribs[2]));
    }

    public Artikal(String sifra, String naziv, double cijena){
        setSifra(sifra);
        setNaziv(naziv);
        setCijena(cijena);
    }
    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        if(sifra.isEmpty()){
            throw new IllegalArgumentException("Sifra je prazna!");
        }
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if(naziv.isEmpty()){
            throw new IllegalArgumentException("Naziv je prazan!");
        }
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        if(cijena<0){
            throw new IllegalArgumentException("Cijena je negativna!");
        }
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "Artikal{" +
                "sifra='" + sifra + '\'' +
                ", naziv='" + naziv + '\'' +
                ", cijena=" + cijena +
                '}';
    }

    @Override
    public boolean equals(Object o) {
      /* if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikal artikal = (Artikal) o;
        return Double.compare(artikal.cijena, cijena) == 0 &&
                sifra.equals(artikal.sifra) &&
                naziv.equals(artikal.naziv);*/
      if(!(o instanceof Artikal)) return false;
     Artikal artikal=(Artikal) o;
     if(!artikal.sifra.equals(this.sifra) || !artikal.naziv.equals(this.naziv) || artikal.cijena!=(this.cijena))return false;
     return true;

    }

    @Override
    public int hashCode() {
        return Objects.hash(sifra, naziv, cijena);
    }


  public static ArrayList<Artikal> izbaciDuplikate (ArrayList<Artikal>artikal){
      for(int i=0;i<artikal.size();i++){
          for(int j=i+1;j<artikal.size();j++){
              if(artikal.get(i).equals(artikal.get(j))) {
                  artikal.remove(j);
                  j--;
              }
          }
      }
      return artikal;
  }
}


