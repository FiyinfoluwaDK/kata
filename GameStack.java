
public class GameStack {

    private String[] games;
    private int numberOfGames;

    public GameStack(int GameLibraryStark) {
        games = new String[GameLibraryStark];
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
            System.out.println("Stack is full");
            return;
        }

        games[numberOfGames] = game;
        numberOfGames++;
    }

  
    public String pop() {
        if (isEmpty()) {
            return null;
        }

        numberOfGames--;
        String game = games[numberOfGames];
        games[numberOfGames] = null;

        return game;
    }

   
    public String peek() {
        if (isEmpty()) {
            return null;
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
