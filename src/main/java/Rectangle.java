import java.util.ArrayList;

public class Rectangle {
    private int length;
    private int width;
    private static ArrayList<Rectangle> mInstance = new ArrayList<Rectangle>();
    private Boolean shape;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        this.shape = isSquare();
        this.mInstance.add(this);
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public boolean getShape(){return shape;}
    public static ArrayList<Rectangle> getAll(){
        return mInstance;
    }
    public boolean isSquare(){
        return length == width;
    }
    public int area() {
        return length * width;
    }

}
