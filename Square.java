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
        if (fill) {
            gc.setFill(Color.GREEN);
            gc.fillRect(x - size / 2, y - size / 2, size, size);
        }
        gc.setStroke(Color.GREEN);
        gc.setLineWidth(2);
        gc.strokeRect(x - size / 2, y - size / 2, size, size);
    }

    @Override
    public Boolean isPointed(int mx, int my) {
        return (Math.abs((int)(x - mx)) <= size / 2) && (Math.abs((int)(y - my)) <= size / 2);
    }
}
