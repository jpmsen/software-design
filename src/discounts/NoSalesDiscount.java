package discounts;

import com.company.Customer;
import products.Product;

public class NoSalesDiscount implements DiscountStrategy {
    @Override
    public double getDiscount(Product product, int index, Customer customer) {
        double discount = 0.0;

        if(customer.isRegular()) {
            discount = .15;
        }

        return 1 - discount;
    }
}
