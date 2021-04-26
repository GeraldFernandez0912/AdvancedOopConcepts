public class BookArray {
    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Fiction("The Lord of The Rings");
        books[1] = new NonFiction("Silent Spring");
        books[2] = new Fiction("Jane Eyre");
        books[3] = new NonFiction("Hiroshima");
        books[4] = new Fiction("The Great Gatsby");
        books[5] = new NonFiction("Into Thin Air");
        books[6] = new Fiction("Wuthering Heights");
        books[7] = new NonFiction("In Cold Blood");
        books[8] = new Fiction("Brave New World");
        books[9] = new NonFiction("Black Futures");

        for(int x = 0; x < books.length; ++x){
            System.out.println("BOOK: \"" + books[x].getTitle() + "\" IS $" + books[x].getPrice());
        }
    }
}