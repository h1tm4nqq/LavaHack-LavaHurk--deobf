//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.mZKglU52NJKeleKf9WRZyyfpIeAgybGE;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Mouse;

public class VKGu2PG1RG58c61zIvsNkflXbIcPkoYI
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field17062 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11447).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17063 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Section", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xF3B4CE872C50E87L ^ 0x4F2B4CE872C50E87L), 1.0, Double.longBitsToDouble((long)1042999872 ^ 0x403000003E2AEA40L), ((int)-595996958L ^ 0xDC79CEE3) != 0).Method314((this.Field17062.Method341() == VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11447 ? (int)((long)-480868121 ^ (long)-480868122) : (int)((long)-530831027 ^ (long)-530831027)) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17064 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Angle", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1230803490 ^ 0x40568000495C9222L), 1.0, Double.longBitsToDouble(0x7F2CC0FDD505D702L ^ 0x3F5A40FDD505D702L), ((int)115260093L ^ 0x6DEBABC) != 0).Method314((this.Field17062.Method341() == VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11448 ? (int)-1908474797L ^ 0x8E3EFC52 : (int)((long)-1337366471 ^ (long)-1337366471)) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17065 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entities", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)181229062L ^ 0xACD5606) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17066 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("IgnoreTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)150565022 ^ 0x4010000008F9709EL), 0.0, Double.longBitsToDouble(0x27E039BE31160BF5L ^ 0x67D439BE31160BF5L), (boolean)((long)-1454701704 ^ (long)-1454701703)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17067 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Interpolate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1223396048L ^ 0x48EB8AD1) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17068 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)442817283 ^ 0x3FB9999983FD4299L), 0.0, Double.longBitsToDouble((long)1920756877 ^ 0x40140000727C6C8DL), ((int)826515820L ^ 0x3143A16C) != 0).Method313(this.Field17067::Method365));
    private int Field17069 = (int)((long)-490936692 ^ (long)-490936692);
    private int Field17070;

    public VKGu2PG1RG58c61zIvsNkflXbIcPkoYI() {
        super("YawStep", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7290(RenderWorldLastEvent renderWorldLastEvent) {
        float f;
        if (VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaX != 0 || VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaY != 0 || VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.Method7291()) {
            this.Field17069 = this.Field17066.Method335();
            return;
        }
        if (this.Field17069 > 0) {
            this.Field17069 -= (int)1547340870L ^ 0x5C3A8C47;
            return;
        }
        float f2 = this.Field17062.Method341() == VKGu2PG1RG58c61zIvsNkflXbIcPkoYI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11447 ? Float.intBitsToFloat(0x119DBCC ^ 0x42ADDBCC) / (float)this.Field17063.Method335() : this.Field17064.Method368();
        float f3 = f = VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw + Float.intBitsToFloat((int)((long)139222898 ^ (long)1266179954));
        f = (float)Math.round(f / f2) * f2;
        f += f3 - f;
        VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw = VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = this.Field17067.Method365() ? mZKglU52NJKeleKf9WRZyyfpIeAgybGE.Method2508(VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, f, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks(), this.Field17068.Method368()) : (f -= Float.intBitsToFloat((int)1029418660L ^ 0x7E6FAEA4));
        Entity entity = VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity();
        if (!this.Field17065.Method365()) return;
        if (entity == null) return;
        entity.prevRotationYaw = entity.rotationYaw;
        entity.rotationYaw = VKGu2PG1RG58c61zIvsNkflXbIcPkoYI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
    }

    private static boolean Method7291() {
        int n = (int)((long)115141388 ^ (long)115141388);
        while (n < Mouse.getButtonCount()) {
            if (Mouse.isButtonDown((int)n)) {
                return (int)((long)-1775516994 ^ (long)-1775516993) != 0;
            }
            ++n;
        }
        return (int)((long)-225712640 ^ (long)-225712640) != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)484763294L ^ 0x1CE4E69E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1265097722 ^ (long)1265097477);
            int n2 = (int)((long)952364492 ^ (long)952364325);
            cArray2[n] = (char)(cArray[n] ^ ((int)564148308L ^ 0x21A00701 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

