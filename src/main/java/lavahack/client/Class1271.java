//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 */
package lavahack.client;

import lavahack.client.Class1416;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;

class Class1271 {
    public final EntityPlayer Field13738;
    public double Field13739;
    public boolean Field13740;
    public boolean Field13741 = false;
    private String Field13742 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1271(EntityPlayer entityPlayer, double d) {
        this.Field13738 = entityPlayer;
        this.Field13739 = d;
        this.Field13740 = false;
    }

    public Class1271(EntityPlayer entityPlayer, double d, boolean bl) {
        this.Field13738 = entityPlayer;
        this.Field13739 = d;
        if (bl) {
            this.Field13741 = !Class1416.Method5665().player.getHeldItemMainhand().getItem().equals(Items.TOTEM_OF_UNDYING) && !Class1416.Method5666().player.getHeldItemMainhand().getItem().equals(Items.TOTEM_OF_UNDYING);
        }
        this.Field13740 = bl;
    }
}

