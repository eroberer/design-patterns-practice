package eroberer_practice.design_pattern._2_structural.chapter_10_facade;

import eroberer_practice.design_pattern._2_structural.chapter_10_facade.video_converter_subsystem.VideoConverterFacade;

public class Application {

    public static void main(String[] args) {
        VideoConverterFacade videoConverterFacade = new VideoConverterFacade();
        videoConverterFacade.convertVideo("/user/temp.ogg", "MP4");
    }
}
