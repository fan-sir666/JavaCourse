package jihejinjie.shuangliebiao;

import java.util.HashMap;
import java.util.Map;

public class Demo06 {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();

        list.put("aa", 11);
        list.put("bb", 22);
        list.put("cc", 33);

//        遍历 key  快捷 map.keySet().for
        for (String key : list.keySet()) {
            System.out.println(key +":"+list.get(key));

        }

//        遍历键值对  map.entrySet().for     getKey 获取键  getValue 获取值
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
