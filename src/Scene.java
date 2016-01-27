// BlueJ project: lesson9/scene1
import java.util.ArrayList;

public class Scene {
    public static void main(String[] args) {
        ArrayList<Drawable> list = new ArrayList<>();
        list.add(new House(100, 150, 100, 100));
        list.add(new House(250, 100, 150, 150));
        list.add(new Dog(200, 100, "Fido.jpg"));
        list.add(new Dog(100, 400, "Rex.jpg"));
        list.add(new Dog(200, 400, "Lucky.jpg"));
        list.add(new Car(100, 300));
        list.add(new Car(250, 300));
        list.add(new Car(250, 350));

        Ball ball = new Ball(400, 400, Color.RED);
        ball.draw();

        for (Drawable d : list) {
            d.draw();
        }
        for (int i = 0; i < 10; i++) {
            for (Drawable d : list) {
                if (list instanceof Moveable) {
                    ((Moveable) list).move(1);

                }
            }
            Canvas.snapshot();
        }
    }
}
