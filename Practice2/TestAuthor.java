package Practise_Java.Practice2;
public class TestAuthor {
    public static void main(String[] args) {
            String name = "Leonid";
            char gender = 'm';
            String email = "Leonid.com";
            Author test1 = new Author(name,email,gender);
            System.out.println("Test result is \n" + test1.toString());
    };
}
