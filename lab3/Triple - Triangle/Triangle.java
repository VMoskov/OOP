class Triangle extends Triple<String> {

    public Triangle(String first, String second, String third) {
        super(first, second, third);
    }

    public static boolean sharedVertex(Triple<String> t1, Triple<String> t2) throws IllegalArgumentException {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (t1.getElement(i).equals(t2.getElement(j))) {
                    return true;
                }
            }
        }
        return false;
    }
}