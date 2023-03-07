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

import com.kisman.cc.util.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.util.math.Vec3d;

public class SF5ZMxM68EOwKd5ixXQybj9xgbpMzSC9
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11839 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Max Distance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)845818903 ^ 0x40340000326A2C17L), 1.0, Double.longBitsToDouble((long)666774245 ^ 0x4049000027BE2AE5L), (boolean)((long)837042078 ^ (long)837042079)));
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field11840 = this.Method54();
    private final IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk Field11841 = new IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk(this.Field11839::Method367, this.Field11840.Method2000()::Method369, this.Field11840.Method2001()::Method365);
    private int Field11842;

    public SF5ZMxM68EOwKd5ixXQybj9xgbpMzSC9() {
        super("BowAimBot", "", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    @Override
    public void Method38() {
        this.Field11841.Method498();
    }

    @Override
    public void Method45() {
        if (SF5ZMxM68EOwKd5ixXQybj9xgbpMzSC9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (SF5ZMxM68EOwKd5ixXQybj9xgbpMzSC9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!(SF5ZMxM68EOwKd5ixXQybj9xgbpMzSC9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemBow)) return;
        if (!SF5ZMxM68EOwKd5ixXQybj9xgbpMzSC9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) return;
        if (SF5ZMxM68EOwKd5ixXQybj9xgbpMzSC9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() < ((int)2020325782L ^ 0x786BB995)) return;
        EntityPlayer entityPlayer = this.Field11841.Method496();
        this.Field11841.Method499();
        if (entityPlayer == null) return;
        Vec3d vec3d = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1943((Entity)entityPlayer, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks());
        float[] fArray = YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4303(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1943((Entity)SF5ZMxM68EOwKd5ixXQybj9xgbpMzSC9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks()), vec3d);
        SF5ZMxM68EOwKd5ixXQybj9xgbpMzSC9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray[(int)((long)2089428678 ^ (long)2089428678)];
        SF5ZMxM68EOwKd5ixXQybj9xgbpMzSC9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray[(int)-1795066339L ^ 0x9501761C];
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-342328202L ^ 0xEB987C76;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)874254931L ^ 0x341C12AC);
            int n2 = ((int)-1736685979L ^ 0x987C4670) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-584666228L ^ 0xDD26AC9B) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

