package operation;

import book.BookList;
import book.Book;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        System.out.println("请输入书名");
        String name = this.sca.next();
        System.out.println("请输入作者");
        String author = this.sca.next();
        System.out.println("请输入价格");
        int price = this.sca.nextInt();
        System.out.println("请输入类型");
        String type = this.sca.next();

        Book book = new Book(name,author,price,type);
        int currentSize = bookList.getUsedSize();
        bookList.setBook(currentSize,book);
        bookList.setUsedSize(currentSize+1);
    }
}
