class Solution {
    public int findClosest(int x, int y, int z) {
          int d = Math.abs(x - z);
        int e = Math.abs(y - z); 
        if (d < e) return 1;    
        if (e < d) return 2;   
        return 0;      
    }
}