public class Main {
    public static void main(String[] args) {
        var generator = new RandomNumberGenerator();
        var observer1 = new DigitObserver();
        var observer2 = new GraphObserver();
        var observer3 = new SumObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        generator.execute();
    }
}
