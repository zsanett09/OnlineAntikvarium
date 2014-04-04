
import java.util.Random;

public class LicitesHirdetes {

	private Konyv konyv;
	private int minimalAr;
	private int licitLepcso;
	private int aktualisAr;
	private int kikialtasiAr;
	private Felhasznalo utolsoErvenyesLicitalo;
        private int ID;

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
		// TODO - implement LicitesHirdetes.getAktalisAr
		return this.aktualisAr;
	}

	/**
	 * 
	 * @param osszeg
	 * @param v
	 */
	public void setUjArUjLicitalo(int osszeg, Felhasznalo v) {
            this.aktualisAr = osszeg;
            this.utolsoErvenyesLicitalo = v;
		
	}

	public LicitesHirdetes getLicitesHirdetes() {
		return this;
	}

	/**
	 * 
	 * @param minimalAr
	 * @param licitLepcso
	 * @param kikialtasiAr
	 */
	public  LicitesHirdetes(Konyv konyv, int minimalAr, int licitLepcso, int kikialtasiAr) {
		// TODO - implement LicitesHirdetes.LicitesHirdetes
            this.konyv = konyv;
            this.minimalAr = minimalAr;
            this.licitLepcso = licitLepcso;
            this.kikialtasiAr = kikialtasiAr;
            this.aktualisAr = this.kikialtasiAr;
            Random rnd = new Random();
            int id = rnd.nextInt(10000);
            this.ID = id;
	}

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

}