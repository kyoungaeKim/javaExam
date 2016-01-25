import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(2, "d");

        String str = "e";
        list.add(str);
        System.out.println(list.remove(2) + "가 삭제되었습니다");

        if (list.remove(str)) {
            System.out.println("삭제됨");

            System.out.println(list.get(0) + "찾았음");
        }
        System.out.println(list);


    }
}
