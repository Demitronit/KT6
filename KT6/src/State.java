public class State<T> {
    private T value;

    public State(T value) {
        this.value = value;
    }

    public static <T> State<T> of(T value) {
        return new State<>(value);
    }

    public T get() {
        return value;
    }
}
