package SpringCoreAssignment;

public class Customer {
	
	private int custId;
	private String customerName;
	private int customerContact;
	private Address customerAddress;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Customer(int custId, String customerName, int customerContact, Address customerAddress) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + ", customerContact=" + customerContact
				+ ", customerAddress=" + customerAddress + "]";
	}


}
