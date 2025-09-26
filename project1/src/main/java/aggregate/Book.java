package aggregate;

public class Book {String name;
int price;
Author author;  // Aggregation: Book has an Author

// Constructor to initialize book details and associate an author
Book(String name, int price, Author author) {
    this.name = name;
    this.price = price;
    this.author = author;
}

}
