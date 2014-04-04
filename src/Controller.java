import java.util.*;
public class Controller {

	private EladoController eladoController;
	private FelhasznaloController felhasznaloController;
	private VevoController vevoController;

	public Controller() {
		eladoController = new EladoController();
                felhasznaloController = new FelhasznaloController();
                //vevoController = new VevoController( );
		
	}

	public ArrayList<LicitesHirdetes> Listazas() {
		// TODO - implement Controller.Listazas
		return null;
	}

	public boolean Licitalas(LicitesHirdetes h, int osszeg) {
            boolean b = vevoController.Licit(h, osszeg);
            return b;
	}

        public void ujVevoCont(Felhasznalo f){
            vevoController = new VevoController(f);
        }
        
//          public void ujFelhasznaloCont(Felhasznalo f){
//            felhasznaloController = new FelhasznaloController(f);
//        }

    /**
     * @return the felhasznaloController
     */
    public FelhasznaloController getFelhasznaloController() {
        return felhasznaloController;
    }
}