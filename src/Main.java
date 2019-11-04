import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book=new Book();
        book.setPrice(20);
        book.setIsInStock(true);

      price(book);


    }

    public static void price(Book book){
        Scanner key=new Scanner(System.in);
        System.out.println("How many books do you want?");
        int num=key.nextInt();
        if(book.getIsInStock()){
            System.out.println("The total price is :"+(book.getPrice()*num));
        }else{
            System.out.println("out stock");
        }
    }

}
