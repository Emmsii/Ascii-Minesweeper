package com.mac.asciiminesweeper.board;

import com.mac.asciiminesweeper.ascii.AsciiPanel;
import com.mac.asciiminesweeper.ascii.AsciiTerminalButton;

import java.awt.*;

/**
 * Project: Ascii Minesweeper
 * Created by Matt on 18/05/2017 at 08:42 PM.
 */
public class BoardPiece extends AsciiTerminalButton{
    
    public BoardPiece(AsciiPanel asciiPanel, String label, int x, int y, Color mouseDefaultColor, Color mouseEnteredColor) {
        super(asciiPanel, label, x, y, mouseDefaultColor, mouseEnteredColor);
    }

    public BoardPiece(AsciiPanel asciiPanel, String label, int x, int y, Color mouseDefaultColor, Color mouseEnteredColor, Color mouseBackgroundColor) {
        super(asciiPanel, label, x, y, mouseDefaultColor, mouseEnteredColor, mouseBackgroundColor);
    }
}
