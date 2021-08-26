package algorithm;


import java.util.*;

public class SimpleLanguage {
    class Variable {
        int block;
        String name;
        String value; // 값은 int 이지만 값을 비교하는 로직이 없으므로 String

        public Variable(int block, String name, String value) {
            this.block = block;
            this.name = name;
            this.value = value;
        }
    }
    public String[] solution(String[] code) {
        ArrayList<Variable> list = new ArrayList();
        List<String> ans = new ArrayList<>();

        for (int i=0;i<code.length;i++) {
            String data = code[i];

            int block = 0;
            for (int j=0;j<data.length();j++) {
                if ('.' == data.charAt(j)) {
                    block++;
                } else {
                    break;
                }
            }

            data = data.replace(".","");

            if (data.startsWith("print")) {
                // print a
                String name = data.substring(data.length() - 1);

                removeBlocks(list, block);

                ans.add(findAndGetPrintString(list, name));


            } else {
                // a=3
                String name = data.split("=")[0];
                String value = data.split("=")[1];

                // 기존 리스트의 맨 끝에서부터, 현재 입력된 block 보다 더 깊은 block 들을 모두 제거
                removeBlocks(list, block);
                list.add(new Variable(block, name, value));
            }

        }

        String[] str = new String[ans.size()];
        str = (String[]) ans.toArray(str);

        return str;
    }

    private String findAndGetPrintString(ArrayList<Variable> list, String name) {
        int size = list.size();
        for (int i=size-1;i>=0;i--) {
            Variable v = list.get(i);
            if (v.name.equals(name)) {
                return String.format("%s=%s", v.name, v.value);
            }
        }

        return "error";
    }

    private void removeBlocks(ArrayList<Variable> list, int block) {
        int size = list.size();
        for (int i=size-1;i>=0;i--) {
            if (list.get(i).block > block) {
                list.remove(i);
            } else {
                break;
            }
        }
    }
}
