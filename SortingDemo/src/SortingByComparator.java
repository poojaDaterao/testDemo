import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByComparator {

	public static void main(String[] args) {
		
		Emp e1=new Emp(20,"abcd",31,450008.0);
		Emp e2=new Emp(30,"Abcd",30,470078.0);
		Emp e3=new Emp(40,"bbcd",33,490078.0);
		Emp e4=new Emp(50,"Bbcd",34,420078.0);
		Emp e5=new Emp(60,"qbce",36,410078.0);
		Emp e6=new Emp(70,"rbce",60,400078.0);
		Emp e7=new Emp(80,"null",40,440078.0);
		Emp e8=new Emp(90,"ybcv",20,430078.0);
		
		
		List<Emp> listOfEmp=new ArrayList<>();
		
		listOfEmp.add(e1);
		listOfEmp.add(e2);
		listOfEmp.add(e3);
		listOfEmp.add(e4);
		listOfEmp.add(e5);
		listOfEmp.add(e6);
		listOfEmp.add(e7);
		listOfEmp.add(e8);
		
		/*Collections.sort(listOfEmp,new AgeSort());
		System.out.println("AgeSort"+listOfEmp);
		*/
		Collections.sort(listOfEmp,new NameSort());
		System.out.println("NameSort"+listOfEmp);
		
		System.out.println("-----------------------");
		
		Collections.sort(listOfEmp,new SalarySort());
		System.out.println("SalarySort"+listOfEmp);
		
		System.out.println(listOfEmp);
	}
}

	
	class Emp{
	private int empId;
	private String empName;
	private int empAge;
	private double empSalary;
	@Override
	public String toString() {
		return "\n Sortings [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}
	public Emp(int empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	}
	
	/* class AgeSort implements Comparator<Emp>{

		public int compare(Emp o1, Emp o2) {
			
			return o1.getEmpAge()-o2.getEmpAge();
		}
	 }*/
	 
	
	class NameSort implements Comparator<Emp>{

		@Override
		public int compare(Emp o1, Emp o2) {
			if(o1.getEmpName()==null||o2.getEmpName()==null){
				return 0;
				}
			return o1.getEmpName().compareTo(o2.getEmpName());
		}
	}
		
	class SalarySort implements Comparator<Emp>{

		@Override
		public int compare(Emp o1, Emp o2) {
			
			return (int)(o1.getEmpSalary()-o2.getEmpSalary());
		}
		
	}

		
	
	

