package ch.akratash.m226b.lb1.coronaprovider;

public class Coronadata {

    private final long id; // YYYYMM
	private final String date; // YYYYMM
	private final String tested;
	private final String confirmed; // cases
	private final String deceased;


	public Coronadata(long id, String date, String tested, String confirmed, String deceased) {
        this.id = id;
		this.date = date;
		this.tested = tested;
		this.confirmed = confirmed;
		this.deceased = deceased;
	}

	public long getId() {
		return id;
    }
    
    public String getDate() {
        return date;
	}
	
	public String getTested() {
		return tested;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public String getDeceased(){
		return deceased;
	}
}