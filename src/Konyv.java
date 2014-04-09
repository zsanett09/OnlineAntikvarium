import java.util.*;
public class Konyv {

	private String szerzo;
	private String cim;
	private String allapot;
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
		
		return this.szerzo;
	}

	public String getKiadasS() {
            String s = kiadas.getYear() + "." + kiadas.getMonth() + "." + kiadas.getDay();
            return s;
	}
        
      

	public Konyv getKonyv() {
		
		return this;
	}

}