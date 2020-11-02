package recursiveex1;
import java.io.*;

public class RecursiveEx1 {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int sum = factorial(N);
		System.out.println(sum);

	}
	
	public static int factorial(int N) 
	{
		if(N <= 1) return 1;	// 재귀 종료조건
		return N * factorial(N - 1);		
	}
		
}