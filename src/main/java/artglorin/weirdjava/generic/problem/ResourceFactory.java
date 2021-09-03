package artglorin.weirdjava.generic.problem;

import java.net.URI;

// tag::include[]
interface ResourceFactory {

    <T extends Resource> T createResource(URI resource);

}
// end::include[]
