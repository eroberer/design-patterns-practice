package eroberer_practice.design_pattern._3_behavioral.chapter_18_state;

import eroberer_practice.design_pattern._3_behavioral.chapter_18_state.states.ReadyState;
import eroberer_practice.design_pattern._3_behavioral.chapter_18_state.states.State;

import java.util.List;

public class Player {

    private State state;
    private boolean isPlaying;
    private List<String> tracks;
    private int currentTrack;

    public Player(List<String> tracks) {
        this.tracks = tracks;
        this.state = new ReadyState(this);
        this.currentTrack = 0;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public void start() {
        System.out.println(tracks.get(currentTrack));
    }

    public void nextTrack() {
        this.currentTrack = (this.currentTrack + 1) % tracks.size();
    }
}
