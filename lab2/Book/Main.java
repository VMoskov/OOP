public class Main {
    public static void main(String[] args) {
        Author ws = new Author("Walter", "Savitch");
        Author km = new Author("Kenrick", "Mock");

        Book book = new Book(new Author[]{ws, km}, "Absolute Java", 2015,
                "0134041674", "Pearson", "PEL, Edinburgh Gate, Harlow, Essex CM20 2JE, England");

        System.out.println(book.getCitation());//Book15SavitchMock-0134041674

        Author gb = new Author("Gilad", "Bracha");
        Author mo = new Author("Martin", "Odersky");
        Author ds = new Author("David", "Stoutamire");
        Author pw = new Author("Philip", "Wadler");

        InProceedings inProceedings = new InProceedings(new Author[]{gb, mo, ds, pw},
                "Making the future safe for the past: Adding genericity to the Java programming language", 1998, "286957", "ACM",
                "ACM, 2 Penn Plaza, Suite 701, New York, NY 10121-0701",
                "Proceedings of the 13th ACM SIGPLAN conference on Object-oriented programming, systems, languages and applications", 183, 200);

        System.out.println(inProceedings.getCitation());//InProceedingsBOSW1998-286957
    }
}