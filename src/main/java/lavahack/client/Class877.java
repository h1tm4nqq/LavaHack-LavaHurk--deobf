//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;

@Deprecated
public class Class877 extends Class42
{
    private final Class44 Field11686;
    private final Class44 Field11687;
    private final Class44 Field11688;
    private final Class44 Field11689;
    private final Class44 Field11690;
    private final Class44 Field11691;
    private final Class44 Field11692;
    private final Class1920 Field11693;
    private final Class44 Field11694;
    private final Class44 Field11695;
    private final Class1920 Field11696;
    private final Class44 Field11697;
    private int Field11698;
    private List Field11699;
    private Map Field11700;
    private String Field11701 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class877() {
        super("HoleESPRewrite", Class97.Field8342);
        this.Field11686 = this.Method23(new Class44("Obsidian", (Class42)this, true));
        this.Field11687 = this.Method23(new Class44("Bedrock", (Class42)this, true));
        this.Field11688 = this.Method23(new Class44("Single", (Class42)this, true));
        this.Field11689 = this.Method23(new Class44("Double", (Class42)this, true));
        this.Field11690 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)365904260 ^ 0x4028000015CF4184L), 1.0, Double.longBitsToDouble(4626322717216342016L), false));
        this.Field11691 = this.Method23(new Class44("Limit", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4632233691727265792L), true));
        this.Field11692 = this.Method23(new Class44("RenderObsidian", (Class42)this, true));
        this.Field11693 = new Class1087((Class42)this, "").Method2729();
        this.Field11694 = this.Method23(new Class44("Height", (Class42)this, 1.0, 0.0, 1.0, false));
        this.Field11695 = this.Method23(new Class44("RenderBedrock", (Class42)this, true));
        this.Field11696 = new Class1087((Class42)this, "2").Method2729();
        this.Field11697 = this.Method23(new Class44("Height 2", (Class42)this, 1.0, 0.0, 1.0, false));
        this.Field11698 = 0;
        this.Field11699 = new ArrayList();
        this.Field11700 = new HashMap(128);
    }
    
    public void Method45() {
        if (Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field11699 = this.Method3673();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3672(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        final HashSet<AxisAlignedBB> set = new HashSet<AxisAlignedBB>(128);
        for (final Class1862 class1862 : this.Field11699) {
            if (class1862 == null) {
                continue;
            }
            final Class410 method6960 = class1862.Method6960();
            if (method6960 == null) {
                return;
            }
            if (method6960 == Class410.Field9699 && !this.Field11695.Method365()) {
                continue;
            }
            if (!this.Field11692.Method365()) {
                continue;
            }
            final Class2125 class1863 = this.Field11700.get(class1862);
            if (class1863 == null) {
                continue;
            }
            if (set.contains(class1862.Method6961())) {
                continue;
            }
            final Class1240 class1864 = new Class1240(class1862.Method6961());
            class1864.Field13621 = class1864.Field13618 + this.Field11694.Method367();
            if (method6960 == Class410.Field9697) {
                class1864.Field13621 = class1864.Field13618 + this.Field11697.Method367();
            }
            class1863.Method7308(class1864).Method7317();
            set.add(class1862.Method6961());
        }
        set.clear();
    }
    
    private List Method3673() {
        final ArrayList list = new ArrayList(64);
        final Set method3675 = this.Method3675(this.Field11690.Method368());
        this.Field11698 = 0;
        this.Field11700.clear();
        if (this.Field11688.Method365()) {
            list.addAll(this.Method3674(method3675, Class422.Field9768));
        }
        if (this.Field11689.Method365()) {
            list.addAll(this.Method3674(method3675, Class422.Field9769));
        }
        return list;
    }
    
    private List Method3674(final Set set, final Class422 class422) {
        final ArrayList<Class1862> list = new ArrayList<Class1862>(32);
        for (final BlockPos blockPos : set) {
            if (this.Field11691.Method335() != 0 && this.Field11698 > this.Field11691.Method335()) {
                break;
            }
            final Class1862 method7131 = Class1914.Method7131(blockPos, false, false);
            final Class422 method7132 = method7131.Method6959();
            final Class410 method7133 = method7131.Method6960();
            if (method7132 != class422) {
                continue;
            }
            if (method7133 == Class410.Field9697 && this.Field11687.Method365()) {
                list.add(method7131);
                this.Field11700.put(method7131, this.Field11696.Method2732());
                ++this.Field11698;
            }
            else {
                if (!this.Field11686.Method365()) {
                    continue;
                }
                list.add(method7131);
                this.Field11700.put(method7131, this.Field11693.Method2732());
                ++this.Field11698;
            }
        }
        return list;
    }
    
    private Set Method3675(final float n) {
        final HashSet<BlockPos> set = new HashSet<BlockPos>();
        for (final BlockPos blockPos : Class394.Method1946(new BlockPos(Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), n, (int)n, false, true, 0)) {
            if (!Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos)).isEmpty()) {
                continue;
            }
            if (!Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (!Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (!Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            set.add(blockPos);
        }
        return set;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2DDF ^ 0x55));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
