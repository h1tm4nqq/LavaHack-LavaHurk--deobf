//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import com.kisman.cc.util.*;
import net.minecraft.entity.player.*;

public class Class908 extends Class42
{
    private final Class44 Field11839;
    private final Class411 Field11840;
    private final Class61 Field11841;
    private int Field11842;
    
    public Class908() {
        super("BowAimBot", "", Class97.Field8338);
        this.Field11839 = this.Method23(new Class44("Max Distance", (Class42)this, Double.longBitsToDouble((long)845818903 ^ 0x40340000326A2C17L), 1.0, Double.longBitsToDouble((long)666774245 ^ 0x4049000027BE2AE5L), true));
        this.Field11840 = this.Method54();
        this.Field11841 = new Class61((Supplier)this.Field11839::Method367, (Supplier)this.Field11840.Method2000()::Method369, (Supplier)this.Field11840.Method2001()::Method365);
    }
    
    public void Method38() {
        this.Field11841.Method498();
    }
    
    public void Method45() {
        if (Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemBow && Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() >= 3) {
            final EntityPlayer method496 = this.Field11841.Method496();
            this.Field11841.Method499();
            if (method496 != null) {
                final float[] method497 = Class1055.Method4303(Class394.Method1943((Entity)Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks()), Class394.Method1943((Entity)method496, Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks()));
                Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = method497[0];
                Class908.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = method497[1];
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3E2E ^ 0x54));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
