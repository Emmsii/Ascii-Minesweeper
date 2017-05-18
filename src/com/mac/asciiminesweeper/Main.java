package com.mac.asciiminesweeper;

import com.mac.asciiminesweeper.ascii.AsciiPanel;
import com.mac.asciiminesweeper.ascii.AsciiTerminal;
import com.mac.asciiminesweeper.ascii.AsciiTerminalButton;

import java.awt.*;
import java.util.Random;

/**
 * Project: Ascii Minesweeper
 * Created by Matt on 18/05/2017 at 04:20 PM.
 */
public class Main {
    
    public static final int WIDTH = 16;
    public static final int HEIGHT = 16;
    
    private final AsciiTerminal terminal;
    
    public Main(String fontFile, int characterWidth, int characterHeight){
        terminal = new AsciiTerminal("Title", new Dimension(WIDTH, HEIGHT), fontFile, characterWidth, characterHeight);

        AsciiPanel panel = terminal.getAsciiPanel();

        Random rand = new Random();

        for(int i = 0; i < 16; i++) {
            for(int j = 0; j < 10; j++) {
                panel.write(i, j, (char)rand.nextInt(256), new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
            }
        }

        AsciiTerminalButton b1 = new AsciiTerminalButton(panel, "Click on me", 0, 12, Color.GREEN, Color.ORANGE);
        panel.add(b1);
        
        terminal.repaint();
    }
    
    public static void main(String[] args){
        new Main("fonts/drake_10x10.png", 10, 10);
    }
}
