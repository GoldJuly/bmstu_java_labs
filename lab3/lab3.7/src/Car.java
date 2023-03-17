class Car {
    private String model;
    private boolean isAssigned;
    private String condition;

    public Car(String model) {
        this.model = model;
        this.isAssigned = false;
        this.condition = "Good";
    }

    public void setAssigned(boolean assigned) {
        this.isAssigned = assigned;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}

