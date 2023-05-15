import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Map;

class LabTask {
    public static Pair<Pair<String, LocalDate>, Pair<String, LocalDate>> closest(Map<String, LocalDate> birthdays) {
        Pair<Pair<String, LocalDate>, Pair<String, LocalDate>> closestPair = null;
        long minDifference = Long.MAX_VALUE;

        for (Map.Entry<String, LocalDate> entry1 : birthdays.entrySet()) {
            for (Map.Entry<String, LocalDate> entry2 : birthdays.entrySet()) {
                if (!(entry1.equals(entry2))) {
                    int istaGodina = 2023;
                    LocalDate date10 = entry1.getValue();
                    LocalDate date20 = entry2.getValue();

                    int godina1 = date10.getYear();
                    int godina2 = date20.getYear();

                    LocalDate date1 = date10.withYear(istaGodina);
                    LocalDate date2 = date20.withYear(istaGodina);
                    long difference = ChronoUnit.DAYS.between(date1, date2);

                    Pair<String, LocalDate> person1 = new Pair<>(null, null);
                    Pair<String, LocalDate> person2 = new Pair<>(null, null);
                    //System.out.printf("izmedu je %d a to su %s i %s\n", difference, entry1.getKey(), entry2.getKey());
                    if (difference < minDifference && difference>=0) {
                        minDifference = difference;
                        date1=date1.withYear(godina1);
                        date2=date2.withYear(godina2);
                        if (date1.isBefore(date2)) {
                            person1 = new Pair<>(entry1.getKey(), date1);
                            person2 = new Pair<>(entry2.getKey(), date2);
                            closestPair = new Pair<>(person1, person2);
                        } else {
                            person1 = new Pair<>(entry2.getKey(), date2);
                            person2 = new Pair<>(entry1.getKey(), date1);
                            closestPair = new Pair<>(person1, person2);
                        }



                    } else if (difference == minDifference) {
                        // If the dates are equally close, compare alphabetically
                        //System.out.printf("usporedivat cu %s i %s",);
                        int nameComparison = entry1.getKey().compareTo(closestPair.first.first);
                        if (nameComparison < 0) {
                            date1=date1.withYear(godina1);
                            date2=date2.withYear(godina2);
                            if (date1.isBefore(date2)) {
                                person1 = new Pair<>(entry1.getKey(), date1);
                                person2 = new Pair<>(entry2.getKey(), date2);
                                closestPair = new Pair<>(person1, person2);
                            } else {
                                person1 = new Pair<>(entry2.getKey(), date2);
                                person2 = new Pair<>(entry1.getKey(), date1);
                                closestPair = new Pair<>(person1, person2);
                            }
                        }
                    }
                }
            }
        }

        return closestPair;
    }
}