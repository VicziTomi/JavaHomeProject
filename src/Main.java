import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Piece> pieces = new ArrayList<Piece>();
        Piece tbsy = new Piece("tall", "black", "square", "yes", false);
        pieces.add(tbsy);
        Piece tbsn = new Piece("tall", "black", "square", "no", false);
        pieces.add(tbsn);
        Piece tbry = new Piece("tall", "black", "round", "yes", false);
        pieces.add(tbry);
        Piece tbrn = new Piece("tall", "black", "round", "no", false);
        pieces.add(tbrn);
        Piece twsy = new Piece("tall", "white", "square", "yes", false);
        pieces.add(twsy);
        Piece twsn = new Piece("tall", "white", "square", "no", false);
        pieces.add(twsn);
        Piece twry = new Piece("tall", "white", "round", "yes", false);
        pieces.add(twry);
        Piece twrn = new Piece("tall", "white", "round", "no", false);
        pieces.add(twrn);
        Piece sbsy = new Piece("small", "black", "square", "yes", false);
        pieces.add(sbsy);
        Piece sbsn = new Piece("small", "black", "square", "no", false);
        pieces.add(sbsn);
        Piece sbry = new Piece("small", "black", "round", "yes", false);
        pieces.add(sbry);
        Piece sbrn = new Piece("small", "black", "round", "no", false);
        pieces.add(sbrn);
        Piece swsy = new Piece("small", "white", "square", "yes", false);
        pieces.add(swsy);
        Piece swsn = new Piece("small", "white", "square", "no", false);
        pieces.add(swsn);
        Piece swry = new Piece("small", "white", "round", "yes", false);
        pieces.add(swry);
        Piece swrn = new Piece("small", "white", "round", "no", false);
        pieces.add(swrn);


        System.out.println(tbsy);
        System.out.println(pieces);
    }
}
