package artglorin.weirdjava.generic.solution.useclass;

import java.net.URI;
// tag::include[]
public interface ResourceFactory {

    <T extends Resource> T createResource(URI resource, Class<T> type);

    default Resource createResource(URI resource){
        return createResource(resource,Resource.class);
    }
}
// end::include[]
