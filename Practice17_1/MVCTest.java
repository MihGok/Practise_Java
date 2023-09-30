package Practise_Java.Practice17_1;

public class MVCTest {
    public static void main(String[] args){
        Model model = new Model();
        View view = new View();
        Controller control = new Controller(model,view);
    }
}
