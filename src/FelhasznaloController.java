import java.util.*;
public class FelhasznaloController {

    protected Felhasznalo fh;
  
    public  FelhasznaloController(Felhasznalo f) {
       fh = f;
    }

    public ArrayList<LicitesHirdetes> hiretesListazastKer(){
        ArrayList<LicitesHirdetes> l = 
                fh.getAntik().getHirdetesKezelo().getLicitesHirdetesek();
        
        return l;
    }

}