import java.util.function.Function;

public class StateMachine<T> {
    private State<T> state;

    public StateMachine(T value) {
        this.state = new State<>(value);
    }

    public <R> StateMachine<R> next(Function<State<T>, State<R>> nextState) {
        State<R> newState = nextState.apply(state);
        return new StateMachine<>(newState.get());
    }

    public T get() {
        return state.get();
    }
}
