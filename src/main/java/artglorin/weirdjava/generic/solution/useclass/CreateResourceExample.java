package artglorin.weirdjava.generic.solution.useclass;

import java.net.URI;

public class CreateResourceExample {

    public static void main(String[] args) {
        var factory = new ResourceFactoryImpl();
        // tag::example[]
        FileResource fileResource = factory
                .createResource(
                        URI.create("file:/share/doc.txt"),
                        FileResource.class
                );
        // end::example[]
    }

}
