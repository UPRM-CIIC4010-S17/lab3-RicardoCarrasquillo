import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        
                        int width = x2 - x1;
                        int height = y2 - y1;
                        
                        int OVALSIZE = 55;
 
                        //Paint the background
                        g.setColor(Color.DARK_GRAY);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width , height);
//                        g.setColor(Color.RED);
//                        g.drawRect(x1 + 10 , y1 + 10 , width - 20, height - 20);
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.BLUE);
//                        g.drawLine(x2, y1, x1, y2);
//                        g.setColor(Color.PINK);
//                        g.fillOval(width - OVALSIZE / 2 - width / 2, height - OVALSIZE /2 - height / 2, 55, 55);
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        final int DEFAULT_RECTANGLE_HEIGHT = height/5;
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1 , DEFAULT_RECTANGLE_HEIGHT);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1 , DEFAULT_RECTANGLE_HEIGHT , width + 1, DEFAULT_RECTANGLE_HEIGHT);
                        g.setColor(Color.RED);
                        g.fillRect(x1, DEFAULT_RECTANGLE_HEIGHT * 2 , width + 1, DEFAULT_RECTANGLE_HEIGHT);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1 , DEFAULT_RECTANGLE_HEIGHT * 3 , width + 1, DEFAULT_RECTANGLE_HEIGHT);
                        g.setColor(Color.RED);
                        g.fillRect(x1, DEFAULT_RECTANGLE_HEIGHT * 4 , width + 1, DEFAULT_RECTANGLE_HEIGHT + 1);
                        g.setColor(Color.BLUE);
                        Polygon p1 = new Polygon();
                        p1.addPoint(x1, y1);
                        p1.addPoint(width / 2, height / 2);
                        p1.addPoint(x1, y2);
                        g.fillPolygon(p1);
                        g.setColor(Color.WHITE);
                        Polygon p2 = new Polygon();
                        final int DEFAULT_P2_POLYGON_HEIGHT = height/2;
                        p2.addPoint(x1 + 25, DEFAULT_P2_POLYGON_HEIGHT + 73);
                        p2.addPoint(x1 + 41, DEFAULT_P2_POLYGON_HEIGHT + 73);
                        p2.addPoint(x1 + 47, DEFAULT_P2_POLYGON_HEIGHT + 58);
                        p2.addPoint(x1 + 53, DEFAULT_P2_POLYGON_HEIGHT + 73);
                        p2.addPoint(x1 + 69, DEFAULT_P2_POLYGON_HEIGHT + 73);
                        p2.addPoint(x1 + 56, DEFAULT_P2_POLYGON_HEIGHT + 83);
                        p2.addPoint(x1 + 61, DEFAULT_P2_POLYGON_HEIGHT + 98);
                        p2.addPoint(x1 + 47, DEFAULT_P2_POLYGON_HEIGHT + 88);
                        p2.addPoint(x1 + 34, DEFAULT_P2_POLYGON_HEIGHT + 98);
                        p2.addPoint(x1 + 38, DEFAULT_P2_POLYGON_HEIGHT + 83);
                        g.fillPolygon(p2);
                        
                        
                        
            }
}