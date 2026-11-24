
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameQueueTest {

    @Test
    public void testEmptyQueue() {
        GameQueue gameQueue = new GameQueue(5);

        assertTrue(gameQueue.isEmpty());
        assertEquals(0, gameQueue.size());
    }


    @Test
    public void testFullQueue() {
        GameQueue gameQueue = new GameQueue(2);

        gameQueue.enqueue("Minecraft");
        gameQueue.enqueue("Dead Cells");

        assertTrue(gameQueue.isFull());
    }


    @Test
    public void testEnqueue() {
        GameQueue gameQueue = new GameQueue(5);

        gameQueue.enqueue("Minecraft");

        assertFalse(gameQueue.isEmpty());
        assertEquals(1, gameQueue.size());
        assertEquals("Minecraft", gameQueue.peek());
    }


    @Test
    public void testEnqueueWhenFull() {
        GameQueue gameQueue = new GameQueue(2);

        gameQueue.enqueue("Minecraft");
        gameQueue.enqueue("Dead Cells");

        assertThrows(IllegalStateException.class, () ->
            gameQueue.enqueue("Limbus Company")
        );
    }


    @Test
    public void testDequeue() {
        GameQueue gameQueue = new GameQueue(5);

        gameQueue.enqueue("Minecraft");
        gameQueue.enqueue("Dead Cells");

        assertEquals("Minecraft", gameQueue.dequeue());
        assertEquals(1, gameQueue.size());
        assertEquals("Dead Cells", gameQueue.peek());
    }


    @Test
    public void testDequeueWhenEmpty() {
        GameQueue gameQueue = new GameQueue(5);

        assertThrows(IllegalStateException.class, () ->
            gameQueue.dequeue()
        );
    }


    @Test
    public void testPeek() {
        GameQueue gameQueue = new GameQueue(5);

        gameQueue.enqueue("Minecraft");
        gameQueue.enqueue("Dead Cells");

        assertEquals("Minecraft", gameQueue.peek());
        assertEquals(2, gameQueue.size());
    }


    @Test
    public void testPeekWhenEmpty() {
        GameQueue gameQueue = new GameQueue(5);

        assertThrows(IllegalStateException.class, () ->
            gameQueue.peek()
        );
    }


    @Test
    public void testSize() {
        GameQueue gameQueue = new GameQueue(5);

        gameQueue.enqueue("Minecraft");
        gameQueue.enqueue("Dead Cells");
        gameQueue.enqueue("Limbus Company");

        assertEquals(3, gameQueue.size());
    }


    @Test
    public void testClear() {
        GameQueue gameQueue = new GameQueue(5);

        gameQueue.enqueue("Minecraft");
        gameQueue.enqueue("Dead Cells");

        gameQueue.clear();

        assertTrue(gameQueue.isEmpty());
        assertEquals(0, gameQueue.size());
    }


    @Test
    public void testContains() {
        GameQueue gameQueue = new GameQueue(5);

        gameQueue.enqueue("Minecraft");
        gameQueue.enqueue("Dead Cells");

        assertTrue(gameQueue.contains("Minecraft"));
        assertTrue(gameQueue.contains("Dead Cells"));
        assertFalse(gameQueue.contains("Limbus Company"));
    }


    @Test
    public void testInvalidCapacity() {
        assertThrows(IllegalArgumentException.class, () ->
            new GameQueue(0)
        );

        assertThrows(IllegalArgumentException.class, () ->
            new GameQueue(-5)
        );
    }
}
