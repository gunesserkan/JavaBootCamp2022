package oop1;

public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxtName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxtName() {
		return taxtName;
	}

	public void setTaxtName(String taxtName) {
		this.taxtName = taxtName;
	}

}
