/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.FOVUpdateEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Deprecated
public class Class157
extends Class42 {
    private final Class44 Field8616 = this.Method23(new Class44("SettingFOV", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4024000000000000L), false));
    private final Class44 Field8617 = this.Method23(new Class44("Static", (Class42)this, true));
    private String Field8618 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class157() {
        super("FovModifier", Class97.Field8342, true);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1054(FOVUpdateEvent fOVUpdateEvent) {
        fOVUpdateEvent.setNewfov(this.Field8617.Method365() ? this.Field8616.Method368() : fOVUpdateEvent.getFov() * this.Field8616.Method368());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 207;
            cArray2[n] = (char)(cArray[n] ^ (0x5F18 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

