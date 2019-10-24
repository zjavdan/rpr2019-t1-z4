package ba.unsa.etf.rpr;

public class Korpa {
    public Artikl[] a = new Artikl[50];
    private int vel = 0;

    public boolean dodajArtikl(Artikl ar){
        if(vel > 50){
            a[vel] = new Artikl(ar.getNaziv(), ar.getCijena(), ar.getKod());
            vel++;
            return true;
        }
        return false;
    }

    public void IspisiKorpu() {
        for (int i = 0; i < vel; i++) {
            System.out.println("Naziv atrikla: " + a[i].getNaziv() + " \nCijena artikla: " + a[i].getCijena()
                    + "\nKod artikla: " + a[i].getKod());
        }
    }

    public Artikl[] getArtikli(){
        return a;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i = 0; i < vel; i++){
            if(a[i].getKod().equals(kod)) {
                Artikl ar = new Artikl(a[i].getNaziv(), a[i].getCijena(), a[i].getKod());
                for (int j = i; j < vel-1; j++) {
                    a[j] = a[j + 1];
                }
                vel--;
                return ar;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala(){
        int s = 0;
        for(int i = 0; i < vel; i++){
            s += a[i].getCijena();
        }
        return s;
    }
}

