package chess.service.dto;

public class GameStatusRequestDto {

    private String chessName;
    private boolean isGameOver;

    public GameStatusRequestDto() {
    }

    public GameStatusRequestDto(String chessName, boolean isGameOver) {
        this.chessName = chessName;
        this.isGameOver = isGameOver;
    }

    public String getChessName() {
        return chessName;
    }

    public void setChessName(String chessName) {
        this.chessName = chessName;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }
}
