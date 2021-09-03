package artglorin.weirdjava.generic.solution.useclasses;


import java.net.URI;

// tag::include[]
interface ResourceFactory {

    <T extends Resource> T createResource(URI resource);

}
// end::include[]
