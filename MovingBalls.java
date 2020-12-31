import processing.core.PApplet;
public class MovingBalls extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 650;
    public static final int RADIUS = 20;
    public static int X[];
    public static int Y[];

    public static void main(String[] args ){PApplet.main("MovingBalls",args);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        X = new int[4];
        Y = new int[]{HEIGHT / 5, 2 * HEIGHT / 5, 3 * HEIGHT / 5, 4 * HEIGHT / 5};
    }

    @Override
    public void draw() {
//        super.draw();
        for(int i = 0; i < 4; i++) {
            drawCircle(i);
            X[i] += i+1;
        }
//        System.out.println(X[0]);
    }

    private void drawCircle(int i) {
        ellipse(X[i], Y[i], RADIUS, RADIUS);
    }
}
