package book;

public class BookList {
    private Book[] elem = new Book[5];
    private int usedSize;

    public BookList() {
        this.elem[0] = new Book("三国","罗贯中",14,"小说");
        this.elem[1] = new Book("水浒传","施耐庵",54,"小说");
        this.elem[2] = new Book("西游记","吴承恩",30,"小说");
        this.usedSize = 3;
    }

    public void setBook(int pos,Book book) {
        this.elem[pos] = book;
    }
    public Book getBook(int pos) {
        return this.elem[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
