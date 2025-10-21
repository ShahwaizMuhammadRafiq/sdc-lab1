
public class package2 {
	   
    public DeliveryDrone(String model) {
        super(model, DroneCategory.DELIVERY);
    }
    
    @Override
    public double getMaxPayload() {
        return 5.0; // 5 kg for packages
    }
    
    @Override
    public double getMaxRange() {
        return 10.0; // 10 km range
    }
    
    @Override
    public String getSpecialFeatures() {
        return "Package Compartment, Drop Mechanism, Weather Resistant";
    }
}

/**
 * Heavy Drone implementation (package-private for factory use)
 */
class HeavyDrone extends Drone {
    
    public HeavyDrone(String model) {
        super(model, DroneCategory.HEAVY);
    }
    
    @Override
    public double getMaxPayload() {
        return 20.0; // 20 kg for heavy items
    }
    
    @Override
    public double getMaxRange() {
        return 5.0; // 5 km range due to heavy payload
    }
    
    @Override
    public String getSpecialFeatures() {
        return "Heavy Lift Capability, Reinforced Frame, Dual Battery System";
    }
}
}

}
