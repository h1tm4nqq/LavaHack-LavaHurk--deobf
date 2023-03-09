//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import java.util.ArrayList;
import lavahack.client.Class1477;
import lavahack.client.Class1796;
import lavahack.client.Class96;
import net.minecraft.entity.player.EntityPlayer;

public class Class726 {
    public static Class726 Field11086;
    private ArrayList Field11087 = new ArrayList();
    private String Field11088 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class726() {
        Field11086 = this;
    }

    public ArrayList Method3039() {
        return this.Field11087;
    }

    public void Method3040(String string) {
        if (this.Field11087.contains(string.toLowerCase())) return;
        this.Field11087.add(string.toLowerCase());
        Class1477 class1477 = new Class1477(string.toLowerCase(), Class96.Field8334);
        Class1796.Field16242.Method715(class1477);
    }

    public void Method3041(String string) {
        if (this.Field11087.isEmpty()) return;
        if (!this.Field11087.contains(string.toLowerCase())) return;
        this.Field11087.remove(string.toLowerCase());
        Class1477 class1477 = new Class1477(string.toLowerCase(), Class96.Field8335);
        Class1796.Field16242.Method715(class1477);
    }

    public boolean Method3042(EntityPlayer entityPlayer) {
        if (!this.Field11087.contains(entityPlayer.getName().toLowerCase())) return false;
        if (!null.Field11779.Method365()) return false;
        return true;
    }

    public boolean Method3043(String string) {
        if (!this.Field11087.contains(string.toLowerCase())) return false;
        if (!null.Field11779.Method365()) return false;
        return true;
    }

    public void Method3044(ArrayList arrayList) {
        this.Field11087 = arrayList;
    }
}

