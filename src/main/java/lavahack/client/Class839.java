//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1106;
import lavahack.client.Class2008;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class815;
import lavahack.client.Class97;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class839
extends Class42 {
    private final Class44 Field11562 = this.Method23(new Class44("XVal", (Class42)this, Double.longBitsToDouble((long)1813376185 ^ 0x401000006C15ECB9L), Double.longBitsToDouble((long)150203151 ^ 0xC024000008F3EB0FL), Double.longBitsToDouble(0x4024000000000000L), true));
    private final Class44 Field11563 = this.Method23(new Class44("ZVal", (Class42)this, Double.longBitsToDouble((long)1604976983 ^ 0x401000005FAA0157L), Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble((long)1921199825 ^ 0x4024000072832ED1L), true));
    private final Class44 Field11564 = this.Method23(new Class44("Connect", (Class42)this, false));
    private final Class44 Field11565 = this.Method23(new Class44("Mode", (Class42)this, "Inside", Arrays.asList("Inside", "Outside")));
    private String Field11566 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class839() {
        super("BlockLiner", "dev/debug module", Class97.Field8342);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3564(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class839.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class839.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        System.out.println("Rendering...");
        BlockPos blockPos = new BlockPos(Class839.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Double.longBitsToDouble(0x4010000000000000L), Class839.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos2 = blockPos.add(this.Field11562.Method367(), 0.0, this.Field11563.Method367());
        List list = Class1106.Method4535(blockPos, blockPos2, this.Field11564.Method365(), this.Field11565.Method359().equals("Outside"));
        System.out.println(list.isEmpty());
        if (list.isEmpty()) {
            return;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos3 = (BlockPos)iterator.next();
            AxisAlignedBB axisAlignedBB = Class815.Method3447(new AxisAlignedBB(blockPos3));
            Class815.Method3446(axisAlignedBB, 2.0f, new Class2027(255, 255, 255, 120), Class815.Field11486, Class2008.Field17214);
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 242;
            cArray2[n] = (char)(cArray[n] ^ (0x6CC2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

