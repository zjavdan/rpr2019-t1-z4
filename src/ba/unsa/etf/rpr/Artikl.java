package ba.unsa.etf.rpr;

public class Artikl {
    public String naziv;
    public int cijena;
    public String kod;

    Artikl(String ime, int c, String k){
        naziv = ime;
        cijena = c;
        kod = k;
    }

    public String getNaziv(){
        return this.naziv;
    }

    public int getCijena(){
        return this.cijena;
    }

    public String getKod(){
        return this.kod;
    }

}
