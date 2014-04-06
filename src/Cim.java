public class Cim {

	private String telepules;
	private String utca;
	private String hazszam;
	private String isz;

        public Cim(String telepules, String utca, String hazszam, String isz) {
            this.telepules = telepules;
            this.utca = utca;
            this.hazszam = hazszam;
            this.isz = isz;
		
	}

	public String getTelepules() {
		return this.telepules;
	}

	public void setTelepules(String telepules) {
		this.telepules = telepules;
	}

	public String getUtca() {
		return this.utca;
	}

	public void setUtca(String utca) {
		this.utca = utca;
	}

	public String getHazszam() {
		return this.hazszam;
	}

	public void setHazszam(String hazszam) {
		this.hazszam = hazszam;
	}

	public String getIsz() {
		return this.isz;
	}

	public void setIsz(String isz) {
		this.isz = isz;
	}



	
	public void setCim(Cim c) {
            this.telepules = c.telepules;
            this.utca = c.utca;
            this.hazszam = c.hazszam;
            this.isz = c.isz;
		
	}

	public Cim getCim() {
            return this;
	}

}