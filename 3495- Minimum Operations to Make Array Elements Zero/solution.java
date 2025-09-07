class Solution {
    private long sumUpTo(long n) {
        if (n <= 0) {
            return 0;
        }
        
        long totalSum = 0;
        long ops = 1;
        long start = 1;
        long end = 3;
        
        while (start <= n) {
            long countInRange = Math.min(n, end) - start + 1;
            totalSum += countInRange * ops;
            
            ops++;
            start = end + 1;
            
            if (end > Long.MAX_VALUE / 4) {
                end = Long.MAX_VALUE;
            } else {
                end = 4 * end + 3;
            }
        }
        return totalSum;
    }

    public long minOperations(int[][] queries) {
        long totalOperations = 0;
        
        for (int[] query : queries) {
            long l = query[0];
            long r = query[1];
            
            long sumH = sumUpTo(r) - sumUpTo(l - 1);
            
            long minOpsForQuery = (sumH + 1) / 2;
            totalOperations += minOpsForQuery;
        }
        
        return totalOperations;
    }
}