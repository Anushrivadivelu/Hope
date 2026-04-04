package com.ecommerce.main;
import com.ecommerce.model.Product;
import com.ecommerce.service.CartService;
import com.ecommerce.util.DiscountUtil;
public class MainApp{
  public static void main(String[] args) {
    CartService cart = new CartService();
    Product p = new Product(1, "Laptop",DiscountUtil.applyDiscount(500000));
    cart.addProduct(p);
    cart.showCart();
    int totalamount = cart.calculateTotal();
    System.out.println("Amount: $"+ totalamount);
  }
}
