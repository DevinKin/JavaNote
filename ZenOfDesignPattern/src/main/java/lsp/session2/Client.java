package lsp.session2;

public class Client {
    public static void main(String[] args) {
        // Soldier sanMao = new Soldier();
        // sanMao.setGun(new Rifle());
        // sanMao.killEnemy();

        // sanMao.setGun(new ToyGun());
        // sanMao.killEnemy();

        // Snipper sanMao = new Snipper();
        // sanMao.setRifle(new AUG());
        // sanMao.killEnemy();

        Snipper sanMao = new Snipper();
        sanMao.setRifle((AUG)(new Rifle()));
        sanMao.killEnemy();
    }
}
