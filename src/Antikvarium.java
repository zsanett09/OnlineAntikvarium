public class Antikvarium {

	private HirdetesKezelo hirdetesKezelo;
	private Felhasznalok felhasznalok;

	public  Antikvarium() {
            hirdetesKezelo = new HirdetesKezelo();
            felhasznalok = new Felhasznalok();
	}

 
        public HirdetesKezelo getHirdetesKezelo() {
            return hirdetesKezelo;
        }

        public Felhasznalok getFelhasznalok() {
            return felhasznalok;
        }
        
        

}