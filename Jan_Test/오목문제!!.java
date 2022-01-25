import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res/Test5.txt"));

		Scanner sc = new Scanner(System.in);
		int[][] oh = new int[19][19];
		for(int i =0; i<19;i++) {
			for(int j=0; j<19; j++) {
				oh[i][j]=sc.nextInt();
			}
		}
		int[] di= {-1,0,1,1};
		int[] dj= {1,1,1,0};
	
	boolean game =true;
    finish :for(int i=0; i<19;i++) {
		for(int j=0; j<19;j++) {
			       //System.out.println(i+" "+j);
				   if(oh[i][j]!=0) {
				 
				   for(int x = 0 ; x<4 ; x++) {
					   if(i-di[x]>=0&&i-di[x]<19&&j-dj[x]>=0&&j-dj[x]<19) {
					   if(oh[i-di[x]][j-dj[x]]==oh[i][j]) continue;
					   System.out.println(i+" "+j+" " +x);
					   }
				   
				 
					   int ni = i;
					   int nj = j;
					   int n=1;
					   for(int t=0;t<=6;t++) {
						 
						   ni+=di[x];
						   nj+=dj[x];
					
						   if(ni>=0&&ni<19&&nj>=0&&nj<19) {
							   if(oh[ni][nj]==oh[i][j]){
								   n++;
							   }else break;
							   
							   
							  
						   }else break;

						  
					   }
					   if(i==13)System.out.println(n+" "+(i+1)+" "+(j+1));
					   if(n==5)
						   {
						   		System.out.println(oh[i][j]+"\n"+(i+1)+" "+(j+1));
						   		game= false ;
						   		break finish;
						   }
					   
					   
				 
				   }
			}
		}
    }
	if(game) System.out.println(0);
	sc.close();
				
		
		
	}

}
