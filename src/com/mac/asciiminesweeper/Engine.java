package com.mac.asciiminesweeper;

import com.mac.asciiminesweeper.ascii.AsciiPanel;
import com.mac.asciiminesweeper.ascii.AsciiTerminal;
import com.mac.asciiminesweeper.ascii.AsciiTerminalButton;
import com.mac.asciiminesweeper.board.Board;
import com.mac.asciiminesweeper.screen.BoardScreen;
import com.mac.asciiminesweeper.screen.Screen;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * Project: Ascii Minesweeper
 * Created by Matt on 18/05/2017 at 08:30 PM.
 */
public class Engine implements KeyListener{
    
    private static Engine instance;
    private static boolean initialized = false;
    
    private final AsciiTerminal terminal;
    private final AsciiPanel panel;
    
    private Screen screen;
    private Board board;
    
    private Engine(){
        terminal = new AsciiTerminal(Main.TITLE, new Dimension(Main.width(), Main.height()), Main.FONT, Main.CHAR_WIDTH, Main.CHAR_HEIGHT);
        panel = terminal.getAsciiPanel();
        terminal.addKeyListener(this);
        
        AsciiTerminalButton b1 = new AsciiTerminalButton(panel, "Click on me", 0, 12, Color.GREEN, Color.ORANGE);
        panel.add(b1);

        render();
    }
    
    public void newGame(){
        board = new Board(Main.height(), Main.height());
        screen = new BoardScreen(board);
    }
    
    public void render(){
        panel.clear();
        if(screen != null) screen.render(panel);
                
        terminal.repaint();
    }
    
    public void input(KeyEvent key){
        if(screen != null) screen = screen.input(key);
        render();
    }
    
    public AsciiPanel panel(){
        return panel;
    }
    
    public static void init(){
        if(initialized){
            System.err.print("Engine already initialized.");
            return;
        }
        initialized = true;
        Engine.instance = new Engine();
    }
    
    public static Engine instance(){
        if(instance == null){
            System.err.println("Error: Engine not initialized.");
            System.exit(-1);
        }
        return instance;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        input(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
