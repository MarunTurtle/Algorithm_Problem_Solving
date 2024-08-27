import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // A의 선택
        int B = sc.nextInt(); // B의 선택

        // 가위바위보 승리 조건 판별
        if ((A == 1 && B == 3) || (A == 2 && B == 1) || (A == 3 && B == 2)) {
            System.out.println("A"); // A가 이긴 경우
        } else {
            System.out.println("B"); // B가 이긴 경우
        }

        sc.close();
    }
}
