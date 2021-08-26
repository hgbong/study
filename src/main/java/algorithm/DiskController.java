//https://programmers.co.kr/learn/courses/30/lessons/42627

package algorithm;

import java.util.PriorityQueue;

public class DiskController {
    public int solution(int[][] jobs) {
        int jobCnt = jobs.length;
        PriorityQueue<Job> pq = new PriorityQueue();

        for (int i=0;i<jobCnt;i++) {
            pq.add(new Job(jobs[i][0], jobs[i][1]));
        }

        Job firstJob = pq.poll();

        int sum = firstJob.time;
        int curTime = firstJob.startAt + firstJob.time;

        while(!pq.isEmpty()) {
            Job job = pq.poll();

            if (curTime >= job.startAt) {
                sum += curTime - job.startAt + job.time;
                curTime += job.time;
            } else {
                sum += job.time;
                curTime += job.startAt - curTime + job.time;
            }
        }

        return sum / jobCnt;
    }

    class Job implements Comparable<Job> {
        int startAt;
        int time;

        public Job(int startAt, int time) {
            this.startAt = startAt;
            this.time = time;
        }

        @Override
        public int compareTo(Job o) {
            if(startAt + time == o.startAt + o.time)
                return time > o.time ? 1: -1;
            return (startAt + time) > (o.startAt + o.time) ? 1: -1;
        }

    }
}