import java.io.*;
public class Datum {

	private int ev;
	private int ho;
	private int nap;

	
	public Datum(int ev, int ho, int nap) {
            this.ev = ev;
            this.ho = ho;
            this.nap = nap;

	}

	public String getDatum() {
            String s = ev + "." + ho + "." + nap;
            return s;
	}

	
	public void setDatum(Datum d) {
		// TODO - ellenorizni a számokat
            this.ev = d.ev;
            this.ho = d.ho;
            this.nap = d.nap;
	}

}