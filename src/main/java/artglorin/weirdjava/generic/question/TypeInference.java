package artglorin.weirdjava.generic.question;

import java.net.URI;

class TypeInference {

    public static void main(String[] args) {
        var factory = new ResourceFactoryImpl();
        // tag::example[]
        var fileResource = factory
                .createResource(
                        URI.create("file:/share/doc.txt")
                );
        // end::example[]
    }

}
