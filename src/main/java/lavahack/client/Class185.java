//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.item.*;
import net.minecraft.util.math.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;

public class Class185 extends Class42
{
    private final Class44 Field8807;
    private int Field8808;
    
    public Class185() {
        super("BowSpam", "", Class97.Field8338);
        this.Field8807 = this.Method23(new Class44("DrawLength", this, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4626604192193052672L), true));
    }
    
    @Override
    public void Method45() {
        if (Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null && Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemBow && Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() >= this.Field8807.Method367()) {
            Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing()));
            Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActiveHand()));
            Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.stopActiveHand();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2E6F ^ 0x1F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
