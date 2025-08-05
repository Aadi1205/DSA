package GreedyAlgorithm;
import java.util.*;
public class MaxLengthChainOfPair {  //TC: n*log(n)
    public static int MaxChainLen(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1]; //Last selected pair end // chain end

        for(int i=1; i<pairs.length; i++) {
            if(pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        return chainLen;
    }
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 15, 25 }, { 27, 40 }, { 50, 60 } };

        System.out.println("Max length of chain: " + MaxChainLen(pairs)); 

    }
}
