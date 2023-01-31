package schoolmanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int id;
@Column(nullable = false)
private String name;
@Column(nullable = false)
private String Stream;
private double fees;
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
public String getStream() {
	return Stream;
}
public void setStream(String stream) {
	Stream = stream;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}




}
