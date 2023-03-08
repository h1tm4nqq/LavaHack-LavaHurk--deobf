//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.common.*;

public class Class228
{
    public static final int Field8995;
    public static final int Field8996;
    public static final int Field8997;
    public static final int Field8998;
    public static final int Field8999;
    private static final Class1644[] Field9000;
    private int Field9001;
    
    public static void Method1290(final Class1859 class1859, final Object o) {
        for (int method6953 = class1859.Method6953(), i = 0; i < 32 - Integer.numberOfLeadingZeros(method6953); ++i) {}
    }
    
    public static void Method1291(final Class1859 class1859, final Object o) {
        for (int method6953 = class1859.Method6953(), i = 0; i < 32 - Integer.numberOfLeadingZeros(method6953); ++i) {}
    }
    
    private static void Method1292(final Object o, final boolean b) {
        if (!(o instanceof Class1320)) {
            Class1796.Field16243.warn("[SubscribeMode] " + o.getClass().getName() + " is not a Listenable and will not be processed!");
            return;
        }
        if (b) {
            Class1796.Field16242.Method710((Class1320)o);
            return;
        }
        Class1796.Field16242.Method705((Class1320)o);
    }
    
    private static void Method1293(final Object o, final boolean b) {
        if (b) {
            MinecraftForge.EVENT_BUS.unregister(o);
            return;
        }
        MinecraftForge.EVENT_BUS.register(o);
    }
    
    static {
        Field8999 = 3;
        Field8998 = 3;
        Field8997 = 2;
        Field8996 = 1;
        Field8995 = 0;
        (Field9000 = new Class1644[3])[0] = Class228::UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        Class228.Field9000[1] = Class228::Method1293;
        Class228.Field9000[2] = Class228::Method1292;
    }
    
    private static String Method1294(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4DC9 ^ 0xE3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
