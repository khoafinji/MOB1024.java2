package mainPackage;

import enity.*;
import java.util.ArrayList;

public class MainLab1 {
    public static void main(String[] args) {

        ArrayList<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product("Ao01", "Áo thun", 10));
        listProduct.add(new Product("Ao02", "Áo sơ mi", 12));
        listProduct.add(new ImportedProduct("Q01", "Quần tây", 15, 0.1, 1));
        listProduct.add(new ImportedProduct("Q02", "Quần jean", 17, 0.2, 2));
        listProduct.add(new Product("Ao03", "Áo khoác", 20));

       
        System.out.println("=== DANH SÁCH SẢN PHẨM ===");
        for (Product p : listProduct) {
            System.out.println(p);
        }

  
        Product max = listProduct.get(0);

        for (Product p : listProduct) {
            if (p.finalPrice() > max.finalPrice()) {
                max = p;
            }
        }

        System.out.println("\n=== SẢN PHẨM GIÁ CAO NHẤT ===");
        System.out.println(max);
    }
}