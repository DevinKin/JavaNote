package isp.session1;

public abstract class AbstractSearcher {
    protected IPettyGirl pettyGirl;
    public AbstractSearcher(IPettyGirl _pettyGirl) {
        this.pettyGirl = _pettyGirl;
    }

    // 搜索美女，列出美女信息
    public abstract void show();
}
