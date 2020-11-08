public class Book {
    private String author, name, publisher;
    private int year, pagesNum;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPagesNum() {
        return pagesNum;
    }

    public void setPagesNum(int pagesNum) {
        this.pagesNum = pagesNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + "\'" +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pagesNum=" + pagesNum +
                '}';
    }
}
