package isp.session2;


public class Client {
    public static void main(String[] args) {
        PettyGirl yanYan = new PettyGirl("艳艳");
        AbstractSearcher searcher = new Searcher(yanYan);
        searcher.show();
    }
}
