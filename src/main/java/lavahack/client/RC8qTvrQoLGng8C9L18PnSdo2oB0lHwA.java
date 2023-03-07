//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.entity.Entity;

public class RC8qTvrQoLGng8C9L18PnSdo2oB0lHwA
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field9124 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public RC8qTvrQoLGng8C9L18PnSdo2oB0lHwA() {
        super("AntiVanish", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method45() {
        if (RC8qTvrQoLGng8C9L18PnSdo2oB0lHwA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (RC8qTvrQoLGng8C9L18PnSdo2oB0lHwA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        RC8qTvrQoLGng8C9L18PnSdo2oB0lHwA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(Entity::isInvisible).forEach(RC8qTvrQoLGng8C9L18PnSdo2oB0lHwA::Method1366);
    }

    @Override
    public boolean Method52() {
        return (int)((long)418943756 ^ (long)418943757) != 0;
    }

    private static void Method1366(Entity entity) {
        entity.setInvisible((boolean)((long)-1970684839 ^ (long)-1970684839));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-348600847 ^ (long)-348600847);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1024827901 ^ (long)-1024827652);
            int n2 = ((int)-1537452005L ^ 0xA45C5838) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-106937840L ^ 0xF9A04351) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

