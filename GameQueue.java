
public class GameQueue {

    private String[] games;
    private int numberOfGames;

    public GameQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Invalid capacity");
        }

        games = new String[capacity];
        numberOfGames = 0;
    }


    public boolean isEmpty() {
        return numberOfGames == 0;
    }


    public boolean isFull() {
        return numberOfGames == games.length;
    }


    public void enqueue(String game) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }

        games[numberOfGames] = game;
        numberOfGames++;
    }


    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        String removedGame = games[0];

        for (int count = 0; count < numberOfGames - 1; count++) {
            games[count] = games[count + 1];
        }

        numberOfGames--;
        games[numberOfGames] = null;

        return removedGame;
    }


    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return games[0];
    }


    public int size() {
        return numberOfGames;
    }


    public void clear() {
        for (int count = 0; count < numberOfGames; count++) {
            games[count] = null;
        }

        numberOfGames = 0;
    }


    public boolean contains(String game) {
        for (int count = 0; count < numberOfGames; count++) {
            if (games[count].equals(game)) {
                return true;
            }
        }

        return false;
    }
}
