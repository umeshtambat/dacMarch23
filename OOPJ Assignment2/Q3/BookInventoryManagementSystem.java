/*You are required to write a Java program to implement a Book class that can be 
used to manage a book inventory system. 
The Book class should have the following fields:
a. title: A string field to store the title of the book.
b. author: A string field to store the name of the author of the book.
c. publisher: A string field to store the name of the publisher of the book.
d. isbn: A string field to store the ISBN number of the book.
e. year: An integer field to store the year in which the book was published.
f. price: A double field to store the price of the book.
g. quantity: An integer field to store the quantity of the book in the inventory.
The Book class should have following methods
a. Constructors, 
b. Getter & setter methods
c. Business Logic methods
I. increaseQuantity(int quantity ): A method to increase the quantity of 
the book in the inventory by the specified amount.
II. decreaseQuantity(int quantity): A method to decrease the quantity of 
the book in the inventory by the specified amount.
III. getInventoryValue(): A method to calculate the total value of the 
inventory of the book, which is the product of the price and the 
quantity of the book*/
import java.util.Scanner;
class Book{
    String title;  //to store the title of the book.
    String auther; //to store the name of the author of the book.
    String publisher; //to store the name of the publisher of the book.
    String isbn; //to store the ISBN number of the book.
    int year;   //to store the year in which the book was published.
    double price=0; //to store the price of the book.
    int quantity=0; //to store the quantity of the book in the inventory.
    int count=0;
    Scanner sc=new Scanner(System.in);

    Book(){
        this.title=null;
        this.title=null;

    }

     public void setTitle(String title){
        this.title=title;
     }
      public void setAuther(String auther){
        this.auther=auther;
     }
      public void setPublisher(String publisher){
        this.publisher=publisher;
     }
      public void setIsbn(String isbn){
        this.isbn=isbn;
     }
     public void setYear(int year){
        this.year=year;
     }
     public void setQuantity(int quantity){
        this.quantity=quantity;
     }
     public void setPrice(double price){
        this.price+=price;
     }

      public String getTitle(){
        return this.title=title;
     }
      public String getAuther(){
        return this.auther=auther;
     }
      public String getPublisher(){
        return this.publisher=publisher;
     }
      public String getIsbn(){
       return this.isbn=isbn;
     }
     public int getYear(){
        return this.year=year;
     }
     public int getQuantity(){
        return this.quantity=quantity;
     }
     public double getPrice(){
        return this.price=price;
     }
     public void removePrice(double price){
        this.price-=price;
     }
     public int increaseQuantity(int quantity ){
        System.out.print("Enter price: ");
        setPrice(sc.nextDouble());
        return this.quantity+=quantity;
     }
      public int decreaseQuantity(int quantity){
        System.out.print("Enter price: ");
        removePrice(sc.nextDouble());
        return this.quantity-=quantity;
     }
     public double getInventoryValue(){
        return this.quantity*this.price;
     }


}

class BookInventoryManagementSystem
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Book b=new Book();
        System.out.print("Add number of the Books: ");
        b.setQuantity(sc.nextInt());
        System.out.print("Enter price: ");
        b.setPrice(sc.nextDouble());

        System.out.println("Total Quantity of the books till now: " +b.getQuantity());
         System.out.println("Total price of the books till now: " +b.getPrice());
        
        System.out.print("Increase Quantity of the Books: ");
        b.increaseQuantity(sc.nextInt());
        // System.out.print("Enter price: ");
        //  b.setPrice(sc.nextDouble());

          System.out.println("Total Quantity of the books till now: " +b.getQuantity());
         System.out.println("Total price of the books till now: " +b.getPrice());
       
      
        System.out.print("Enter number of Books issued: ");
        b.decreaseQuantity(sc.nextInt());
        // System.out.print("Enter price: ");
        // b.setPrice(sc.nextDouble());

          System.out.println("Total Quantity of the books till now: " +b.getQuantity());
         System.out.println("Total price of the books till now: " +b.getPrice());

        System.out.println("Inventary Value of the Books: "+b.getInventoryValue());

    }
}