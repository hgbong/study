package algorithm;

public class ApartPassword {
    private enum dataType {
        ROOM_NUMBER,
        PASSWORD
    }

    public int solution(int[][] passwords, String s) {
        int answer = 0;

        int[] roomNumbers = new int[passwords.length];
        for(int i=0;i<passwords.length;i++) {
            roomNumbers[i] = passwords[i][0];
        }


        dataType dt = dataType.ROOM_NUMBER;
        int roomNum = -1;
        String[] inputs = s.split("#");


        for (int i=0;i<inputs.length;i++) {
            int input = Integer.parseInt(inputs[i]); // 입력받은 방의 번호 또는 패스워드
            if (dataType.ROOM_NUMBER.equals(dt)) {
                if (isRoomExist(input, roomNumbers)) { // ex. 102 번호 방의 존재여부
                    roomNum = input;
                    dt = dataType.PASSWORD;
                } else {
                    // do nothing
                }
            } else {
                if (isRoomPasswordMatched(roomNum, input, passwords)) { // 102, 1234, {{102,1234},{},...}
                    answer++;
                } else {

                }

                dt = dataType.ROOM_NUMBER;
            }

        }

        return answer;
    }

    private boolean isRoomPasswordMatched(int roomNum, int password, int[][] passwords) {
        for (int i=0;i<passwords.length;i++) {
            if (passwords[i][0] == roomNum && passwords[i][1] == password) {
                return true;
            }
        }
        return false;
    }

    private boolean isRoomExist(int roomNum, int[] roomNumbers) {
        for (int i=0;i<roomNumbers.length;i++) {
            if (roomNumbers[i] == roomNum) {
                return true;
            }
        }
        return false;
    }
}
