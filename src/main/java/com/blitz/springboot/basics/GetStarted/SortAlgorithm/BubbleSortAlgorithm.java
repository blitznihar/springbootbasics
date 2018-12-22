package com.blitz.springboot.basics.GetStarted.SortAlgorithm;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements ISortAlgorithm {

	public BubbleSortAlgorithm() {
	System.out.println("BubbleSortAlgorithm started");
	}

	@Override
	public int[] sort(int[] arr) {
		System.out.println("sorting using BubbleSortAlgorithm");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
