package discounts;

import com.company.Customer;
import products.Product;

public interface DiscountStrategy {
    public double getDiscount(Product product, int index, Customer customer);
}
