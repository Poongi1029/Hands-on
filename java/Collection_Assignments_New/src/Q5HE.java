package java11;
import java.util.Objects;
public class Q5HE
{
	private Integer id;
	private String firstname;
	private String lastName;
	private String department;

	//Setters and Getters

	@Override
	public int hashCode() {
		return Objects.hash(department, firstname, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Q5HE other = (Q5HE) obj;
		return Objects.equals(department, other.department) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName);
	}

	public void setId(int i) {
		id=1;
		firstname="poo";
		lastName="A";
		department="MCA";
	}
}