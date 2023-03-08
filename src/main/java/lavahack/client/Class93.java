//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class93
{
    private final Thread Field8319;
    private final Class1077 Field8320;
    private final Class251 Field8321;
    private final long Field8322;
    private final long Field8323;
    private String Field8324 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class93(final Class251 field8321, final Class1077 field8322, final long field8323, final long field8324, final Runnable runnable) {
        this.Field8321 = field8321;
        this.Field8320 = field8322;
        this.Field8322 = field8323;
        this.Field8323 = field8324;
        this.Field8319 = new Thread(Class93::Method799);
    }
    
    public Thread Method793() {
        return this.Field8319;
    }
    
    public Class1077 Method794() {
        return this.Field8320;
    }
    
    public Class251 Method795() {
        return this.Field8321;
    }
    
    public long Method796() {
        return this.Field8322;
    }
    
    public long Method797() {
        return this.Field8323;
    }
    
    private static void Method798(final long n) {
        Thread.sleep(n);
    }
    
    private static void Method799(final long n, final Class1077 class1077, final long n2, final Class251 class1078, final Runnable runnable) {
        if (n >= 0L) {
            for (long n3 = 0L; n3 < n; ++n3) {
                if (class1077 == Class1077.Field12792 || class1077 == Class1077.Field12794) {
                    Method798(n2);
                }
                if (class1078 == Class251.Field9120) {
                    runnable.run();
                }
                else {
                    new Thread(runnable).start();
                }
                if (class1077 == Class1077.Field12793 || class1077 == Class1077.Field12794) {
                    Method798(n2);
                }
            }
            return;
        }
        while (true) {
            if (class1077 == Class1077.Field12792 || class1077 == Class1077.Field12794) {
                Method798(n2);
            }
            if (class1078 == Class251.Field9120) {
                runnable.run();
            }
            else {
                new Thread(runnable).start();
            }
            if (class1077 == Class1077.Field12793 || class1077 == Class1077.Field12794) {
                Method798(n2);
            }
        }
    }
    
    private static String Method800(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1D5A ^ 0x61));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
