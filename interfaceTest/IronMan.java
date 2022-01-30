package interfaceTest;

public class IronMan implements Heroable{

	@Override
	public int fire() {
		System.out.println("발사!!!");
		return 0;
	}

	@Override
	public void upgrade() {
		System.out.println("변신!!");
		
	}

	@Override
	public void changeShape() {
		System.out.println("기능 강화!!");
		
	}

}
