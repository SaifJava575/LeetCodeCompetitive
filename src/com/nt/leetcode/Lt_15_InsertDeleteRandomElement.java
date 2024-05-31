package com.nt.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Lt_15_InsertDeleteRandomElement {

	private ArrayList<Integer> list;
	private Map<Integer, Integer> map;

	public Lt_15_InsertDeleteRandomElement() {
		list = new ArrayList<>();
		map = new HashMap<>();
	}

	public boolean search(int val) {
		return map.containsKey(val);
	}

	public boolean insert(int val) {
		if (search(val))
			return false;

		list.add(val);
		map.put(val, list.size() - 1);
		return true;
	}

	public boolean remove(int val) {
		if (!search(val))
			return false;

		int index = map.get(val);
		list.set(index, list.get(list.size() - 1));
		map.put(list.get(index), index);
		list.remove(list.size() - 1);
		map.remove(val);

		return true;
	}

	public int getRandom() {
		Random rand = new Random();
		return list.get(rand.nextInt(list.size()));
	}

	public static void main(String[] args) {
		Lt_15_InsertDeleteRandomElement obj = new Lt_15_InsertDeleteRandomElement();
		
		if (obj.insert(1)) {
			int response = obj.getRandom();
			System.out.println("The Rnadom number is ::" + response);
		} else {
			boolean res = obj.remove(1);
			System.out.println("The Object will be deleted ::" + res);
		}

	}

}
