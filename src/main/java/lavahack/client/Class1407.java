//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import javax.sound.sampled.*;
import java.io.*;
import com.kisman.cc.util.net.music.util.*;

class Class1407 extends Thread
{
    final Class1251 Field14361;
    private String Field14362 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1407(final Class1251 field14361) {
        this.Field14361 = field14361;
    }
    
    @Override
    public void run() {
        final Class1251 field14361 = this.Field14361;
        final URL value = Class1251.Method5042(this.Field14361).get(Class1251.Method5041(this.Field14361));
        InputStream openStream;
        if (value instanceof File) {
            openStream = new FileInputStream((File)value);
        }
        else {
            if (!(value instanceof URL)) {
                throw new IOException("this is impossible; how come the play list contains this kind of object? :: " + value.getClass());
            }
            openStream = value.openStream();
            this.Field14361.Field13680 = value.openStream();
        }
        final SoundStream soundStream = new SoundStream(openStream);
        final Decoder decoder = new Decoder();
        while (true) {
            final Class1251 field14362 = this.Field14361;
            if (Class1251.Method5043(this.Field14361)) {
                break;
            }
            if (Class1251.Method5044(this.Field14361)) {
                if (Class1251.Method5045(this.Field14361) != null) {
                    Class1251.Method5045(this.Field14361).flush();
                }
                Class1251.Method5046(this.Field14361, Class1251.Method5047(this.Field14361));
                this.Field14361.wait();
            }
            else {
                final Frame vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = soundStream.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV();
                if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV == null) {
                    break;
                }
                if (Class1251.Method5045(this.Field14361) == null) {
                    final AudioFormat format = new AudioFormat((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(), 16, (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Ljc0gDTN8WkwPRHY480HpEkScGALG41A() == 3) ? 1 : 2, true, false);
                    Class1251.Method5048(this.Field14361, (SourceDataLine)AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, format)));
                    Class1251.Method5045(this.Field14361).open(format);
                    Class1251.Method5045(this.Field14361).start();
                    Class1251.Method5049(this.Field14361, Class1251.Method5045(this.Field14361), Class1251.Method5046(this.Field14361, 0));
                }
                final SampleBuffer sampleBuffer = (SampleBuffer)decoder.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, soundStream);
                final short[] ljc0gDTN8WkwPRHY480HpEkScGALG41A = sampleBuffer.Ljc0gDTN8WkwPRHY480HpEkScGALG41A();
                final int n = 0;
                final int vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi = sampleBuffer.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi();
                if (Class1251.Method5050(this.Field14361) != Class1251.Method5047(this.Field14361)) {
                    if (Class1251.Method5050(this.Field14361) > Class1251.Method5047(this.Field14361)) {
                        Class1251.Method5046(this.Field14361, Class1251.Method5050(this.Field14361) - 10);
                        if (Class1251.Method5050(this.Field14361) < Class1251.Method5047(this.Field14361)) {
                            Class1251.Method5046(this.Field14361, Class1251.Method5047(this.Field14361));
                        }
                    }
                    else {
                        Class1251.Method5046(this.Field14361, Class1251.Method5050(this.Field14361) + 10);
                        if (Class1251.Method5050(this.Field14361) > Class1251.Method5047(this.Field14361)) {
                            Class1251.Method5046(this.Field14361, Class1251.Method5047(this.Field14361));
                        }
                    }
                    Class1251.Method5049(this.Field14361, Class1251.Method5045(this.Field14361), Class1251.Method5050(this.Field14361));
                }
                Class1251.Method5045(this.Field14361).write(Class1251.Method5051(this.Field14361, ljc0gDTN8WkwPRHY480HpEkScGALG41A, n, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi), 0, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi * 2);
                soundStream.Ljc0gDTN8WkwPRHY480HpEkScGALG41A();
            }
        }
        if (Class1251.Method5045(this.Field14361) != null) {
            final Class1251 field14363 = this.Field14361;
            if (!Class1251.Method5043(this.Field14361)) {
                Class1251.Method5045(this.Field14361).drain();
            }
            else {
                Class1251.Method5045(this.Field14361).flush();
            }
            Class1251.Method5045(this.Field14361).stop();
            Class1251.Method5045(this.Field14361).close();
            Class1251.Method5048(this.Field14361, (SourceDataLine)null);
        }
        soundStream.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV();
        if (openStream != null) {
            openStream.close();
        }
        final Class1251 field14364 = this.Field14361;
        final boolean b = !Class1251.Method5043(this.Field14361);
        Class1251.Method5052(this.Field14361, false);
        Class1251.Method5053(this.Field14361, true);
        Class1617.Field15567 = (!Class1251.Method5044(this.Field14361) && !Class1251.Method5043(this.Field14361));
        Class1617.Field15566 = true;
        Class1251.Method5054(this.Field14361, (Thread)null);
    }
    
    private static String Method5536(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3749 ^ 0x6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
