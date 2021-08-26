package java8;

/* 람다식 정의
    함수를 하나의 식(expression)으로 표현한 것, 하나의 함수 표현식
    익명 함수에 포함되는 개념 (함수의 이름이 없이 사용)
        익명 함수는 일급객체로, 메소드의 파라미터로 전달하거나 메소드의 반환값 등등으로 객체의 개념으로 사용할 수 있음



*
* */


public class Lambda {

    interface Say{
        int something(int a, int b);
    }


    interface Say2{
        int something(int a, int b);
        int something2(int a, int b);
        int something3(int a, int b);
    }

    static class Person {
        public void hi(Say say) {
            int num = say.something(3,4);
            System.out.println(num);
        }

        public void hi2(Say2 say2) {
            int num = say2.something(3,4);
            System.out.println(num);
        }
    }

    static class SayImpl implements Say {
        @Override
        public int something(int a, int b){
            return a-b;
        }
    }

    public static void main(String[] args) {

        Person person = new Person();

        // 원래의 방법 : 인터페이스 구현체인 "클래스"를 레퍼런스하는 변수 생성 후 파라미터로 전달
        // (그러나 함수형 프로그래밍은 "함수"를 전달하는 것임
        Say s = new SayImpl();
        person.hi(s);

        // 1. 람다식을 사용하지 않은 방법
        Say2 x = new Say2() {
            public int something(int a, int b) {
                return a - b;
            }

            @Override
            public int something2(int a, int b) {
                return 0;
            }

            @Override
            public int something3(int a, int b) {
                return 0;
            }
        };

        person.hi2(x);

        // 2. 람다식을 사용하지 않은 방법
        person.hi(new Say() {
            public int something(int a, int b) {
                return a-b;
            }
        });


        // 3. 람다식을 사용한 방법 (java8 이후)
        person.hi((a, b) -> {
            return a-b;
        });


    }

}
