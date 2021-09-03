package artglorin.weirdjava.generic.solution.container;

import java.net.URI;

class ResourceFactoryImpl implements ResourceFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T extends Resource> Container<T> createResource(URI resource) {
        return new Container<>((T) new FileResource());
    }
}
