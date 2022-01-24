import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("Test5.txt"));
		
		// 구현하세요.
		Scanner sc = new Scanner(System.in);
		int[][] oh = new int[19][19];
		for(int i =0; i<19;i++) {
			for(int j=0; j<19; j++) {
				oh[i][j]=sc.nextInt();
			}
		}
		//for(int[] i : oh)System.out.println(Arrays.toString(i));
		int[] di= {0,1,1,1};
		int[] dj= {1,1,0,-1};
	
		
		
	/* 
	 * 우 우하 하 좌하에 위치한 오목판 확인
	 *  같은 것이 있다면 진출 
	 *  그 방향 기억 후 계속 진출
	 *  정확히 5면 라벨 이용해서 탈출 
	 *  6개 되면 브레이크
	 *  만약 새로운 1이나 2가 발견되면 좌 좌상 상 우상 확인해서 같은 것이 있다면 아웃 	
	 */
	boolean game =true;
    finish :for(int i=0; i<19;i++) {
		check :	for(int j=0; j<19;j++) {
			       //System.out.println(i+" "+j);
				   if(oh[i][j]==0) continue; 
				   int mb = oh[i][j];
				   
				   for(int x = 0 ; x<4 ; x++) {
					   if(i-di[x]>=0&&i-di[x]<19&&j-dj[x]>=0&&j-dj[x]<19) {
					   if(oh[i-di[x]][j-dj[x]]==oh[i][j]) continue check ;
					   }
				   }
				   for(int x=0;x<4;x++) {
					   int ni = i;
					   int nj = j;
					   int n=1;
					   for(int t=0;t<=5;t++) {
						 
						   ni+=di[x];
						   nj+=dj[x];
						   
						   if(ni>=0&&ni<19&&nj>=0&&nj<19&&oh[ni][nj]==oh[i][j]) {
							   n++;
							  
						   }else break;

						  
					   }
					   if(n==5)
						   {
						   		System.out.println(oh[i][j]+"\n"+(i+1)+" "+(j+1));
						   		game= false ;
						   		break finish;
						   }
					   
					   
				   }
				   
				
				
				
				
			}
    }
	if(game) System.out.println(-1);
				
		
		
	}

}
