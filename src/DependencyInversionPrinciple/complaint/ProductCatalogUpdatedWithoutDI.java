package DependencyInversionPrinciple.complaint;

import java.util.Arrays;
import java.util.List;

class ProductCatalogUpdatedWithoutDIDriver {
	public static void main(String[] args) {
		ProductCatalog productCatalog = new ProductCatalog();
		productCatalog.showAllProducts();
	}
}
class ProductCatalog{
	ProductRepository repo;
	public ProductCatalog() {
		repo = ProductRepositoryFactory.createRepository();
	}
	public void showAllProducts() {
		List<String> products = repo.getAllProducts();
		System.out.println("All Products are listed below:");
		for(String p : products) {
			System.out.println(p);
		}
	}
}
interface ProductRepository{
	public List<String> getAllProducts();
}
class SqlProductRepository implements ProductRepository{
	@Override
	public List<String> getAllProducts() {
		return Arrays.asList("Laptop", "Keyboard", "Mouse", "SmartPhone");
	}
}
class ProductRepositoryFactory{
	public static ProductRepository createRepository() {
		return new SqlProductRepository();
	}
}