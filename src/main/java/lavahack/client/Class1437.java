//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.init.Blocks
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.Class1486;
import lavahack.client.Class1612;
import lavahack.client.Class1996;
import lavahack.client.Class237;
import lavahack.client.Class256;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.BlockLiquid;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1437
extends Class42 {
    private final Class44 Field14729 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble(4605380979056443392L), Double.longBitsToDouble((long)1117574771 ^ 0x3FB99999E29CD673L), 1.0, false));
    public Class44 Field14730 = this.Method23(new Class44("Instant", (Class42)this, true));
    private final Class44 Field14731 = this.Method23(new Class44("Silent", (Class42)this, true));
    private final Class44 Field14732 = this.Method23(new Class44("Strict", (Class42)this, false));
    private final Class44 Field14733 = this.Method23(new Class44("Auto Switch", (Class42)this, true));
    private final Class1996 Field14734 = this.Method24(new Class1996(new Class44("Render", this)));
    private final Class1612 Field14735 = ((Class1612)new Class1612(this).Method772(this.Field14734)).Method3788().Method3789();
    private final Class237 Field14736 = ((Class237)new Class237(this).Method772(this.Field14734)).Method1307().Method1308();
    private final Class44 Field14737 = this.Method23(new Class44("Instant Attempts", (Class42)this, Double.longBitsToDouble((long)1718386172 ^ 0x40200000666C7DFCL), 0.0, Double.longBitsToDouble((long)1171487593 ^ 0x4034000045D37B69L), true));
    private final Class44 Field14738 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)2043564040 ^ 0x4030000079CE5008L), Double.longBitsToDouble((long)1254732952 ^ 0x401000004AC9B498L), Double.longBitsToDouble(4629137466983448576L), true));
    public final Class44 Field14739 = this.Method23(new Class44("Packet Spam", (Class42)this, 1.0, 1.0, Double.longBitsToDouble((long)1397381716 ^ 0x40240000534A5A54L), true));
    public static Class1437 Field14740;
    private int Field14741;

    public Class1437() {
        super("PacketMine", "PacketMineProvider implementation", Class97.Field8344);
        Field14740 = this;
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
    public void Method5745(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class256.Field9152.Method1369() == null) return;
        if (Class1437.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(Class256.Field9152.Method1369()).getBlock() == Blocks.AIR) return;
        if (Class1437.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(Class256.Field9152.Method1369()).getBlock() instanceof BlockLiquid) return;
        this.Field14735.Method3804(Class1486.Method5945(Class256.Field9152.Method1369(), Class1437.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class9.Method109(Class256.Field9152.Method1369())), Class256.Field9152.Method1397(), this.Field14736));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 121;
            cArray2[n] = (char)(cArray[n] ^ (0x4762 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

