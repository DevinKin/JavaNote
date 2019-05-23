package lsp.session2;

public class Snipper {
    private AUG aug;
    public void setRifle(AUG aug) {
        this.aug = aug;
    }
    public void killEnemy() {
        // 首先看看敌人的情况，别杀死敌人，自己也被人干掉
        aug.zoomOut();
        aug.shoot();
    }
}