package algorithm;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class AddTowNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1: 2 4 3
        // l2: 5 6 4

        // reverse : 342 + 465 = 807
        // reverse ans : 708
        // result : 7,0,8

        long n1 = getNumber(l1);
        long n2 = getNumber(l2);

        if (n1==0 && n2==0) {
            return new ListNode(0);
        }

        long reversed = getReverseSum(n1,n2);
        long endZeroCount = getEndZeroCount(n1,n2);

        ListNode result = new ListNode();
        ListNode curNode = result;
        if (endZeroCount > 0) {
            for (long j=0;j<endZeroCount;j++) {
                curNode.val = 0;
                curNode.next = new ListNode(0);
                curNode = curNode.next;



            }




        }

        long numlen = getNumberLength(reversed);


        long remainVal = reversed;
        for (long i=numlen-1;i>=0;i--) {

            // FIXME
            int qual = (int)remainVal / (int)Math.pow(10,i);
            remainVal %= (long)Math.pow(10,i);

            curNode.val = qual;
            if (i != 0) {
                curNode.next = new ListNode();
                curNode = curNode.next;

            }
        }



        return result;
    }

    private long getEndZeroCount(long n1, long n2) {
        long sum = n1+n2;

        long i = 0;
        while(true) {
            if (sum % (long)Math.pow(10,i+1) == 0) {
                i++;
            } else {
                break;
            }
        }


        return i;
    }

    private long getReverseSum(long n1, long n2) {
        long sum = n1+n2;
        long reversSum = 0;
        long remain = sum;
        long size = getNumberLength(sum);
        for (long i=size-1;i>=0;i--) {
            long qual = remain / (long)Math.pow(10,i);
            reversSum += qual * (long)Math.pow(10,size-i-1);
            remain = sum % (long)Math.pow(10,i);

        }
        return reversSum;
    }

    public long getNumberLength(long number) {
        // ex. 111 => 3, 12345 => 5, 10000 => 5

        long result = 1;
        for (long i=11;i>=0;i--) {
            long remains = number / (long)Math.pow(10,i);
            if (remains != 0) {
                result = i+1;
                break;
            }
        }

        return result;
    }

    private long getSize(ListNode listnode) {

        long i = 0;
        ListNode target = listnode;
        while (target != null) {
            i++;
            target = target.next;
        }

        return i;
    }


    private long getNumber(ListNode listnode) {

        long result = 0;
        ListNode curNode = listnode;
        for (long i=0;i<getSize(listnode);i++) {
            result += curNode.val * (long)Math.pow(10,i);
            curNode = curNode.next;
        }

        return result;
    }
}
