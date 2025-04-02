package renu.gusain.design.principles.solid.ocp;

public class ColorSpecification implements Specification<Product>{
    Color color;
    public  ColorSpecification(Color color)
    {
        this.color=color;
    }
    @Override
    public boolean isSatisfied(Product item) {
      return item.getColor()==color;
    }
}
