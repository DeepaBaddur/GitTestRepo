package com.gittestrepo.demo;

public class Search {
	
	public int search(int arr[], int x) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			if(arr[i] == x)
				return i;
		}
		return -1;
	}	

}
