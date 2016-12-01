package text.bwei.com.songjieou.one;

/**
 * 1.version:
 * 2.date:2016/12/1 20:31
 * 3.update:2016/12/1.
 * 4.autour:张玉杰
 */
public class one {
    public static void main(String[] args) {
        Runnable1 r = new Runnable1();

        //r.run();并不是线程开启，而是简单的方法调用
        Thread t = new Thread(r);//创建线程
        //t.run(); //如果该线程是使用独立的 Runnable 运行对象构造的，则调用该 Runnable 对象的 run 方法；否则，该方法不执行任何操作并返回。
        t.start(); //线程开启
        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }
    }
}

class Runnable1 implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread-----:" + i);
        }
    }
}
