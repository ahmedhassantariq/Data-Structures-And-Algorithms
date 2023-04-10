

public class Book {
   private String author;


   public Book(){
       //No Argument Constructor
   }

   public Book(String author) {
        this.author = author;
   }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public boolean compare(Book b){
       return this.author.equals(b.author);
    }
}
