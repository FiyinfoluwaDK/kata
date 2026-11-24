
public class GameStack {

    private String[] games;
    private int numberOfGames;

    public GameStack(int capacity) {
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

    public void push(String game) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }

        games[numberOfGames] = game;
        numberOfGames++;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        String removedGame = games[numberOfGames - 1];
        games[numberOfGames - 1] = null;
        numberOfGames--;

        return removedGame;
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return games[numberOfGames - 1];
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
