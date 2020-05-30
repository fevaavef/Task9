package moxy.viewstate.strategy;

import java.util.List;
import moxy.MvpView;
import moxy.viewstate.ViewCommand;

/**
 * Command will be saved in the commands queue, but will be removed after its first execution.
 */

public class OneExecutionStateStrategy implements StateStrategy {

    @Override
    public <View extends MvpView> void beforeApply(final List<ViewCommand<View>> currentState,
        final ViewCommand<View> incomingCommand) {
        currentState.add(incomingCommand);
    }

    @Override
    public <View extends MvpView> void afterApply(final List<ViewCommand<View>> currentState,
        final ViewCommand<View> incomingCommand) {
        currentState.remove(incomingCommand);
    }
}
