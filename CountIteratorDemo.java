package com.hipposoft.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.hipposoft.counting.CountingIterator;
import com.hipposoft.counting.CountingUtils;

public class CountIteratorDemo {

	static void printAll(CountingIterator iter, List<String> elems) {
		System.out.print("{");
		boolean firstElem = true;
		while (iter.hasNext()) {
			if (firstElem) {
				firstElem = false;
			} else {
				System.out.print(", ");
			}
			System.out.print(iter.next(elems));
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		List<String> list = Collections.unmodifiableList(Arrays.asList(new String[] { "a", "b", "c", "d", "e" }));

		CountingIterator iter = null;

		iter = CountingUtils.permutationIterator(list.size(), 3);
		System.out.println("Permulation without repetition:");
		printAll(iter, list);
		System.out.println("Size of the Iterator:" + iter.totalSize());

		iter = CountingUtils.permutation2Iterator(list.size(), 3);
		System.out.println("Permulation with repetition:");
		printAll(iter, list);
		System.out.println("Size of the Iterator:" + iter.totalSize());

		iter = CountingUtils.combinationIterator(list.size(), 3);
		System.out.println("Combination without repetition:");
		printAll(iter, list);
		System.out.println("Size of the Iterator:" + iter.totalSize());

		iter = CountingUtils.combination2Iterator(list.size(), 3);
		System.out.println("Combination with repetition:");
		printAll(iter, list);
		System.out.println("Size of the Iterator:" + iter.totalSize());
	}

}
