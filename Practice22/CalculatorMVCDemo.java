package Practise_Java.Practice22;

public class CalculatorMVCDemo {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller control = new Controller(model, view);
    }
}
