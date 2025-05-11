package core;

import javax.imageio.IIOException;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Sound {
    public static void playSound(String filePath) throws UnsupportedAudioFileException, IIOException, LineUnavailableException, IOException {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.setMicrosecondPosition(0);
        clip.start();
    }
}

