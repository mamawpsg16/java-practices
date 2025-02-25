package app.lambda.functional_interfaces;

class Customer {
    String name;
    boolean isActive;

    public Customer(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', active=" + isActive + "}";
    }
}
