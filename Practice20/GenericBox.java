package Practise_Java.Practice20;


public class GenericBox<T,V ,K> {
    // Private переменная класса
    private T content;
    private K count;
    private V toAdd;
    // конструктор
    public GenericBox(T content,K count,V toAdd) {
        this.content = content;
        this.toAdd = toAdd;
        this.count = count;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String toString() {
        return content + " (" + content.getClass() + ")" + "        " + toAdd + " (" + toAdd.getClass() + ")" + "     " + count + " (" + count.getClass() +")";
    }
}