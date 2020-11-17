import book.BookList;
import operation.IOperation;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public  static User login() {
        System.out.print("请输入名字:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("请输入你的身份，1：是管理员，0：是普通用户");
        int choice = scanner.nextInt();
        if(choice == 1) {
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();//向上转型
        while (true) {
            int choice = user.menu();
            IOperation iOperation = user.doOperation(choice);
            iOperation.work(bookList);
        }
    }
}
