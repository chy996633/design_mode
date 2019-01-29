package design_mode.behaviour.command;

/**
 * Created by backstop-samuel on 7/4/17.
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        ((Barbecuer)receiver).bakeMutton();
    }

    @Override
    public String toString() {
        return "要一串羊肉";
    }

}
