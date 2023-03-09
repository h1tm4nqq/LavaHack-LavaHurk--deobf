//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.init.MobEffects
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1744;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.network.play.client.CPacketPlayer;

public class Class665
extends Class42 {
    private final Class44 Field10821 = this.Method23(new Class44("Ticks", (Class42)this, Double.longBitsToDouble((long)1826685873 ^ 0x403200006CE103B1L), 1.0, Double.longBitsToDouble(4641240890982006784L), true));
    private final Class44 Field10822 = this.Method23(new Class44("Timer", (Class42)this, Double.longBitsToDouble((long)1001913323 ^ 0x3FFCCCCCF77B3726L), 1.0, Double.longBitsToDouble((long)1010252471 ^ 0x400800003C373AB7L), false));
    private final Class44 Field10823 = this.Method23(new Class44("While Speed Effect", (Class42)this, false));
    private int Field10824 = 0;
    @Class1801
    private final Class618 Field10825 = new Class618(this::Method2839, new Predicate[0]);
    private int Field10826;

    public Class665() {
        super("TickShift", "boobs", Class97.Field8344);
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field10825);
        this.Field10824 = 0;
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field10825);
        Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(1112014848);
    }

    @Override
    public void Method45() {
        if (Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field10823.Method365() && Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.SPEED)) {
            this.Field10824 = 0;
            Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(1112014848);
            return;
        }
        if (this.Field10824 <= 0) {
            this.Field10824 = 0;
        }
        Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(1112014848);
        if (this.Field10824 > 0 && Class1744.Method6651((EntityLivingBase)Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
            --this.Field10824;
            Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = (float)(Double.longBitsToDouble(0x4049000000000000L) / this.Field10822.Method367());
        }
        if (!Class1744.Method6651((EntityLivingBase)Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
            ++this.Field10824;
        }
        if (this.Field10824 < this.Field10821.Method335()) return;
        this.Field10824 = this.Field10821.Method335();
    }

    private void Method2839(Class805 class805) {
        if (!(class805.Method982() instanceof CPacketPlayer)) return;
        --this.Field10824;
        if (this.Field10824 > 0) return;
        this.Field10824 = 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 251;
            cArray2[n] = (char)(cArray[n] ^ (0x6EC8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

