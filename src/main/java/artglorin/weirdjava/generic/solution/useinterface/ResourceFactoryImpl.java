package artglorin.weirdjava.generic.solution.useinterface;

import java.net.URI;

class ResourceFactoryImpl implements ResourceFactory {
    @SuppressWarnings("unchecked")
    @Override
    public Resource createResource(URI resource) {
        return new FileResource();
    }
}
