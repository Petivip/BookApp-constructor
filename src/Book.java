public class Book {
   private String title;
   private String author;
   private String description;
   private int price;
   private String isInStock;

   //default constructor
   public Book(){};

   //overload constructor

    public Book(String title,String author,String description, int price,String isInStock){
        this.title=title;
        this.author=author;
        this.description=description;
        this.price=price;
        this.isInStock=isInStock;
    }

   public void getDisplayText(){
        System.out.println(title);
       System.out.println(author);
       System.out.println(description);
   }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
   public void setAuthor(String author){
        this.author=author;
   }
   public String getDescription(){
        return description;
   }
   public void setDescription(String description){
        this.description=description;
   }
   public int getPrice(){
        return price;
   }
   public void setPrice(int price){
        this.price=price;
   }
   public String getIsInStock(){
        return isInStock;
   }
   public void setIsInStock(String isInStock){
        this.isInStock=isInStock;
   }
}
