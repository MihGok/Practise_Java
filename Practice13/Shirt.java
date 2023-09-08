package Practise_Java.Practice13;

public class Shirt {
    private String model, size, type, color;

    public Shirt() {
    }

    public void shirt(String[] info) {
        this.model = info[0];
        this.size = info[3];
        this.type = info[1];
        this.color = info[2];
        toLine();
    }

    public void toLine() {
        String res = "";
        res = new StringBuffer().append("Your type is ").append(type).append("\nYour size and color are ").append(size).append(" ").append(color).append(" You may find it using id ").append(model).toString();
        System.out.println(res);
        System.out.println("\n");
    }
}
