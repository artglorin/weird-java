package artglorin.weirdjava.generic.solution.useclass;

import java.net.URI;

class ResourceFactoryImpl implements ResourceFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T extends Resource> T createResource(URI resource, Class<T> type) {
        return (T) new FileResource();
    }
}
