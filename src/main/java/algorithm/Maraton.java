// https://programmers.co.kr/learn/courses/30/lessons/42576?language=java

package algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Maraton
{
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hash = new HashMap<>();
        for (String name : participant) {
            Integer val = hash.get(name);
            if (val == null) {
                hash.put(name, 1);
            } else {
                hash.put(name, val+1);
            }
        }

        for (String name : completion) {
            hash.put(name, hash.get(name) -1);
        }

        for (String name : participant) {
            int res = hash.get(name);
            if (res != 0) {
                return name;
            }
        }

        return "wrong";
/*
        HashMap<Person, LinkedList<String>> hashmap  = new HashMap<>();

        for (String name : participant) {
            hashmap.put(new Person(name), ??);






            LinkedList data = hashmap.get(name);
            if (data == null) {
                data = new LinkedList();
            }

            data.add(new Person(name));
        }

        for (String name : completion) {
            LinkedList data = hashmap.get(name);

            for (Object o : data) {
                Person p = (Person) o;
                if (name.equals(p.getName())) {
                    data.remove(o);
                    break;
                }
            }


        }

        for (Map.Entry x: hashmap.entrySet()) {
            LinkedList ll = (LinkedList) x.getValue();
            if (ll.isEmpty()) {
                return (String) x.getKey();
            }
        }


        return "Wrong";*/

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null ||!(o instanceof Person)) {
            return false;
        }

        Person p = (Person) o;
        if (name.equals(p.getName())) {
            return true;
        }
        return false;

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }




}