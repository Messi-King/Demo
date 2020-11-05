package operation;

import book.Book;
import book.BookList;

public class DelOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入删除图书的书名");
        String name = this.sca.next();
        int currentSize = bookList.getUsedSize();
        int i = 0;
        for (; i <currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                //System.out.println(book);
                book.setBorrowed(true);
                break;
            }
        }
        if(i == currentSize) {
            System.out.println("位置不合法");
        }
        int pos = i;
        for (int j = pos; j < currentSize-1 ; j++) {
            Book book = bookList.getBook(i+1);
            bookList.setBook(i,book);
        }
        bookList.setBook(currentSize-1,null);
        bookList.setUsedSize(currentSize-1);
        System.out.println("删除成功");
    }
}
