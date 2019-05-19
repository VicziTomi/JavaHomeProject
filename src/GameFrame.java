import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class GameFrame extends JFrame implements MouseListener {

/*
    private JPanel pieceArea;
    private JPanel gameArea;


    public GameFrame() throws HeadlessException {


        piecePool = new ArrayList<Piece>();
        piecePool.add(tbsy);
        piecePool.add(tbsn);
        piecePool.add(tbry);
        piecePool.add(tbrn);
        piecePool.add(twsy);
        piecePool.add(twsn);
        piecePool.add(twry);
        piecePool.add(twrn);
        piecePool.add(sbsy);
        piecePool.add(sbsn);
        piecePool.add(sbry);
        piecePool.add(sbrn);
        piecePool.add(swsy);
        piecePool.add(swsn);
        piecePool.add(swry);
        piecePool.add(swrn);


        this.setTitle("Quatro");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0,0,800,800);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        pieceArea = new JPanel();
        pieceArea.setBackground(Color.GREEN);
        pieceArea.setLayout(new GridLayout(2,8));


        gameArea = new JPanel();
        gameArea.setBackground(Color.GRAY);
        gameArea.setLayout(new GridLayout(4,4));

        JPanel selectPiece = new JPanel();
        selectPiece.setBackground(Color.cyan);
        selectPiece.setLayout(null);


        gameArea.setMinimumSize(new Dimension(200,200));
        gameArea.setPreferredSize(new Dimension(500,500));
        gameArea.setMaximumSize(new Dimension(500,500));

        pieceArea.setMinimumSize(new Dimension(200,200));
        pieceArea.setPreferredSize(new Dimension(800,300));
        //pieceArea.setMaximumSize(new Dimension(800,300));

        selectPiece.setMinimumSize(new Dimension(50,50));
        selectPiece.setPreferredSize(new Dimension(300,500));
        selectPiece.setMaximumSize(new Dimension(300,500));


        pieceLabels = new Piece[4][4];
        for (int i = 0; i < pieceLabels.length; i++) {
            for (int j = 0; j < pieceLabels[i].length; j++) {
                pieceLabels[i][j] = new Piece();
                pieceLabels[i][j].addMouseListener(this);
                pieceLabels[i][j].setBorder(BorderFactory.createLineBorder(Color.WHITE));
                gameArea.add(pieceLabels[i][j]);
            }
        }

        for (Piece p : piecePool) {
            pieceArea.add(p);
            p.addMouseListener(this);
            p.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            pieceArea.validate();
            pieceArea.repaint();
        }

        this.add(gameArea);
        this.add(selectPiece);
        this.add(pieceArea);
        gameArea.setAlignmentY(this.TOP_ALIGNMENT);
        // selectPiece.setAlignmentY(gameArea.RIGHT_ALIGNMENT);
        // selectPiece.setAlignmentX(gameArea.RIGHT_ALIGNMENT);
        pieceArea.setAlignmentY(this.BOTTOM_ALIGNMENT);


        setVisible(true);
    }

    Piece temp = new Piece();


 */

    @Override
    public void mouseClicked(MouseEvent e) {
        /* if (e.getSource() instanceof Piece) {
            temp = ((Piece) e.getSource());
            piecePool.remove(e.getSource());
            pieceArea.remove((Piece)e.getSource());
            pieceArea.revalidate();
            pieceArea.repaint();
            System.out.println(temp);
            System.out.println(piecePool);

        }
        */
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
