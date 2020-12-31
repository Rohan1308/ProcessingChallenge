import processing.core.PApplet;

public class MovingBalls extends PApplet {
    public static final int WIDTH = 480;
    public static final int HEIGHT = 650;
    public static final int DIAMETER = 20;
    public static Ball[] ball;

    public static void main(String[] args) {PApplet.main("MovingBalls", args);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        ball = new Ball[4];
        for(int i = 0; i < 4; i++) {
            ball[i] = new Ball(0,HEIGHT/5*(i+1),DIAMETER);
        }
    }

    @Override
    public void draw() {
//        super.draw();
        for(int i = 0; i<4; i++){
            drawCircle(ball[i]);
            calculateNextX(i);
        }
    }

    private void calculateNextX(int i) {
        ball[i].setX(ball[i].getX() + i + 1);
    }

    private void drawCircle(Ball ball1) {
        ellipse(ball1.getX(), ball1.getY(), ball1.getDiameter(), ball1.getDiameter());
    }
}
