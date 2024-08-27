import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		// 테스트를 위해 input.txt 파일을 사용하려면 아래 주석을 해제하세요.
		// System.setIn(new FileInputStream("res/input.txt"));

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스 수 입력

		// 여러 개의 테스트 케이스 처리
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt(); // 재료의 수
			int L = sc.nextInt(); // 제한 칼로리
			
			int[] T_scores = new int[N]; // 재료별 맛 점수
			int[] K_calories = new int[N]; // 재료별 칼로리
			
			for (int i = 0; i < N; i++) {
				T_scores[i] = sc.nextInt(); // i번째 재료의 맛 점수
				K_calories[i] = sc.nextInt(); // i번째 재료의 칼로리
			}
			
			int maxScore = 0;
			// 완전 탐색을 통해 최적의 맛 점수를 계산
			maxScore = findMaxScore(N, L, T_scores, K_calories, 0, 0, 0);
			
			System.out.println("#" + test_case + " " + maxScore);
		}
		
		sc.close(); // 스캐너 종료
	}
	
	// 재귀를 통한 완전탐색 함수
	public static int findMaxScore(int N, int L, int[] T_scores, int[] K_calories, int idx, int currentScore, int currentCalories) {
		if (currentCalories > L) {
			return 0; // 칼로리 초과시 무효
		}
		
		if (idx == N) {
			return currentScore; // 모든 재료를 확인한 경우 현재까지의 맛 점수 반환
		}
		
		// 현재 재료를 선택하지 않는 경우
		int scoreWithoutCurrent = findMaxScore(N, L, T_scores, K_calories, idx + 1, currentScore, currentCalories);
		
		// 현재 재료를 선택하는 경우
		int scoreWithCurrent = findMaxScore(N, L, T_scores, K_calories, idx + 1, currentScore + T_scores[idx], currentCalories + K_calories[idx]);
		
		// 두 경우 중 더 큰 점수를 반환
		return Math.max(scoreWithoutCurrent, scoreWithCurrent);
	}
}
