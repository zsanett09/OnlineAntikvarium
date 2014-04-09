public class Antikvarium {

	private HirdetesKezelo hirdetesKezelo;
	private Felhasznalok felhasznalok;

	public  Antikvarium() {
		// TODO - implement Antikvarium.Antikvarium
            hirdetesKezelo = new HirdetesKezelo();
            felhasznalok = new Felhasznalok();
		
	}

    /**
     * @return the hirdetesKezelo
     */
    public HirdetesKezelo getHirdetesKezelo() {
        return hirdetesKezelo;
    }

    /**
     * @return the felhasznalok
     */
    public Felhasznalok getFelhasznalok() {
        return felhasznalok;
    }
        
        

}