package eroberer_practice.design_pattern._2_structural.chapter_10_facade.video_converter_subsystem;

public class Codec {

    public void convertCompression(Video video, String format) {
        System.out.println(video.getFileName() + " is converting to " + format);
    }
}
