package artglorin.weirdjava.generic.solution.container;

// tag::include[]
class Container <T> {

    private final T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
// end::include[]
