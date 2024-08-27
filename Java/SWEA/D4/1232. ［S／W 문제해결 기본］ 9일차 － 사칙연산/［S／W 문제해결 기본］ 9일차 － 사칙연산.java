import java.util.Scanner;

class Solution {
    static class Node {
        String value;
        int left, right;

        Node(String value, int left, int right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    static Node[] tree;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int t = 1; t <= 10; t++) { // 총 10개의 테스트 케이스
            int N = sc.nextInt();
            tree = new Node[N + 1]; // 1번 정점부터 시작하므로 N+1 크기로 설정

            for (int i = 1; i <= N; i++) {
                int index = sc.nextInt();
                String value = sc.next();
                if (value.matches("[0-9]+")) { // value가 숫자일 경우
                    tree[index] = new Node(value, -1, -1);
                } else { // value가 연산자일 경우
                    int left = sc.nextInt();
                    int right = sc.nextInt();
                    tree[index] = new Node(value, left, right);
                }
            }

            int result = (int) evaluate(1); // 루트에서 연산 시작
            System.out.println("#" + t + " " + result);
        }

        sc.close();
    }

    public static double evaluate(int index) {
        Node node = tree[index];

        if (node.left == -1 && node.right == -1) {
            return Double.parseDouble(node.value); // 숫자인 경우 값을 반환
        }

        double leftValue = evaluate(node.left); // 왼쪽 서브트리 계산
        double rightValue = evaluate(node.right); // 오른쪽 서브트리 계산

        switch (node.value) {
            case "+":
                return leftValue + rightValue;
            case "-":
                return leftValue - rightValue;
            case "*":
                return leftValue * rightValue;
            case "/":
                return leftValue / rightValue;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
