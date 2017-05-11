import java.util.Arrays;

/**
 * Created by NafisaBarlaskar on 22-04-2017.
 */
public class OptimalDivision {

    public static String getOptimalDivisionParenthesis(int[] array){
        
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(array[0]);
            for (int i = 1; i < array.length; i++) {
                if (i == 1 && array.length > 2) {
                    stringBuilder.append("/(").append(array[i]);
                } else {
                    stringBuilder.append("/").append(array[i]);
                }
            }

            return array.length > 2 ? stringBuilder.append(")").toString() : stringBuilder.toString();
        
    }
}
