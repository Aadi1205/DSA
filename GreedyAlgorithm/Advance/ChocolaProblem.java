package GreedyAlgorithm.Advance;

import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer vertical[] = {2, 1, 3, 1, 4};    // m-1 cuts
        Integer horizontal[] = {4, 1, 2};        // n-1 cuts

        Arrays.sort(vertical, Collections.reverseOrder());
        Arrays.sort(horizontal, Collections.reverseOrder());

        int i = 0, j = 0;  // i for horizontal, j for vertical
        int hp = 1, vp = 1;
        int cost = 0;

        while (i < horizontal.length && j < vertical.length) {
            if (horizontal[i] >= vertical[j]) {
                cost += horizontal[i] * vp;
                hp++;
                i++;
            } else {
                cost += vertical[j] * hp;
                vp++;
                j++;
            }
        }

        // remaining horizontal cuts
        while (i < horizontal.length) {
            cost += horizontal[i] * vp;
            hp++;
            i++;
        }

        // remaining vertical cuts
        while (j < vertical.length) {
            cost += vertical[j] * hp;
            vp++;
            j++;
        }

        System.out.println("Min cost required to cut the chocolate is: " + cost);
    }
}
