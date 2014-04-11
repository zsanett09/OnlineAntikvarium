/**
 * @author Zsanett
 */
import java.util.*;
public class LicitKezelo {
        
        private LicitesHirdetes hirdetes;
        

	public LicitKezelo(LicitesHirdetes lh) {
            hirdetes = lh;

	}

	public boolean Licitalas(int osszeg, Felhasznalo vevo){
	
            if(vevo.getfID() == hirdetes.getTulaj().getfID()){
                return false;
            }
            if(osszeg > hirdetes.getAktalisAr()){
                hirdetes.setUjArUjLicitalo(osszeg, vevo);
                Date ido = new Date(); //ez az aktualis datummal jon letre
                Licit l = new Licit(osszeg, vevo, ido, hirdetes.gethirdetesID());
                hirdetes.addLicit(l);
                return true;
            }
            return false;
		
	}

}