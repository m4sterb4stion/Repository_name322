package praktika4;

public class Administration extends Personnel{
	private String countyName;
	private String post;
	private int lengthOfService;
	private int allowanceAmount;
	
	public Administration(String surname, int company, String rank, String DateOfBirth, String dateOfEntry, String unit, String countyName, String post, int lengthOfService, int allowanceAmount) {
		super(surname, company, rank, DateOfBirth, dateOfEntry, unit);
		this.countyName = countyName;
		this.post = post;
		this.lengthOfService = lengthOfService;
	}
	
	public void setcountyName(String countyName) {
		this.countyName = countyName;
	}
	public String getcountyName() {
		return countyName;
	}
	
	public void setpost(String post) {
		this.post = post;
	}
	public String getpost() {
		return post;
	}
	
	public void setlengthOfService(int lengthOfService) {
		this.lengthOfService = lengthOfService;
	}
	public int getlengthOfService() {
		return lengthOfService;
	}
	public void setallowanceAmount(int allowanceAmount) {
		this.allowanceAmount = allowanceAmount;
	}
	public int getallowanceAmount() {
		return allowanceAmount;
	}
	
	public String toString()
    {
        return super.toString() + "\nnazvanie okruga - " + countyName + "\ndolzhnost - " + post + "\nvisluga let - " + lengthOfService + "\nsumma nadbavki -" + allowanceAmount;
    }
}
