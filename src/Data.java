

public class Data {
	
	private String name;
	private String surname;
	private String src_iban;
	private String dst_iban;
	private double amount;
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Data(String name, String surname, String src_iban, String dst_iban, double amount) {
		super();
		this.name = name;
		this.surname = surname;
		this.src_iban = src_iban;
		this.dst_iban = dst_iban;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSrc_iban() {
		return src_iban;
	}

	public void setSrc_iban(String src_iban) {
		this.src_iban = src_iban;
	}

	public String getDst_iban() {
		return dst_iban;
	}

	public void setDst_iban(String dst_iban) {
		this.dst_iban = dst_iban;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", surname=" + surname + ", src_iban=" + src_iban + ", dst_iban=" + dst_iban
				+ ", amount=" + amount + "]";
	}
	
	
	
	
	
}
