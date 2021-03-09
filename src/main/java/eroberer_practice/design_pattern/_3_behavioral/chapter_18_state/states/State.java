package eroberer_practice.design_pattern._3_behavioral.chapter_18_state.states;

import eroberer_practice.design_pattern._3_behavioral.chapter_18_state.Player;

public abstract class State {

    protected Player player;

    protected State(Player player) {
        this.player = player;
    }

    public abstract void onLock();

    public abstract void onPlay();

    public abstract void onNext();

}
