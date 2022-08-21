package cn.learn.start;

// 域名 + 模块名
// com.big.testing
// package 包
// package + 类名
// Uesr
// User

/**
 * helloworld
 *
 * @author ：sqlhero.
 * @date ：Created in 2022/8/21 下午3:31
 */
public class Start {
    // 类名 Start
    // class -> 类声明关键字
    // public -> 公共的
    public static void main(String  ...args) {
        // 函数
        // static -> 静态的
        // void -> 没有返回值
        // main -> 函数名
        // 形参 参数列表 -> 类型 + 参数名,类型 + 参数名
        // 参数可变 ...args ... + 参数名 = 无限个参数
        System.out.println("HelloWorld");
        // System.out.println("No...");
        // System.out.print("HelloWorld");
        // System.out.print("No...");
        // System 类 -> 系统
        // out -> 属性 输出
        // println -> 输出函数（带换行的输出）
        // print -> 无换行 输出函数
    }

    public static String toStr(){
        return  "HelloWorld";
    }

    public static String getStartName(){
        return "Start";
    }

    public static int sum(int a,int b){
        return a + b;
    }
}
// 只能有一个公开的类
// public  class Hello{
//
// }
