
import java.util.*;

public class Felhasznalo {

	private String nev;
	private String jelszo;
	private String email;
	private double ertekeles;
	private Cim lakhely;
	private Date szuletes;
        private int fID;
        private Antikvarium antik;
        
        
        public Felhasznalo(String nev, Cim lakhely, String jelszo, 
                Date szuletes, String email, Antikvarium a) {
            this.nev = nev;
            this.lakhely = lakhely;
            this.jelszo = jelszo;
            this.szuletes = szuletes;
            this.email = email;
            Random rnd = new Random();
            int id = rnd.nextInt(10000);
            this.fID = id;
            this.antik = a;
	}
       
        
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
      

	public Cim getLakhely() {
		return this.lakhely;
	}

	
	public void setLakhely(Cim cim) {
		lakhely.setCim(cim);
		
	}
        
        public Felhasznalo getFelhasznalo(){
            return this;
        }

    
        public int getfID() {
            return fID;
        }

        public Antikvarium getAntik() {
            return antik;
        }

}