
public class SumObserver implements Observer {
	private int sum = 0; 
	@Override
	public void update(RandomNumberGenerator generator) {
		sum += generator.getNumber();
        System.out.println("SumObserver:" + sum);	
	}

}
