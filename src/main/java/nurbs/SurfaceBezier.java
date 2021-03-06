/**
 * *
 * Global license :  *
 * Microsoft Public Licence
 *
 * author Manuel Dahmen <ibiiztera.it@gmail.com>
 *
    Creation time 17-sept.-2014
 *
 **
 */
package nurbs;
import info.emptycanvas.library.nurbs.SurfaceParametriquePolynomialeBezier;
import info.emptycanvas.library.object.*;
import info.emptycanvas.library.testing.TestObjetSub;

/**
 *
 * @author Manuel Dahmen <ibiiztera.it@gmail.com>
 */
public class SurfaceBezier extends TestObjetSub {

    @Override
    public void testScene() {
        Point3D[][] p = new Point3D[9][9];
        int m = 0;
        for (int i = -4; i <= 4; i++) {
            int n = 0;
            for (int j = -4; j <= 4; j++) {
                p[m][n] = new Point3D(i, j, 0);
                n++;
            }
            m++;
        }
        SurfaceParametriquePolynomialeBezier surfaceParametriquePolynomialeBezier = new SurfaceParametriquePolynomialeBezier(p);
        boolean add = scene().add(surfaceParametriquePolynomialeBezier);
        scene().cameraActive(new Camera(Point3D.Z.mult(-10), Point3D.O0));

    }

    public static void main(String[] arg) {
        SurfaceBezier t1 = new SurfaceBezier();
        t1.loop(false);
        new Thread(t1).start();
    }

    @Override
    public void finit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ginit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
