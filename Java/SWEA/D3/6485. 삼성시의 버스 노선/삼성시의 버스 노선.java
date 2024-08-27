import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int[] busStops = new int[5000];

            for (int i = 0; i < N; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                for (int j = start; j <= end; j++) {
                    busStops[j - 1] += 1;
                }
            }

            int P = sc.nextInt();
            System.out.print("#" + test_case + " ");
            for (int i = 0; i < P; i++) {
                int stop = sc.nextInt();
                System.out.print(busStops[stop - 1] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}