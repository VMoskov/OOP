import java.time.LocalDate;

class ItemBox<T extends Item> extends SimpleArrayList<T>{

    public ItemBox() {
        super();
    }

    public SimpleArrayList<String> perishables = null;

    public SimpleArrayList<String>  getPerishables() {
        SimpleArrayList<String> persihed = new SimpleArrayList<>();
        for (int i = 0; i < super.size(); i++) {
            if (super.get(i) instanceof Perishable) {
                if (((Perishable)super.get(i)).getBestBefore().isBefore(LocalDate.now())) {
                    persihed.add(super.get(i).getSku());
                }
            }
        }

        return persihed;

    }
}