package abstractTest;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle[] vehicles = { new DieselSUV(),     //abstract 클래스가 객체는 생성할 수 없지만 부모 클래스로써 자식 클래스 참조 가능
				        new ElectricCar(),
				         new HorseCart()}; 
		
		
		for(Vehicle v : vehicles) 
		{
			v.reportPosition();
			v.addFuel();
		}
		

	}

}
