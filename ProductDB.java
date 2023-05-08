package murach.db;

import murach.business.Album;
import murach.business.Book;
import murach.business.Product;
import murach.business.Software;

public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java")
                || productCode.equalsIgnoreCase("jsp")
                || productCode.equalsIgnoreCase("mysql")) {
            Book b = new Book();
            if (productCode.equalsIgnoreCase("java")) {
                b.setCode(productCode);
                b.setDescription("Murach's Java Programming");
                b.setPrice(57.50);
                b.setAuthor("Joel Murach");
            } else if (productCode.equalsIgnoreCase("jsp")) {
                b.setCode(productCode);
                b.setDescription("Murach's Java Servlets and JSP");
                b.setPrice(57.50);
                b.setAuthor("Mike Urban");
            } else if (productCode.equalsIgnoreCase("mysql")) {
                b.setCode(productCode);
                b.setDescription("Murach's MySQL");
                b.setPrice(54.50);
                b.setAuthor("Joel Murach");
            }
            p = b; // set Product object equal to the Book object
        } else if (productCode.equalsIgnoreCase("netbeans")) {
            Software s = new Software();
            s.setCode("netbeans");
            s.setDescription("NetBeans");
            s.setPrice(0.00);
            s.setVersion("8.0");
            p = s; // set Product object equal to the Software object
            
        } else if (productCode.equalsIgnoreCase("sgtp")) {
            // this sets up a new album
            Album a = new Album();
            // this sets the code that the user must type in to be spte
            a.setCode("sgtp");
            //this sets the description to Sgt. Peppers
            a.setDescription("Sgt. Peppers");
            // this sets the price of the album
            a.setPrice(14.99);
            // this sets the artist of the album to be the beatles
            a.setArtist("The Beatles");
            // this sets the product to be equal to the album
            p = a; 
        } else if (productCode.equalsIgnoreCase("bdgo")) {
            // this sets up another new album
            Album a = new Album();
            // this sets the code to bdgo
            a.setCode("bdgo");
            // this sets the description to Java with Murach
            a.setDescription("Java with Murach");
            // this sets the price to 1500
            a.setPrice(1500);
            // this sets the artist to be Micky Badgero
            a.setArtist("Micky Badgero");
            
            p = a;
        }
        return p;
    }
}
