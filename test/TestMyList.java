import customList.MyList;

public class TestMyList {
    public static void testList(String[] args) {
        MyList<Integer> list = new MyList<>();
        for(int i = 0; i < 21; i++) {
            list.add(i);
        }
        System.out.println("does list contain 1: " + list.contains(1));
        System.out.println("size = " + list.size() + list);
        list.remove(3);
        System.out.println("size = " + list.size() + list);
        list.add(1, 30);
        System.out.println("size = " + list.size() + list);
    }
}
