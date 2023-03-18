public class InProceedings extends Book{
    private String bookTitle;
    private int startPage;
    private int endPage;

    public InProceedings(Author[] authors, String title, int year, String label, String publisher, String adress, String bookTitle, int startPage, int endPage) {
        super(authors, title, year, label, publisher, adress);
        this.bookTitle = bookTitle;
        this.startPage = startPage;
        this.endPage = endPage;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getStartPage() {
        return startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    @Override
    public String getCitation(){
        StringBuilder s = new StringBuilder();
        s.append("InProceedings");
        for(Author a : getAuthors()){
            s.append(a.getSurname().charAt(0));
        }
        s.append(getYear());
        s.append("-");
        s.append(getLabel());
        return s.toString();
    }
}
