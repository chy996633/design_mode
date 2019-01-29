package design_mode.behaviour.visitor;

/**
 * Created by backstop-samuel on 5/11/17.
 */
public class Summer implements Season {
    @Override
    public void accept(SeasonVisitor seasonVisitor) {
        seasonVisitor.visitSummer(this);
    }
}
