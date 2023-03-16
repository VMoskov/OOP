class Solution implements StudentStatistics {

    // public static void main(String[] args) {
    // Solution s = new Solution();
    // s.addStudentPoints("pero", 1);
    // s.addStudentPoints("pero", 2);
    // System.out.println(s.getTotalPointsForStudent("pero"));
    // }

    private Map<String, Integer> m = new HashMap<>();
    private int sum = 0;

    @Override
    public void addStudentPoints(String student, Integer... points) {
        for (Integer i : points) {
            if (m.get(student) == null)
                m.put(student, i);
            else
                m.put(student, m.get(student) + i);
            sum += i;
        }
    }

    @Override
    public Integer getTotalPoints() {
        return sum;
    }

    @Override
    public Integer getStudentSize() {
        return this.m.size();
    }

    @Override
    public Integer getTotalPointsForStudent(String student) {
        if (m.get(student) == null)
            return 0;
        return m.get(student);
    }
}