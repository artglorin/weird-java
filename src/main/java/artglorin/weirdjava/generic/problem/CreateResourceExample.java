package artglorin.weirdjava.generic.problem;

import java.net.URI;

class CreateResourceExample {

    public static void main(String[] args) {
        var factory = new ResourceFactoryImpl();
        // tag::example[]
        FileResource fileResource = factory
                .createResource(
                        URI.create("file:/share/doc.txt")
                );
        // end::example[]
    }

}
