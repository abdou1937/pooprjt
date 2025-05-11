public class Driver {
    private String name;
    private String vehicle;
    private Preferences preferences;

    public Driver(String name, String vehicle) {
        this.name = name;
        this.vehicle = vehicle;
        this.preferences = new Preferences();  
    }

    // Getters&setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }
}
