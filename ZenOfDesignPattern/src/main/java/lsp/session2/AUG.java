package lsp.session2;

public class AUG extends Rifle {
    // 狙击抢都携带一个精准的望远镜
    public void zoomOut() {
        System.out.println("通过望远镜查看敌人...");
    }

    @Override
    public void shoot() {
        System.out.println("AUG射击...");
    }
}