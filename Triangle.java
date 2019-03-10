package gz.hw12.t1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Figure {

    public static final int FIGCODE = 3;

    Triangle(GraphicsContext gc, double x, double y, double size) {
        super(gc, x, y, size);
    }

    @Override
    public void draw(Boolean fill) {
        double xD = size / 2;
        double yD = size / 2;
        if (fill) {
            gc.setFill(Color.BLACK);
            gc.fillPolygon(new double[]{(x - xD + size / 2), x - xD, (x - xD + size)},
                    new double[]{y - yD, (y - yD + size), (y - yD + size)}, 3);
        }
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokePolygon(new double[]{(x - xD + size / 2), x - xD, (x - xD + size)},
                new double[]{y - yD, (y - yD + size), (y - yD + size)}, 3);
    }

    @Override
    public Boolean isPointed(int mx, int my) {
        return false;
    }
}
