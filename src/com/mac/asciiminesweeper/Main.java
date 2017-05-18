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
        
    private static final int WIDTH = 16;
    private static final int HEIGHT = 9;
    private static final int SCALE = 2;
    
    public static final String TITLE = "Title";
    public static final String FONT = "fonts/drake_10x10.png";
    public static final int CHAR_WIDTH = 10;
    public static final int CHAR_HEIGHT = 10;
    
    public Main(){
        Engine.init();
        Engine.instance().newGame();
    }
    
    public static int width(){
        return WIDTH * SCALE;
    }
    
    public static int height(){
        return HEIGHT * SCALE;
    }
    
    public static void main(String[] args){
        new Main();
    }
}
