package com.mac.asciiminesweeper.screen;

import com.mac.asciiminesweeper.ascii.AsciiPanel;

import java.awt.event.KeyEvent;

/**
 * Project: Ascii Minesweeper
 * Created by Matt on 18/05/2017 at 08:37 PM.
 */
public abstract class Screen {
    
    public abstract void render(AsciiPanel panel);
    public abstract Screen input(KeyEvent key);
}
