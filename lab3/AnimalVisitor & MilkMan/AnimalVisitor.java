interface AnimalVisitor<P extends Animal> {
    public void visit(P animal);
}