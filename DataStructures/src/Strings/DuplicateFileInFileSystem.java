package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateFileInFileSystem {

    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String s : paths){
            String[] split = s.split(" ");
            for(int i = 1; i < split.length; i++){
                int index = split[i].indexOf("(");
                String str = split[i].substring(index + 1);
                str = str.substring(0, str.indexOf(")"));
                List<String> list = map.get(str);
                if(list == null){
                    list = new ArrayList<>();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(split[0]).append("/").append(split[i].substring(0, index));
                list.add(sb.toString());
                map.put(str, list);
            }
        }

        for(Map.Entry<String, List<String>> m : map.entrySet()){
            List<String> list = m.getValue();
            if(list.size() > 1){
                result.add(list);
            }
        }
        return result;
    }
}
