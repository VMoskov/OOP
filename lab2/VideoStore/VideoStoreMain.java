public class VideoStoreMain{
    public static void main(String[] args) {
        VideoStoreImplementation vs = new VideoStoreImplementation();

        //init:
        vs.getCost(); // vraca 0

        vs.add("2234853");

        vs.getCost(); // vraca 12.10
        //(cijena svakoga filma je random broj između 0.00-20.00)

        vs.add("2234753");

        vs.getCost(); // vraca 14.05

        vs.remove("2234753");

        vs.getCost(); // vraca 12.10

        vs.remove("2234753");

        vs.getCost(); // vraca 12.10
    }
}
