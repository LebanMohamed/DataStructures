import java.util.*;

public class Name {
	private static Set<Name> list; 
	private String firstName;
	private String surName;

	public Name(String firstName, String surName) { 
		this.firstName = firstName;
		this.surName = surName;
		list = new HashSet<Name>();
	}
	
	public String getfirstName() {
		return this.firstName;
	}

	public Set<Name> getList() {
		return Collections.unmodifiableSet(list);
	}
 

	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return 31 * firstName.hashCode() + surName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");

		if (!(obj instanceof Name)) {
			return false;
		}
		Name name = (Name) obj;
		return firstName.equals(name.firstName) && surName.equals(name.surName);
	}  
}
