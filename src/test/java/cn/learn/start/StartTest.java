package cn.learn.start;

import org.junit.Test;

import static org.junit.Assert.*;

// 测试类名 = 原类名 + Test
public class StartTest {

    @Test
    public void toStr() {
        // 正确的输出 应该是什么 HelloWorld
        assertEquals("HelloWorld",Start.toStr());
    }


    @Test
    public void toBase() {
        // 强类型 语言
        // 变量 -> 类型 + 变量名
        // 基本数据类型
        // 整型
        // -255 ~ 254
        byte b = 1;
        short s = 2;
        int i = 4;
        long l = 6;
        // 大的数据类型 数据超过 小的数据类型 会溢出的
        // 计算机发展历史里面 我们存储空间的有限的
        // 根据使用场景不同来进行选择
        // 浮点型
        // 单精度
        float f = 0.1f;
        // 双精度
        double d = 0.2;
        // 0.2
        // 0.19999999999999998
        // 浮点存储有关系，计算机组成原理 这本书
        // System.out.println(0.3 - 0.1);

        // 字符型
        char c = 86;

        // System.out.println(c);

        // 布尔型 // 黑 与 白
        // false -> true
        // 假 -> 真
        boolean bo = false;
        // System.out.println(1 == 1);
        // System.out.println(1== 2);

        // 非基础 很常用的类型
        String str = "密码";
        // System.out.println(str);

        // 数据类型 强行转换
        // 254~255
        // System.out.println((byte)200);
        bo = true;
        // System.out.println(bo);
        final String no = "aaa";
        // no = "Tom";
        System.out.println(no);
    }


    @Test
    public void getStartName(){
        String name = "Start";
        // 断言
        // Start -> Start
        assertEquals(name,Start.getStartName());
    }

    // 获取两个的和
    @Test
    public void sum(){
        assertEquals(3,Start.sum(1,2));
    }
}