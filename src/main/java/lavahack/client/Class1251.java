/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import lavahack.client.Class1083;
import lavahack.client.Class1407;
import lavahack.client.Class1617;

public class Class1251 {
    private static final long Field13666 = 1L;
    private static final Random Field13667 = new Random();
    private List Field13668 = new ArrayList();
    private transient boolean Field13669 = false;
    private transient boolean Field13670 = true;
    private transient int Field13671 = 50;
    private transient boolean Field13672 = false;
    private transient boolean Field13673 = true;
    private transient Thread Field13674 = null;
    private transient int Field13675 = 0;
    private transient SourceDataLine Field13676 = null;
    private transient int Field13677 = 0;
    public static URL Field13678;
    public static String Field13679;
    public InputStream Field13680;
    private String Field13681 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1251() {
        this.Method5017();
    }

    public Class1251(File file) {
        this.Method5019(file);
        this.Method5017();
    }

    public Class1251(File ... fileArray) {
        File[] fileArray2 = fileArray;
        int n = fileArray2.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.Method5017();
                return;
            }
            File file = fileArray2[n2];
            this.Method5019(file);
            ++n2;
        }
    }

    public Class1251(URL uRL) {
        this.Method5020(uRL);
        Field13678 = uRL;
        this.Method5017();
    }

    public Class1251(URL ... uRLArray) {
        URL[] uRLArray2 = uRLArray;
        int n = uRLArray2.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.Method5017();
                return;
            }
            URL uRL = uRLArray2[n2];
            this.Method5020(uRL);
            ++n2;
        }
    }

    private void Method5017() {
        new Class1083().Method4375(this);
    }

    public Class1251 Method5018(File file, boolean bl) {
        File[] fileArray;
        if (file.isFile()) {
            if (!file.getName().endsWith(".cla")) return this;
            Class1251 class1251 = this;
            this.Field13668.add(file);
            return this;
        }
        if (!file.isDirectory()) throw new IllegalArgumentException("WTF is this? ( " + file + " )");
        File[] fileArray2 = fileArray = file.listFiles();
        int n = fileArray2.length;
        int n2 = 0;
        while (n2 < n) {
            File file2 = fileArray2[n2];
            if (file2.isFile() || bl) {
                this.Method5018(file2, bl);
            }
            ++n2;
        }
        return this;
    }

    public Class1251 Method5019(File file) {
        this.Method5018(file, true);
        return this;
    }

    public Class1251 Method5020(URL uRL) {
        Class1251 class1251 = this;
        this.Field13668.add(uRL);
        return this;
    }

    public void Method5021() {
        Class1251 class1251 = this;
        if (this.Field13669) {
            this.Field13669 = false;
            Class1617.Field15567 = !this.Field13669 && !this.Field13670;
            this.notifyAll();
            return;
        }
        this.Method5025();
        if (this.Field13668.size() == 0) {
            return;
        }
        class1251 = this;
        this.Field13670 = false;
        Class1617.Field15566 = false;
        Class1617.Field15567 = !this.Field13669 && !this.Field13670;
        if (this.Field13674 != null) return;
        this.Field13674 = new Class1407(this);
        this.Field13674.start();
    }

    public boolean Method5022() {
        Class1251 class1251 = this;
        if (this.Field13669) return false;
        if (this.Field13670) return false;
        return true;
    }

    public void Method5023() {
        if (!this.Method5022()) {
            return;
        }
        Class1251 class1251 = this;
        this.Field13669 = true;
        Class1617.Field15567 = !this.Field13669 && !this.Field13670;
        this.notifyAll();
    }

    public boolean Method5024() {
        Class1251 class1251 = this;
        return this.Field13669;
    }

    public void Method5025() {
        Class1251 class1251 = this;
        this.Field13669 = false;
        this.Field13670 = true;
        Class1617.Field15566 = true;
        Class1617.Field15567 = !this.Field13669 && !this.Field13670;
        this.notifyAll();
        if (this.Field13674 == null) return;
        this.Field13674.join();
    }

    public boolean Method5026() {
        Class1251 class1251 = this;
        return this.Field13670;
    }

    public void Method5027() {
        this.Method5029(1);
    }

    public void Method5028() {
        this.Method5029(-1);
    }

    private void Method5029(int n) {
        if (this.Field13668.size() == 0) {
            return;
        }
        boolean bl = this.Method5022();
        if (this.Field13672) {
            this.Field13675 = Field13667.nextInt(this.Field13668.size());
        } else {
            this.Field13675 += n;
            if (this.Field13675 > this.Field13668.size() - 1) {
                if (this.Field13673) {
                    this.Field13675 = 0;
                } else {
                    this.Field13675 = this.Field13668.size() - 1;
                    bl = false;
                }
            } else if (this.Field13675 < 0) {
                if (this.Field13673) {
                    this.Field13675 = this.Field13668.size() - 1;
                } else {
                    this.Field13675 = 0;
                    bl = false;
                }
            }
        }
        this.Method5025();
        if (!bl) return;
        this.Method5021();
    }

    public Class1251 Method5030(int n) {
        if (n < 0) throw new IllegalArgumentException("Wrong value for volume, must be in interval [0..100].");
        if (n > 100) {
            throw new IllegalArgumentException("Wrong value for volume, must be in interval [0..100].");
        }
        this.Field13671 = n;
        return this;
    }

    public int Method5031() {
        return this.Field13671;
    }

    public Class1251 Method5032(boolean bl) {
        this.Field13672 = bl;
        return this;
    }

    public boolean Method5033() {
        return this.Field13672;
    }

    public Class1251 Method5034(boolean bl) {
        this.Field13673 = bl;
        return this;
    }

    public boolean Method5035() {
        return this.Field13673;
    }

    private void Method5036(SourceDataLine sourceDataLine, int n) {
        FloatControl floatControl = (FloatControl)sourceDataLine.getControl(FloatControl.Type.MASTER_GAIN);
        BooleanControl booleanControl = (BooleanControl)sourceDataLine.getControl(BooleanControl.Type.MUTE);
        if (n == 0) {
            booleanControl.setValue(true);
            return;
        }
        booleanControl.setValue(false);
        floatControl.setValue((float)(Math.log((double)n / Double.longBitsToDouble(4636737291354636288L)) / Math.log(Double.longBitsToDouble((long)1428449121 ^ 0x4024000055246761L)) * Double.longBitsToDouble(0x4034000000000000L)));
    }

    public int Method5037() {
        int n = 0;
        if (this.Field13676 == null) return n;
        return (int)(this.Field13676.getMicrosecondPosition() / 1000L);
    }

    public void Method5038() throws UnsupportedAudioFileException, IOException {
        if (this.Field13676.getFramePosition() <= 0) return;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.Field13680);
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bufferedInputStream);
        AudioFormat audioFormat = audioInputStream.getFormat();
        long l = audioInputStream.getFrameLength();
        Field13679 = String.valueOf(((double)l + 0.0) / (double)audioFormat.getFrameRate());
    }

    private byte[] Method5039(short[] sArray, int n, int n2) {
        byte[] byArray = new byte[n2 * 2];
        int n3 = 0;
        while (n2-- > 0) {
            short s = sArray[n++];
            byArray[n3++] = (byte)s;
            byArray[n3++] = (byte)(s >>> 8);
        }
        return byArray;
    }

    private void Method5040(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    static int Method5041(Class1251 class1251) {
        return class1251.Field13675;
    }

    static List Method5042(Class1251 class1251) {
        return class1251.Field13668;
    }

    static boolean Method5043(Class1251 class1251) {
        return class1251.Field13670;
    }

    static boolean Method5044(Class1251 class1251) {
        return class1251.Field13669;
    }

    static SourceDataLine Method5045(Class1251 class1251) {
        return class1251.Field13676;
    }

    static int Method5046(Class1251 class1251, int n) {
        class1251.Field13677 = n;
        return class1251.Field13677;
    }

    static int Method5047(Class1251 class1251) {
        return class1251.Field13671;
    }

    static SourceDataLine Method5048(Class1251 class1251, SourceDataLine sourceDataLine) {
        class1251.Field13676 = sourceDataLine;
        return class1251.Field13676;
    }

    static void Method5049(Class1251 class1251, SourceDataLine sourceDataLine, int n) {
        class1251.Method5036(sourceDataLine, n);
    }

    static int Method5050(Class1251 class1251) {
        return class1251.Field13677;
    }

    static byte[] Method5051(Class1251 class1251, short[] sArray, int n, int n2) {
        return class1251.Method5039(sArray, n, n2);
    }

    static boolean Method5052(Class1251 class1251, boolean bl) {
        class1251.Field13669 = bl;
        return class1251.Field13669;
    }

    static boolean Method5053(Class1251 class1251, boolean bl) {
        class1251.Field13670 = bl;
        return class1251.Field13670;
    }

    static Thread Method5054(Class1251 class1251, Thread thread) {
        class1251.Field13674 = thread;
        return class1251.Field13674;
    }

    static {
        Field13679 = "0:00";
    }

    private static String Method5055(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 17;
            cArray2[n] = (char)(cArray[n] ^ (0x1757 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

