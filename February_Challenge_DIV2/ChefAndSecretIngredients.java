import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ChefAndSecretIngredients {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			List<String> input = new ArrayList<String>();
			int inputLength[] = new int[n];
			String in = ""; 
			for(int i = 0; i<n; i++) {
				in = br.readLine();
				input.add(in);
				inputLength[i] = in.length();
			}
			if(n == 1) {
			      String temp = "";
			 
			      for (int i = 0; i < in.length(); i++) {
			         if(temp.indexOf(in.charAt(i)) == -1 ){
			             temp = temp + in.charAt(i);
			         }
			      }
			      System.out.println(temp.length());
			}
			else {
				Arrays.sort(inputLength);
				int minLength = inputLength[0];
				String minInput = "";
				for(int i = 0; i<input.size(); i++) {
					
					if(input.get(i).length() == minLength) {
						minInput = input.get(i);
						input.remove(i);
						break;
					}
				}
				int count = 0, k = 0;
				String alreadyParsedChar = "";
				for(int i = 0; i<minLength; i++) {
					k = 0;
					for(int j = 0; j<input.size(); j++) {
						// check for occurrence
						if(input.get(j).contains(minInput.charAt(i)+"") && !(alreadyParsedChar.contains(minInput.charAt(i)+""))) {
							k++;
						}
					}
					alreadyParsedChar = alreadyParsedChar + minInput.charAt(i);
					if(k == (input.size()) && k!= 0) {
						count++;
						k = 0;
					}
					
				}
				System.out.println(count);
			}
		}
	}
}
