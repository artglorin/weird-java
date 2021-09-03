package artglorin.weirdjava.generic.question;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

class ResourceFactoryImpl implements ResourceFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T extends Resource> T createResource(URI resource) {
        return (T) new FileResource();
    }

}
