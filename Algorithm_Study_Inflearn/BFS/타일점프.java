package Algorithm_Study_Inflearn.BFS;

import Algorithm_Study_Inflearn.해싱and시간파싱.Solution;

import java.util.LinkedList;
import java.util.Queue;

public class 타일점프 {
    public static int solution(int[] nums){
        int n = nums.length;
        int[] ch = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        ch[0] =1;
        int L=0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0;i<len;i++){
                int temp = queue.poll();
                for(int j=1;j<=nums[temp];j++){
                    int nx = temp + j;
                    if(nx == n-1 ) return L+1;
                    if(nx < n && ch[nx] ==0 ){
                        ch[nx]=1;
                        queue.add(nx);
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(solution(new int[]{2, 2, 1, 2, 1, 1}));
        System.out.println(solution(new int[]{1, 0, 1, 1, 3, 1, 2, 1}));
        System.out.println(solution(new int[]{2, 3, 1, 0, 1, 1, 2, 3, 1, 5, 1, 3, 1}));
        System.out.println(solution(new int[]{1, 2, 1, 2, 1, 2, 1, 1, 3, 1, 2, 1}));
        System.out.println(solution(new int[]{1, 3, 2, 1, 1, 2, 3, 1, 3, 1, 2, 3, 5, 1, 5, 1, 2, 1, 1}));
    }
}
