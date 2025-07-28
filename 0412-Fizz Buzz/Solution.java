class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int j = 1; j <= n; j++)
        {
            if(j % 3 == 0 && j % 5 == 0)
                res.add("FizzBuzz");
            else if(j % 3 == 0)
                res.add("Fizz");
            else if(j % 5 == 0)
                res.add("Buzz");
            else
                res.add(String.valueOf(j));
            
        }
        return res; 
    }
}