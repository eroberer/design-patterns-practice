package eroberer_practice.design_pattern._2_structural.chapter_10_facade.video_converter_subsystem;

public class Video {

    private String fileName;

    public Video(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
