import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudSorting{
	
	public static void main(String[] args) {
		Student s1=new Student(1,"pooja",34000.45);
		Student s2=new Student(2,"Amit",35000.46);
		Student s3=new Student(3,"Roma",34000.48);
		
		
		List<Student> l=new ArrayList<>();
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		//annonymous implementation means without name use as per the requirement.
		Comparator<Student> idsort=new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getStudId()-o2.getStudId();
			}
			
		};
		Comparator<Student>salarysort=new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				
				return (int)(o1.getStudSalary()-o2.getStudSalary());
			}
			
		};
		
		Collections.sort(l,idsort);
		System.out.println(l);
		
		Collections.sort(l,salarysort);
		System.out.println(l);
	}
}
public class Student {
	
	int studId;
	String studName;
	double studSalary;
	@Override
	public String toString() {
		return "\n Student [studId=" + studId + ", studName=" + studName + ", studSalary=" + studSalary + "]";
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getStudSalary() {
		return studSalary;
	}
	public void setStudSalary(double studSalary) {
		this.studSalary = studSalary;
	}
	public Student(int studId, String studName, double studSalary) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studSalary = studSalary;
	}
	

}
