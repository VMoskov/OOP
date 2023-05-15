import java.util.HashMap;
import java.util.Map;

class Utils {

    public static RentalInfo getHighestGrade(HashMap<Integer, RentalInfo> apartments) {
        RentalInfo highestGradeInfo = null;
        double highestGrade = Double.MIN_VALUE;

        for (RentalInfo info : apartments.values()) {
            if (info.getAvgGrade() > highestGrade) {
                highestGrade = info.getAvgGrade();
                highestGradeInfo = info;
            }
        }

        return highestGradeInfo;
    }

    public static HashMap<Integer, RentalInfo> getByCapacity(
            HashMap<Integer, RentalInfo> apartments, int capacity) {
        HashMap<Integer, RentalInfo> filteredApartments = new HashMap<>();

        for (Map.Entry<Integer, RentalInfo> entry : apartments.entrySet()) {
            RentalInfo info = entry.getValue();
            int totalCapacity = info.getSingleBedsNum() + (2 * info.getDoubleBedsNum());

            if (totalCapacity >= capacity) {
                filteredApartments.put(entry.getKey(), info);
            }
        }

        return filteredApartments;
    }

    public static RentalInfo getByCapacityAndGrade(
            HashMap<Integer, RentalInfo> apartments, int capacity) {
        RentalInfo highestGradeInfo = null;
        double highestGrade = Double.MIN_VALUE;

        for (RentalInfo info : apartments.values()) {
            int totalCapacity = info.getSingleBedsNum() + (2 * info.getDoubleBedsNum());

            if (totalCapacity >= capacity && info.getAvgGrade() > highestGrade) {
                highestGrade = info.getAvgGrade();
                highestGradeInfo = info;
            }
        }

        return highestGradeInfo;
    }

    public static HashMap<Integer, RentalInfo> getByGrade(
            HashMap<Integer, RentalInfo> apartments, double grade) {
        HashMap<Integer, RentalInfo> filteredApartments = new HashMap<>();

        for (Map.Entry<Integer, RentalInfo> entry : apartments.entrySet()) {
            RentalInfo info = entry.getValue();
            if (info.getAvgGrade() >= grade) {
                filteredApartments.put(entry.getKey(), info);
            }
        }

        return filteredApartments;
    }

    public static RentalInfo getByName(HashMap<Integer, RentalInfo> apartments, String name) {
        for (RentalInfo info : apartments.values()) {
            if (info.getName().equals(name)) {
                return info;
            }
        }

        return null;
    }
}