/**
 * @author Zsanett
 */
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
                return true;
            }
            return false;
		
	}

}