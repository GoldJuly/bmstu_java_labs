
class Driver {
    private String name;
    private boolean isAssigned;
    private boolean needsRepair;

    public Driver(String name) {
        this.name = name;
        this.isAssigned = false;
        this.needsRepair = false;
    }

    public void makeRepairRequest() {
        this.needsRepair = true;
    }

    public void makeTripReport(Trip trip, String carCondition) {
        trip.setCompleted(true);
        trip.getCar().setCondition(carCondition);
    }

    public void setAssigned(boolean assigned) {
        this.isAssigned = assigned;
    }

    public boolean isAssigned() {
        return isAssigned;
    }
}
