package bussiness;

public class companyBasics {

	private String name;
	private String part;
	private String addr;
	private String birthday;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public void print() {
		
		System.out.printf("이름 : " + this.name+"\n");
		System.out.printf("부서 : " + this.part+"\n");
		System.out.printf("주소 : " + this.addr+"\n");
		System.out.printf("생일 : " + this.birthday+"\n");
	}
	
	
}
