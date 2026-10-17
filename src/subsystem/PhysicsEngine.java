package subsystem;

public class PhysicsEngine {
    public void initWorld(double gravity) {
        System.out.println("[PhysicsEngine] Initializing Havok physics world with gravity " + gravity + " m/s²...");
    }

    public void setupColliders() {
        System.out.println("[PhysicsEngine] Generating static and dynamic mesh colliders...");
    }

    public void stopSimulation() {
        System.out.println("[PhysicsEngine] Halting physical simulation...");
    }
}
