package LeastMultiful;

import java.util.*;

/*두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 
 * 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.

두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)

출력
첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.*/

//이번 문제는 그냥 수학문제인 것 같다. 어려움은 없었다.

public class LeastMultiful {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		for(int i = 0; i < Num; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if(n1 <= n2) {
				if(n2 % n1 == 0) {
					System.out.println(n2);
				}
				else {
					// A와 B중 큰 수에 2부터 곱하며 작은 수로 나누어 나머지가 0인 것을 찾는다.
					int count = 1;
					for(int j = 0; j < 500000; j++) {
						count++;
						if(n2 * count % n1 == 0) break;
						
					}
					System.out.println(n2 * count);
				}
			}
			else {
				// A와 B중 어느 것이 큰 수인지 모르기 때문에 2가지 경우 모두 고려하여 코딩함
				if(n1 % n2 == 0) {
					System.out.println(n1);
				}
				else {
					int count = 1;
					for(int j = 0; j < 500000; j++) {
						count++;
						if(n1 * count % n2 == 0) break;
						
					}
					System.out.println(n1 * count);
				}
			}
		}
	}

}
