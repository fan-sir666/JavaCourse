package jihejinjie.shuangliebiao;

import java.util.HashMap;

public class Demo05 {
    public static void main(String[] args) {
        /*
         *  Map : 双列集合 元素由 键值组成
         *       元素不能重复 新值会覆盖
         * */

//        定义    键       值
        HashMap<String, Integer> list = new HashMap<>();

//        添加
        list.put("aa", 11);
        list.put("bb", 22);
        list.put("cc", 33);
//        System.out.println(list);
        System.out.println(list.put("aa", 44)); // 添加重复元素 返回覆盖的值


//        获取
        System.out.println(list.get("bb")); // 如果获取的值不存在 返回 null

//        删除
        System.out.println(list.remove("cc")); // 33 返回删除的值   删除未存在的值返回 null表示删除失败

//        个数
        System.out.println(list.size());

//        清空
//        System.out.println(list.clear());

//        是否为空
        System.out.println(list.isEmpty()); // false
    }
}
