/**
 * @author Zsanett
 */
public class LicitKezelo {
        
        private LicitesHirdetes hirdetes;
        //private HirdetesKezelo hk;

	public LicitKezelo(LicitesHirdetes lh) {
            
            hirdetes = lh;

	}

	/**
	 * 
	 * @param osszeg
	 */
	public boolean Licitalas(int osszeg, Felhasznalo v) {
		
            if(osszeg > hirdetes.getAktalisAr()){
                hirdetes.setUjArUjLicitalo(osszeg, v);
                return true;
            }
            return false;
		
	}

}