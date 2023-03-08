//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1437 extends Class42
{
    private final Class44 Field14729;
    public Class44 Field14730;
    private final Class44 Field14731;
    private final Class44 Field14732;
    private final Class44 Field14733;
    private final Class1996 Field14734;
    private final Class1612 Field14735;
    private final Class237 Field14736;
    private final Class44 Field14737;
    private final Class44 Field14738;
    public final Class44 Field14739;
    public static Class1437 Field14740;
    private int Field14741;
    
    public Class1437() {
        super("PacketMine", "PacketMineProvider implementation", Class97.Field8344);
        this.Field14729 = this.Method23(new Class44("Speed", this, Double.longBitsToDouble(4605380979056443392L), Double.longBitsToDouble((long)1117574771 ^ 0x3FB99999E29CD673L), 1.0, false));
        this.Field14730 = this.Method23(new Class44("Instant", this, true));
        this.Field14731 = this.Method23(new Class44("Silent", this, true));
        this.Field14732 = this.Method23(new Class44("Strict", this, false));
        this.Field14733 = this.Method23(new Class44("Auto Switch", this, true));
        this.Field14734 = this.Method24(new Class1996(new Class44("Render", this)));
        this.Field14735 = ((Class1612)new Class1612(this).Method772(this.Field14734)).Method3788().Method3789();
        this.Field14736 = ((Class237)new Class237(this).Method772(this.Field14734)).Method1307().Method1308();
        this.Field14737 = this.Method23(new Class44("Instant Attempts", this, Double.longBitsToDouble((long)1718386172 ^ 0x40200000666C7DFCL), 0.0, Double.longBitsToDouble((long)1171487593 ^ 0x4034000045D37B69L), true));
        this.Field14738 = this.Method23(new Class44("Range", this, Double.longBitsToDouble((long)2043564040 ^ 0x4030000079CE5008L), Double.longBitsToDouble((long)1254732952 ^ 0x401000004AC9B498L), Double.longBitsToDouble(4629137466983448576L), true));
        this.Field14739 = this.Method23(new Class44("Packet Spam", this, 1.0, 1.0, Double.longBitsToDouble((long)1397381716 ^ 0x40240000534A5A54L), true));
        Class1437.Field14740 = this;
    }
    
    private void Method20() {
        Class256.Field9152.Method1374(this.Field14731.Method365());
        Class256.Field9152.Method1376(this.Field14730.Method365());
        Class256.Field9152.Method1378(this.Field14732.Method365());
        Class256.Field9152.Method1384(this.Field14733.Method365());
        Class256.Field9152.Method1380(this.Field14729.Method367());
        Class256.Field9152.Method1382(this.Field14738.Method335());
        Class256.Field9152.Method1386(this.Field14737.Method335());
        Class256.Field9152.Method1388(this.Field14739.Method335());
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class256.Field9152.Method1403();
    }
    
    @Override
    public void Method45() {
        this.Method20();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method5745(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class256.Field9152.Method1369() != null && Class1437.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(Class256.Field9152.Method1369()).getBlock() != Blocks.AIR && !(Class1437.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(Class256.Field9152.Method1369()).getBlock() instanceof BlockLiquid)) {
            this.Field14735.Method3804(Class1486.Method5945(Class256.Field9152.Method1369(), Class1437.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class9.Method109(Class256.Field9152.Method1369())), Class256.Field9152.Method1397(), this.Field14736));
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4762 ^ 0x79));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
