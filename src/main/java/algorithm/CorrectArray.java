package algorithm;

import java.util.ArrayList;

public class CorrectArray {
    public int solution(int[] arr) {
        int answer = 0;
        ArrayList<Integer> cuttedList = new ArrayList<>();

        for (int i=0;i<arr.length;i++) {
            int n = arr[i];
            if (i>1 && arr[i-1] == n) {
                continue;
            }

            // n보다 큰 값을 마지막에서부터 지우고 break
            refreshCuttedList(n, cuttedList);

            // 리스트 모든 원소가 n 보다 작은 수들의 오름차순 보장

            if (isCutted(n, cuttedList)) {
                // 존재하면
                continue;
            } else {
                // 존재하지 않으면
                if (n != 0) {
                    cuttedList.add(n);
                    answer++;
                } else {
                    // 0 이면 리스트만 비우고 answer는 추가하지 않음 (0은 안 잘라도 되기 때문)

                }
            }

        }

        return answer;
    }

    private boolean isCutted(int n, ArrayList<Integer> cuttedList) {
        return cuttedList.contains(n);
    }

    private void refreshCuttedList(int n, ArrayList<Integer> cuttedList) {
        int size = cuttedList.size();
        for (int i=size-1;i>=0;i--) {
            if (cuttedList.get(i) > n) {
                cuttedList.remove(i);
            } else {
                break;
            }
        }
    }
}
