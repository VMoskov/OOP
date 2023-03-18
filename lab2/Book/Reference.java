public abstract class Reference implements Citable{
    private Author[] authors;
    private String title;
    private int year;
    private String label;

    public Reference(Author[] authors, String title, int year, String label) {
        this.authors = authors;
        this.title = title;
        this.year = year;
        this.label = label;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getLabel() {
        return label;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString(){
        return "" + year;
    }
}