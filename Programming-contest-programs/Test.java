package com.prog.CodeChefCompetitionsProgs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Test {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		// taking input
		for(int i = 0; i<n; i++)
			a[i] = Integer.parseInt(st.nextToken());
		
		List<Pair> list = new ArrayList<Pair>();
		for(int i = 0; i<n; i++) {
			list.add(new Pair(a[i], i+1));
		}
		
 
		Collections.sort(list, new Pair());
		
		Integer currentMaxIndex = list.get(0).getSecond();
		Integer finalAnswer = -1;
		for(int i = 1; i < list.size(); i++){
			Pair p = list.get(i);
			if(currentMaxIndex > p.getSecond()){
				p.setLongestFromCurrent(currentMaxIndex - p.getSecond() + 1);
			}
			else{
				currentMaxIndex = p.getSecond();
			}
			finalAnswer = finalAnswer < p.getLongestFromCurrent() ? 
								p.getLongestFromCurrent(): finalAnswer;
		}
		
		System.out.println(finalAnswer);
	}
}
}
 
class Pair implements Comparator<Pair>{
 
	private Integer first;
	private Integer second;
	private Integer longestFromCurrent;
 
	Pair(){
		this.first = 0;
		this.second = 0;
		this.longestFromCurrent = 1;
	}
 
	Pair(Integer first, Integer second){
		this.first = first;
		this.second = second;
		this.longestFromCurrent = 1;
	}
 
	public int compare(Pair a, Pair b){
		if(a.first == b.first){
			return b.second - a.second;
		}
		return a.first - b.first;
	}
 
	public Integer getLongestFromCurrent(){
		return longestFromCurrent;
	}
 
	public void setLongestFromCurrent(Integer longestFromCurrent){
		this.longestFromCurrent = longestFromCurrent;
	}
 
	public Integer getFirst(){
		return first;
	}
 
	public Integer getSecond(){
		return second;
	}
 
}