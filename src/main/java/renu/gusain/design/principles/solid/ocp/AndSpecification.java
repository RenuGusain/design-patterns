package renu.gusain.design.principles.solid.ocp;

import java.util.Arrays;
import java.util.List;

public class AndSpecification<T> implements Specification<T> {
    List<Specification<T>> specifications;

    public AndSpecification(Specification<T>... specifications) {
        this.specifications = Arrays.asList(specifications);

    }

    public boolean isSatisfied(T item) {


        for (Specification<T> specification : specifications) {
            if (!specification.isSatisfied(item)) {
                return false;
            }

        }
        return true;



    }


}
