class MilkMan implements AnimalVisitor<Cow>{

    public void visit(Cow cow) {

        if(cow.getMilk() > 5) cow.setMilk(cow.getMilk() - 5);
        else cow.setMilk(0);

    }

}
