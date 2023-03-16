import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Solution implements StudentDatabase{
    Map<String, Map<String, Integer>> database = new HashMap<>();

    @Override
    public void addEntry(String student, String course, int score) {
        database.putIfAbsent(student, new HashMap<>());
        database.get(student).put(course, score);
    }

    @Override
    public Integer getScore(String student, String course) {
        if (database.containsKey(student))
            return database.get(student).get(course);
        return null;
    }

    @Override
    public Collection<Integer> getNaturallyOrderedScoresByCourse(String course) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (Map.Entry<String, Map<String, Integer>> entry : database.entrySet()) {
            if (entry.getValue().containsKey(course)) {
                ret.add(entry.getValue().get(course));
            }
        }
        ret.sort(Integer::compareTo);
        return ret;
    }
}