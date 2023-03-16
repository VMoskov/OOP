import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


class LabTask {
    public static List<Integer> insert(List<Integer> source, List<Integer> dest) {
        List<Integer> lis = new ArrayList<>();


        for(Integer broj : source)
        {

            dest.add(broj);
            Collections.sort(dest);

            for(int i = 0; i< dest.size(); i++) {
                if(broj==dest.get(i)) {

                    lis.add(i);
                    break;
                }
            }


        }

        Collections.sort(dest);

        return lis;

    }
}