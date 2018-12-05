import java.util.ArrayList;
import java.util.Collections;

class PSorting{
	
	public static void main(String[] args) {
		
		PersonInfo p1=new PersonInfo("pooja",20,34);
		PersonInfo p2=new PersonInfo("smita",21,30);
		PersonInfo p3=new PersonInfo("rani",22,40);
		PersonInfo p4=new PersonInfo("gauri",23,20);
		PersonInfo p5=new PersonInfo("satu",24,50);
		
		
		ArrayList<PersonInfo> al=new ArrayList<PersonInfo>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		
		Collections.sort(al);
		System.out.println(al);
		
	}
}
//ex sorting by using comparable -natural sorting on Age 
public class PersonInfo implements Comparable<PersonInfo> {
	
	String personName;
	int personId;
	int personAge;
	@Override
	public String toString() {
		return "\n PersonInfo [personName=" + personName + ", personId=" + personId + ", personAge=" + personAge + "]";
	}
	public PersonInfo(String personName, int personId, int personAge) {
		super();
		this.personName = personName;
		this.personId = personId;
		this.personAge = personAge;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	@Override
	public int compareTo(PersonInfo o1) {
        //  return this.personAge-o1.personAge; //incresing order
		 //return -(this.personAge-o1.personAge);//descending order
         // return this.personName.compareTo(o1.personName);
		int AgeSort=this.personAge-o1.personAge;
		if(AgeSort==0){
			return this.personName.compareTo(o1.personName);
		}
		return AgeSort;
		}
	}
	
	


