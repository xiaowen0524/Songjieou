package text.bwei.com.songjieou.three;

/**
 * 1.version:用Runnable开启线程
 * 2.date:2016/12/1 19:04
 * 3.update:2016/12/1.
 * 4.autour:张玉杰
 */
public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开始：" + this.name + ",i=" + i);
        }
    }

    public static void main(String[] args) {
        MyRunnable mt1 = new MyRunnable("线程a");
        MyRunnable mt2 = new MyRunnable("线程b");
        new Thread(mt1).start();
        new Thread(mt2).start();
    }
}