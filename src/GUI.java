import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI extends JFrame implements MouseListener {
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
        pieceMap.setBackground(Color.darkGray);
        pieceMap.setLayout(new GridLayout(2, 8));
        pieceMap.setBounds(0, 500, 800, 300);
        pieceMap.addMouseListener(this);

        pieces = new PiecePool();
        for (Piece p : pieces.getList()) {
            p.setIcon(p.getImg());
            p.addMouseListener(this);
            p.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            p.setVerticalAlignment(SwingConstants.CENTER);
            p.setHorizontalAlignment(SwingConstants.CENTER);
            pieceMap.add(p);
        }

        temp = new JPanel();
        temp.setBackground(Color.pink);
        temp.setBounds(575, 200, 150, 150);

        gameMap = new JPanel();
        gameMap.setBackground(Color.gray);
        gameMap.setLayout(new GridLayout(4, 4));
        gameMap.setBounds(0, 0, 500, 500);

        inPlay = new Piece[4][4];
        for (int i = 0; i < inPlay.length; i++) {
            for (int j = 0; j < inPlay[i].length; j++) {
                Piece fillPiece = new Piece("", "", "", "", true, new ImageIcon(getClass().getResource("icons/def.png")));
                //inPlay[i][j] = new Piece(true, new ImageIcon(getClass().getResource("icons/def.png")));
                inPlay[i][j] = fillPiece;
                //inPlay[i][j].setIcon(inPlay[i][j].getIcon());
                // inPlay[i][j].setOpaque(false);
                // System.out.println(fillPiece.getImg());
                inPlay[i][j].setIcon(fillPiece.getImg());
                inPlay[i][j].setBorder(BorderFactory.createLineBorder(Color.white));
                inPlay[i][j].setVerticalAlignment(SwingConstants.CENTER);
                inPlay[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                inPlay[i][j].addMouseListener(this);
                gameMap.add(inPlay[i][j]);
                gameMap.revalidate();
                gameMap.repaint();
            }
        }

        this.add(gameMap);
        this.add(temp);
        this.add(pieceMap);

        setVisible(true);
    }

    public int mouseX(int i) {
        int x = 0;
        if (i == 0) { x = 0; }
        else if (i == 125) { x = 1; }
        else if (i == 250) { x = 2; }
        else if (i == 375) { x = 3; }
        return x;
    }

    public int mouseY(int j) {
        int y = 0;
        if (j == 0) { y = 0; }
        else if (j == 125) { y = 1; }
        else if (j == 250) { y = 2; }
        else if (j == 375) { y = 3; }
        return y;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Piece tempPiece = null;
        if (e.getSource() instanceof Piece && !((Piece) e.getSource()).isPlayed()) {
            tempPiece = (Piece) e.getSource();
            tempPiece.setPlayed(true);
            temp.add(tempPiece);
            pieces.remove(tempPiece);
            pieceMap.revalidate();
            pieceMap.repaint();
            System.out.println(temp.toString());
            System.err.println(tempPiece.toString());
        } else if (e.getSource() instanceof Piece && ((Piece) e.getSource()).isPlayed()) {
            int i = ((Piece) e.getSource()).getX();
            int j = ((Piece) e.getSource()).getY();
            int x = mouseX(j);
            int y = mouseY(i);
            System.err.println(x + " " + y);
            Piece toPut = (Piece) temp.getComponent(0);
            ImageIcon toPutImage = toPut.getImg();
            //inPlay[x][y] = toPut;
            inPlay[x][y].setIcon(toPutImage);
            ((Piece)inPlay[x][y]).setHeight(toPut.height);
            ((Piece)inPlay[x][y]).setColor(toPut.color);
            ((Piece)inPlay[x][y]).setShape(toPut.shape);
            ((Piece)inPlay[x][y]).setDotted(toPut.dotted);
            // inPlay[x][y].revalidate();
            // inPlay[x][y].repaint();
            // gameMap.revalidate();
            // gameMap.repaint();
            temp.remove(toPut);
            temp.revalidate();
            temp.repaint();
            System.err.println(toPut);
            System.err.println(inPlay[x][y].toString());
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
}
