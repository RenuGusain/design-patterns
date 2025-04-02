package renu.gusain.design.principles.solid.ocp;

public interface Specification<T> {
    public boolean isSatisfied(T item);

}
