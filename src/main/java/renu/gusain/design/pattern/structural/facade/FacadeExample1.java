package renu.gusain.design.pattern.structural.facade;

class VideoDecoder {
    public void decode(String fileName) {
        System.out.println("Decoding video: " + fileName);

    }
}

class AudioExtracotr {
    public void extract(String fileName) {
        System.out.println("Extracting audio from: " + fileName);
    }
}

class FormatEncoder {
    public void encode(String fileName, String format) {
        System.out.println("Encoding " + fileName + " to format: " + format);
    }
}
class VideoConversionFacade
{
    private final VideoDecoder decoder=new VideoDecoder();
    private final AudioExtracotr extracotr=new AudioExtracotr();
    private final FormatEncoder encoder=new FormatEncoder();
    public void convertVideo(String fileName,String format)
    {
        decoder.decode(fileName);
        extracotr.extract(fileName);
        encoder.encode(fileName,format);

    }
}

public class FacadeExample1 {
    public static void main(String[] args) {
        VideoConversionFacade convertor=new VideoConversionFacade();
        convertor.convertVideo("my_movie.mp4","avi");
    }

}
