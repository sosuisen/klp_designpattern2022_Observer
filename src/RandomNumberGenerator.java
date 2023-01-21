import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    // 保持しているObserverたち
    private List<Observer> observers = new ArrayList<>();
    private Random random = new Random(); // 乱数生成器
    private int number;                   // 現在の数

    // Observerを追加する
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Observerを削除する
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // Observerへ通知する
    public void notifyObservers() {
        for (var o: observers) {
            o.update(this);
        }
    }
    
    // 数を取得する
    public int getNumber() {
        return number;
    }

    // 数を生成する
    public void execute() {
        for (var i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
