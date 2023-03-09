//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 */
package lavahack.client;

import lavahack.client.Class1274;
import lavahack.client.Class1303;
import lavahack.client.Class135;
import lavahack.client.Class1464;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class9;
import lavahack.client.Class97;
import lavahack.client.Class99;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;

@Class99
public class Class1791
extends Class42 {
    private final Class44 Field16214 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(0x4044000000000000L), 0.0, Double.longBitsToDouble(0x4044000000000000L), false));
    private final Class44 Field16215 = this.Method23(new Class44("CheckUse", (Class42)this, false));
    private final Class44 Field16216 = this.Method23(new Class44("MaxUse", (Class42)this, Double.longBitsToDouble((long)2004394771 ^ 0x402400007778A313L), 0.0, Double.longBitsToDouble((long)537916071 ^ 0x40340000200FF2A7L), true));
    private final Class44 Field16217 = this.Method23(new Class44("BowInHandCheck", (Class42)this, true));
    private final Class1303 Field16218 = this.Method25(new Class1303("Rotate", (Class42)this, Class135.Field8498));
    private boolean Field16219;
    private int Field16220;
    @Class1274
    public EntityPlayer Field16221 = null;
    private String Field16222 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1791() {
        super("AntiBow", Class97.Field8338);
        super.Method44(this::Method6776);
    }

    @Override
    public void Method38() {
        this.Field16219 = false;
        this.Field16221 = null;
    }

    @Override
    public void Method45() {
        if (Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field16221 = Class394.Method1924(this.Field16214.Method368());
        if (this.Field16221 == null) {
            if (!this.Field16219) return;
            Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.pressed = false;
            if (this.Field16220 != -1) {
                Class9.Method110(this.Field16220, true);
            }
            this.Field16219 = false;
            return;
        }
        int n = Class9.Method116(Items.SHIELD, 0, 9);
        if (n == -1) {
            return;
        }
        this.Field16220 = Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (this.Field16217.Method365()) {
            if (!this.Field16221.getHeldItemMainhand().getItem().equals(Items.BOW)) return;
        }
        if (this.Field16215.Method365() && (double)this.Field16221.getItemInUseMaxCount() <= this.Field16216.Method367()) {
            return;
        }
        if (!Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem().equals(Items.SHIELD)) {
            Class9.Method110(n, true);
        }
        Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.pressed = true;
        Class1464.Method5895((Entity)this.Field16221, (Class135)this.Field16218.Method341());
        this.Field16219 = true;
    }

    private String Method6776() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("[");
        if (this.Field16221 == null) {
            string = "no target no fun";
            return stringBuilder.append(string).append("]").toString();
        }
        string = this.Field16221.getName();
        return stringBuilder.append(string).append("]").toString();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 78;
            cArray2[n] = (char)(cArray[n] ^ (0x62A3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

