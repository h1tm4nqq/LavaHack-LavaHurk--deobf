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
import lavahack.client.XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb;
import lavahack.client.paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF$1;

public class paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF {
    private static final long Field13666 = 1L;
    private static final Random Field13667 = new Random();
    private List Field13668 = new ArrayList();
    private transient boolean Field13669;
    private transient boolean Field13670;
    private transient int Field13671;
    private transient boolean Field13672;
    private transient boolean Field13673;
    private transient Thread Field13674;
    private transient int Field13675;
    private transient SourceDataLine Field13676;
    private transient int Field13677;
    public static URL Field13678;
    public static String Field13679;
    public InputStream Field13680;
    private String Field13681 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF() {
        this.Field13669 = (int)((long)1352458028 ^ (long)1352458028);
        this.Field13670 = (int)((long)-1736291506 ^ (long)-1736291505);
        this.Field13671 = ((int)580103967L ^ 0x2293AF06) << 1;
        this.Field13672 = (int)((long)2085343925 ^ (long)2085343925);
        this.Field13673 = (int)((long)1208729678 ^ (long)1208729679);
        this.Field13674 = null;
        this.Field13675 = (int)-261459631L ^ 0xF06A7151;
        this.Field13676 = null;
        this.Field13677 = (int)1367455611L ^ 0x5181B77B;
        this.Method5017();
    }

    public paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF(File file) {
        this.Field13669 = (int)((long)2118268241 ^ (long)2118268241);
        this.Field13670 = (int)966264901L ^ 0x39980844;
        this.Field13671 = (int)((long)-716530754 ^ (long)-716530777) << 1;
        this.Field13672 = (int)((long)-1583174444 ^ (long)-1583174444);
        this.Field13673 = (int)1669463459L ^ 0x6381FDA2;
        this.Field13674 = null;
        this.Field13675 = (int)((long)-534092744 ^ (long)-534092744);
        this.Field13676 = null;
        this.Field13677 = (int)((long)-1157637512 ^ (long)-1157637512);
        this.Method5019(file);
        this.Method5017();
    }

    public paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF(File ... fileArray) {
        this.Field13669 = (int)((long)-421357202 ^ (long)-421357202);
        this.Field13670 = (int)1436865822L ^ 0x55A4D51F;
        this.Field13671 = ((int)-1249293671L ^ 0xB5894A80) << 1;
        this.Field13672 = (int)((long)1877878456 ^ (long)1877878456);
        this.Field13673 = (int)((long)-1295417732 ^ (long)-1295417731);
        this.Field13674 = null;
        this.Field13675 = (int)((long)-1807756642 ^ (long)-1807756642);
        this.Field13676 = null;
        this.Field13677 = (int)-1036500332L ^ 0xC2384294;
        File[] fileArray2 = fileArray;
        int n = fileArray2.length;
        int n2 = (int)((long)1304593468 ^ (long)1304593468);
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

    public paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF(URL uRL) {
        this.Field13669 = (int)((long)1084812151 ^ (long)1084812151);
        this.Field13670 = (int)-415840874L ^ 0xE736C597;
        this.Field13671 = ((int)112616324L ^ 0x6B6639D) << 1;
        this.Field13672 = (int)1645968114L ^ 0x621B7AF2;
        this.Field13673 = (int)-1802295747L ^ 0x9493263C;
        this.Field13674 = null;
        this.Field13675 = (int)-1376597336L ^ 0xADF2CAA8;
        this.Field13676 = null;
        this.Field13677 = (int)((long)856330975 ^ (long)856330975);
        this.Method5020(uRL);
        Field13678 = uRL;
        this.Method5017();
    }

    public paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF(URL ... uRLArray) {
        this.Field13669 = (int)1061012642L ^ 0x3F3DC4A2;
        this.Field13670 = (int)-840873516L ^ 0xCDE149D5;
        this.Field13671 = ((int)1334674937L ^ 0x4F8D85E0) << 1;
        this.Field13672 = (int)-915666292L ^ 0xC96C0A8C;
        this.Field13673 = (int)((long)824026622 ^ (long)824026623);
        this.Field13674 = null;
        this.Field13675 = (int)1409842028L ^ 0x54087B6C;
        this.Field13676 = null;
        this.Field13677 = (int)((long)1599934557 ^ (long)1599934557);
        URL[] uRLArray2 = uRLArray;
        int n = uRLArray2.length;
        int n2 = (int)-779148039L ^ 0xD18F24F9;
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
        new fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb().Method4375(this);
    }

    public paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF Method5018(File file, boolean bl) {
        File[] fileArray;
        if (file.isFile()) {
            if (!file.getName().endsWith(".cla")) return this;
            paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 = this;
            this.Field13668.add(file);
            return this;
        }
        if (!file.isDirectory()) throw new IllegalArgumentException("WTF is this? ( " + file + " )");
        File[] fileArray2 = fileArray = file.listFiles();
        int n = fileArray2.length;
        int n2 = (int)-1963523130L ^ 0x8AF703C6;
        while (n2 < n) {
            File file2 = fileArray2[n2];
            if (file2.isFile() || bl) {
                this.Method5018(file2, bl);
            }
            ++n2;
        }
        return this;
    }

    public paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF Method5019(File file) {
        this.Method5018(file, ((int)-653676008L ^ 0xD909B219) != 0);
        return this;
    }

    public paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF Method5020(URL uRL) {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 = this;
        this.Field13668.add(uRL);
        return this;
    }

    public void Method5021() {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 = this;
        if (this.Field13669) {
            this.Field13669 = (int)((long)1291290236 ^ (long)1291290236);
            XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Field15567 = !this.Field13669 && !this.Field13670 ? (int)-1750826152L ^ 0x97A48359 : (int)((long)383006806 ^ (long)383006806);
            this.notifyAll();
            return;
        }
        this.Method5025();
        if (this.Field13668.size() == 0) {
            return;
        }
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 = this;
        this.Field13670 = (int)((long)2127271570 ^ (long)2127271570);
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Field15566 = (int)((long)1351956617 ^ (long)1351956617);
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Field15567 = !this.Field13669 && !this.Field13670 ? (int)((long)137933003 ^ (long)137933002) : (int)((long)-1479071214 ^ (long)-1479071214);
        if (this.Field13674 != null) return;
        this.Field13674 = new paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF$1(this);
        this.Field13674.start();
    }

    public boolean Method5022() {
        boolean bl;
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 = this;
        if (!this.Field13669 && !this.Field13670) {
            bl = (int)1437271506L ^ 0x55AB05D3;
            return bl;
        }
        bl = (int)-1364559195L ^ 0xAEAA7AA5;
        return bl;
    }

    public void Method5023() {
        if (!this.Method5022()) {
            return;
        }
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 = this;
        this.Field13669 = (int)((long)1662469756 ^ (long)1662469757);
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Field15567 = !this.Field13669 && !this.Field13670 ? (int)-1202617281L ^ 0xB851843E : (int)((long)1943471263 ^ (long)1943471263);
        this.notifyAll();
    }

    public boolean Method5024() {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 = this;
        return this.Field13669;
    }

    public void Method5025() {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 = this;
        this.Field13669 = (int)((long)375367401 ^ (long)375367401);
        this.Field13670 = (int)-730422740L ^ 0xD476A22D;
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Field15566 = (int)((long)1172345810 ^ (long)1172345811);
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Field15567 = !this.Field13669 && !this.Field13670 ? (int)-2052667838L ^ 0x85A6C643 : (int)((long)-594360689 ^ (long)-594360689);
        this.notifyAll();
        if (this.Field13674 == null) return;
        this.Field13674.join();
    }

    public boolean Method5026() {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2 = this;
        return this.Field13670;
    }

    public void Method5027() {
        this.Method5029((int)((long)-752956285 ^ (long)-752956286));
    }

    public void Method5028() {
        this.Method5029((int)((long)-1410910486 ^ (long)1410910485));
    }

    private void Method5029(int n) {
        if (this.Field13668.size() == 0) {
            return;
        }
        int n2 = this.Method5022();
        if (this.Field13672) {
            this.Field13675 = Field13667.nextInt(this.Field13668.size());
        } else {
            this.Field13675 += n;
            if (this.Field13675 > this.Field13668.size() - ((int)2099177742L ^ 0x7D1EE90F)) {
                if (this.Field13673) {
                    this.Field13675 = (int)((long)523467593 ^ (long)523467593);
                } else {
                    this.Field13675 = this.Field13668.size() - ((int)1551955283L ^ 0x5C80F552);
                    n2 = (int)((long)1296791778 ^ (long)1296791778);
                }
            } else if (this.Field13675 < 0) {
                if (this.Field13673) {
                    this.Field13675 = this.Field13668.size() - (int)((long)984421117 ^ (long)984421116);
                } else {
                    this.Field13675 = (int)-1987044172L ^ 0x89901CB4;
                    n2 = (int)((long)1530484263 ^ (long)1530484263);
                }
            }
        }
        this.Method5025();
        if (n2 == 0) return;
        this.Method5021();
    }

    public paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF Method5030(int n) {
        if (n < 0) throw new IllegalArgumentException("Wrong value for volume, must be in interval [0..100].");
        if (n > (int)((long)-986039758 ^ (long)-986039765) << 2) {
            throw new IllegalArgumentException("Wrong value for volume, must be in interval [0..100].");
        }
        this.Field13671 = n;
        return this;
    }

    public int Method5031() {
        return this.Field13671;
    }

    public paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF Method5032(boolean bl) {
        this.Field13672 = bl;
        return this;
    }

    public boolean Method5033() {
        return this.Field13672;
    }

    public paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF Method5034(boolean bl) {
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
            booleanControl.setValue((boolean)((long)1358584359 ^ (long)1358584358));
            return;
        }
        booleanControl.setValue((boolean)((long)1134185450 ^ (long)1134185450));
        floatControl.setValue((float)(Math.log((double)n / Double.longBitsToDouble(0x94C6C6378FD1372AL ^ 0xD49FC6378FD1372AL)) / Math.log(Double.longBitsToDouble((long)1428449121 ^ 0x4024000055246761L)) * Double.longBitsToDouble(0xC17AF29F78D72700L ^ 0x814EF29F78D72700L)));
    }

    public int Method5037() {
        int n = (int)((long)-865927803 ^ (long)-865927803);
        if (this.Field13676 == null) return n;
        return (int)(this.Field13676.getMicrosecondPosition() / (0x94A17E8L & 0x9023E8L));
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
        byte[] byArray = new byte[n2 * (((int)-1711968467L ^ 0x99F56F2C) << 1)];
        int n3 = (int)602200460L ^ 0x23E4D98C;
        while (n2-- > 0) {
            short s = sArray[n++];
            byArray[n3++] = (byte)s;
            byArray[n3++] = (byte)(s >>> (((int)-1114802782L ^ 0xBD8D75A3) << 3));
        }
        return byArray;
    }

    private void Method5040(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    static int Method5041(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2) {
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13675;
    }

    static List Method5042(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2) {
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13668;
    }

    static boolean Method5043(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2) {
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13670;
    }

    static boolean Method5044(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2) {
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13669;
    }

    static SourceDataLine Method5045(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2) {
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13676;
    }

    static int Method5046(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, int n) {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13677 = n;
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13677;
    }

    static int Method5047(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2) {
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13671;
    }

    static SourceDataLine Method5048(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, SourceDataLine sourceDataLine) {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13676 = sourceDataLine;
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13676;
    }

    static void Method5049(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, SourceDataLine sourceDataLine, int n) {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Method5036(sourceDataLine, n);
    }

    static int Method5050(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2) {
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13677;
    }

    static byte[] Method5051(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, short[] sArray, int n, int n2) {
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Method5039(sArray, n, n2);
    }

    static boolean Method5052(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, boolean bl) {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13669 = bl;
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13669;
    }

    static boolean Method5053(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, boolean bl) {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13670 = bl;
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13670;
    }

    static Thread Method5054(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, Thread thread) {
        paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13674 = thread;
        return paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2.Field13674;
    }

    static {
        Field13679 = "0:00";
    }

    private static String Method5055(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1882788296 ^ (long)1882788296);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-240720972L ^ 0xF1A6E34B);
            int n2 = (int)((long)1856452722 ^ (long)1856452707);
            cArray2[n] = (char)(cArray[n] ^ ((int)-129271313L ^ 0xF84B6EB8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

