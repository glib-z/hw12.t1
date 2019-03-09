package gz.hw12.t1;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int currentShape;
    private GraphicsContext gc;

    private List<Shape> shapes = new ArrayList<>();

    public Board(GraphicsContext gc) {
        this.gc = gc;
    }

    public void addBall(GraphicsContext gc) {
        this.gc = gc;
        shapes.add(new Ball(gc,10,10,30));
        currentShape = shapes.size() - 1;
    }

    public void addSquare(GraphicsContext gc) {
        this.gc = gc;
        shapes.add(new Square(gc,10,10,30));
        currentShape = shapes.size() - 1;
    }

    public void nextShape(GraphicsContext gc) {
        if (shapes.size() != 0) {
            if (currentShape < shapes.size() - 1) {
                currentShape++;
            } else {
                currentShape = 0;
            }
        }
    }

    public void move(GraphicsContext gc, double dx, double dy) {
        if (shapes.size() != 0) {                                // Check if some shape exist
            shapes.get(currentShape).move(dx, dy);
        }
    }

    public void draw() {
        clean();
        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw(i == currentShape);
        }
    }

    private void clean() {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }

}
