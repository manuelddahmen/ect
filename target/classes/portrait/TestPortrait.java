/**
 * *
 * Global license : * Microsoft Public Licence
 *
 * author Manuel Dahmen <ibiiztera.it@gmail.com>
 *
 **
 */
package portrait;
import info.emptycanvas.library.object.*;
import info.emptycanvas.library.testing.TestObjet;
import info.emptycanvas.library.tribase.TRISphere;
import java.awt.Color;

/**
 *
 * @author Manuel Dahmen <ibiiztera.it@gmail.com>
 */
public class TestPortrait extends TestObjet {

    @Override
    public void testScene() throws Exception {

        Cube c1 = new Cube(2.0, new Point3D(0, 0, 0), Color.red);

        Cube c2 = new Cube(1.5, new Point3D(1, 1, 0), Color.yellow);

        Cube cy1 = new Cube(0.5, new Point3D(2.1, 0, 0), Color.green);
        Cube cy2 = new Cube(0.5, new Point3D(2.1, 1, 1), Color.green);

        Cube c3 = new Cube(1, new Point3D(2, 2, 0), Color.blue);

        TRISphere ts = new TRISphere(new Point3D(0,6,-5), 4);
        
        ts.texture(new TColor(Color.WHITE));
        
        scene().add(ts);

        Camera c = new Camera(new Point3D(10, 10, 10), Point3D.O0);

        scene().add(new SegmentDroite(Point3D.O0, Point3D.X.mult(10), Color.RED));
        scene().add(new SegmentDroite(Point3D.O0, Point3D.Y.mult(10), Color.GREEN));
        scene().add(new SegmentDroite(Point3D.O0, Point3D.Z.mult(10), Color.BLUE));
        scene().add(new TRI(new Point3D(3.1, 3, -1), new Point3D(3.1, 1, -1), new Point3D(3.1, 3, 1), Color.red));

        scene().add(c1);
        scene().add(c2);
        scene().add(cy1);
        scene().add(cy2);
        scene().add(c3);
        scene().cameraActive(c);
        scene().lumieres()
                .add(
                    new LumierePonctuelle(new Point3D(5,20,5), Color.orange));
        scene().lumieres()
                .add(
                    new LumierePonctuelle(new Point3D(20,0,0), Color.magenta));
    }

    public static void main(String[] args) {
        TestPortrait tp = new TestPortrait();
        tp.loop(false);
        tp.setResx(1600);
        tp.setResy(1200);
        tp.run();
    }
}
