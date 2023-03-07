//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 */
package lavahack.client;

import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;

class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG {
    public final EntityPlayer Field13738;
    public double Field13739;
    public boolean Field13740;
    public boolean Field13741;
    private String Field13742 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG(EntityPlayer entityPlayer, double d) {
        this.Field13741 = (int)((long)366659538 ^ (long)366659538);
        this.Field13738 = entityPlayer;
        this.Field13739 = d;
        this.Field13740 = (int)((long)-741344136 ^ (long)-741344136);
    }

    public b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG(EntityPlayer entityPlayer, double d, boolean bl) {
        this.Field13741 = (int)((long)-1214924868 ^ (long)-1214924868);
        this.Field13738 = entityPlayer;
        this.Field13739 = d;
        if (bl) {
            this.Field13741 = !b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Method5665().player.getHeldItemMainhand().getItem().equals(Items.TOTEM_OF_UNDYING) && !b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Method5666().player.getHeldItemMainhand().getItem().equals(Items.TOTEM_OF_UNDYING) ? (int)((long)-1564005309 ^ (long)-1564005310) : (int)((long)-1223532460 ^ (long)-1223532460);
        }
        this.Field13740 = bl;
    }
}

