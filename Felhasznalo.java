public class Felhasznalo {

	protected String nev;
	protected String jelszo;
	protected String email;
	protected double ertekeles;
	protected Cim lakhely;
	protected Datum szuletes;
        
        public Felhasznalo(String nev, Cim lakhely, String jelszo, Datum szuletes, String email) {
            this.nev = nev;
            this.lakhely = lakhely;
            this.jelszo = jelszo;
            this.szuletes = szuletes;
            this.email = email;
		
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

	public Datum getSzuletes() {
		return this.szuletes;
	}

	public void setSzuletes(Datum szuletes) {
		this.szuletes = szuletes;
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

}