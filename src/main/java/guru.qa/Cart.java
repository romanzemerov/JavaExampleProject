package guru.qa;

import java.util.ArrayList;

public class Cart {
  ArrayList<Product> products;

  void add(Product product) {
    products.add(product);
  }

  void remove(Product product) {
    products.remove(product);
  }


  int getValue() {
    int result = 0;

    for (Product product : products) {
      int amount = product.amount;
      int price = product.price;

      result += amount * price;
    }

    return result;
  }
}
