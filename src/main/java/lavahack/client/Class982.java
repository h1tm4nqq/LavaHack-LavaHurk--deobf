/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.RenderSpecificHandEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class788;
import lavahack.client.Class97;
import net.minecraftforge.client.event.RenderSpecificHandEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class982
extends Class42 {
    public static Class982 Field12194;
    public Class44 Field12195 = this.Method23(new Class44("Mode", (Class42)this, "Strong", new ArrayList<String>(Arrays.asList("Hand", "Strong"))));
    private final Class44 Field12196 = this.Method23(new Class44("Hand Mode", (Class42)this, "X", Arrays.asList("X", "Y", "Z")));
    public Class44 Field12197 = this.Method23(new Class44("StrongMode", (Class42)this, Class788.Field11330));
    public Class44 Field12198 = this.Method23(new Class44("IgnoreEating", (Class42)this, true));
    public Class44 Field12199 = this.Method23(new Class44("If KillAura", (Class42)this, true));
    public Class44 Field12200 = this.Method23(new Class44("Test", (Class42)this, false));
    public Class44 Field12201 = this.Method23(new Class44("Rotate X", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4645040803167600640L), true));
    public Class44 Field12202 = this.Method23(new Class44("Rotate Y", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)672791533 ^ 0x407680002819FBEDL), true));
    public Class44 Field12203 = this.Method23(new Class44("Rotate Z", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4645040803167600640L), true));
    private String Field12204 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class982() {
        super("SwingAnimation", "SwingAnimation", Class97.Field8342);
        super.Method44(this::Method3994);
        Field12194 = this;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3993(RenderSpecificHandEvent renderSpecificHandEvent) {
        if (!this.Field12195.Method359().equalsIgnoreCase("Hand")) return;
        if (!(renderSpecificHandEvent.getSwingProgress() > 0.0f)) return;
        float f = (1.0f - renderSpecificHandEvent.getSwingProgress()) * Float.intBitsToFloat(1135869952);
        String string = this.Field12196.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case 88: {
                if (!string.equals("X")) return;
                return;
            }
            case 89: {
                if (!string.equals("Y")) return;
                return;
            }
            case 90: {
                if (!string.equals("Z")) return;
                return;
            }
        }
    }

    private String Method3994() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("[");
        if (this.Field12195.Method359().equalsIgnoreCase("Hand")) {
            string = this.Field12196.Method359();
            return stringBuilder.append(string).append("]").toString();
        }
        string = this.Field12197.Method359();
        return stringBuilder.append(string).append("]").toString();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 214;
            cArray2[n] = (char)(cArray[n] ^ (0x3006 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

