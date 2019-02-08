
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AppyAndContest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n, a, b, k;
			String input[] = br.readLine().split(" ");
			n = Integer.parseInt(input[0]);
			a = Integer.parseInt(input[1]);	// Appy
			b = Integer.parseInt(input[2]);	// Chef
			k = Integer.parseInt(input[3]);	// atleast k problems to solve to win
			int count = 0;
			int mulVariable = a*b;
			// logic to check no. of problem solved
			for(int i = 1; i<=n; i++) {
				
				// for Appy
				if((i % a == 0) && (i % mulVariable!= 0) && (i % b != 0))
					count++;
				else if(i % b == 0 && (i % mulVariable!= 0) && (i % a != 0))
					count++;
				if(count >= k)
					break;
			}
			if(count >= k)
				System.out.println("Win");
			else
				System.out.println("Lose");
		}	
	}
}
