/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.MinecraftForge
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import lavahack.client.Class1320;
import lavahack.client.Class1644;
import lavahack.client.Class1796;
import lavahack.client.Class1859;
import net.minecraftforge.common.MinecraftForge;

public class Class228 {
    public static final int Field8995;
    public static final int Field8996;
    public static final int Field8997;
    public static final int Field8998;
    public static final int Field8999;
    private static final Class1644[] Field9000;
    private int Field9001;

    public static void Method1290(Class1859 class1859, Object object) {
        int n = class1859.Method6953();
        int n2 = 0;
        while (n2 < 32 - Integer.numberOfLeadingZeros(n)) {
            int cfr_ignored_0 = n2 & 1;
            ++n2;
        }
    }

    public static void Method1291(Class1859 class1859, Object object) {
        int n = class1859.Method6953();
        int n2 = 0;
        while (n2 < 32 - Integer.numberOfLeadingZeros(n)) {
            int cfr_ignored_0 = n2 & 1;
            ++n2;
        }
    }

    private static void Method1292(Object object, boolean bl) {
        if (!(object instanceof Class1320)) {
            Class1796.Field16243.warn("[SubscribeMode] " + object.getClass().getName() + " is not a Listenable and will not be processed!");
            return;
        }
        if (bl) {
            Class1796.Field16242.Method710((Class1320)object);
            return;
        }
        Class1796.Field16242.Method705((Class1320)object);
    }

    private static void Method1293(Object object, boolean bl) {
        if (bl) {
            MinecraftForge.EVENT_BUS.unregister(object);
            return;
        }
        MinecraftForge.EVENT_BUS.register(object);
    }

    static {
        Field8999 = 3;
        Field8998 = 3;
        Field8997 = 2;
        Field8996 = 1;
        Field8995 = 0;
        Field9000 = new Class1644[3];
        Class228.Field9000[0] = (Class1644)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Z)V, UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(java.lang.Object boolean ), (Ljava/lang/Object;Z)V)();
        Class228.Field9000[1] = Class228::Method1293;
        Class228.Field9000[2] = Class228::Method1292;
    }

    private static String Method1294(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 227;
            cArray2[n] = (char)(cArray[n] ^ (0x4DC9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

