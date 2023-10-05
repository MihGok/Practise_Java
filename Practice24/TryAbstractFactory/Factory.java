package Practise_Java.Practice24.TryAbstractFactory;
import java.util.Random;
public class Factory implements AbstractFactory{
    @Override
    public VictorianChair crateVictorianChair() {
        Random rand = new Random();
        return new VictorianChair(rand.nextInt());
    }

    @Override
    public MagicanChair createMagicacChair() {
        return new MagicanChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
