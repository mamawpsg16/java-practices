package app.exceptions;

class MyAutoCloseable implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource closed automatically.");
    }
}