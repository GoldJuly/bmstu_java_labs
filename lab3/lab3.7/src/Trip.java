public class Trip {
        private Car car;
        private Driver driver;
        private boolean isCompleted;

        public void setCar(Car car) {
            this.car = car;
        }

        public void setDriver(Driver driver) {
            this.driver = driver;
        }

        public void setCompleted(boolean completed) {
            isCompleted = completed;
        }

        public Car getCar() {
            return car;
        }

        public Driver getDriver() {
            return driver;
        }
}
