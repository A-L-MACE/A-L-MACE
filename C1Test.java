import org.junit.Test.*;
import static org.junit.Assert.*;
import java.util.*;

public class FourLineTest {

    @Test
    public void testPlayer1Wins() {
        FourLine game = new FourLine();

        // Player1 drops their pieces in column 3, Player2 drops their pieces in columns 4,5,6 in order.
        game.drop(3); // First player drops a piece in column 3
        game.drop(4); // Second player drops a piece in column 4
        game.drop(5); // Second player drops a piece in column 5
        game.drop(6); // Second player drops a piece in column 6
        game.drop(3); 
        game.drop(4);
        game.drop(5); 
        game.drop(6); 
        game.drop(3); 
        game.drop(4); 
        game.drop(5); 
        game.drop(6); 
        game.drop(3); 

        // Check that player1 has won
        assertTrue(game.isGameOver());
        assertEquals(1, game.getWinner());
    }
}
