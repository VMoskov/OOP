class Shed<A extends Animal> {
    private A[] animals;

    public Shed(A[] animals) {
        this.animals = animals;
    }

    public A[] getAnimals() {
        return animals;
    }

    public void accept(AnimalVisitor<A> visitor) {
        for(A animal : animals) {
            visitor.visit(animal);
        }
    }
}
