import java.util.ArrayList;
import java.util.List;

public class PiecePool {

    Piece tbsy = new Piece("tall", "black", "square", "yes", false);
    Piece tbsn = new Piece("tall", "black", "square", "no", false);
    Piece tbry = new Piece("tall", "black", "round", "yes", false);
    Piece tbrn = new Piece("tall", "black", "round", "no", false);
    Piece twsy = new Piece("tall", "white", "square", "yes", false);
    Piece twsn = new Piece("tall", "white", "square", "no", false);
    Piece twry = new Piece("tall", "white", "round", "yes", false);
    Piece twrn = new Piece("tall", "white", "round", "no", false);
    Piece sbsy = new Piece("small", "black", "square", "yes", false);
    Piece sbsn = new Piece("small", "black", "square", "no", false);
    Piece sbry = new Piece("small", "black", "round", "yes", false);
    Piece sbrn = new Piece("small", "black", "round", "no", false);
    Piece swsy = new Piece("small", "white", "square", "yes", false);
    Piece swsn = new Piece("small", "white", "square", "no", false);
    Piece swry = new Piece("small", "white", "round", "yes", false);
    Piece swrn = new Piece("small", "white", "round", "no", false);

    private List<Piece> list;

    public PiecePool() {
        this.list = new ArrayList<>();
        list.add(tbsy);
        list.add(tbsn);
        list.add(tbry);
        list.add(tbrn);
        list.add(twsy);
        list.add(twsn);
        list.add(twry);
        list.add(twrn);
        list.add(sbsy);
        list.add(sbsn);
        list.add(sbry);
        list.add(sbrn);
        list.add(swsy);
        list.add(swsn);
        list.add(swry);
        list.add(swrn);
    }

    @Override
    public String toString() {
        return "PiecePool: " + list;
    }

    public void remove(int index) {
        list.remove(index - 1);
    }

}
