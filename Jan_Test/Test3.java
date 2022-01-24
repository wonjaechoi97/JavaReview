

public class Test3 {


	public void execute(String msg) {
		char[] cha = msg.toCharArray();
		int[] used = new int[10];
		for(int i =0; i<cha.length;i++) {
			used[cha[i]-'0']++;
			
		}
		for(int i = 0; i<10; i++) {
			if(used[i]!=0) {
				System.out.println(i+" : "+used[i]);
			}
		}
		
				
		
		
		
	}
	public static void main(String[] args) {
		Test3 c=new Test3();
		c.execute("53290539955364534323455987827332679340558347453272569584"); 
		System.out.println("=======");
		c.execute("13334444555557777777"); 
	}
}
