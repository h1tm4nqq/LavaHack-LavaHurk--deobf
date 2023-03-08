//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.network.play.client.*;

public class Class665 extends Class42
{
    private final Class44 Field10821;
    private final Class44 Field10822;
    private final Class44 Field10823;
    private int Field10824;
    @Class1801
    private final Class618 Field10825;
    private int Field10826;
    
    public Class665() {
        super("TickShift", "boobs", Class97.Field8344);
        this.Field10821 = this.Method23(new Class44("Ticks", (Class42)this, Double.longBitsToDouble((long)1826685873 ^ 0x403200006CE103B1L), 1.0, Double.longBitsToDouble(4641240890982006784L), true));
        this.Field10822 = this.Method23(new Class44("Timer", (Class42)this, Double.longBitsToDouble((long)1001913323 ^ 0x3FFCCCCCF77B3726L), 1.0, Double.longBitsToDouble((long)1010252471 ^ 0x400800003C373AB7L), false));
        this.Field10823 = this.Method23(new Class44("While Speed Effect", (Class42)this, false));
        this.Field10824 = 0;
        this.Field10825 = new Class618(this::Method2839, new Predicate[0]);
    }
    
    public void Method38() {
        Class1796.Field16242.Method706(this.Field10825);
        this.Field10824 = 0;
    }
    
    public void Method39() {
        Class1796.Field16242.Method711(this.Field10825);
        Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(1112014848);
    }
    
    public void Method45() {
        if (Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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
            Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = (float)(Double.longBitsToDouble(4632233691727265792L) / this.Field10822.Method367());
        }
        if (!Class1744.Method6651((EntityLivingBase)Class665.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
            ++this.Field10824;
        }
        if (this.Field10824 >= this.Field10821.Method335()) {
            this.Field10824 = this.Field10821.Method335();
        }
    }
    
    private void Method2839(final Class805 class805) {
        if (class805.Method982() instanceof CPacketPlayer) {
            --this.Field10824;
            if (this.Field10824 <= 0) {
                this.Field10824 = 0;
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6EC8 ^ 0xFB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
