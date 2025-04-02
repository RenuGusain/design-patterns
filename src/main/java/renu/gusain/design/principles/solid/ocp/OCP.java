package renu.gusain.design.principles.solid.ocp;

import java.util.Arrays;
import java.util.List;

public class OCP {
    public static void main(String[] args) {
        Product apple=new Product("Apple",Color.GREEN,Size.SMALL);
        Product tree=new Product("Tree",Color.GREEN,Size.LARGE);
        Product house=new Product("House",Color.BLUE,Size.LARGE);
        List<Product> products= Arrays.asList(apple,tree,house);
        ProductFilter productFilter=new ProductFilter();
        ColorSpecification greenSpecification=new ColorSpecification(Color.GREEN);
        SizeSpecification smallSizeSpecification=new SizeSpecification(Size.SMALL);

        productFilter.filter(products,greenSpecification).forEach(p-> System.out.println("-"+p.getName()+" is green"));

        AndSpecification<Product> greenSmallSpecification=new AndSpecification<>(smallSizeSpecification,greenSpecification);
        productFilter.filter(products,greenSmallSpecification).forEach(p-> System.out.println("-"+p.getName()+" is green and Small"));


    }
}
