package Stack;

public class TrappingRainWater {

    public int trapRainWater(int[] height){

        int n = height.length;
        int[] maxHeight = new int[n];
        int[] minHeight = new int[n];

        int max = 0;
        minHeight[0] = height[0];
        maxHeight[n-1] = height[n-1];

        for(int i = 1; i < height.length; i++){
            minHeight[i] = Math.min(height[i], minHeight[i-1]);
        }

        for(int i = n-2; i >= 0; i--){
            maxHeight[i] = Math.max(height[i], maxHeight[i+1]);
        }

        for(int i = 0; i < height.length; i++){
            max += Math.min(maxHeight[i], minHeight[i]) - height[i];
        }
        return max;
    }
}
