/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.network.NetworkRegistry
 *  net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper
 *  net.minecraftforge.fml.relauncher.Side
 */
package lavahack.client;

import lavahack.client.Class1755;
import lavahack.client.Class2151;
import lavahack.client.Class231;
import lavahack.client.Class289;
import lavahack.client.Class446;
import lavahack.client.Class513;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class Class137 {
    public static final SimpleNetworkWrapper Field8524 = NetworkRegistry.INSTANCE.newSimpleChannel("schematica");
    private String Field8525 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method940() {
        Field8524.registerMessage(Class446.class, Class446.class, 0, Side.CLIENT);
        Field8524.registerMessage(Class1755.class, Class1755.class, 1, Side.CLIENT);
        Field8524.registerMessage(Class2151.class, Class2151.class, 2, Side.SERVER);
        Field8524.registerMessage(Class289.class, Class289.class, 3, Side.CLIENT);
        Field8524.registerMessage(Class231.class, Class231.class, 4, Side.SERVER);
        Field8524.registerMessage(Class513.class, Class513.class, 5, Side.CLIENT);
    }

    private static String Method941(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 80;
            cArray2[n] = (char)(cArray[n] ^ (0x29D5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

