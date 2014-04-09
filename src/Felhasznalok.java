import java.util.*;

public class Felhasznalok {

	private ArrayList<Felhasznalo> felhasznalok;

	public Felhasznalok() {
            felhasznalok = new ArrayList<Felhasznalo>();
	}
        
        public void addFelhasznalo(Felhasznalo f){
            felhasznalok.add(f);
        }
        
         public Felhasznalo getFelhasznalo(int i){
            return felhasznalok.get(i);
        }
        
          public Felhasznalo keresIDalapjan(int ID){
            
            for(int i = 0; i < felhasznalok.size(); i++){
                Felhasznalo h = felhasznalok.get(i);
                if(h.getfID() == ID )
                    return felhasznalok.get(i);
            }
            return null;
        }
          
        public FelhasznaloController getFelhasznaloC(int ID){
            Felhasznalo f = keresIDalapjan(ID);
            FelhasznaloController fc = new FelhasznaloController(f);
            return fc;
        }
        public VevoController getVevoC(int ID){
            Felhasznalo f = keresIDalapjan(ID);
            VevoController vc = new VevoController(f);
            return vc;
        }
        public EladoController getEladoC(int ID){
            Felhasznalo f = keresIDalapjan(ID);
            EladoController ec = new EladoController(f);
            return ec;
        }
}