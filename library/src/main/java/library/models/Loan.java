package library.models;

//@Entity
public class Loan {
	
	private java.sql.Date dateAdded;
	private int loans;
//	private Publisher publisher;
	private int id;
	private boolean availble;
	private int holdsCount;
	
	public java.sql.Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(java.sql.Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	public int getLoans() {
		return loans;
	}
	public void setLoans(int loans) {
		this.loans = loans;
	}
//	public Publisher getPublisher() {
//		return publisher;
//	}
//	public void setPublisher(Publisher publisher) {
//		this.publisher = publisher;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isAvailble() {
		return availble;
	}
	public void setAvailble(boolean availble) {
		this.availble = availble;
	}
	public int getHoldsCount() {
		return holdsCount;
	}
	public void setHoldsCount(int holdsCount) {
		this.holdsCount = holdsCount;
	}
	
}