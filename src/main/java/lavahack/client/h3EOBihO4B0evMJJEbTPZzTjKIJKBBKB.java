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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.mZKglU52NJKeleKf9WRZyyfpIeAgybGE;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Mouse;

public class h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17593 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Diagonals", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1584096150 ^ (long)1584096151)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17594 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entities", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-244712801L ^ 0xF169FA9F) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17595 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("IgnoreTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x80C6D3F4FEEC9E3EL ^ 0xC0D6D3F4FEEC9E3EL), 0.0, Double.longBitsToDouble((long)2008707667 ^ 0x4034000077BA7253L), (boolean)((long)-1659543898 ^ (long)-1659543897)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17596 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Interpolate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)315464389 ^ (long)315464388)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17597 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x8CAD68B49A2AD276L ^ 0xB314F12D03B34BECL), 0.0, Double.longBitsToDouble((long)831931330 ^ 0x40140000319643C2L), (boolean)((long)-520675148 ^ (long)-520675148)).Method313(this.Field17596::Method365));
    private int Field17598 = (int)((long)-1952997166 ^ (long)-1952997166);
    private int Field17599;

    public h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB() {
        super("YawLock", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7648(RenderWorldLastEvent renderWorldLastEvent) {
        if (h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaX != 0 || h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaY != 0 || h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.Method7649()) {
            this.Field17598 = this.Field17595.Method335();
            return;
        }
        if (this.Field17598 > 0) {
            this.Field17598 -= (int)-326507428L ^ 0xEC89E45D;
            return;
        }
        float f = Float.intBitsToFloat((int)((long)1733529099 ^ (long)619154955)) / (this.Field17593.Method365() ? Float.intBitsToFloat((int)2052384934L ^ 0x3B54E8A6) : Float.intBitsToFloat((int)1635019462L ^ 0x21F46AC6));
        float f2 = h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw + Float.intBitsToFloat((int)((long)559017061 ^ (long)1650846821));
        f2 = (float)Math.round(f2 / f) * f;
        h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw = h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = this.Field17596.Method365() ? mZKglU52NJKeleKf9WRZyyfpIeAgybGE.Method2508(h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, f2, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks(), this.Field17597.Method368()) : (f2 -= Float.intBitsToFloat((int)((long)677148098 ^ (long)1802008002)));
        Entity entity = h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity();
        if (!this.Field17594.Method365()) return;
        if (entity == null) return;
        entity.prevRotationYaw = entity.rotationYaw;
        entity.rotationYaw = h3EOBihO4B0evMJJEbTPZzTjKIJKBBKB.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
    }

    private static boolean Method7649() {
        int n = (int)((long)-929601950 ^ (long)-929601950);
        while (n < Mouse.getButtonCount()) {
            if (Mouse.isButtonDown((int)n)) {
                return (int)((long)-380803648 ^ (long)-380803647) != 0;
            }
            ++n;
        }
        return (int)((long)-1188747398 ^ (long)-1188747398) != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)981479157 ^ (long)981479157);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)643768774L ^ 0x265F2139);
            int n2 = (int)((long)-1724373248 ^ (long)-1724373217) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)1097676119L ^ 0x416D14D6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

