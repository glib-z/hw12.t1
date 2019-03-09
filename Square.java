package gz.hw12.t1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape {

    Square(GraphicsContext gc, double x, double y, double size) {
        super(gc, x, y, size);
    }

    @Override
    public void draw(Boolean fill) {

        if (fill) {
            gc.setFill(Color.GREEN);
            gc.fillRect(x, y, size, size);
        }
        gc.setStroke(Color.GREEN);
        gc.setLineWidth(2);
        gc.strokeRect(x, y, size, size);
    }
}
