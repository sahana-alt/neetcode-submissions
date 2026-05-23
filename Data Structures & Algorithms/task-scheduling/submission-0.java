class Solution {
    public int leastInterval(char[] tasks, int n) {
        char[] charFreq = new char[26];

        for(int i=0;i<tasks.length;i++){
            charFreq[tasks[i]-'A']++;
        }

        Arrays.sort(charFreq);

        int maxVal = charFreq[25]-1;    //imp:-last slot u dpnt need to wait
        int intervalslots  = maxVal*n;



        for(int i=24;i>=0;i--){
            intervalslots-= Math.min(charFreq[i],maxVal);

        }
        return intervalslots>0?intervalslots+tasks.length:tasks.length;
        
    }
}
