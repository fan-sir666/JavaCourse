package jihejinjie.cunchuzidingyi;

import java.util.HashMap;

public class Cs {
    public static void main(String[] args) {
        // 自定义类型
        HashMap<String, Person> list = new HashMap<>();

        list.put("帅哥",new Person("张三","男",18));
        list.put("靓女",new Person("小红","女",16));
        System.out.println(list);

        Person p = list.get("帅哥");
        System.out.println(p);
    }
}
