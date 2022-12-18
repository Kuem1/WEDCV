package model;

public class cv {
    private int idcv;
    private String name;
    private String email;
    private String phone;
    private String hobby;
    private int idu;
    
    public cv()
    {
    }
    public cv(int idcv, String name, String email, String phone, String hobby, int idu) {
    	this.idcv = idcv;
    	this.name = name;
    	this.email = email;
    	this.phone = phone;
    	this.hobby = hobby;
    	this.idu = idu;
    }
	public int getIdcv() {
		return idcv;
	}
	public void setIdcv(int idcv) {
		this.idcv = idcv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getIdu() {
		return idu;
	}
	public void setIdu(int idu) {
		this.idu = idu;
	}
	@Override
	public String toString() {
		return "cv [idcv=" + idcv + ", name=" + name + ", email=" + email + ", phone=" + phone + ", hobby=" + hobby
				+ ", idu=" + idu + "]";
	}
    
}
