package artglorin.weirdjava.generic.solution.container;

import java.net.URI;

interface ResourceFactory {

    // tag::include[]
    <T extends Resource> Container<T> createResource(URI resource);
// end::include[]

}
