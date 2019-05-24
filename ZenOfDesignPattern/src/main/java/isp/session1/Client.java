package isp.session1;

public class Client {
    public static void main(String[] args) {
        IPettyGirl yanYan = new PettyGirl("艳艳");
        AbstractSearcher searcher = new Searcher(yanYan);
        searcher.show();
    }
}
