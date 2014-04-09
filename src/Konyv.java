
import java.util.Date;

public class Konyv {

	private String szerzo;
	private String cim;
	private String allapot;
	//private Datum kiadas;
        private Date kiadas;
        
        
        
	public String getCim() {
		return this.cim;
	}

	public String getAllapot() {
		return this.allapot;
	}

	/**
	 * 
	 * @param szerzo
	 * @param cim
	 * @param kiadas
	 * @param allapot
	 */
	public  Konyv(String szerzo, String cim, Date kiadas, String allapot) {
		this.szerzo = szerzo;
                this.cim = cim;
                this.kiadas = kiadas;
                this.allapot = allapot;
		
	}

	public String getSzerz() {
		// TODO - implement Konyv.getSzerz
		return this.szerzo;
	}

	public String getKiadasString() {
		// TODO - implement Konyv.getKiadas
           
            String s = kiadas.getYear() + "." + kiadas.getMonth() + "." + kiadas.getDay();
            return s;
	}

	public Konyv getKonyv() {
		// TODO - implement Konyv.getKonyv
		return this;
	}

}