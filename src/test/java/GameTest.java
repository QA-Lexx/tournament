import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void testWhenFirstPlayerIsStronger() {
        Game game = new Game();
        Player player1 = new Player(1, "Jim", 30);
        Player player2 = new Player(1, "Beam", 25);

        game.register(player1);
        game.register(player2);
        int actual = game.round("Jim", "Beam");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenSecondPlayerIsStronger() {
        Game game = new Game();
        Player player1 = new Player(1, "Jim", 25);
        Player player2 = new Player(1, "Beam", 30);

        game.register(player1);
        game.register(player2);
        int actual = game.round("Jim", "Beam");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenBothPlayersIsEquals() {
        Game game = new Game();
        Player player1 = new Player(1, "Jim", 30);
        Player player2 = new Player(1, "Beam", 30);

        game.register(player1);
        game.register(player2);
        int actual = game.round("Jim", "Beam");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}