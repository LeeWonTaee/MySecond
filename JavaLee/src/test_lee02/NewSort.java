/*package javaSample;

public class Name implements Comparable<Name>{
	private final String firstName, lastName;
	
	public Name(String firstName, String lastName) {
		if(firstName == null || lastName == null) {
			throw new NullPointerException();
		}
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String firstName() {
		return firstName;
	}
	public String lastName() {
		return lastName;
	}
 

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(!(o instanceof Name)) {
			return false;
		}
		Name n = (Name) o;
		return firstName.equals(n.firstName) && lastName.equals(n.lastName);
	}
	
	@Override
	public int compareTo(Name o) {
		// TODO Auto-generated method stub
		int lastCmp = lastName.compareTo(o.lastName);
		return ((lastCmp != 0 ) ? lastCmp: firstName.compareTo(o.firstName));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n" + firstName + " " + lastName;
	}

	

	
	
	
}*/
