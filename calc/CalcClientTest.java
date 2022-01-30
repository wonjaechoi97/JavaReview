package calc;

public class CalcClientTest {

	public static void main(String[] args) {
		Calculator calc = new CalculatorStub();//대충 구현해 놓은 것.
		CalcClientUI ui = new CalcClientUI(calc);
		
		ui.add(100, 200);
		
		Calculator calc2 = new CaculatorImpl();//그 사이 로직팀에서 제대로 구현해 놓은 메서드
		CalcClientUI ui2 = new CalcClientUI(calc2);
		ui2.add(100, 200);
	}

}
