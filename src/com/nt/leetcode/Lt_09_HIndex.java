package com.nt.leetcode;

import java.util.PriorityQueue;

public class Lt_09_HIndex {

	public static int hIndex(int[] citations) {
		int n = citations.length;
		int[] buckets = new int[n + 1];
		for (int c : citations) {
			if (c >= n) {
				buckets[n]++;
			} else {
				buckets[c]++;
			}
		}
		int count = 0;
		for (int i = n; i >= 0; i--) {
			count += buckets[i];
			if (count >= i) {
				return i;
			}
		}
		return 0;
	}

	public static int hIndex1(int[] citations) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		int hIndex = 0;

		for (int i : citations) {
			pq.offer(i);
		}

		while (!pq.isEmpty() && pq.peek() > hIndex) {
			pq.poll();
			hIndex++;
		}

		return hIndex;
	}

	public static void main(String[] args) {
		int  citations[] = {3,0,6,1,5};
		int response=hIndex(citations);
		System.out.println("The max HIndex value is  ::"+response);

	}

}
