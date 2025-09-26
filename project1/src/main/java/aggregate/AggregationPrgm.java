package aggregate;

public class AggregationPrgm {
	public static void main(String[] args) {
	
	
    // Creating an Author object
    Author obj1 = new Author("Basheer", 42, "tvm");
    
    // Creating a Book object and associating it with the Author object
    Book obj3 = new Book("Pathumade Aadu", 160, obj1);
    
    // Printing details of the Book and Author
    System.out.println("Book Name: " + obj3.name);
    System.out.println("Book Price: " + obj3.price);
    System.out.println("Author Name: " + obj3.author.AuthorName);
    System.out.println("Author Age: " + obj3.author.age);
    System.out.println("Author Place: " + obj3.author.place);
}

}
