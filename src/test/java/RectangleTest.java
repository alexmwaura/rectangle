import org.junit.*;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void newRectangle_instantiatesCorrectly(){
        Rectangle testRectangle = new Rectangle(2,4);
        assertEquals(true,testRectangle instanceof Rectangle );
    }
    @Test
    public void newRectangle_getsLength_2(){
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(2, testRectangle.getLength());
    }
    @Test
    public void newRectangle_getsWidth_4(){
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(4, testRectangle.getWidth());
    }
    @Test
    public void isSquare_whenNotSquare_false(){
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(false, testRectangle.isSquare());
    }
    @Test
    public void isSquare_whenIsSquare_true(){
        Rectangle testRectangle = new Rectangle(4,4);
        assertEquals(true, testRectangle.isSquare());
    }
    @Test
    public void getAll_returnsAllInstancesOfRectangle_true(){
        Rectangle firstRectangle = new Rectangle(12,6);
        Rectangle secondRectangle = new Rectangle(12,12);
        assertTrue(Rectangle.getAll().contains(firstRectangle));
        assertTrue(Rectangle.getAll().contains(secondRectangle));
    }
}
