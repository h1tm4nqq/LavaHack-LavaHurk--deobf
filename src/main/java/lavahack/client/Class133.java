//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1510;
import lavahack.client.Class1960;
import lavahack.client.Class2008;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class815;
import lavahack.client.Class97;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class133
extends Class42 {
    private final Class44 Field8492 = this.Method23(new Class44("Range", (Class42)this, 1.0, Double.longBitsToDouble(4624633867356078080L), Double.longBitsToDouble(4629137466983448576L), false));
    private String Field8493 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class133() {
        super("HoleTest", Class97.Field8345, true);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method911(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class133.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class133.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        List list = Class1510.Method6031(this.Field8492.Method367());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Class1960 class1960 = (Class1960)iterator.next();
            Class815.Method3446(Class815.Method3447(class1960.Method7277()), 2.0f, new Class2027(255, 255, 255, 120), new Class2027(255, 255, 255, 120), Class2008.Field17214);
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 163;
            cArray2[n] = (char)(cArray[n] ^ (0x2F13 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

