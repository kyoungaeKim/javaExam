import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        Picture pic1 = new Picture("degas1.jpg");
        pic1.draw();
        Picture pic2 = new Picture("gaugin1.jpg");
        pic2.draw();
        Picture pic3 = new Picture("monet1.jpg");
        pic3.draw();
        Picture pic4 = new Picture("monet2.jpg");
        pic4.draw();
        Picture pic5 = new Picture("renoir1.jpg");
        pic5.draw();

        ArrayList<Picture> list = new ArrayList<>();
        list.add(pic1);
        list.add(pic2);
        list.add(pic3);
        list.add(pic4);
        list.add(pic5);

        //getMaxX() : 오른쪽 끝 X좌표
        //getWidth() : 가로 길이
        //translate : x, y만큼 길이이동

        for (int i = 0; i < list.size(); i++) {
            Picture pic = list.get(i);
            pic.draw();
        }
    }
}
