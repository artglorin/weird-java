package artglorin.weirdjava.generic.problem;

import java.net.URI;

class ResourceFactoryImpl implements ResourceFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T extends Resource> T createResource(URI resource) {
        return (T) new FileResource();
    }
}
