package gz.hw12.t1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ball extends Figure {

    public static final int FIGCODE = 1;

    Ball(GraphicsContext gc, double x, double y, double size) {
        super(gc, x, y, size);
    }

    @Override
    public void draw(Boolean fill) {
        double dx = size / 2;
        double dy = size / 2;
        if (fill) {
            gc.setFill(Color.RED);
            gc.fillOval(x - dx, y - dy, size, size);
        }
        gc.setStroke(Color.RED);
        gc.setLineWidth(2);
        gc.strokeOval(x - dx, y - dy, size, size);
    }

    @Override
    public Boolean isPointed(int mx, int my) {
        return Math.sqrt(Math.pow(x - mx, 2) + Math.pow(y - my, 2)) <= size / 2;
    }

}
