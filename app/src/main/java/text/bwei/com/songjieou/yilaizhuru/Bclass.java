package text.bwei.com.songjieou.yilaizhuru;

/**
 * 1.version:
 * 2.date:2016/12/1 14:49
 * 3.update:2016/12/1.
 * 4.autour:张玉杰
 */
public class Bclass {
    private Cclass c;

    public Bclass() {
        c = new Cclass();
    }

    public Bclass(Cclass c) {
        this.c = c;
    }

    public void abc() {
        c.Cclass();
    }
}
