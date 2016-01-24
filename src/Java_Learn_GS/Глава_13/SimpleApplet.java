package Java_Learn_GS.Глава_13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by GM on 22.07.2015.
 */

/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
*/

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("sad", 20, 20);
    }
}
