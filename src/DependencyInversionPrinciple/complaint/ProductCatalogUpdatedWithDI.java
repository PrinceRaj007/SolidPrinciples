package DependencyInversionPrinciple.complaint;

import java.util.Arrays;
import java.util.List;

class ProductCatalogUpdatedWithDIDriver {
	public static void main(String[] args) {
		ProductCatalogDI productCatalog = new ProductCatalogDI(new ProductRepo());
		productCatalog.showAllProducts();
	}
}
class ProductCatalogDI{
	IProductRepo repo;
	public ProductCatalogDI(IProductRepo repo) {
		this.repo = repo;
	}
	public void showAllProducts() {
		List<String> products = repo.getAllProducts();
		System.out.println("All Products are listed below:");
		for(String p : products) {
			System.out.println(p);
		}
	}
}
interface IProductRepo{
	public List<String> getAllProducts();
}
class ProductRepo implements IProductRepo{
	public List<String> getAllProducts(){
		return Arrays.asList("Laptop", "Keyboard", "Mouse", "SmartPhone");
	}
}