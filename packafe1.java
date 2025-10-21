
public class packafe1 {
	    public static Drone createDrone(Drone.DroneCategory category, String model) {
	        if (model == null || model.trim().isEmpty()) {
	            throw new IllegalArgumentException("Model name cannot be null or empty");
	        }
	        
	        switch (category) {
	            case SURVEILLANCE:
	                return new SurveillanceDrone(model);
	            case DELIVERY:
	                return new DeliveryDrone(model);
	            case HEAVY:
	                return new HeavyDrone(model);
	            default:
	                throw new IllegalArgumentException("Unknown drone category: " + category);
	        }
	    }
	    
	    /**
	     * Creates a drone with default specifications for the given category
	     * @param category The category of drone to create
	     * @return A new drone instance with default model name
	     */
	    public static Drone createDefaultDrone(Drone.DroneCategory category) {
	        String defaultModel = getDefaultModelName(category);
	        return createDrone(category, defaultModel);
	    }
	    
	    /**
	     * Gets the default model name for a drone category
	     * @param category The drone category
	     * @return Default model name
	     */
	    private static String getDefaultModelName(Drone.DroneCategory category) {
	        switch (category) {
	            case SURVEILLANCE:
	                return "Surveillance Pro X1";
	            case DELIVERY:
	                return "Delivery Express 2.0";
	            case HEAVY:
	                return "Heavy Lifter Max";
	            default:
	                return "Generic Drone";
	        }
	    }
	}

	/**
	 * Delivery Drone implementation (package-private for factory use)
	 */
	class DeliveryDrone extends Drone {
	    
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
