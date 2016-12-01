package text.bwei.com.songjieou.three;

/**
 * 1.version:用Thread开启线程
 * 2.date:2016/12/1 19:04
 * 3.update:2016/12/1.
 * 4.autour:张玉杰
 */
public class MyThread {
    private String name;

    public MyThread(String name) {
        super();
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程开始：" + this.name + ",i=" + i);
        }
    }

    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程a");
        MyThread mt2 = new MyThread("线程b");
        mt1.run();
        mt2.run();
    }
}
