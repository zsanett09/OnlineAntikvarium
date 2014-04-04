import java.io.*;
public class Datum {

	private int ev;
	private int ho;
	private int nap;

	/**
	 * 
	 * @param ev
	 * @param ho
	 * @param nap
	 */
	public Datum(int ev, int ho, int nap) {
            
            this.ev = ev;
            this.ho = ho;
            this.nap = nap;
            
		
	}

	public String getDatum() {
            String s = ev + "." + ho + "." + nap;
            return s;
	}

	/**
	 * 
	 * @param datum
	 */
	public void setDatum(Datum datum) {
		// TODO - implement Datum.setDatum
	}

}