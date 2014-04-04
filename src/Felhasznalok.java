import java.util.*;

public class Felhasznalok {

	private ArrayList<Felhasznalo> felhasznalok;

	public Felhasznalok() {
            felhasznalok = new ArrayList<Felhasznalo>();
	}
        
        public void addFelhasznalo(Felhasznalo f){
            felhasznalok.add(f);
        }
        
          public Felhasznalo keresIDalapjan(int ID){
            
            for(int i = 0; i < felhasznalok.size(); i++){
                Felhasznalo h = felhasznalok.get(i);
                if(h.getfID() == ID )
                    return felhasznalok.get(i);
            }
            return null;
        }

}