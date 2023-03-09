//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemBow
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.Class1055;
import lavahack.client.Class394;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class61;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.util.math.Vec3d;

public class Class908
extends Class42 {
    private final Class44 Field11839 = this.Method23(new Class44("Max Distance", (Class42)this, Double.longBitsToDouble((long)845818903 ^ 0x40340000326A2C17L), 1.0, Double.longBitsToDouble((long)666774245 ^ 0x4049000027BE2AE5L), true));
    private final Class411 Field11840 = this.Method54();
    private final Class61 Field11841 = new Class61(this.Field11839::Method367, this.Field11840.Method2000()::Method369, this.Field11840.Method2001()::Method365);
    private int Field11842;

    public Class908() {
        super("BowAimBot", "", Class97.Field8338);
    }

    @Override
    public void Method38() {
        this.Field11841.Method498();
    }

    @Override
    public void Method45() {
        if (Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!(Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemBow)) return;
        if (!Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) return;
        if (Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() < 3) return;
        EntityPlayer entityPlayer = this.Field11841.Method496();
        this.Field11841.Method499();
        if (entityPlayer == null) return;
        Vec3d vec3d = Class394.Method1943((Entity)entityPlayer, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks());
        float[] fArray = Class1055.Method4303(Class394.Method1943((Entity)Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks()), vec3d);
        Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray[0];
        Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray[1];
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 84;
            cArray2[n] = (char)(cArray[n] ^ (0x3E2E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

