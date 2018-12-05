import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortings {

	public static void main(String[] args) {
		
		Emp2 e1=new Emp2(20,"abcde",31,4508.0);
		Emp2 e2=new Emp2(30,"Abcd",30,450078.0);
		Emp2 e3=new Emp2(40,"bbcd",33,450078.0);
		Emp2 e4=new Emp2(50,"Bbcd",34,450078.0);
		Emp2 e5=new Emp2(60,"qbce",36,450078.0);
		Emp2 e6=new Emp2(70,"rbce",60,450078.0);
		Emp2 e7=new Emp2(80,"null",40,450078.0);
		Emp2 e8=new Emp2(90,"ybcv",20,450078.0);
		
		
		List<Emp2> listOfEmp=new ArrayList<>();
		
		listOfEmp.add(e1);
		listOfEmp.add(e2);
		listOfEmp.add(e3);
		listOfEmp.add(e4);
		listOfEmp.add(e5);
		listOfEmp.add(e6);
		listOfEmp.add(e7);
		listOfEmp.add(e8);
		
		Collections.sort(listOfEmp, new Emp2());
		System.out.println(listOfEmp);
	}
}
	
	class Emp2 implements Comparator<Emp2>{
	private int empId;
	private String empName;
	private int empAge;
	private double empSalary;
	@Override
	public String toString() {
		return "\n Sortings [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}
	public Emp2(int empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
	public Emp2() {
		// TODO Auto-generated constructor stub
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
	
	/*public int compareTo(Emp obj){
		int ageSort=this.empAge-obj.empAge;
		if(ageSort==0){
		return this.empName.compareTo(obj.empName);
		}
		return ageSort;
		
		
		//return this.empAge-obj.empAge; //sorting in descending order by empAge
		return this.empName.compareTo(obj.empName); //sorting in descending order by empName
		
	}*/
	@Override
	public int compare(Emp2 o1, Emp2 o2) {
		// TODO Auto-generated method stub
		//return o2.empAge-o1.empAge;//decreasing order same as bellow 

		//return -(o1.empAge-o2.empAge);//decreasing order
		return o1.empAge-o2.empAge;// increasing order

	}
	
	}

