package com.blitz.springboot.basics.GetStarted.SearchAlgorithm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SequentialSearch implements ISearch {
	public SequentialSearch() {
		System.out.println("SequentialSearch Started");
	}

	public int search(int[] arr, int key) {
		int arraySize = arr.length;
		for (int i = 0; i < arraySize; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
