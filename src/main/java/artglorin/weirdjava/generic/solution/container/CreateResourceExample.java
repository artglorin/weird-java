package artglorin.weirdjava.generic.solution.container;

import java.net.URI;

class CreateResourceExample {

    public static void main(String[] args) {
        var factory = new ResourceFactoryImpl();
        // tag::example[]
        FileResource fileResource = factory
                .<FileResource>createResource(
                        URI.create("file:/share/doc.txt")
                )
                .getValue();
        // end::example[]
    }

}
