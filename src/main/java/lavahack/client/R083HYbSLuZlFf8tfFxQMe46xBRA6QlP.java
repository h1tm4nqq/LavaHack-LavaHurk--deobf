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

import lavahack.client.TDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO;
import lavahack.client.dxECsBiCCQZR3sg44LtDW8kcY6zewFx8;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class R083HYbSLuZlFf8tfFxQMe46xBRA6QlP
extends dxECsBiCCQZR3sg44LtDW8kcY6zewFx8 {
    private boolean Field15862 = (int)-297844996L ^ 0xEE3F3EFC;
    private String Field15863 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public R083HYbSLuZlFf8tfFxQMe46xBRA6QlP(String string, TDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO tDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO) {
        super("key", string, tDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO);
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
        if (n < 0 || n > (int)((long)-357881774 ^ (long)-357881773) << 8) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("[KeyActivator] Invalid key range: " + n);
            return;
        }
        if (!Keyboard.isKeyDown((int)n)) {
            this.Field15862 = (int)((long)184543079 ^ (long)184543079);
            return;
        }
        if (this.Field15862) {
            return;
        }
        this.Method2266();
        this.Field15862 = (int)1838505986L ^ 0x6D956003;
    }

    private static String Method6508(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1649089431 ^ (long)-1649089431);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)890663854 ^ (long)890663761);
            int n2 = (int)((long)1998209795 ^ (long)1998209824) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-191285302 ^ (long)-191270073) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

