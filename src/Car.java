/**
   A car shape that can be positioned anywhere on the screen.
*/
public class Car implements Drawable,Moveable
{
    private int xLeft;
    private int yTop;
    private Rectangle body;
    private Ellipse frontTire1;
    private Ellipse rearTire1;
    private Line frontWindshield1;
    private Line roofTop1;
    private Line rearWindshield1;


    /**
       Constructs a car with a given top left corner.
       @param x the x coordinate of the top left corner
       @param y the y coordinate of the top left corner
    */
    public Car(int x, int y)
    {
        xLeft = x;
        yTop = y;
        body = new Rectangle(xLeft, yTop + 10, 60, 10);
        frontTire1 = new Ellipse(xLeft + 10, yTop + 20, 10, 10);
        rearTire1 = new Ellipse(xLeft + 40, yTop + 20, 10, 10);

        frontWindshield1 = new Line(xLeft + 10, yTop + 10, xLeft + 20, yTop);
        roofTop1 = new Line(xLeft + 20, yTop, xLeft + 40, yTop);
        rearWindshield1 = new Line(xLeft + 40, yTop, xLeft + 50, yTop + 10);


    }

    /**
       Draws this car.
    */
    public void draw()
    {
        body.draw();
        frontTire1.fill();
        rearTire1.fill();
        frontWindshield1.draw();
        roofTop1.draw();
        rearWindshield1.draw();
    }

    @Override
    public void move(int seconds) {
        body.translate(seconds*10,0);
        frontTire1.translate(seconds*10,0);
        rearTire1.translate(seconds*10,0);
        frontWindshield1.translate(seconds*10,0);
        roofTop1.translate(seconds*10,0);
        rearWindshield1.translate(seconds*10,0);

        }
    }

