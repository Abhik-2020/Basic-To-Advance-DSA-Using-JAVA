public class trappedWater {

    // Function to calculate trapped rainwater
    public static void trapwater(int height[]){

        int trapwater = 0;      // stores total trapped water
        int waterLevel = 0;     // stores water level at each index
        int n = height.length;  // length of array

        // array to store max height to the LEFT of each index
        int leftBoundary[] = new int[n];

        // first bar's left max is itself
        leftBoundary[0] = height[0];

        // fill leftBoundary array
        for(int i=1; i<n; i++){
            // max of previous left max OR current height
            leftBoundary[i] = Math.max(leftBoundary[i-1], height[i]);
        }

        // array to store max height to the RIGHT of each index
        int rightBoundary[] = new int[n];

        // last bar's right max is itself
        rightBoundary[n-1] = height[n-1];

        // fill rightBoundary array from right → left
        for(int i = n-2; i>=0; i--){
            // max of next right max OR current height
            rightBoundary[i] = Math.max(rightBoundary[i+1], height[i]);
        }

        // calculate trapped water at each index
        for(int i=0; i<n; i++){

            // water level depends on smaller boundary
            waterLevel = Math.min(rightBoundary[i], leftBoundary[i]);

            // trapped water = water level − height of current bar
            trapwater += waterLevel - height[i];
        }

        // print total trapped water
        System.out.println(trapwater);
    }

    public static void main(String args[]){

        // input elevation map
        int height[] = {4,2,0,6,3,2,5};

        // call function
        trapwater(height);
    }
}