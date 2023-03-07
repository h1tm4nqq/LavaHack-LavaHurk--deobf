/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.MinecraftForge
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import lavahack.client.EO07t74ygaxjSG6Y7XzAWcj6luS8mVJ8;
import lavahack.client.GAy9jV5JLrUCU1UxQkzXttscRqZTYALl;
import lavahack.client.Jcl3rNZt1mdsfFHKgNIY51SDYe58l3Wb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraftforge.common.MinecraftForge;

public class Jcl3rNZt1mdsfFHKgNIY51SDYe58l3Wb {
    public static final int Field8995;
    public static final int Field8996;
    public static final int Field8997;
    public static final int Field8998;
    public static final int Field8999;
    private static final Jcl3rNZt1mdsfFHKgNIY51SDYe58l3Wb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field9000;
    private int Field9001;

    public static void Method1290(EO07t74ygaxjSG6Y7XzAWcj6luS8mVJ8 eO07t74ygaxjSG6Y7XzAWcj6luS8mVJ8, Object object) {
        int n = eO07t74ygaxjSG6Y7XzAWcj6luS8mVJ8.Method6953();
        int n2 = (int)1961814079L ^ 0x74EEE83F;
        while (n2 < (((int)-894324570L ^ 0xCAB1B0A7) << 5) - Integer.numberOfLeadingZeros(n)) {
            int cfr_ignored_0 = n2 & (int)((long)291207555 ^ (long)291207554);
            ++n2;
        }
    }

    public static void Method1291(EO07t74ygaxjSG6Y7XzAWcj6luS8mVJ8 eO07t74ygaxjSG6Y7XzAWcj6luS8mVJ8, Object object) {
        int n = eO07t74ygaxjSG6Y7XzAWcj6luS8mVJ8.Method6953();
        int n2 = (int)2137226509L ^ 0x7F637D0D;
        while (n2 < (((int)887017625L ^ 0x34DED098) << 5) - Integer.numberOfLeadingZeros(n)) {
            int cfr_ignored_0 = n2 & ((int)-1908461174L ^ 0x8E3F318B);
            ++n2;
        }
    }

    private static void Method1292(Object object, boolean bl) {
        if (!(object instanceof GAy9jV5JLrUCU1UxQkzXttscRqZTYALl)) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.warn("[SubscribeMode] " + object.getClass().getName() + " is not a Listenable and will not be processed!");
            return;
        }
        if (bl) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710((GAy9jV5JLrUCU1UxQkzXttscRqZTYALl)object);
            return;
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705((GAy9jV5JLrUCU1UxQkzXttscRqZTYALl)object);
    }

    private static void Method1293(Object object, boolean bl) {
        if (bl) {
            MinecraftForge.EVENT_BUS.unregister(object);
            return;
        }
        MinecraftForge.EVENT_BUS.register(object);
    }

    static {
        Field8999 = (int)((long)264665044 ^ (long)264665047);
        Field8998 = (int)-591814238L ^ 0xDCB9A1A1;
        Field8997 = ((int)-1456149595L ^ 0xA934EBA4) << 1;
        Field8996 = (int)2147038519L ^ 0x7FF93536;
        Field8995 = (int)((long)1652549929 ^ (long)1652549929);
        Field9000 = new Jcl3rNZt1mdsfFHKgNIY51SDYe58l3Wb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-1048669934 ^ (long)-1048669935)];
        Jcl3rNZt1mdsfFHKgNIY51SDYe58l3Wb.Field9000[(int)-937207837L ^ 0xC82357E3] = (Jcl3rNZt1mdsfFHKgNIY51SDYe58l3Wb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Z)V, UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(java.lang.Object boolean ), (Ljava/lang/Object;Z)V)();
        Jcl3rNZt1mdsfFHKgNIY51SDYe58l3Wb.Field9000[(int)898557868L ^ 0x358EE7AD] = Jcl3rNZt1mdsfFHKgNIY51SDYe58l3Wb::Method1293;
        Jcl3rNZt1mdsfFHKgNIY51SDYe58l3Wb.Field9000[(int)((long)1882918496 ^ (long)1882918497) << 1] = Jcl3rNZt1mdsfFHKgNIY51SDYe58l3Wb::Method1292;
    }

    private static String Method1294(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2033386106L ^ 0x86CCFD86;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-503309788L ^ 0xE2001ADB);
            int n2 = (int)1046553653L ^ 0x3E6124D6;
            cArray2[n] = (char)(cArray[n] ^ ((int)-949102029L ^ 0xC76D97FA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

