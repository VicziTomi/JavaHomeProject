import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class GUI extends JFrame implements MouseListener, ActionListener {

    public Piece tbsy = new Piece("tall", "black", "square", "yes", false, new ImageIcon(getClass().getResource("icons/p9.png")));
    public Piece tbsn = new Piece("tall", "black", "square", "no", false, new ImageIcon(getClass().getResource("icons/p8.png")));
    public Piece tbry = new Piece("tall", "black", "round", "yes", false, new ImageIcon(getClass().getResource("icons/p13.png")));
    public Piece tbrn = new Piece("tall", "black", "round", "no", false, new ImageIcon(getClass().getResource("icons/p12.png")));
    public Piece twsy = new Piece("tall", "white", "square", "yes", false, new ImageIcon(getClass().getResource("icons/p1.png")));
    public Piece twsn = new Piece("tall", "white", "square", "no", false, new ImageIcon(getClass().getResource("icons/p0.png")));
    public Piece twry = new Piece("tall", "white", "round", "yes", false, new ImageIcon(getClass().getResource("icons/p5.png")));
    public Piece twrn = new Piece("tall", "white", "round", "no", false, new ImageIcon(getClass().getResource("icons/p4.png")));
    public Piece sbsy = new Piece("small", "black", "square", "yes", false, new ImageIcon(getClass().getResource("icons/p11.png")));
    public Piece sbsn = new Piece("small", "black", "square", "no", false, new ImageIcon(getClass().getResource("icons/p10.png")));
    public Piece sbry = new Piece("small", "black", "round", "yes", false, new ImageIcon(getClass().getResource("icons/p15.png")));
    public Piece sbrn = new Piece("small", "black", "round", "no", false, new ImageIcon(getClass().getResource("icons/p14.png")));
    public Piece swsy = new Piece("small", "white", "square", "yes", false, new ImageIcon(getClass().getResource("icons/p3.png")));
    public Piece swsn = new Piece("small", "white", "square", "no", false, new ImageIcon(getClass().getResource("icons/p2.png")));
    public Piece swry = new Piece("small", "white", "round", "yes", false, new ImageIcon(getClass().getResource("icons/p7.png")));
    public Piece swrn = new Piece("small", "white", "round", "no", false, new ImageIcon(getClass().getResource("icons/p6.png")));

    public JPanel pieceMap;
    public JPanel temp;
    public List<Piece> pieces;
    public JLabel[][] inPlay;
    public JPanel gameMap;
    public Piece tempPiece;


    public GUI() throws HeadlessException {
        this.setTitle("Quatro");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0, 0, 800, 850);
        this.setLayout(null);

        pieceMap = new JPanel();
        pieceMap.setBackground(Color.green);
        pieceMap.setLayout(new GridLayout(2, 8));
        pieceMap.setBounds(0, 500, 800, 300);

        pieces = new ArrayList<>();
        pieces.add(tbsy);
        pieces.add(tbsn);
        pieces.add(tbry);
        pieces.add(tbrn);
        pieces.add(twsy);
        pieces.add(twsn);
        pieces.add(twry);
        pieces.add(twrn);
        pieces.add(sbsy);
        pieces.add(sbsn);
        pieces.add(sbry);
        pieces.add(sbrn);
        pieces.add(swsy);
        pieces.add(swsn);
        pieces.add(swry);
        pieces.add(swrn);



        for (Piece p: pieces) {
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
        // gameMap.addMouseListener(this);

        inPlay = new Piece[4][4];
        for (int i = 0; i < inPlay.length; i++) {
            for (int j = 0; j < inPlay[i].length; j++) {
                inPlay[i][j] = new Piece(true);
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
        tempPiece = (Piece) e.getSource();
        if (!tempPiece.isPlayed()) {
            temp.add(tempPiece);
            pieces.remove(tempPiece);
            tempPiece.setPlayed(true);
            System.out.println(temp);
            pieceMap.revalidate();
            pieceMap.repaint();
        } else {
            //TODO hogy a túróba kell kinyerni a JPanel (grid) sor / oszlop értékeit? ActionListener???
            int x = e.getX();
            int y = e.getY();
            inPlay[x][y] = tempPiece;
            temp.remove(tempPiece);
            gameMap.revalidate();
            gameMap.repaint();
            System.err.println(x + " " + y);
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
