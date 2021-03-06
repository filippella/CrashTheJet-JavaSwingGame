/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crashthejet.game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Filippo-TheAppExpert
 */
public class Bullet extends Sprite {

    public Bullet(int x, int y, int speed) {
        super(x, y, speed);
    }

    @Override
    protected void draw(Graphics2D g2D) {
        g2D.setColor(Color.RED);
        g2D.fillOval(getX(), getY(), 10, 10);
    }

    public void update() {
        setY(getY() - getSpeed());
    }

    public Rectangle getBound() {
        return new Rectangle(getX(), getY(), 10, 10);
    }
}
