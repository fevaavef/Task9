package moxy.viewstate.strategy;

import java.util.List;
import moxy.MvpView;
import moxy.viewstate.ViewCommand;

/**
 * This strategy will clear current commands queue and then the given command will be put in.
 * <p>
 * Caution! Be sure that you fully set view to initial state inside this command.
 */
public class SingleStateStrategy implements StateStrategy {

    @Override
    public <View extends MvpView> void beforeApply(final List<ViewCommand<View>> currentState,
        final ViewCommand<View> incomingCommand) {
        currentState.clear();
        currentState.add(incomingCommand);
    }

    @Override
    public <View extends MvpView> void afterApply(final List<ViewCommand<View>> currentState,
        final ViewCommand<View> incomingCommand) {
        // pass
    }
}
