import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GUI extends JFrame implements MouseListener, ActionListener {
    public JPanel pieceMap;
    public JPanel temp;
    public PiecePool pieces;
    public JLabel[][] inPlay;
    public JPanel gameMap;

    public GUI() throws HeadlessException {
        this.setTitle("Quatro");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0, 0, 800, 850);
        this.setLayout(null);

        pieceMap = new JPanel();
        pieceMap.setBackground(Color.green);
        pieceMap.setLayout(new GridLayout(2, 8));
        pieceMap.setBounds(0, 500, 800, 300);
        pieceMap.addMouseListener(this);

        pieces = new PiecePool();
        for (Piece p: pieces.getList()) {
            p.setIcon(p.getImg());
            p.addMouseListener(this);
            p.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            pieceMap.add(p);
        }

        temp = new JPanel();
        temp.setBackground(Color.yellow);
        temp.setBounds(501,0,300,250);

        gameMap = new JPanel();
        gameMap.setBackground(Color.gray);
        gameMap.setLayout(new GridLayout(4, 4));
        gameMap.setBounds(0,0,500, 500);

        inPlay = new Piece[4][4];
        for (int i = 0; i < inPlay.length; i++) {
            for (int j = 0; j < inPlay[i].length; j++) {
                // Piece def = new Piece("height", "color", "shape", "dotted", true, new ImageIcon(getClass().getResource("icons/p6.png")));
                inPlay[i][j] = new Piece(true);
                // inPlay[i][j].setIcon(def.getImg());
                inPlay[i][j].setBorder(BorderFactory.createLineBorder(Color.white));
                inPlay[i][j].addMouseListener(this);
                gameMap.add(inPlay[i][j]);
            }
        }

        this.add(gameMap);
        this.add(temp);
        this.add(pieceMap);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Piece tempPiece = null;
        if (e.getSource() instanceof Piece && !((Piece) e.getSource()).isPlayed()) {
            System.err.println(e.getSource());
            tempPiece = (Piece) e.getSource();
            tempPiece.setPlayed(true);
            temp.add(tempPiece);
            pieces.remove(tempPiece);
            pieceMap.revalidate();
            pieceMap.repaint();
            System.out.println(temp);
            System.err.println(tempPiece);
        } else if (e.getSource() instanceof Piece && ((Piece) e.getSource()).isPlayed()) {
            //TODO hogy a túróba kell kinyerni a JPanel (grid) sor / oszlop értékeit? ActionListener???
            int x = ((Piece) e.getSource()).getX();
            int y = ((Piece) e.getSource()).getY();
            inPlay[x][y] = tempPiece; //ezt a sort átírni, fogadja a tempPiece-t és a kattintás koordiátájára tegye le!
            inPlay[x][y].setIcon(tempPiece.getImg());
            inPlay[x][y].revalidate();
            inPlay[x][y].repaint();
            gameMap.revalidate();
            gameMap.repaint();
            temp.remove(tempPiece);
            // tempPiece.remove(temp);
            temp.revalidate();
            temp.repaint();
            System.err.println(x + " " + y);
            System.err.println(tempPiece);
            System.err.println(temp);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
