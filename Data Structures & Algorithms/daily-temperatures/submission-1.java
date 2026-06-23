class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;  
        // we need to store the the result in the same datatype that the question asked of 
        int []res=new int [n]; 
        // we also want to use a stack as the intermediate step to slove this question 
        Stack<int[]> stack = new Stack<>();  // Store [temp, index]
        
        for(int i = n - 1; i >= 0; i--) {
            // Remove colder temperatures
            while(!stack.isEmpty() && stack.peek()[0] <= temperatures[i]) {
                stack.pop();  // pair[0] = temp, pair[1] = index
            }
            
            // If stack not empty, calculate distance
            if(!stack.isEmpty()) {
                res[i] = stack.peek()[1] - i;  // Use index from pair
            }
            
            stack.push(new int[]{temperatures[i], i});  // Push [temp, index]
        }
        
        return res;
    }
}
