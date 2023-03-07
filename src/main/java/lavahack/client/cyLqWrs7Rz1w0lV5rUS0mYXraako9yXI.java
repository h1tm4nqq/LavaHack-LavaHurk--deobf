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

import lavahack.client.L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.bAaIh3bYHxH7ANifZFFb4hVRX7sKeeUC;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vo8JGtFXaeonZQiouVGTbpILJYQDvWk4;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.block.BlockLiquid;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14729 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xDC3451ED600D952BL ^ 0xE3DDC874C00D952BL), Double.longBitsToDouble((long)1117574771 ^ 0x3FB99999E29CD673L), 1.0, (boolean)((long)146097946 ^ (long)146097946)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14730 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)423581916 ^ (long)423581917)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14731 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Silent", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1089416587L ^ 0x40EF2D8A) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14732 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Strict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1379562764 ^ (long)1379562764)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14733 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-877262128L ^ 0xCBB60AD1) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14734 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render", this)));
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field14735 = ((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this).Method772(this.Field14734)).Method3788().Method3789();
    private final bAaIh3bYHxH7ANifZFFb4hVRX7sKeeUC Field14736 = ((bAaIh3bYHxH7ANifZFFb4hVRX7sKeeUC)new bAaIh3bYHxH7ANifZFFb4hVRX7sKeeUC(this).Method772(this.Field14734)).Method1307().Method1308();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14737 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant Attempts", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1718386172 ^ 0x40200000666C7DFCL), 0.0, Double.longBitsToDouble((long)1171487593 ^ 0x4034000045D37B69L), ((int)1639130464L ^ 0x61B32561) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14738 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)2043564040 ^ 0x4030000079CE5008L), Double.longBitsToDouble((long)1254732952 ^ 0x401000004AC9B498L), Double.longBitsToDouble(0x2CCBB5AB98671C8EL ^ 0x6CF5B5AB98671C8EL), (boolean)((long)600304940 ^ (long)600304941)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14739 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet Spam", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble((long)1397381716 ^ 0x40240000534A5A54L), ((int)-836057601L ^ 0xCE2AC5FE) != 0));
    public static cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI Field14740;
    private int Field14741;

    public cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI() {
        super("PacketMine", "PacketMineProvider implementation", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
        Field14740 = this;
    }

    private void Method20() {
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1374(this.Field14731.Method365());
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1376(this.Field14730.Method365());
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1378(this.Field14732.Method365());
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1384(this.Field14733.Method365());
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1380(this.Field14729.Method367());
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1382(this.Field14738.Method335());
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1386(this.Field14737.Method335());
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1388(this.Field14739.Method335());
    }

    @Override
    public void Method38() {
        super.Method38();
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1403();
    }

    @Override
    public void Method45() {
        this.Method20();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5745(RenderWorldLastEvent renderWorldLastEvent) {
        if (L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369() == null) return;
        if (cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369()).getBlock() == Blocks.AIR) return;
        if (cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369()).getBlock() instanceof BlockLiquid) return;
        this.Field14735.Method3804(vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5945(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369(), cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method109(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369())), L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1397(), this.Field14736));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1633947655 ^ (long)-1633947655);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)179087045L ^ 0xAACA63A);
            int n2 = (int)-458376839L ^ 0xE4ADB900;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)669812688 ^ (long)669820001) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

