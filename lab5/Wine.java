import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

enum Type {
    RED, ROSE, WHITE;
}

class Wine implements Comparable<Wine> {

    private String winery;
    private String label;
    private double abv;
    private Type type;

    public Wine(String label, String winery, double abv, Type type) {
        this.winery = winery;
        this.label = label;
        this.abv = abv;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getWinery() {
        return winery;
    }

    public void setWinery(String winery) {
        this.winery = winery;
    }

    @Override
    public int compareTo(Wine wine) {
        return Comparator.comparing(Wine::getType).reversed().thenComparing(Comparator.comparing(Wine::getLabel))
                .thenComparing(Comparator.comparing(Wine::getWinery)).compare(this, wine);
    }

    public static final Comparator<Wine> COMPARE_BY_ABV = new Comparator<Wine>() {
        @Override
        public int compare(Wine w1, Wine w2) {
            return (int) (w2.getAbv() - w1.getAbv());
        }
    };
}

// public static final Comparator<Wine> COMPARE_BY_ABV = (w1, w2) ->
// (int)(w2.getAbv() - w1.getAbv());

class Main {
    public static void main(String[] args) {
        Set<Wine> wines = new TreeSet<Wine>();

        wines.add(new Wine("Bijelo", "Žnidaršić", 10.2, Type.WHITE));
        wines.add(new Wine("Crno", "Žnidaršić", 15.0, Type.RED));
        wines.add(new Wine("Pleševičko", "Žnidaršić", 14.5, Type.WHITE));

        wines.forEach((Wine p) -> System.out.println(p.getWinery() + ", " + p.getLabel() + " - " + p.getAbv()) + "%");

        Set<Wine> winesSet = new TreeSet<>(Wine.COMPARE_BY_ABV);

        winesSet.forEach((Wine p) -> System.out.println(p.getWinery() + ", " + p.getLabel() + " - " + p.getAbv()) + "%");

    }
}