class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int current = 0;
        int time = 0;
        for(int request:requests){
            time += Math.abs(current-request);
            current = request;
        }
        return time;
    }
}