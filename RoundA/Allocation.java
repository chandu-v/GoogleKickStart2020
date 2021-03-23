package RoundA;

import java.util.Arrays;
import java.util.Scanner;

class Allocation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0  ; i < T ; i++) {
            int N = in.nextInt();
            int [] A = new int[N];
            int B = in.nextInt();
            for(int j = 0 ; j < N ; j++) {
                A[j] = in.nextInt();
            }
            System.out.println(String.format("Case #%S: %S", i+1, maxHousesInBudget(A, B)));
        }
        in.close();
    }

    public static int maxHousesInBudget(int [] A, int B) {
        int count = 0;
        Arrays.sort(A);
        while(count < A.length && B-A[count] >= 0) {
            B = B-A[count];
            count++;
        }
        return count;
    }
}