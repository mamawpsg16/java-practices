package app.exceptions;

public class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Suppressed Exception: Error while closing resource");
    }
}