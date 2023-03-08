//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class839 extends Class42
{
    private final Class44 Field11562;
    private final Class44 Field11563;
    private final Class44 Field11564;
    private final Class44 Field11565;
    private String Field11566 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class839() {
        super("BlockLiner", "dev/debug module", Class97.Field8342);
        this.Field11562 = this.Method23(new Class44("XVal", (Class42)this, Double.longBitsToDouble((long)1813376185 ^ 0x401000006C15ECB9L), Double.longBitsToDouble((long)150203151 ^ 0xC024000008F3EB0FL), Double.longBitsToDouble(4621819117588971520L), true));
        this.Field11563 = this.Method23(new Class44("ZVal", (Class42)this, Double.longBitsToDouble((long)1604976983 ^ 0x401000005FAA0157L), Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble((long)1921199825 ^ 0x4024000072832ED1L), true));
        this.Field11564 = this.Method23(new Class44("Connect", (Class42)this, false));
        this.Field11565 = this.Method23(new Class44("Mode", (Class42)this, "Inside", (List)Arrays.asList("Inside", "Outside")));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3564(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class839.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class839.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        System.out.println("Rendering...");
        final BlockPos blockPos = new BlockPos(Class839.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Double.longBitsToDouble(4616189618054758400L), Class839.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        final List method4535 = Class1106.Method4535(blockPos, blockPos.add(this.Field11562.Method367(), 0.0, this.Field11563.Method367()), this.Field11564.Method365(), this.Field11565.Method359().equals("Outside"));
        System.out.println(method4535.isEmpty());
        if (method4535.isEmpty()) {
            return;
        }
        final Iterator<BlockPos> iterator = method4535.iterator();
        while (iterator.hasNext()) {
            Class815.Method3446(Class815.Method3447(new AxisAlignedBB((BlockPos)iterator.next())), 2.0f, new Class2027(255, 255, 255, 120), Class815.Field11486, Class2008.Field17214);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6CC2 ^ 0xF2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
