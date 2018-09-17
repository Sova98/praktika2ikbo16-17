public class TestAuthor {
    public static void main(String [] args){
        Author author1 = new Author("Florea", "florea@gmail.com", 'Q');
        System.out.println(author1.toString());

        author1.SetEmail("new_florea@gmail.com");
        System.out.println(author1.toString());

    }
}
