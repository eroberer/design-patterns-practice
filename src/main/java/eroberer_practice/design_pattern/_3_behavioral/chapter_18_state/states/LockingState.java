package eroberer_practice.design_pattern._3_behavioral.chapter_18_state.states;

import eroberer_practice.design_pattern._3_behavioral.chapter_18_state.Player;

import java.util.logging.Logger;

public class LockingState extends State {

    protected LockingState(Player player) {
        super(player);
        player.setPlaying(false);
        System.out.println("Locking State");
    }

    @Override
    public void onLock() {
        player.changeState(new ReadyState(player));
    }

    @Override
    public void onPlay() {
        System.out.println("Locking...");
    }

    @Override
    public void onNext() {
        System.out.println("Locking...");
    }
}
