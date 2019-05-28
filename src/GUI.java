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

    public int mouseY(int i) {
        int y = 0;
        if (i == 0) { y = 0; }
        else if (i == 125) { y = 1; }
        else if (i == 250) { y = 2; }
        else if (i == 375) { y = 3; }
        return y;
    }

    public int mouseX(int j) {
        int x = 0;
        if (j == 0) { x = 0; }
        else if (j == 125) { x = 1; }
        else if (j == 250) { x = 2; }
        else if (j == 375) { x = 3; }
        return x;
    }

    public void rowCheck(int row) {
        Piece p0 = (Piece)inPlay[row][0];
        Piece p1 = (Piece)inPlay[row][1];
        Piece p2 = (Piece)inPlay[row][2];
        Piece p3 = (Piece)inPlay[row][3];
        if (p0.height.equals(p1.height) && p1.height.equals(p2.height) && p2.height.equals(p3.height)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Line: " + (row + 1) + "\n" + "Type: " + p0.height);
        } else if (p0.color.equals(p1.color) && p1.color.equals(p2.color) && p2.color.equals(p3.color)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Line: " + (row + 1) + "\n" + "Type: " + p0.color);
        } else if (p0.shape.equals(p1.shape) && p1.shape.equals(p2.shape) && p2.shape.equals(p3.shape)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Line: " + (row + 1) + "\n" + "Type: " + p0.shape);
        } else if (p0.dotted.equals(p1.dotted) && p1.dotted.equals(p2.dotted) && p2.dotted.equals(p3.dotted)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Line: " + (row + 1) + "\n" + "Type: " + p0.dotted);
        }
    }

    public void columnCheck(int column) {
        Piece p0 = (Piece)inPlay[0][column];
        Piece p1 = (Piece)inPlay[1][column];
        Piece p2 = (Piece)inPlay[2][column];
        Piece p3 = (Piece)inPlay[3][column];
        if (p0.height.equals(p1.height) && p1.height.equals(p2.height) && p2.height.equals(p3.height)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Column: " + (column + 1) + "\n" + "Type: " + p0.height);
        } else if (p0.color.equals(p1.color) && p1.color.equals(p2.color) && p2.color.equals(p3.color)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Column: " + (column + 1) + "\n" + "Type: " + p0.color);
        } else if (p0.shape.equals(p1.shape) && p1.shape.equals(p2.shape) && p2.shape.equals(p3.shape)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Column: " + (column + 1) + "\n" + "Type: " + p0.shape);
        } else if (p0.dotted.equals(p1.dotted) && p1.dotted.equals(p2.dotted) && p2.dotted.equals(p3.dotted)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Column: " + (column + 1) + "\n" + "Type: " + p0.dotted);
        }
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
            int y = mouseY(((Piece) e.getSource()).getY());
            int x = mouseX(((Piece) e.getSource()).getX());
            System.err.println(y + " " + x);
            Piece toPut = (Piece) temp.getComponent(0);
            ImageIcon toPutImage = toPut.getImg();
            //inPlay[y][x] = toPut;
            inPlay[y][x].setIcon(toPutImage);
            ((Piece)inPlay[y][x]).setHeight(toPut.height);
            ((Piece)inPlay[y][x]).setColor(toPut.color);
            ((Piece)inPlay[y][x]).setShape(toPut.shape);
            ((Piece)inPlay[y][x]).setDotted(toPut.dotted);
            // inPlay[y][x].revalidate();
            // inPlay[y][x].repaint();
            // gameMap.revalidate();
            // gameMap.repaint();
            temp.remove(toPut);
            temp.revalidate();
            temp.repaint();
            rowCheck(y);
            columnCheck(x);
            System.err.println(toPut);
            System.err.println(inPlay[y][x].toString());
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
