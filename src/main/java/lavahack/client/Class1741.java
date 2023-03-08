//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.play.server.*;
import com.kisman.cc.mixin.mixins.accessor.*;

public class Class1741 extends Class42
{
    @Class1801
    private final Class618 Field15984;
    private int Field15985;
    
    public Class1741() {
        super("ChorusTP", Class97.Field8345, true);
        this.Field15984 = new Class618(this::Method6620, new Predicate[0]);
    }
    
    private void Method6620(final Class544 class544) {
        if (Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (!(class544.Method982() instanceof SPacketEntityTeleport)) {
            return;
        }
        final SPacketEntityTeleport sPacketEntityTeleport = (SPacketEntityTeleport)class544.Method982();
        if (sPacketEntityTeleport.getEntityId() != Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityId()) {
            return;
        }
        ((ISPacketEntityTeleport)sPacketEntityTeleport).Method804(Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getX() + Double.longBitsToDouble((long)997876689 ^ 0x3FE000003B7A63D1L));
        ((ISPacketEntityTeleport)sPacketEntityTeleport).Method805(Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getY() + 1.0);
        ((ISPacketEntityTeleport)sPacketEntityTeleport).Method806(Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getZ() + Double.longBitsToDouble(4602678819172646912L));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2EAD ^ 0xB2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
