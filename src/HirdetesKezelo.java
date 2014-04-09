import java.util.*;

public class HirdetesKezelo {

	private ArrayList<LicitesHirdetes> licitesHirdetesek;
        
	public  HirdetesKezelo() {
		licitesHirdetesek = new ArrayList<LicitesHirdetes>();	
	}
        
        public ArrayList<LicitesHirdetes> getLicitesHirdetesek() {
		return this.licitesHirdetesek;
	}

	public void addLicitesHirdetes(LicitesHirdetes hirdetes) {
		licitesHirdetesek.add(hirdetes);
		
	}
        public LicitesHirdetes keresIDalapjan(int ID){
            
            for(int i = 0; i < licitesHirdetesek.size(); i++){
                LicitesHirdetes h = licitesHirdetesek.get(i);
                if(h.gethirdetesID() == ID )
                    return licitesHirdetesek.get(i);
            }
            return null;
        }
       
        public LicitesHirdetes getHirdetes(int i){
            return licitesHirdetesek.get(i);
        }

}