/**

 * // 5)Вывести на консоль каталог продуктов. (все продукты магазина)
 * // 6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
 
 */

package org.example;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Product Milk = new Product("Oloneckoe", 2.15, 2);
        System.out.println("Main Table: " +
                "name of Milk - " + Milk.getName() +
                ", price is " + Milk.getPrice() +
                ", rating of the product is " + Milk.getRating());


        Category DiaryProducts = new Category("Diary products");
        Category Alcohol = new Category("Alcohol");
        Category Bread = new Category("Bread");
        System.out.println("Categories: "
                + DiaryProducts.getName() + ", "
                + Alcohol.getName() + ", "
                + Bread.getName());

        Basket Basket = new Basket();
        System.out.println("Your basket: " + Basket.getProducts());

        User User = new User("Anna", "1234P");
        System.out.println(User.getLogin() + " " + User.getPassword() + " " + User.getBasket());
    }
}