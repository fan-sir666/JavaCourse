/*
 *  使用数组实现线性表(顺序结构)
 * */


public class Array<E> {
    //    数组容器存放元素
    private E[] data;
    //    元素个数
    private int size;

    //   构造方法

    public Array() {
//        初始化
        this(10);
    }

    public Array(int capacity) {
//        注意: java 中 Object 支持接收任何类型
        data = (E[]) new Object[capacity];
        size = 0;
    }

    //    1 获取容量
    public int getCapacity() {
        return data.length;
    }

    //    2 元素个数
    public int getSize() {
        return size;
    }

    //    3 判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //    4 添加    注意:只能在零到size的位置添加元素
    public void add(int index, E e) {
//        存在极端情况 数组满 索引越界
        if (size == data.length) {
            // 需要扩容
//            throw new RuntimeException("数组已满,请扩容");
            resize(data.length * 2);
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
    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }


    //   5  获取: 索引找元素
    public E get(int index) {
//        判断索引的范围是否在0~size之间
        if (index < 0 || index >= size) {
            throw new RuntimeException("索引非法");
        }
//        返回索引对应的值
        return data[index];
    }

    //   6 查找: 元素找索引
    public int find(E e) {
//        遍历每一个元素 对比
        for (int i = 0; i < size; i++) {
//      注意: 在java中 == 比较地址 equals 比较值
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //    7 修改
    public void set(int index, E e) {
        //        判断索引的范围是否在0~size之间
        if (index < 0 || index >= size) {
            throw new RuntimeException("索引非法");
        }
        data[index] = e;
    }

    //    8 包含
    public boolean contains(E e) {
        //        遍历每一个元素 对比
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    //    9 删除
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("非法索引");
        }

//        保存删除元素
        E oldValue = data[index];
//        遍历 向前挪 赋值
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
//        最后一个元素设置初始值
        data[size - 1] = null;
        size--;
//        缩容
        if (size == data.length/2){
            resize(data.length/2);
        }
//        返回删除元素
        return oldValue;
    }

    //    删除 首||尾 元素
    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }


//    扩容方法
    public void resize(int newCapacity){
       E[] newData = (E[]) new Object[newCapacity];
//       遍历将旧数组的元素存到新数组里
        for (int i = 0;i<size;i++){
            newData[i] = data[i];
        }
//        覆盖老数组
        data = newData;
    }

    //    重写toString方法
    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < data.length; i++) {
//            拼接元素
            str += data[i];
            if (i != data.length - 1) {
//            拼接，号
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}
