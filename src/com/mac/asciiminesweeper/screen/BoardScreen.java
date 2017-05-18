package com.mac.asciiminesweeper.screen;

import com.mac.asciiminesweeper.ascii.AsciiPanel;
import com.mac.asciiminesweeper.board.Board;
import com.mac.asciiminesweeper.board.BoardPiece;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * Project: Ascii Minesweeper
 * Created by Matt on 18/05/2017 at 08:39 PM.
 */
public class BoardScreen extends Screen{
    
    private Board board;
    
    public BoardScreen(Board board){
        this.board = board;
    }
    
    @Override
    public void render(AsciiPanel panel) {
        for(int y = 0; y < board.width(); y++){
            for(int x = 0; x < board.height(); x++){
//                BoardPiece piece = board.piece(x, y);
//                panel.write(x, y, 'x', Color.WHITE);
            }
        }
    }

    @Override
    public Screen input(KeyEvent key) {
        return null;
    }
}
