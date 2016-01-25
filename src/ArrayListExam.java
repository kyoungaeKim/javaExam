import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        Picture pic1 = new Picture("degas1.jpg");
        Picture pic2 = new Picture("gaugin1.jpg");
        Picture pic3 = new Picture("monet1.jpg");
        Picture pic4 = new Picture("monet2.jpg");
        Picture pic5 = new Picture("renoir1.jpg");

        ArrayList<Picture> list = new ArrayList<>();
        list.add(pic1);
        list.add(pic2);
        list.add(pic3);
        list.add(pic4);
        list.add(pic5);

        //getMaxX() : 오른쪽 끝 X좌표
        //getWidth() : 가로 길이
        //translate : x, y만큼 길이이동

        //1
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            Picture pic = list.get(i);
            pic.translate(a, 0);
            pic.draw();
            a += pic.getWidth() + 30;
        }

        //2
        int sum = 0;
        for (int j = 0; j < list.size(); j++) {
            Picture p = list.get(j);
            sum += p.getMaxX();
        }
        System.out.println(sum);

        // 3
        int b = 0;
        for (int i = 0; i < list.size(); i++) {
            Picture pic = list.get(i);
            if (pic.getMaxX() < pic.getMaxY()) {
                pic.translate(b, 0);
                pic.draw();
                b += pic.getWidth() + 30;
            }
        }

        //4
        int cnt = 0;
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k).getMaxX() < list.get(k).getMaxY()) {
                cnt++;
            }
        }
        System.out.println(cnt);

        // 5
        for (int h = 0; h < list.size(); h++) {
            if (list.get(h).getMaxX() < list.get(h).getMaxY()) {
                list.get(h).draw();
            }
        }

        // 6

        for (int g = 0; g < list.size(); g++) {
            if (list.get(g).getMaxX() < list.get(g).getMaxY()) {
                ArrayList<Picture> matches = new ArrayList<>();
                matches.add(list.get(g));
                System.out.println(matches);

            }

        }
    }
}












