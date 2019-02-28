package gameobject;

import java.awt.*;

public abstract class Enemy {
    public abstract void update();
    public abstract void draw(Graphics g);
    public abstract Rectangle getBound();
    public abstract boolean isOutOfScreen();
}
