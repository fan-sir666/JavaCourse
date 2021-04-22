/*
 *  使用数组实现线性表(顺序结构)
 * */


import java.util.Arrays;

public class Array {
    //    数组容器存放元素
    private int[] data;
    //    元素个数
    private int size;

    //   构造方法

    public Array() {
//        初始化
        this(10);
    }

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    //    获取容量
    public int getCapacity() {
        return data.length;
    }

    //    元素个数
    public int getSize() {
        return size;
    }

    //    判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //    添加    注意:只能在零到size的位置添加元素
    public void add(int index, int e) {
//        存在极端情况 数组满 索引越界
        if (size == data.length) {
            // 需要扩容
            throw new RuntimeException("数组已满,请扩容");
        }
        if (index < 0 || index > size) {
            throw new RuntimeException("索引非法");
        }


//        1 挪
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
//        赋值
        data[index] = e;
//        元素个数++
        size++;

    }

    //    添加元素到 首||尾
    public void addFirst(int e) {
        add(0, e);
    }

    public void addLast(int e) {
        add(size, e);
    }



//    重写toString方法
    @Override
    public String toString() {
       String str = "[";
        for (int i = 0; i < data.length; i++) {
//            拼接元素
            str += data[i];
            if (i!=data.length-1){
//            拼接，号
                str+=",";
            }
        }
        str += "]";
        return str;
    }
}
