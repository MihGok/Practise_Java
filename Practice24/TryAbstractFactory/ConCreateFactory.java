package Practise_Java.Practice24.TryAbstractFactory;

public class ConCreateFactory implements AbstractFactory{
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real,image);
    }
}
