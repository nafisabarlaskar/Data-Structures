package DivideAndConquer;

public class HIndex {

    public int hIndex(int[] citations) {

        int left=0, len = citations.length, right= len-1,  mid;
        while(left<=right)
        {
            mid=left+ (right-left)/2;
            if(citations[mid] >= (len-mid)) right = mid - 1;
            else left = mid + 1;
        }
        return len - left;
    }
}
