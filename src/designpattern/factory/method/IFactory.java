package designpattern.factory.method;

import designpattern.factory.simple.Operation;
import designpattern.factory.simple.OperationAdd;
import designpattern.factory.simple.OperationDiv;
import designpattern.factory.simple.OperationMul;
import designpattern.factory.simple.OperationSub;

public interface	 IFactory {
public Operation createOperation();

}
class AddFactoy implements IFactory{
	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationAdd();
	}

	
}
class SubFactoy implements IFactory{
	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationSub();
	}
}
class DivFactory implements IFactory{
	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationDiv();
	}
}
class MulFactoy implements IFactory{
	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationMul();
	}
}
