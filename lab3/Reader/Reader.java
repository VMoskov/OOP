import java.util.Scanner;

public class Reader {
    public static void readData() {
        Scanner sc = new Scanner(System.in);
        String name;
        try {
            while (sc.hasNextLine()) {
                name = sc.nextLine();
                System.out.println(Names.checkAndFixName(name));
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new IllegalArgumentException(e.getMessage());
        } finally {
            System.out.println("KRAJ!");
            sc.close();
        }
    }
}