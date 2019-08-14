package TwoPointer;

public class FruitIntoBaskets {

    public int totalFruit(int[] tree) {
        if(tree.length == 0){
            return 0;
        }

        int t1 = Integer.MAX_VALUE;
        int t2 = t1;
        int maxCount = Integer.MIN_VALUE;
        int c1 = 0;
        int c2 = 0;
        int indexT2 = -1;

        for(int i = 0; i < tree.length;){

            if(t1 == Integer.MAX_VALUE && t2 == Integer.MAX_VALUE){
                t1 = tree[i];
            }
            else if(t1 != Integer.MAX_VALUE && t2 == Integer.MAX_VALUE && tree[i] != t1){
                t2 = tree[i];
                indexT2 = i;
            }else if(tree[i] != t1 && tree[i] != t2){
                maxCount = Math.max(c1+c2, maxCount);
                t1 = Integer.MAX_VALUE;
                t2 = t1;
                c1 = 0;
                c2 = 0;
                i = indexT2;
                continue;
            }

            if(tree[i] == t1){
                c1+=1;
            }else if(tree[i] == t2){
                c2+= 1;
            }

            maxCount = Math.max(c1+c2, maxCount);
            i++;

        }

        return maxCount;
    }
}
