import facade.GameLevelFacade;

public class Main {
    public static void main(String[] args) {
        GameLevelFacade levelFacade = new GameLevelFacade();
        // Start
        levelFacade.startLevel("Detroit City 2038", "Connor_theme.mp3");

        // Finish
        levelFacade.unloadLevel();
    }
}
