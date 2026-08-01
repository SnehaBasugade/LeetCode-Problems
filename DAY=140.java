import java.io.*;

class Result {
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        int n = responseTimes.size();
        
        if(n <= 1){
            return 0;
        }
        long sum=responseTimes.get(0);
        int count=0;
        
        for(int i=1;i<n;i++){
            double average=(double) sum / i;
            
            if(responseTimes.get(i)>average){
                count++;
            }
            sum += responseTimes.get(i);
        }
        return count;


    }

}
