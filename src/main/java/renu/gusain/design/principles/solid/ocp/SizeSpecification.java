package renu.gusain.design.principles.solid.ocp;

public class SizeSpecification implements Specification<Product>{
    private Size size;
   public  SizeSpecification(Size size)
    {
        this.size=size;

    }
    @Override
    public boolean isSatisfied(Product item) {
       return  item.getSize()==size;
    }
}
