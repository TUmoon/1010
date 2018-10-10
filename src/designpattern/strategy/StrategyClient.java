package designpattern.strategy;

public class StrategyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context;

		context = new Context(new ConcreteStrategyA());
		context.contextInterface();

		context = new Context(new ConcreteStrategyB());
		context.contextInterface();

		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
	}

}
