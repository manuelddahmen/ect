package position;
import info.emptycanvas.library.object.*;
import info.emptycanvas.library.testing.TestObjet;
import info.emptycanvas.library.tribase.TRISphere;
import java.awt.Color;

/**
 *
 * @author Se7en
 */
public class TestTRISphere extends TestObjet
{

    public TestTRISphere() {
    }

    @Override
    public void testScene() throws Exception {
       scene().cameraActive().eye().setZ(-10);
       
       TRISphere s = new TRISphere(Point3D.O0, 1);
        Barycentre barycentre = new Barycentre();
       barycentre.position = Point3D.Y.mult(5);
       
       s.position(barycentre);
       s.texture(new TColor(Color.WHITE));
       scene().add(s);
        
    }
    
    
    public static void main(String [] args)
    {
        TestTRISphere ts = new TestTRISphere();
        ts.loop(false);
        ts.run();
        
    }
}
