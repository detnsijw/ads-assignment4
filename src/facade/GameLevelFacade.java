package facade;

import subsystem.AssetLoader;
import subsystem.PhysicsEngine;
import subsystem.SoundManager;
import subsystem.UIRenderer;

public class GameLevelFacade {
    private final AssetLoader assetLoader;
    private final PhysicsEngine physicsEngine;
    private final SoundManager soundManager;
    private final UIRenderer uiRenderer;

    public GameLevelFacade() {
        this.assetLoader = new AssetLoader();
        this.physicsEngine = new PhysicsEngine();
        this.soundManager = new SoundManager();
        this.uiRenderer = new UIRenderer();
    }

    public void startLevel(String levelName, String trackName) {
        System.out.println("=== INITIALIZING LEVEL: " + levelName + " ===");
        uiRenderer.showLoadingScreen();
        assetLoader.load3DModels(levelName);
        assetLoader.loadTextures();
        physicsEngine.initWorld(-9.81);
        physicsEngine.setupColliders();
        soundManager.loadSoundtrack(trackName);
        soundManager.setMasterVolume(0.8f);
        uiRenderer.hideLoadingScreen();
        uiRenderer.renderHUD();
        System.out.println("=== LEVEL " + levelName + " STARTED SUCCESSFULLY ===\n");
    }

    public void unloadLevel() {
        System.out.println("=== TEARING DOWN LEVEL ===");
        soundManager.stopAllSounds();
        physicsEngine.stopSimulation();
        assetLoader.unloadAssets();
        System.out.println("=== LEVEL UNLOADED ===\n");
    }
}
