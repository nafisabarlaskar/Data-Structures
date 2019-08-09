package DivideAndConquer;

public class CapacityToShipPackages {

    public int shipWithinDays(int[] weights, int D) {

        int left = 0;
        int right = 0;

        for(int w : weights){
            left = Math.max(left, w);
            right += w;
        }

        while(left < right){
            int mid = (left+right)/2;
            int need = 1;
            int curr = 0;
            for(int w : weights){
                if(curr + w > mid){
                    need++;
                    curr = 0;
                }
                curr += w;
            }

            if(need > D){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        return left;
    }
}
