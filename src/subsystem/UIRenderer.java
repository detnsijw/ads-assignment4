package subsystem;

public class UIRenderer {
    public void showLoadingScreen() {
        System.out.println("[UIRenderer] Displaying animated loading screen...");
    }

    public void hideLoadingScreen() {
        System.out.println("[UIRenderer] Hiding loading screen.");
    }

    public void renderHUD() {
        System.out.println("[UIRenderer] Rendering Player HUD, health bar, and minimap...");
    }
}
