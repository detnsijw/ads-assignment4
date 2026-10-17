package subsystem;

public class SoundManager {
    public void loadSoundtrack(String trackName) {
        System.out.println("[SoundManager] Streaming soundtrack: " + trackName);
    }

    public void setMasterVolume(float volume) {
        System.out.println("[SoundManager] Master volume set to " + (volume * 100) + "%");
    }

    public void stopAllSounds() {
        System.out.println("[SoundManager] Fading out all active audio channels...");
    }
}
