package renu.gusain.design.principles.solid.ocp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NotOCPProductFilter {
    public List<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.getColor() == color).collect(Collectors.toList());

    }

    public List<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.getSize() == size).collect(Collectors.toList());

    }

    public List<Product> filterBySizeANDColor(List<Product> products, Size size, Color color) {
        return products.stream().filter(p -> p.getSize() == size
                && p.getColor() == color).collect(Collectors.toList());

    }
}
class Demo

{
    public static void main(String[] args) {
        Product apple=new Product("Apple",Color.GREEN,Size.SMALL);
        Product tree=new Product("Tree",Color.GREEN,Size.LARGE);
        Product house=new Product("House",Color.BLUE,Size.LARGE);
        List<Product>products= Arrays.asList(apple,tree,house);

        NotOCPProductFilter filter=new NotOCPProductFilter();
        System.out.println("green products");
        filter.filterByColor(products,Color.GREEN).
                forEach(p-> System.out.println("-"+p.getName()+" is green"));

    }
}
