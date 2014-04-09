
import java.util.*;

public class LicitesHirdetes {

	private Konyv konyv;
	private int minimalAr;
	private int licitLepcso;
	private int aktualisAr;
	private int kikialtasiAr;
	private Felhasznalo utolsoErvenyesLicitalo;
        private int hirdetesID;
        private Felhasznalo tulaj;
        private ArrayList<Licit> licitek;
        
        public  LicitesHirdetes(Konyv konyv, int minimalAr, int licitLepcso, 
                int kikialtasiAr, Felhasznalo tulaj) {
            this.konyv = konyv;
            this.minimalAr = minimalAr;
            this.licitLepcso = licitLepcso;
            this.kikialtasiAr = kikialtasiAr;
            this.aktualisAr = this.kikialtasiAr;
            Random rnd = new Random();
            int id = rnd.nextInt(10000);
            this.hirdetesID = id;
            this.tulaj = tulaj;
            licitek = new ArrayList<Licit>();
	}

        public Felhasznalo getTulaj(){
            return this.tulaj;
        }

	public Konyv getKonyv() {
		return this.konyv;
	}

	public int getMinimalAr() {
		return this.minimalAr;
	}

	public int getLicitLepcso() {
		return this.licitLepcso;
	}

	public int getKikialtasiAr() {
		return this.kikialtasiAr;
	}

	public Felhasznalo getUtolsoErvenyesLicitalo() {
		return this.utolsoErvenyesLicitalo;
	}

	public int getAktalisAr() {
		return this.aktualisAr;
	}

         public int gethirdetesID() {
            return hirdetesID;
        }
         
	public LicitesHirdetes getLicitesHirdetes() {
		return this;
	}
        
	public void setUjArUjLicitalo(int osszeg, Felhasznalo v) {
            this.aktualisAr = osszeg;
            this.utolsoErvenyesLicitalo = v;
		
	}

	public boolean addLicit(Licit uj){
            licitek.add(uj);
            return true;
        }
        
	

   

}