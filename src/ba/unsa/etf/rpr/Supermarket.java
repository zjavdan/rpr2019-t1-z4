package ba.unsa.etf.rpr;

public class Supermarket {
    public Artikl[] a = new Artikl[1000];
    public Korpa korpa;
    private String k;
    private int vel = 0;

    public void dodajArtikl(Artikl ar){
        if(vel < 1000){
            a[vel] = new Artikl(ar.getNaziv(), ar.getCijena(), ar.getKod());
            vel++;
        }
    }

    public Artikl[] getArtikli(){
        return a;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i = 0; i < vel; i++){
            if(a[i].getKod().equals(kod)){
                Artikl artikl = new Artikl(a[i].getNaziv(), a[i].getCijena(), a[i].getKod());
                for(int j = i; j < vel-1; j++){
                    a[j] = a[j+1];
                }
                vel--;
                return artikl;
            }
        }
        return null;
    }

}
