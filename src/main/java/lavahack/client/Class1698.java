/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import lavahack.client.Class1164;
import lavahack.client.Class1796;
import lavahack.client.Class488;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class Class1698
extends Class488 {
    private boolean Field15862 = false;
    private String Field15863 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1698(String string, Class1164 class1164) {
        super("key", string, class1164);
    }

    @Override
    protected void Method2267() {
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    @Override
    protected void Method2268() {
        MinecraftForge.EVENT_BUS.unregister((Object)this);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6507(TickEvent tickEvent) {
        int n = Integer.parseInt(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (n < 0 || n > 256) {
            Class1796.Field16243.error("[KeyActivator] Invalid key range: " + n);
            return;
        }
        if (!Keyboard.isKeyDown((int)n)) {
            this.Field15862 = false;
            return;
        }
        if (this.Field15862) {
            return;
        }
        this.Method2266();
        this.Field15862 = true;
    }

    private static String Method6508(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 70;
            cArray2[n] = (char)(cArray[n] ^ (0x448D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

