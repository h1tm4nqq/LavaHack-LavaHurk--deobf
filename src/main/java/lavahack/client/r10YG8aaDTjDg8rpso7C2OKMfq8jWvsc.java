//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.entity.player.EntityPlayer;

public class r10YG8aaDTjDg8rpso7C2OKMfq8jWvsc
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final ArrayList Field12835 = new ArrayList();
    private final ArrayList Field12836 = new ArrayList();
    private String Field12837 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public r10YG8aaDTjDg8rpso7C2OKMfq8jWvsc() {
        super("VisualRange", "", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    @Override
    public void Method45() {
        this.Field12836.clear();
        for (Object object : r10YG8aaDTjDg8rpso7C2OKMfq8jWvsc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (!(object instanceof EntityPlayer) || object.getName().equalsIgnoreCase(r10YG8aaDTjDg8rpso7C2OKMfq8jWvsc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getName())) continue;
            this.Field12836.add(object.getName());
        }
        if (this.Field12835.equals(this.Field12836)) return;
        for (Object object : this.Field12836) {
            if (this.Field12835.contains(object)) continue;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886((String)object + " entered in visual range!");
        }
        Iterator iterator = this.Field12835.iterator();
        while (true) {
            Object object;
            if (!iterator.hasNext()) {
                this.Field12835.clear();
                this.Field12835.addAll(this.Field12836);
                return;
            }
            object = (String)iterator.next();
            if (this.Field12836.contains(object)) continue;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886((String)object + " left from visual range!");
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1520064634 ^ (long)1520064634);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1561580617 ^ (long)-1561580728);
            int n2 = (int)((long)-1661591333 ^ (long)-1661591398) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-670753813L ^ 0xD805021A) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

