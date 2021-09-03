package artglorin.weirdjava.generic.solution.useinterface;

import java.net.URI;

// tag::include[]
interface ResourceFactory {

    Resource createResource(URI resource);

}
// end::include[]
