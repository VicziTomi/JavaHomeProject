import java.util.List;

public class PieceList {

    private List<Piece> pieces;

    public PieceList(List<Piece> pieces) {
        this.pieces = pieces;
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
