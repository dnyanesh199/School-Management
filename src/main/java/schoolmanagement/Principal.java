package schoolmanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Principal {
@Id
private int id;
@Column(nullable = false)
private String name;
@Column(unique = true)
private long mobno;

private String email;

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String password;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobno() {
	return mobno;
}
public void setMobno(long mobno) {
	this.mobno = mobno;
}




}


