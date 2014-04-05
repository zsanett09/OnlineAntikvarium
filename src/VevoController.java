public class VevoController extends FelhasznaloController {

	//private LicitKezelo licitKezelo;
        
        
        public VevoController(Felhasznalo f){
            super(f);
         
        }
        
        boolean Licitalas(LicitesHirdetes h, int osszeg){
            LicitKezelo lk = new LicitKezelo(h);
            boolean allapot = lk.Licitalas(osszeg, fh);
            // fh- a felhasznalo amire a controller voantkozik
            return allapot;
        }


}