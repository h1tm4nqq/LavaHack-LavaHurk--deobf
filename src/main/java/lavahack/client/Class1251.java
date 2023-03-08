//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import java.util.*;
import javax.sound.sampled.*;
import java.io.*;

public class Class1251
{
    private static final long Field13666;
    private static final Random Field13667;
    private List Field13668;
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
    
    public Class1251() {
        this.Field13668 = new ArrayList();
        this.Field13669 = false;
        this.Field13670 = true;
        this.Field13671 = 50;
        this.Field13672 = false;
        this.Field13673 = true;
        this.Field13674 = null;
        this.Field13675 = 0;
        this.Field13676 = null;
        this.Field13677 = 0;
        this.Method5017();
    }
    
    public Class1251(final File file) {
        this.Field13668 = new ArrayList();
        this.Field13669 = false;
        this.Field13670 = true;
        this.Field13671 = 50;
        this.Field13672 = false;
        this.Field13673 = true;
        this.Field13674 = null;
        this.Field13675 = 0;
        this.Field13676 = null;
        this.Field13677 = 0;
        this.Method5019(file);
        this.Method5017();
    }
    
    public Class1251(final File... array) {
        this.Field13668 = new ArrayList();
        this.Field13669 = false;
        this.Field13670 = true;
        this.Field13671 = 50;
        this.Field13672 = false;
        this.Field13673 = true;
        this.Field13674 = null;
        this.Field13675 = 0;
        this.Field13676 = null;
        this.Field13677 = 0;
        for (int length = array.length, i = 0; i < length; ++i) {
            this.Method5019(array[i]);
        }
        this.Method5017();
    }
    
    public Class1251(final URL field13678) {
        this.Field13668 = new ArrayList();
        this.Field13669 = false;
        this.Field13670 = true;
        this.Field13671 = 50;
        this.Field13672 = false;
        this.Field13673 = true;
        this.Field13674 = null;
        this.Field13675 = 0;
        this.Field13676 = null;
        this.Field13677 = 0;
        this.Method5020(field13678);
        Class1251.Field13678 = field13678;
        this.Method5017();
    }
    
    public Class1251(final URL... array) {
        this.Field13668 = new ArrayList();
        this.Field13669 = false;
        this.Field13670 = true;
        this.Field13671 = 50;
        this.Field13672 = false;
        this.Field13673 = true;
        this.Field13674 = null;
        this.Field13675 = 0;
        this.Field13676 = null;
        this.Field13677 = 0;
        for (int length = array.length, i = 0; i < length; ++i) {
            this.Method5020(array[i]);
        }
        this.Method5017();
    }
    
    private void Method5017() {
        new Class1083().Method4375(this);
    }
    
    public Class1251 Method5018(final File obj, final boolean b) {
        if (obj.isFile()) {
            if (obj.getName().endsWith(".cla")) {
                this.Field13668.add(obj);
            }
        }
        else {
            if (!obj.isDirectory()) {
                throw new IllegalArgumentException("WTF is this? ( " + obj + " )");
            }
            for (final File file : obj.listFiles()) {
                if (file.isFile() || b) {
                    this.Method5018(file, b);
                }
            }
        }
        return this;
    }
    
    public Class1251 Method5019(final File file) {
        this.Method5018(file, true);
        return this;
    }
    
    public Class1251 Method5020(final URL url) {
        this.Field13668.add(url);
        return this;
    }
    
    public void Method5021() {
        if (this.Field13669) {
            this.Field13669 = false;
            Class1617.Field15567 = (!this.Field13669 && !this.Field13670);
            this.notifyAll();
            return;
        }
        this.Method5025();
        if (this.Field13668.size() == 0) {
            return;
        }
        this.Field13670 = false;
        Class1617.Field15566 = false;
        Class1617.Field15567 = (!this.Field13669 && !this.Field13670);
        if (this.Field13674 == null) {
            (this.Field13674 = new Class1407(this)).start();
        }
    }
    
    public boolean Method5022() {
        return !this.Field13669 && !this.Field13670;
    }
    
    public void Method5023() {
        if (!this.Method5022()) {
            return;
        }
        this.Field13669 = true;
        Class1617.Field15567 = (!this.Field13669 && !this.Field13670);
        this.notifyAll();
    }
    
    public boolean Method5024() {
        return this.Field13669;
    }
    
    public void Method5025() {
        this.Field13669 = false;
        this.Field13670 = true;
        Class1617.Field15566 = true;
        Class1617.Field15567 = (!this.Field13669 && !this.Field13670);
        this.notifyAll();
        if (this.Field13674 != null) {
            this.Field13674.join();
        }
    }
    
    public boolean Method5026() {
        return this.Field13670;
    }
    
    public void Method5027() {
        this.Method5029(1);
    }
    
    public void Method5028() {
        this.Method5029(-1);
    }
    
    private void Method5029(final int n) {
        if (this.Field13668.size() == 0) {
            return;
        }
        boolean method5022 = this.Method5022();
        if (this.Field13672) {
            this.Field13675 = Class1251.Field13667.nextInt(this.Field13668.size());
        }
        else {
            this.Field13675 += n;
            if (this.Field13675 > this.Field13668.size() - 1) {
                if (this.Field13673) {
                    this.Field13675 = 0;
                }
                else {
                    this.Field13675 = this.Field13668.size() - 1;
                    method5022 = false;
                }
            }
            else if (this.Field13675 < 0) {
                if (this.Field13673) {
                    this.Field13675 = this.Field13668.size() - 1;
                }
                else {
                    this.Field13675 = 0;
                    method5022 = false;
                }
            }
        }
        this.Method5025();
        if (method5022) {
            this.Method5021();
        }
    }
    
    public Class1251 Method5030(final int field13671) {
        if (field13671 < 0 || field13671 > 100) {
            throw new IllegalArgumentException("Wrong value for volume, must be in interval [0..100].");
        }
        this.Field13671 = field13671;
        return this;
    }
    
    public int Method5031() {
        return this.Field13671;
    }
    
    public Class1251 Method5032(final boolean field13672) {
        this.Field13672 = field13672;
        return this;
    }
    
    public boolean Method5033() {
        return this.Field13672;
    }
    
    public Class1251 Method5034(final boolean field13673) {
        this.Field13673 = field13673;
        return this;
    }
    
    public boolean Method5035() {
        return this.Field13673;
    }
    
    private void Method5036(final SourceDataLine sourceDataLine, final int n) {
        final FloatControl floatControl = (FloatControl)sourceDataLine.getControl(FloatControl.Type.MASTER_GAIN);
        final BooleanControl booleanControl = (BooleanControl)sourceDataLine.getControl(BooleanControl.Type.MUTE);
        if (n == 0) {
            booleanControl.setValue(true);
        }
        else {
            booleanControl.setValue(false);
            floatControl.setValue((float)(Math.log(n / Double.longBitsToDouble(4636737291354636288L)) / Math.log(Double.longBitsToDouble((long)1428449121 ^ 0x4024000055246761L)) * Double.longBitsToDouble(4626322717216342016L)));
        }
    }
    
    public int Method5037() {
        int n = 0;
        if (this.Field13676 != null) {
            n = (int)(this.Field13676.getMicrosecondPosition() / 1000L);
        }
        return n;
    }
    
    public void Method5038() throws UnsupportedAudioFileException, IOException {
        if (this.Field13676.getFramePosition() > 0) {
            final AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(this.Field13680));
            Class1251.Field13679 = String.valueOf((audioInputStream.getFrameLength() + 0.0) / audioInputStream.getFormat().getFrameRate());
        }
    }
    
    private byte[] Method5039(final short[] array, int n, int n2) {
        final byte[] array2 = new byte[n2 * 2];
        int n3 = 0;
        while (n2-- > 0) {
            final short n4 = array[n++];
            array2[n3++] = (byte)n4;
            array2[n3++] = (byte)(n4 >>> 8);
        }
        return array2;
    }
    
    private void Method5040(final ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
    
    static int Method5041(final Class1251 class1251) {
        return class1251.Field13675;
    }
    
    static List Method5042(final Class1251 class1251) {
        return class1251.Field13668;
    }
    
    static boolean Method5043(final Class1251 class1251) {
        return class1251.Field13670;
    }
    
    static boolean Method5044(final Class1251 class1251) {
        return class1251.Field13669;
    }
    
    static SourceDataLine Method5045(final Class1251 class1251) {
        return class1251.Field13676;
    }
    
    static int Method5046(final Class1251 class1251, final int field13677) {
        return class1251.Field13677 = field13677;
    }
    
    static int Method5047(final Class1251 class1251) {
        return class1251.Field13671;
    }
    
    static SourceDataLine Method5048(final Class1251 class1251, final SourceDataLine field13676) {
        return class1251.Field13676 = field13676;
    }
    
    static void Method5049(final Class1251 class1251, final SourceDataLine sourceDataLine, final int n) {
        class1251.Method5036(sourceDataLine, n);
    }
    
    static int Method5050(final Class1251 class1251) {
        return class1251.Field13677;
    }
    
    static byte[] Method5051(final Class1251 class1251, final short[] array, final int n, final int n2) {
        return class1251.Method5039(array, n, n2);
    }
    
    static boolean Method5052(final Class1251 class1251, final boolean field13669) {
        return class1251.Field13669 = field13669;
    }
    
    static boolean Method5053(final Class1251 class1251, final boolean field13670) {
        return class1251.Field13670 = field13670;
    }
    
    static Thread Method5054(final Class1251 class1251, final Thread field13674) {
        return class1251.Field13674 = field13674;
    }
    
    static {
        Field13666 = 1L;
        Field13667 = new Random();
        Class1251.Field13679 = "0:00";
    }
    
    private static String Method5055(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1757 ^ 0x11));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
