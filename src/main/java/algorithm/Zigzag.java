package algorithm;

import java.util.ArrayList;
import java.util.List;

// TODO: https://leetcode.com/problems/zigzag-conversion/
public class Zigzag {

    public String convert(String s, int numRows) {
        /*
반복되는 n 개
ex.3
	3+1

	4개씩 substring

	한 라인은 하나씩만 선택이 됨
	즉 예제에서는 ex.4 인 경우    substring = [4,4-1]
		for (substring)
			sub[0,0]									=> 첫 라인이므로 적용 안함!
			sub[1,0]+sub[1(fix),c-1]    c=3 (컬럼개수 고정)
			sub[2,0]+sub[1(fix),c-2]
			sub[3,0]+sub[1(fix),c-3]  => 마지막 라인이므로 적용 안함!


	예외는 어떤 경우일까
		1. 마지막 substring 배열이 모두 채워지지 않은 경우
		2. 배열이 1개인데 substring 이 모두 채워지지 않은 경우
			ex. 문자열 길이는 5인데 numRows=10인 경우 => 한줄로만 될것

        * */

        List<Character[][]> x = new ArrayList<>();

        // FIXME: numRows = 0,1 인 경우
        if (numRows == 0 || numRows ==1) {
            return "FIXME";
        }

        // 10길이 문자열에 대해 numRows=3 인 경우 -> cnt = 3
        int cnt = s.length() / (2*numRows - 2);
        if (s.length() % numRows > 0) {
            cnt++;
        }

        for (int c=0;c<cnt;c++) {
            Character[][] cs = new Character[numRows][numRows-2];
            x.add(cs);

            // TODO
//            for (int r=0;r<) {
//
//            }

            for (int i=0;i<numRows-2;i++) {
                cs[c][i] = s.charAt(c*4 + i);
            }
        }

        System.out.println(x.toString());

        for (int c=0;c<cnt;c++) {


        }





        return null;

    }
}
