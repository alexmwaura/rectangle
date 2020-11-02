public class Cube {
    private Rectangle mFace;
    public Cube(Rectangle rectangle){
        mFace = rectangle;
    }
    public Rectangle getFace(){
        return mFace;
    }
    public int getVolume(){
        int length = mFace.getLength();
        return length * length * length;
    }
}
