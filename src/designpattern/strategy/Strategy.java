package designpattern.strategy;

public  interface Strategy {
public void algorithmInterface();
}
class ConcreteStrategyA implements Strategy{

	@Override
	public void algorithmInterface() {
		// TODO Auto-generated method stub
		System.out.println("����A�ľ����㷨ʵ��");
	}
	
}
class ConcreteStrategyB implements Strategy{

	@Override
	public void algorithmInterface() {
		// TODO Auto-generated method stub
		System.out.println("����B�ľ����㷨ʵ��");
	}
	
}
class ConcreteStrategyC implements Strategy{

	@Override
	public void algorithmInterface() {
		// TODO Auto-generated method stub
		System.out.println("����C�ľ����㷨ʵ��");
	}
	
}
