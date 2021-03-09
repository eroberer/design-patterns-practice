package eroberer_practice.design_pattern._3_behavioral.chapter_18_state.states;

import eroberer_practice.design_pattern._3_behavioral.chapter_18_state.Player;

public class ReadyState extends State {

    public ReadyState(Player player) {
        super(player);
        player.setPlaying(false);
        System.out.println("Ready State");
    }

    @Override
    public void onLock() {
        player.changeState(new LockingState(player));
    }

    @Override
    public void onPlay() {
        player.changeState(new PlayingState(player));
    }

    @Override
    public void onNext() {
        System.out.println("Locking");
    }
}
