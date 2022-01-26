package abstractTest;

public abstract class Vehicle {
	//abstract class는 객체 생성을 못하지만 부모 클래스로서 자식 클래스 객체의 참조는 가능하다.
	//abstract 메소드가 있으면 반드시 abstract 클래스가 되어야 함.
	private int curX, curY;
	
	public void reportPosition() {
		System.out.printf("현재 위치 : (%d, %d)\n", curX,curY);
	}
	
	public abstract void addFuel();//자식 클래스에서 반드시 오버라이드해서 사용하기 때문에 
	//abstract 메소드로 만들어서 구현부를 적지 않는다.

}

// abstract 클래스는 구현을 강제함으로써 프로그램을 안정화할 수 있다. 
// 재정의가 꼭 필요한 자식 클래스에서 재정의를 강제하여 실수 방지.