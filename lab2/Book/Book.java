public class Book extends Reference{
    private String publisher;
    private String adress;

    public Book(Author[] authors, String title, int year, String label, String publisher, String adress) {
        super(authors, title, year, label);
        this.publisher = publisher;
        this.adress = adress;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAdress() {
        return adress;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAddress(String adress) {
        this.adress = adress;
    }

    @Override
    public String getCitation(){
        StringBuilder s = new StringBuilder();
        s.append("Book");
        int zadnja = getYear()%10;
        int predzadnja = getYear()%100/10;
        s.append(predzadnja);
        s.append(zadnja);
        for(Author a : getAuthors()){
            s.append(a.getSurname());
        }
        s.append("-");
        s.append(getLabel());
        return s.toString();
    }
}