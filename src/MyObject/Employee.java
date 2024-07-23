package MyObject;

public class Employee {
public Employee() {
		
	}
private int eId;
private String eName;
private Address addres;
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
@Override
public String toString() {
	return "Employee [eId=" + eId + ", eName=" + eName + "]";
}

}
