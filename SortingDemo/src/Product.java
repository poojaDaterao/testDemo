import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProductSorting{
	public static void main(String[] args) {
		
		Address a1=new Address("pune",411043);
		Product p1=new Product("rani",23,"a1",34000);
		
		Address a2=new Address("nagpur",411044);
		Product p2=new Product("pooja",20,"a2",34000);
		
		Address a3=new Address("amt",411045);
		Product p3=new Product("soham",10,"a3",34000);
		
		Address a4=new Address("bid",411046);
		Product p4=new Product("gauri",50,"a4",34000);
		
		List<Product> al=new ArrayList<>();
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		
		System.out.println(al);
       
		
		Collections.sort(al,new IdSort());
		System.out.println("----IdSort-----"+al);
		
		Collections.sort(al,new AddrSort());
		System.out.println("addrSort"+al);
		
		Collections.sort(al,new PinSort());
		System.out.println("pinSort"+al);
				
		
		
	}
}
		
		

public class Product {	
	
	
	public String proName;
	public int proId;
	public String address;
	public int proPrice;
	@Override
	public String toString() {
		return "\n Product [proName=" + proName + ", proId=" + proId + ", address=" + address + ", proPrice=" + proPrice
				+ "]";
	}
	public Product(String proName, int proId, String a1, int proPrice) {
		super();
		this.proName = proName;
		this.proId = proId;
		this.address = a1;
		this.proPrice = proPrice;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public String getAddrCity() {
		// TODO Auto-generated method stub
		return null;
	}
	
}	
	class IdSort implements Comparator<Product>{

		@Override
		public int compare(Product a, Product b) {
			// TODO Auto-generated method stub
			return a.proId-b.proId;
		}
		
	}


	


class Address {
	public String addrCity;
	public int addrPin;
	@Override
	public String toString() {
		return "\n address [addrCity=" + addrCity + ", addrPin=" + addrPin + "]";
	}
	public Address(String addrCity, int addrPin) {
		super();
		this.addrCity = addrCity;
		this.addrPin = addrPin;
	}
	public String getAddrCity() {
		return addrCity;
	}
	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}
	public int getAddrPin() {
		return addrPin;
	}
	public void setAddrPin(int addrPin) {
		this.addrPin = addrPin;
	}
	
}

class AddrSort implements Comparator<Product>{

	@Override
	public int compare(Product a, Product b) {
		// TODO Auto-generated method stub
		return a.getAddress().compareTo(b.getAddress());
	}
	
}
class PinSort implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.proId-p2.proId;
	}
	
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
