package interfacePrintTest;

public class PrinterTest {

	public static void main(String[] args) {
		PrintClient client = new PrintClient();
		client.setPrinter(new DotPrinter());
		//프린터를 교체 
		client.setPrinter(new LaserPrinter());
		
		//레이저 프린터로 바꾸어도 똑같이 print 메서드를 사용하여 똑같은 기능을 수행한다.
		//새로운 프린터 사용법에 대해서 알 필요가 없고 이 프린터 저 프린터 바꿔 끼울 수 있다.
		client.printThis("myfile");
		
		
		
		
		//인터페이스가 있기 때문에 Printer가 바뀌어도 print()는 존재한다!!
		//자바가 데이터 베이스가 필요한 기능을 인터페이스를 만든다.
		//자바에서 선언해 놓은 인터페이스(jdbc 인터페이스)를 데이터베이스 벤더들이 구현해 놓은 것이 jdbc 드라이버.
		//마이sql에서 오라클로 바꾸었을 때 우리의 코드는 변경이 없다
		// 우리가 필요한 기능들은 인터페이스에 선언해 두었고 db 벤더들이 이에 맞춰서 jdbc드라이버를 만들어 놓았기 때문에 코드는 변경될
		// 필요가 없다. !

	}

}
