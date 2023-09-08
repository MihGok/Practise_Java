package Practise_Java.Practice2;

public class Author {
    private String name;
    private char gender;
    private String email;

    public Author(String name, String email, char gender) {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }


    public void setemail(String email) {
        this.email = email;
    }

    public char getgender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}