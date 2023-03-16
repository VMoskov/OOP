class Veterinarian <T extends Animal>implements AnimalVisitor<T>{

    public void visit(T animal) {
        animal.setHealth(animal.getHealth() < 85 ? animal.getHealth() + 15 : 100);

//		animal.setHealth(animal.getHealth() < 85 ? animal.getHealth() + 15 : 100);
    }

}