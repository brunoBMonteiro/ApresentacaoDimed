package estrutural.facade.complex_midialibrary.factory;

import estrutural.facade.complex_midialibrary.Codec;
import estrutural.facade.complex_midialibrary.MPEG4CompressionCodec;
import estrutural.facade.complex_midialibrary.OggCompressionCodec;
import estrutural.facade.complex_midialibrary.VideoFile;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
