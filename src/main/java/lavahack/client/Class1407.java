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
import lavahack.client.Class1251;
import lavahack.client.Class1617;

class Class1407
extends Thread {
    final Class1251 Field14361;
    private String Field14362 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1407(Class1251 class1251) {
        this.Field14361 = class1251;
    }

    @Override
    public void run() {
        Class1251 class1251;
        InputStream inputStream = null;
        Class1251 class12512 = this.Field14361;
        Object e = Class1251.Method5042(this.Field14361).get(Class1251.Method5041(this.Field14361));
        if (e instanceof File) {
            inputStream = new FileInputStream((File)e);
        } else {
            if (!(e instanceof URL)) throw new IOException("this is impossible; how come the play list contains this kind of object? :: " + e.getClass());
            inputStream = ((URL)e).openStream();
            this.Field14361.Field13680 = ((URL)e).openStream();
        }
        class12512 = new SoundStream(inputStream);
        Decoder decoder = new Decoder();
        while (true) {
            if (Class1251.Method5043(this.Field14361)) {
                break;
            }
            if (Class1251.Method5044(this.Field14361)) {
                if (Class1251.Method5045(this.Field14361) != null) {
                    Class1251.Method5045(this.Field14361).flush();
                }
                Class1251.Method5046(this.Field14361, Class1251.Method5047(this.Field14361));
                this.Field14361.wait();
                continue;
            }
            class1251 = class12512.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV();
            if (class1251 == null) break;
            if (Class1251.Method5045(this.Field14361) == null) {
                int n = class1251.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS();
                int n2 = class1251.Ljc0gDTN8WkwPRHY480HpEkScGALG41A() == 3 ? 1 : 2;
                AudioFormat audioFormat = new AudioFormat(n, 16, n2, true, false);
                Line line = AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, audioFormat));
                Class1251.Method5048(this.Field14361, (SourceDataLine)line);
                Class1251.Method5045(this.Field14361).open(audioFormat);
                Class1251.Method5045(this.Field14361).start();
                Class1251.Method5049(this.Field14361, Class1251.Method5045(this.Field14361), Class1251.Method5046(this.Field14361, 0));
            }
            SampleBuffer sampleBuffer = (SampleBuffer)decoder.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Frame)class1251, (SoundStream)class12512);
            short[] sArray = sampleBuffer.Ljc0gDTN8WkwPRHY480HpEkScGALG41A();
            int n = 0;
            int n3 = sampleBuffer.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi();
            if (Class1251.Method5050(this.Field14361) != Class1251.Method5047(this.Field14361)) {
                if (Class1251.Method5050(this.Field14361) > Class1251.Method5047(this.Field14361)) {
                    Class1251.Method5046(this.Field14361, Class1251.Method5050(this.Field14361) - 10);
                    if (Class1251.Method5050(this.Field14361) < Class1251.Method5047(this.Field14361)) {
                        Class1251.Method5046(this.Field14361, Class1251.Method5047(this.Field14361));
                    }
                } else {
                    Class1251.Method5046(this.Field14361, Class1251.Method5050(this.Field14361) + 10);
                    if (Class1251.Method5050(this.Field14361) > Class1251.Method5047(this.Field14361)) {
                        Class1251.Method5046(this.Field14361, Class1251.Method5047(this.Field14361));
                    }
                }
                Class1251.Method5049(this.Field14361, Class1251.Method5045(this.Field14361), Class1251.Method5050(this.Field14361));
            }
            Class1251.Method5045(this.Field14361).write(Class1251.Method5051(this.Field14361, sArray, n, n3), 0, n3 * 2);
            class12512.Ljc0gDTN8WkwPRHY480HpEkScGALG41A();
        }
        if (Class1251.Method5045(this.Field14361) != null) {
            class1251 = this.Field14361;
            if (!Class1251.Method5043(this.Field14361)) {
                Class1251.Method5045(this.Field14361).drain();
            } else {
                Class1251.Method5045(this.Field14361).flush();
            }
            Class1251.Method5045(this.Field14361).stop();
            Class1251.Method5045(this.Field14361).close();
            Class1251.Method5048(this.Field14361, null);
        }
        class12512.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV();
        if (inputStream != null) {
            inputStream.close();
        }
        class12512 = this.Field14361;
        boolean bl = !Class1251.Method5043(this.Field14361);
        Class1251.Method5052(this.Field14361, false);
        Class1251.Method5053(this.Field14361, true);
        Class1617.Field15567 = !Class1251.Method5044(this.Field14361) && !Class1251.Method5043(this.Field14361);
        Class1617.Field15566 = true;
        Class1251.Method5054(this.Field14361, null);
    }

    private static String Method5536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 6;
            cArray2[n] = (char)(cArray[n] ^ (0x3749 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

