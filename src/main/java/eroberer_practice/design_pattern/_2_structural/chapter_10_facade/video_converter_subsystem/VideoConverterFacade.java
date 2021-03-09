package eroberer_practice.design_pattern._2_structural.chapter_10_facade.video_converter_subsystem;

public class VideoConverterFacade {

    public void convertVideo(String fileName, String format) {
        VideoReader reader = new VideoReader();
        Video video = reader.readVideo(fileName);

        Codec codec = new Codec();
        codec.convertCompression(video, format);
    }
}
