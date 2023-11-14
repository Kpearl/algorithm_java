class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = i < num_list.length ? num_list[i] : (num_list[i-1] > num_list[i-2] ? num_list[i-1] - num_list[i-2] : 2 * num_list[i-1]);
        }

        return answer;
    }
}