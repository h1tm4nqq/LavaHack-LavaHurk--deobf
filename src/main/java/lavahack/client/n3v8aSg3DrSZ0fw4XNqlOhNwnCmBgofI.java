//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import java.util.ArrayList;
import lavahack.client.ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU;
import lavahack.client.ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.entity.player.EntityPlayer;

public class n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI {
    public static n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI Field11086;
    private ArrayList Field11087 = new ArrayList();
    private String Field11088 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI() {
        Field11086 = this;
    }

    public ArrayList Method3039() {
        return this.Field11087;
    }

    public void Method3040(String string) {
        if (this.Field11087.contains(string.toLowerCase())) return;
        this.Field11087.add(string.toLowerCase());
        ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU = new ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU(string.toLowerCase(), ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8334);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU);
    }

    public void Method3041(String string) {
        if (this.Field11087.isEmpty()) return;
        if (!this.Field11087.contains(string.toLowerCase())) return;
        this.Field11087.remove(string.toLowerCase());
        ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU = new ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU(string.toLowerCase(), ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8335);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU);
    }

    public boolean Method3042(EntityPlayer entityPlayer) {
        int n;
        if (this.Field11087.contains(entityPlayer.getName().toLowerCase()) && null.Field11779.Method365()) {
            n = (int)1923333398L ^ 0x72A3BD17;
            return n != 0;
        }
        n = (int)((long)-1638197433 ^ (long)-1638197433);
        return n != 0;
    }

    public boolean Method3043(String string) {
        int n;
        if (this.Field11087.contains(string.toLowerCase()) && null.Field11779.Method365()) {
            n = (int)173486045L ^ 0xA572FDC;
            return n != 0;
        }
        n = (int)452724925L ^ 0x1AFC08BD;
        return n != 0;
    }

    public void Method3044(ArrayList arrayList) {
        this.Field11087 = arrayList;
    }
}

