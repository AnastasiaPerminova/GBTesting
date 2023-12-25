package seminars.first.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    public static void main(String[] args) {
       Product product = new Product(1000, "Шляпка");
       Product product1 = new Product(150, "Cумка");
       Product product2 = new Product(300, "Платок");

       List<Product> products_list= new ArrayList<Product>();
       products_list.add(product);
       products_list.add(product1);
       products_list.add(product2);

       Shop shop = new Shop();
       shop.setProducts(products_list);

   //1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).

        assertThat(shop.getProducts().size()).isEqualTo(3);

  // 2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.

        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product);

  // 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).

        List<Product> products_sorted = new ArrayList<Product>();
        products_sorted.add(product1);
        products_sorted.add(product2);
        products_sorted.add(product);

        assertThat(shop.sortProductsByPrice()).isEqualTo(products_sorted);


    }
}