package eroberer_practice.design_pattern._2_structural.chapter_10_facade.video_converter_subsystem;

public class VideoReader {

    public Video readVideo(String fileName) {
        return new Video(fileName);
    }
}
