package text.bwei.com.songjieou.five;

/**
 * 1.version:
 * 2.date:2016/12/1 20:38
 * 3.update:2016/12/1.
 * 4.autour:张玉杰
 */
public class Five {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        t1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("主线程第" + i + "次执行！");
            if (i > 2) try {
                //t1线程合并到主线程中，主线程停止执行过程，转而执行t1线程，直到t1执行完毕后继续。
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1第" + i + "次执行！");
        }
    }
}
