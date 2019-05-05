import java.util.List;

public class PieceList {

    private List<Piece> pieces;

    public PieceList(Piece e) {
        this.pieces.add(0, Piece.sbrn);
        this.pieces.add(1, Piece.sbry);
        this.pieces.add(2, Piece.sbsn);
        this.pieces.add(3, Piece.sbsy);
    }

    @Override
    public String toString() {
        return "PieceList{" +
                "pieces=" + pieces +
                '}';
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }
}
