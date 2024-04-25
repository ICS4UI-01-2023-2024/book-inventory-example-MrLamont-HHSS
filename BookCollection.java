import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class BookCollection {
    private ArrayList<Book> books;
    private String filename;

    public BookCollection(String filename){
        this.filename = filename;
        // create the book array list
        this.books = new ArrayList<>();
        // create the scanner using the filename
        Scanner input = null;
        try{
            input = new Scanner(new File(filename));
        }catch(Exception e){
            // print out the errors
            e.printStackTrace();
        }
        // throw away the first line
        input.nextLine();
        // while there is something to scan
        while(input.hasNext()){
            // scan in the data line
            String textData = input.nextLine();
            // break up the data into pieces
            String[] data = textData.split(",");
            long isbn = Long.parseLong(data[0]);
            String author = data[1];
            String title = data[2];
            double rating = Double.parseDouble(data[3]);
            // create a book
            Book aBook = new Book(isbn, title, author, rating);
            // add the book to the array list
            this.books.add(aBook);
        }
    }

    public void printCollection() {
        // for each book in the books list
        for(Book b : this.books){
            System.out.printf("%d: %s by %s (%.1f)", b.getISBN(), b.getTitle(), b.getAuthor(), b.getRating());
            System.out.println();
        }

    }

    
}
