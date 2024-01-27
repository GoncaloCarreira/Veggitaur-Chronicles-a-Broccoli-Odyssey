package org.gameweek.Audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class GameAudio {
    public Clip clip;
    public String filePath;

    GameAudio gameAudio;
    static AudioInputStream audioInputStream;


    public void stopSoundtrack() {
        try {
            clip.close();
            audioInputStream.close();
        } catch (IOException e) {
            System.out.println("Ooops audio");
        }
    }

    public void playSoundsOnce(String path) {
        //in static methods you can only use static variables//
        try {
            // Initialize gameAudio here or make sure it's not null



            URL url = this.getClass().getResource(path);

            if (url != null) {
                AudioInputStream ais = AudioSystem.getAudioInputStream(url);
                DataLine.Info info = new DataLine.Info(Clip.class, ais.getFormat());
                clip = (Clip) AudioSystem.getLine(info);
                clip.open(ais);
                clip.start();
                clip.loop(0);
            } else {
                System.err.println("Audio file not found: " + path);
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void playSoundtrack(String filepath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        try {
            // Initialize gameAudio here or make sure it's not null



            URL url = this.getClass().getResource(filepath);
            System.out.println(url);

            if (url != null) {
                AudioInputStream ais = AudioSystem.getAudioInputStream(url);
                DataLine.Info info = new DataLine.Info(Clip.class, ais.getFormat());
                clip = (Clip) AudioSystem.getLine(info);
                clip.open(ais);
                //clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                System.err.println("Audio file not found: " + filepath);
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}


   /* public void growl(String filepath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        try {
            // Initialize gameAudio here or make sure it's not null
            if (gameAudio == null) {
                gameAudio = new GameAudio();
            }

            URL url = this.getClass().getResource(filepath);

            if (url != null) {
                AudioInputStream ais = AudioSystem.getAudioInputStream(url);
                DataLine.Info info = new DataLine.Info(Clip.class, ais.getFormat());
                clip = (Clip) AudioSystem.getLine(info);
                clip.open(ais);
                //clip.start();
                clip.loop(0);
            } else {
                System.err.println("Audio file not found: " + filepath);
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }


    public void enemyHit() {
        //in static methods you can only use static variables//
        try {
            File musicPath = new File("GamesWeek/resources/Sounds/death.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            //clip.start();
            clip.loop(0);
        } catch (UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
            System.out.println("Exception");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

} */


