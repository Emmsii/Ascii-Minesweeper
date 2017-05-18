package com.mac.asciiminesweeper.board;

import com.mac.asciiminesweeper.Engine;
import com.mac.asciiminesweeper.ascii.AsciiPanel;

import java.awt.*;

/**
 * Project: Ascii Minesweeper
 * Created by Matt on 18/05/2017 at 08:42 PM.
 */
public class Board {
    
    private BoardPiece[][] pieces;
    
    private final int width, height;
    
    public Board(int width, int height){
        this.width = width;
        this.height = height;
        this.pieces = new BoardPiece[width][height];
        
        generate();
    }
    
    private void generate(){
        AsciiPanel panel = Engine.instance().panel();
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                pieces[x][y] = new BoardPiece(panel, "o", x, y, Color.gray, Color.darkGray, Color.darkGray.darker());
                panel.add(pieces[x][y]);
            }
        }
    }
    
    public BoardPiece piece(int x, int y){
        if(!inBounds(x, y)) return null;
        return pieces[x][y];
    }
    
    public int width(){
        return width;
    }
    
    public int height(){
        return height;
    }
    
    public boolean inBounds(int x, int y){
        return x >= 0 && y >= 0 && x < width && y < height;
    }
}
