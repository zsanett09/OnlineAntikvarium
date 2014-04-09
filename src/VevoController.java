import java.util.*;

public class VevoController extends FelhasznaloController {

	private LicitKezelo licitKezelo;

	/**
	 * 
	 * @param osszeg
	 */
	public boolean Licit(LicitesHirdetes lc, int osszeg) {
            licitKezelo = new LicitKezelo(lc);
            Felhasznalo f = new Felhasznalo("Kezes Csaba", 
                new Cim("Veszprem", "Hovirag", "25", "8200"), "12345", 
                     new Date(1990,5,13), "kezscsaba@gmail.com");
            
            Felhasznalo fe = this.getFelhasznalo();
            boolean b = licitKezelo.Licitalas(osszeg, fe);
            return b;
	}
        
        public VevoController(Felhasznalo f){
            this.email = f.email;
            this.jelszo = f.jelszo;
            this.lakhely = f.lakhely;
            this.nev = f.nev;
            this.szuletes = f.szuletes;
            this.fID = f.fID;
        }
       


}