/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kisman.cc.util.net.music.util.Decoder
 *  com.kisman.cc.util.net.music.util.Frame
 *  com.kisman.cc.util.net.music.util.SampleBuffer
 *  com.kisman.cc.util.net.music.util.SoundStream
 */
package lavahack.client;

import com.kisman.cc.util.net.music.util.Decoder;
import com.kisman.cc.util.net.music.util.Frame;
import com.kisman.cc.util.net.music.util.SampleBuffer;
import com.kisman.cc.util.net.music.util.SoundStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Line;
import javax.sound.sampled.SourceDataLine;
import lavahack.client.XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR;
import lavahack.client.paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF;

class paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF$1
extends Thread {
    final paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF Field14361;
    private String Field14362 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF$1(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2) {
        this.Field14361 = paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2;
    }

    @Override
    public void run() {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2;
        InputStream inputStream = null;
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF3 = this.Field14361;
        Object e = paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5042(this.Field14361).get(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5041(this.Field14361));
        if (e instanceof File) {
            inputStream = new FileInputStream((File)e);
        } else {
            if (!(e instanceof URL)) throw new IOException("this is impossible; how come the play list contains this kind of object? :: " + e.getClass());
            inputStream = ((URL)e).openStream();
            this.Field14361.Field13680 = ((URL)e).openStream();
        }
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF3 = new SoundStream(inputStream);
        Decoder decoder = new Decoder();
        while (true) {
            if (paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5043(this.Field14361)) {
                break;
            }
            if (paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5044(this.Field14361)) {
                if (paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361) != null) {
                    paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361).flush();
                }
                paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5046(this.Field14361, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5047(this.Field14361));
                this.Field14361.wait();
                continue;
            }
            paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 = paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF3.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV();
            if (paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 == null) break;
            if (paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361) == null) {
                int n = paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS();
                int n2 = paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Ljc0gDTN8WkwPRHY480HpEkScGALG41A() == ((int)-812662139L ^ 0xCF8FC286) ? (int)((long)587346315 ^ (long)587346314) : ((int)-1395687552L ^ 0xACCF7F81) << 1;
                AudioFormat audioFormat = new AudioFormat(n, (int)((long)-1493748285 ^ (long)-1493748286) << 4, n2, (boolean)((long)-285897388 ^ (long)-285897387), (boolean)((long)-249523142 ^ (long)-249523142));
                Line line = AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, audioFormat));
                paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5048(this.Field14361, (SourceDataLine)line);
                paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361).open(audioFormat);
                paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361).start();
                paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5049(this.Field14361, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361), paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5046(this.Field14361, (int)-196832361L ^ 0xF4449397));
            }
            SampleBuffer sampleBuffer = (SampleBuffer)decoder.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Frame)paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, (SoundStream)paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF3);
            short[] sArray = sampleBuffer.Ljc0gDTN8WkwPRHY480HpEkScGALG41A();
            int n = (int)((long)1369680536 ^ (long)1369680536);
            int n3 = sampleBuffer.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi();
            if (paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5050(this.Field14361) != paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5047(this.Field14361)) {
                if (paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5050(this.Field14361) > paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5047(this.Field14361)) {
                    paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5046(this.Field14361, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5050(this.Field14361) - ((int)((long)-1894586241 ^ (long)-1894586246) << 1));
                    if (paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5050(this.Field14361) < paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5047(this.Field14361)) {
                        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5046(this.Field14361, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5047(this.Field14361));
                    }
                } else {
                    paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5046(this.Field14361, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5050(this.Field14361) + ((int)((long)-316877007 ^ (long)-316877004) << 1));
                    if (paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5050(this.Field14361) > paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5047(this.Field14361)) {
                        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5046(this.Field14361, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5047(this.Field14361));
                    }
                }
                paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5049(this.Field14361, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361), paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5050(this.Field14361));
            }
            paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361).write(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5051(this.Field14361, sArray, n, n3), (int)((long)2130521796 ^ (long)2130521796), n3 * ((int)((long)-879316493 ^ (long)-879316494) << 1));
            paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF3.Ljc0gDTN8WkwPRHY480HpEkScGALG41A();
        }
        if (paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361) != null) {
            paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 = this.Field14361;
            if (!paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5043(this.Field14361)) {
                paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361).drain();
            } else {
                paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361).flush();
            }
            paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361).stop();
            paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5045(this.Field14361).close();
            paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5048(this.Field14361, null);
        }
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF3.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV();
        if (inputStream != null) {
            inputStream.close();
        }
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF3 = this.Field14361;
        int n = !paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5043(this.Field14361) ? (int)((long)-144534181 ^ (long)-144534182) : (int)-84973620L ^ 0xFAEF67CC;
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5052(this.Field14361, (boolean)((long)949282093 ^ (long)949282093));
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5053(this.Field14361, ((int)-2145124561L ^ 0x8023FF2E) != 0);
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Field15567 = !paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5044(this.Field14361) && !paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5043(this.Field14361) ? (int)1718374714L ^ 0x666C513B : (int)-34535340L ^ 0xFDF10854;
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Field15566 = (int)((long)1090182247 ^ (long)1090182246);
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF.Method5054(this.Field14361, null);
    }

    private static String Method5536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1127042084L ^ 0xBCD2B3DC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1238842477 ^ (long)1238842514);
            int n2 = ((int)1110536892L ^ 0x423172BF) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-223290267L ^ 0xF2B0EB2C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

