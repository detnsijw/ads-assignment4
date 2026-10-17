package subsystem;

public class AssetLoader {
    public void load3DModels(String levelName) {
        System.out.println("[AssetLoader] Loading 3D models and meshes for " + levelName + "...");
    }

    public void loadTextures() {
        System.out.println("[AssetLoader] Baking lighting and loading 4K textures...");
    }

    public void unloadAssets() {
        System.out.println("[AssetLoader] Clearing RAM and VRAM assets...");
    }
}
