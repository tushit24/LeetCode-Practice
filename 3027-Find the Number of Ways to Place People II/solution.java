class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });

        int n = points.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
              
                if (points[i][1] >= points[j][1]) {
                    
                    boolean isRectangleEmpty = true;
                    for (int k = i + 1; k < j; k++) {
                  
                        if (points[j][1] <= points[k][1] && points[k][1] <= points[i][1]) {
                            isRectangleEmpty = false;
                            break;
                        }
                    }

                    if (isRectangleEmpty) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}