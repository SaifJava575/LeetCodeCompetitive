package com.nt.leetcode;

public class Lt_10_GasStation {

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int sGas = 0, sCost = 0, res = 0, total = 0;
		for (int i = 0; i < gas.length; i++) {
			sGas += gas[i];
			sCost += cost[i];
		}
		if (sGas < sCost)
			return -1;
		for (int i = 0; i < gas.length; i++) {
			total += gas[i] - cost[i];
			if (total < 0) {
				total = 0;
				res = i + 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int gas[] = { 1, 2, 3, 4, 5 };
		int cost[] = { 3, 4, 5, 1, 2 };
		int response = canCompleteCircuit(gas, cost);
		System.out.println("Result is ::" + response);

	}

}
