// https://programmers.co.kr/learn/courses/30/lessons/42626

package algorithm;

import java.util.PriorityQueue;

public class Scoville {
    public int solution(int[] scoville, int K) {

        /*
        * 1.모든 원소를 pq 입력
        * 2.
        *   가장 작은 2개를 poll
        *   a + 2*b 연산 후 offer
        *   가장 작은 값을 poll 하고 K 와 비교
        *   x < K   : 재연산 수행. => 만약 원소가 1개였다면 return -1
        *   x >= K  : 현재 cnt 반환
        *
        *  */

        PriorityQueue<Integer> queue = new PriorityQueue();
        for (int i : scoville) {
            queue.offer(i);
        }

        int cnt = 0;

        while (queue.size() > 1) {

            if (queue.peek() >= K) {
                return cnt;
            }
            cnt++;

            int min1 = queue.poll();
            int min2 = queue.poll();

            int scov = min1 + min2 * 2;
            queue.offer(scov);

        }


        if (queue.peek() >= K) {
            return cnt;
        }


        return -1;
    }
}
