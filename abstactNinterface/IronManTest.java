package interfaceTest;

public class IronManTest {

	public static void main(String[] args) {
		IronMan ironman = new IronMan();
		Object ironman5 = new IronMan();
		
		Heroable ironman2 = new IronMan();
		Transformable ironman3 = new IronMan();
		Fightable ironman4 = new IronMan();
		
		ironman2.fire(); // 조상 인터페이스로 참조하고 있지만 오버라이딩한 메서드 호출시 자식 클래스의 오버라이딩한 메서드 사용!!

	}
	

}
