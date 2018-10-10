package designpattern.factory.method;


import designpattern.factory.simple.Operation;

public class FactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory operFactory = new DivFactory();
		Operation operation = operFactory.createOperation();
		operation.numberA = 3.4;
		operation.numberB = 4.5;

		System.out.println(operation.result());
	}

}
