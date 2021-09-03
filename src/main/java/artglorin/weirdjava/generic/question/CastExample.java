package artglorin.weirdjava.generic.question;

import java.net.URI;

public final class CastExample {
    private final ResourceFactory factory = new ResourceFactoryImpl();

    // tag::string[]
    void stringConsumer(String string) {}

    void callStringConsumer() {
        stringConsumer(factory.createResource(URI.create("file:/share/doc.txt")));
        // stringConsumer((String) factory.createResource(URI.create("file:/share/doc.txt")));
        // ^^^^ Inconvertible types; cannot cast 'Resource' to 'java.lang.String'
    }
    // end::string[]

    // tag::exception[]
    void exceptionConsumer(RuntimeException exception) {}

    void callExceptionConsumer() {
        exceptionConsumer(factory.createResource(URI.create("file:/share/doc.txt")));
        exceptionConsumer((RuntimeException)factory.createResource(URI.create("file:/share/doc.txt")));
    }
    // end::exception[]


    public static void main(String[] args) {

    }
}
