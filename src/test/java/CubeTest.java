import static org.junit.Assert.*;
import org.junit.*;
public class CubeTest {
    @Test
    public void newCube_instantiatesCorrectly(){
        Rectangle rectangle = new Rectangle(12,12);
        Cube cube = new Cube(rectangle);
        assertEquals(true, cube instanceof Cube);
    }

    @Test
    public void newCube_savesRectangleInformation_Rectangle() {
        Rectangle rectangle = new Rectangle(30,30);
        Cube cube = new Cube(rectangle);
        assertEquals(rectangle,cube.getFace());
    }

    @Test
    public void volume_determinesTheVolumeOfTheCube_27000(){
        Rectangle rectangle = new Rectangle(30,30);
        Cube cube = new Cube(rectangle);
        assertEquals(27000,cube.getVolume());
    }
}