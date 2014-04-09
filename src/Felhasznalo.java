
import java.util.Random;
import java.util.*;

public class Felhasznalo {

	protected String nev;
	protected String jelszo;
	protected String email;
	protected double ertekeles;
	protected Cim lakhely;
	protected Date szuletes;
        protected int fID;
        
        public Felhasznalo(String nev, Cim lakhely, String jelszo, Date szuletes, String email) {
            this.nev = nev;
            this.lakhely = lakhely;
            this.jelszo = jelszo;
            this.szuletes = szuletes;
            this.email = email;
            Random rnd = new Random();
            int id = rnd.nextInt(10000);
            this.fID = id;
		
	}
        public Felhasznalo(){}
        
	public String getNev() {
		return this.nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getJelszo() {
		return this.jelszo;
	}

	public void setJelszo(String jelszo) {
		this.jelszo = jelszo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getErtekeles() {
		return this.ertekeles;
	}

	public void setErtekeles(double ertekeles) {
		this.ertekeles = ertekeles;
	}

	public Date getSzuletes() {
		return this.szuletes;
	}

	public void setSzuletes(Date szuletes) {
		this.szuletes = szuletes;
	}

        public String getSzuletesString(){
            String s = szuletes.getYear() + "." + szuletes.getMonth() + "." + szuletes.getDay();
            return s; 
        }
	

	public Cim getLakhely() {
		// TODO - implement Felhasznalo.getLakhely
		return this.lakhely;
	}

	/**
	 * 
	 * @param cim
	 */
	public void setLakhely(Cim cim) {
		// TODO - implement Felhasznalo.setLakhely
		
	}
        
        public Felhasznalo getFelhasznalo(){
            return this;
        }

    /**
     * @return the fID
     */
    public int getfID() {
        return fID;
    }

}