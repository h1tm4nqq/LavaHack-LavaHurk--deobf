/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.network.NetworkRegistry
 *  net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper
 *  net.minecraftforge.fml.relauncher.Side
 */
package lavahack.client;

import lavahack.client.JpALxZhiRoxIowvsLoMpesw9I9a4m4rP;
import lavahack.client.WdF17rpDcljzldlz6kIRntB5TqnkfIw6;
import lavahack.client.g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE;
import lavahack.client.o6WjagicEjcekwDevQdMA2QlvL5uoWpx;
import lavahack.client.uousdX8ncJWKUP3BS9cexvVPwWHrFdDD;
import lavahack.client.zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class L2xmcmr9Tre1qBd8su5PcdMk38D1GW4H {
    public static final SimpleNetworkWrapper Field8524 = NetworkRegistry.INSTANCE.newSimpleChannel("schematica");
    private String Field8525 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method940() {
        Field8524.registerMessage(WdF17rpDcljzldlz6kIRntB5TqnkfIw6.class, WdF17rpDcljzldlz6kIRntB5TqnkfIw6.class, (int)-948774001L ^ 0xC772DB8F, Side.CLIENT);
        Field8524.registerMessage(g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE.class, g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE.class, (int)((long)-1542352649 ^ (long)-1542352650), Side.CLIENT);
        Field8524.registerMessage(JpALxZhiRoxIowvsLoMpesw9I9a4m4rP.class, JpALxZhiRoxIowvsLoMpesw9I9a4m4rP.class, ((int)-210023781L ^ 0xF37B4A9A) << 1, Side.SERVER);
        Field8524.registerMessage(zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl.class, zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl.class, (int)((long)67390319 ^ (long)67390316), Side.CLIENT);
        Field8524.registerMessage(o6WjagicEjcekwDevQdMA2QlvL5uoWpx.class, o6WjagicEjcekwDevQdMA2QlvL5uoWpx.class, ((int)2096644065L ^ 0x7CF83FE0) << 2, Side.SERVER);
        Field8524.registerMessage(uousdX8ncJWKUP3BS9cexvVPwWHrFdDD.class, uousdX8ncJWKUP3BS9cexvVPwWHrFdDD.class, (int)894028358L ^ 0x3549CA43, Side.CLIENT);
    }

    private static String Method941(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2102053107 ^ (long)-2102053107);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-874599603 ^ (long)-874599502);
            int n2 = ((int)-63425864L ^ 0xFC3832BD) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1663717508 ^ (long)-1663727959) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

