class Pair implements Comparable<Pair> {
    private String name1;
    private String name2;

    public Pair(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    @Override
    public int compareTo(Pair o) {
        int i = this.getName1().compareTo(o.getName1());
        if (i != 0)
            return i;
        else
            return this.getName2().compareTo(o.getName2());
    }
}