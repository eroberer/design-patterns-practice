package eroberer_practice.design_pattern._3_behavioral.chapter_18_state.states;

import eroberer_practice.design_pattern._3_behavioral.chapter_18_state.Player;

public class PlayingState extends State {

    protected PlayingState(Player player) {
        super(player);
        player.setPlaying(true);
        System.out.println("Playing State");
    }

    @Override
    public void onLock() {
        player.changeState(new LockingState(player));
    }

    @Override
    public void onPlay() {
        player.changeState(new ReadyState(player));
    }

    @Override
    public void onNext() {
        player.nextTrack();
    }
}
