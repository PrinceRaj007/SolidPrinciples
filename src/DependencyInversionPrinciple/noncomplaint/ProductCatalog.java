package DependencyInversionPrinciple.noncomplaint;

import java.util.Arrays;
import java.util.List;

class ProductCatalogDriver{
	public static void main(String args[]) {
		ProductCatalog productCatalog = new ProductCatalog();
		productCatalog.showAllProducts();
	}
}
class ProductCatalog {
	ProductRepository repo;
	public ProductCatalog(){
		repo = new ProductRepository();
	}
	public void showAllProducts() {
		List<String> products = repo.getAllProducts();
		System.out.println("All Products are listed below:");
		for(String p : products) {
			System.out.println(p);
		}
	}
}
class ProductRepository{
	public List<String> getAllProducts(){
		return Arrays.asList("Laptop", "Keyboard", "Mouse", "SmartPhone");
	}
}