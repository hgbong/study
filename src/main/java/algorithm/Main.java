package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* 마라톤
        Maraton m = new Maraton();

        ArrayList<String> l1 = new ArrayList() {{
            add("leo");
            add("kiki");
            add("eden");
        }};

        ArrayList<String> l2 = new ArrayList() {{
            add("kiki");
            add("eden");
        }};

        m.solution(l1.toArray(new String[l1.size()]),
                l2.toArray(new String[l2.size()]));
*/
        /*스코빌
        Scoville solution = new Scoville();
        int xx = solution.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
*/
        /*디스크 컨트롤러
        DiskController s = new DiskController();
        int[][] jobs = new int[][]{{0,3}, {1,9}, {2,6}};
        s.solution(jobs);
*/
/*
        ApartPassword ap = new ApartPassword();
        int[][] data = new int[][] {
                {101,1234},{102,54321},{201,202},{202,1}
        };
        String s = "101#1234#102#654321#51#203#201#202#1#";

        ap.solution(data, s);*/

   /*     SimpleLanguage so = new SimpleLanguage();
        String[] code = {"a=3", "..a=4", "..b=3", "..print a", ".......a=6", ".......print a",
                ".......print b", "..print a", "....a=7", "....print a", "print a",
                "print b", "a=4", "print a", "...print a"};
        so.solution(code);*/

        CorrectArray so = new CorrectArray();
        int[] arr = new int[] {10, 0, 10, 0, 10, 0};
        so.solution(arr);

    }

}
