import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class PiecePool {
    public List<Piece> list = new ArrayList<>();

    public PiecePool() {
        this.list.add(new Piece("tall", "black", "square", "yes", false, new ImageIcon(getClass().getResource("icons/p9.png"))));
        this.list.add(new Piece("tall", "black", "square", "no", false, new ImageIcon(getClass().getResource("icons/p8.png"))));
        this.list.add(new Piece("tall", "black", "round", "yes", false, new ImageIcon(getClass().getResource("icons/p13.png"))));
        this.list.add(new Piece("tall", "black", "round", "no", false, new ImageIcon(getClass().getResource("icons/p12.png"))));
        this.list.add(new Piece("tall", "white", "square", "yes", false, new ImageIcon(getClass().getResource("icons/p1.png"))));
        this.list.add(new Piece("tall", "white", "square", "no", false, new ImageIcon(getClass().getResource("icons/p0.png"))));
        this.list.add(new Piece("tall", "white", "round", "yes", false, new ImageIcon(getClass().getResource("icons/p5.png"))));
        this.list.add(new Piece("tall", "white", "round", "no", false, new ImageIcon(getClass().getResource("icons/p4.png"))));
        this.list.add(new Piece("small", "black", "square", "yes", false, new ImageIcon(getClass().getResource("icons/p11.png"))));
        this.list.add(new Piece("small", "black", "square", "no", false, new ImageIcon(getClass().getResource("icons/p10.png"))));
        this.list.add(new Piece("small", "black", "round", "yes", false, new ImageIcon(getClass().getResource("icons/p15.png"))));
        this.list.add(new Piece("small", "black", "round", "no", false, new ImageIcon(getClass().getResource("icons/p14.png"))));
        this.list.add(new Piece("small", "white", "square", "yes", false, new ImageIcon(getClass().getResource("icons/p3.png"))));
        this.list.add(new Piece("small", "white", "square", "no", false, new ImageIcon(getClass().getResource("icons/p2.png"))));
        this.list.add(new Piece("small", "white", "round", "yes", false, new ImageIcon(getClass().getResource("icons/p7.png"))));
        this.list.add(new Piece("small", "white", "round", "no", false, new ImageIcon(getClass().getResource("icons/p6.png"))));
    }

    public List<Piece> getList() {
        return list;
    }

    public void setList(List<Piece> list) {
        this.list = list;
    }

    public PiecePool(List<Piece> list) {
        this.list = list;
    }

    public void remove(Piece p) {
        this.list.remove(p);
    }
}
