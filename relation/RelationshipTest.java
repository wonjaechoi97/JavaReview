package relation;

public class RelationshipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objs = {new Phone(), new HandPhone(), new Camera(), new DigitalCamera()};
		//충전 가능한 객체만 충전하자!!
		//인터페이스를 사용하지 않는다면??
		for(int i=0;i<objs.length;i++) {
			if(objs[i] instanceof HandPhone) {
				HandPhone phone = (HandPhone)objs[i];
				phone.charge();
			}
			if(objs[i] instanceof DigitalCamera) {
				DigitalCamera camera = (DigitalCamera)objs[i];
				camera.charge();
			}
		}
		// instanceof로 확인 후 형변환 하는 과정이 필요하다.
		
		//하지만 인터페이스를 활용하면 
		Object[] charge = {new Phone(), new HandPhone(), new Camera(), new DigitalCamera()};
		
		for(Object ch : charge) {
			if(ch instanceof Chargeable) ((Chargeable) ch).charge();
		}
	}

}
