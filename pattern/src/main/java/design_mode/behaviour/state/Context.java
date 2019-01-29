package design_mode.behaviour.state;

/**
 * Created by backstop-samuel on 7/5/17.
 */
public interface Context {

    void handle();

    State getState();

    void setState(State state);

}
