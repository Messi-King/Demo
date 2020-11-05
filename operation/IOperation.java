package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public interface IOperation {
    Scanner sca = new Scanner(System.in);
    void work(BookList booklist);
}
