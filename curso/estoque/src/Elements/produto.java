package Elements;

public class produto {
	
	 public String name;
	 public double price;
	 public int quantity;
	 
	 public void detalhes() {
		 
		 System.out.printf("Product data: %s, $ %.2f, %d units, Total %.2f%n", name, price, quantity, quantity*price);
	 }
	 public void add_product(int q) {
		 
		 quantity += q;
	 }
	 
	 public void rem_product(int q) {
		 
		 quantity -= q;
	 }
}
