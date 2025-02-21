package app.class_example;

public record ProductRecordImmutable (String name, double price) {

    /* COMPACT CONSTRUCTOR  - JAVA ASSIGN FIELDS AUTOMATICALLY */
//    public ProductRecordImmutable {
//        if (price <= 0) throw new IllegalArgumentException("Price cannot be negative!");
//    }

    /* CANONICAL CONSTRUCTOR - MANUALLY ASSIGNING FIELDS */
//    public ProductRecordImmutable{
//        if (price <= 0) throw new IllegalArgumentException("Price cannot be negative!");
////        this.name = name;
////        this.price = price;
//    }
    // Overloading a Constructor
    public ProductRecordImmutable(String name) {
        this(name, 3000); // Correct delegation
    }


}
