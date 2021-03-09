package eroberer_practice.design_pattern._3_behavioral.chapter_18_state;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String> tracks = new ArrayList<>();
        tracks.add("Track " + tracks.size());
        tracks.add("Track " + tracks.size());
        tracks.add("Track " + tracks.size());

        Player player = new Player(tracks);
        player.getState().onPlay();

        for (int i = 0; i < tracks.size() + 2; i++) {
            player.start();
            player.getState().onNext();
        }

        player.getState().onPlay();
        player.getState().onNext();
    }
}
