import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    
    static int[][] map; // 초기 입력받는 배열
    static ArrayList<int[]> people; // 사람 있는 위치 좌표
    static ArrayList<int[]> stairs; // 두 개의 계단 좌표(i, j, 길이)
    static ArrayList<Integer> A; // 계단 1 그룹의 계단1까지의 거리
    static ArrayList<Integer> B; // 계단 2 그룹의 계단2까지의 거리
    static int people_cnt;
    static int result; // 최종 값
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt(); // 지도 크기 설정
            map = new int[N][N]; // 지도 객체 생성
            people = new ArrayList<>(); // people 객체 생성
            stairs = new ArrayList<>();
            A = new ArrayList<>();
            B = new ArrayList<>();
            result = Integer.MAX_VALUE;  // 큰 값으로 초기화
            
            people_cnt = 0;
            
            // 지도, 사람 위치, 계단 위치 및 크기 받기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                    
                    // 값이 1이면, 좌표를 사람 배열에 넣기
                    if (map[i][j] == 1) {
                        people.add(new int[]{i, j});
                        people_cnt++;
                    } 
                    // 값이 1보다 크면, 계단 위치와 길이로 추가
                    else if (map[i][j] > 1) {
                        stairs.add(new int[]{i, j, map[i][j]});
                    }                    
                }
            }
            
            int A_dist = stairs.get(0)[2];
            int B_dist = stairs.get(1)[2];
            
            // 부분집합으로 모든 사람을 두 그룹으로 나누기
            for (int i = 0; i < (1 << people_cnt); i++) {
                A.clear();
                B.clear();
                
                // 각 부분집합에 대해 A와 B 그룹에 사람을 나누기
                for (int j = 0; j < people_cnt; j++) {
                    int r = people.get(j)[0]; // 사람의 행 위치
                    int c = people.get(j)[1]; // 사람의 열 위치
                    
                    // i의 j번째 비트가 1이면 A 그룹, 0이면 B 그룹
                    if ((i & (1 << j)) > 0) {
                        int dist = Math.abs(stairs.get(0)[0] - r) + Math.abs(stairs.get(0)[1] - c);
                        A.add(dist);
                    } else {
                        int dist = Math.abs(stairs.get(1)[0] - r) + Math.abs(stairs.get(1)[1] - c);
                        B.add(dist);
                    }
                }
                
                // 그룹 A와 B를 거리순으로 정렬
                Collections.sort(A);
                Collections.sort(B);
                
                // A 그룹의 계단 내려가는 시간 계산
                int timeA = 0;
                if (!A.isEmpty()) {
                    ArrayList<Integer> queueA = new ArrayList<>(3);
                    for (int k = 0; k < A.size(); k++) {
                        while (!queueA.isEmpty() && queueA.get(0) <= A.get(k)) {
                            queueA.remove(0);
                        }
                        if (queueA.size() < 3) {
                            queueA.add(A.get(k) + A_dist);
                        } else {
                            int nextFreeTimeA = queueA.remove(0);
                            queueA.add(nextFreeTimeA + A_dist);
                            A.set(k, nextFreeTimeA);
                        }
                        Collections.sort(queueA);
                    }
                    timeA = queueA.get(queueA.size() - 1);
                }
                
                // B 그룹의 계단 내려가는 시간 계산
                int timeB = 0;
                if (!B.isEmpty()) {
                    ArrayList<Integer> queueB = new ArrayList<>(3);
                    for (int k = 0; k < B.size(); k++) {
                        while (!queueB.isEmpty() && queueB.get(0) <= B.get(k)) {
                            queueB.remove(0);
                        }
                        if (queueB.size() < 3) {
                            queueB.add(B.get(k) + B_dist);
                        } else {
                            int nextFreeTimeB = queueB.remove(0);
                            queueB.add(nextFreeTimeB + B_dist);
                            B.set(k, nextFreeTimeB);
                        }
                        Collections.sort(queueB);
                    }
                    timeB = queueB.get(queueB.size() - 1);
                }
                
                // 두 그룹의 이동 시간 중 최대값을 현재 부분집합의 결과로 설정
                int maxTime = Math.max(timeA, timeB);
                
                // 최종 결과 갱신
                result = Math.min(result, maxTime);
            }
            
            // 결과 출력
            System.out.println("#" + t + " " + (result + 1));
        } 
    } 
}
