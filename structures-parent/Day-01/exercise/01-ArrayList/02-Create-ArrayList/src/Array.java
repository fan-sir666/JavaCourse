/*
 *  使用数组实现线性表(顺序结构)
 * */


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

//    get 方法获取容量 元素个数
    public int getCapacity(){
        return data.length;
    }
    public int getSize(){
        return size;
    }
//    判断是否为空
    public boolean isEmpty(){
        return size == 0;
    }
}
