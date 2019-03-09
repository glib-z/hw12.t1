package gz.hw12.t1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ball extends Shape {

    Ball(GraphicsContext gc, double x, double y, double size) {
        super(gc, x, y, size);
    }

    @Override
    public void draw(Boolean fill) {
        if (fill) {
            gc.setFill(Color.RED);
            gc.fillOval(x, y, size, size);
        }
        gc.setStroke(Color.RED);
        gc.setLineWidth(2);
        gc.strokeOval(x, y, size, size);
    }

}
