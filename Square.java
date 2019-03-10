package gz.hw12.t1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Figure {

    public static final int FIGCODE = 2;

    Square(GraphicsContext gc, double x, double y, double size) {
        super(gc, x, y, size);
    }

    @Override
    public void draw(Boolean fill) {
        double dx = size / 2;
        double dy = size / 2;
        if (fill) {
            gc.setFill(Color.GREEN);
            gc.fillRect(x - dx, y - dy, size, size);
        }
        gc.setStroke(Color.GREEN);
        gc.setLineWidth(2);
        gc.strokeRect(x - dx, y - dy, size, size);
    }

    @Override
    public Boolean isPointed(int mx, int my) {
        return (Math.abs((int)(x - mx)) <= size / 2) && (Math.abs((int)(y - my)) <= size / 2);
    }
}
