
public class Test2 {

	public static void main(String[] args) {

		int[]  su=  { 45, 80, 68, 19, 34, 55, 27, 60, 27, 18 };
		
		double avg = 0;
		double min = 500;
		int min_idx =-1;
		int sum=0;
		
		for(int i = 0; i < su.length;i++ ) {
			sum+=su[i];
		}
		
		avg = (sum*1.0)/su.length;
		
		for(int i=0; i<su.length;i++) {
			if(min>Math.abs(avg-su[i])) {
				min = Math.abs(avg-su[i]);
				min_idx=i;
			}
			
		}
		System.out.printf("%f %d",avg, su[min_idx]);
		System.out.println(avg+" "+ su[min_idx]);
	}
}
