package text.bwei.com.songjieou.four;

/**
 * 1.version:一个计数器，计数到100，在每个数字之间暂停1秒，每隔10个数字输出一个字符串
 * 2.date:2016/12/1 19:15
 * 3.update:2016/12/1.
 * 4.autour:张玉杰
 */
public class MyFour extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            if ((i) % 10 == 0) {
                System.out.println("-------" + i);
            }
            System.out.print(i);
            try {
                Thread.sleep(1);
                System.out.print("    线程睡眠1毫秒！\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MyFour().start();
    }
}
