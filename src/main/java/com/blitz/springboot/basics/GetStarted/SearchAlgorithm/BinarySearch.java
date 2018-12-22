package com.blitz.springboot.basics.GetStarted.SearchAlgorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blitz.springboot.basics.GetStarted.SortAlgorithm.ISortAlgorithm;

@Component
public class BinarySearch implements ISearch {

	public BinarySearch() {
	 System.out.println("BinarySearch started");
	}
	@Autowired
	private ISortAlgorithm bubbleSortAlgorithm;

	@Override
	public int search(int[] numbers, int numberToSearch) {
		System.out.println("searching in BinarySearch");
		int result = 0;
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		for (int i = 1; i < sortedNumbers.length; i++) {
			System.out.print(sortedNumbers[i] + " ");
		}
		result = searchLogic(sortedNumbers, 1, sortedNumbers.length, numberToSearch);
		return result;
	}

	private int searchLogic(int[] array, int left, int right, int key) {
		if (left > right) {
			return -1;
		}

		int mid = (left + right) / 2;

		if (array[mid] == key) {
			return mid;
		}

		if (array[mid] > key) {
			return searchLogic(array, left, mid - 1, key);
		}

		return searchLogic(array, mid + 1, right, key);
	}
}
