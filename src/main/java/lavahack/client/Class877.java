//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lavahack.client.Class1087;
import lavahack.client.Class1240;
import lavahack.client.Class1862;
import lavahack.client.Class1914;
import lavahack.client.Class1920;
import lavahack.client.Class2125;
import lavahack.client.Class394;
import lavahack.client.Class410;
import lavahack.client.Class42;
import lavahack.client.Class422;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Deprecated
public class Class877
extends Class42 {
    private final Class44 Field11686 = this.Method23(new Class44("Obsidian", (Class42)this, true));
    private final Class44 Field11687 = this.Method23(new Class44("Bedrock", (Class42)this, true));
    private final Class44 Field11688 = this.Method23(new Class44("Single", (Class42)this, true));
    private final Class44 Field11689 = this.Method23(new Class44("Double", (Class42)this, true));
    private final Class44 Field11690 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)365904260 ^ 0x4028000015CF4184L), 1.0, Double.longBitsToDouble(0x4034000000000000L), false));
    private final Class44 Field11691 = this.Method23(new Class44("Limit", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4049000000000000L), true));
    private final Class44 Field11692 = this.Method23(new Class44("RenderObsidian", (Class42)this, true));
    private final Class1920 Field11693 = new Class1087(this, "").Method2729();
    private final Class44 Field11694 = this.Method23(new Class44("Height", (Class42)this, 1.0, 0.0, 1.0, false));
    private final Class44 Field11695 = this.Method23(new Class44("RenderBedrock", (Class42)this, true));
    private final Class1920 Field11696 = new Class1087(this, "2").Method2729();
    private final Class44 Field11697 = this.Method23(new Class44("Height 2", (Class42)this, 1.0, 0.0, 1.0, false));
    private int Field11698 = 0;
    private List Field11699 = new ArrayList();
    private Map Field11700 = new HashMap(128);
    private String Field11701 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class877() {
        super("HoleESPRewrite", Class97.Field8342);
    }

    @Override
    public void Method45() {
        if (Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field11699 = this.Method3673();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3672(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        HashSet<AxisAlignedBB> hashSet = new HashSet<AxisAlignedBB>(128);
        Iterator iterator = this.Field11699.iterator();
        while (true) {
            Class2125 class2125;
            if (!iterator.hasNext()) {
                hashSet.clear();
                return;
            }
            Class1862 class1862 = (Class1862)iterator.next();
            if (class1862 == null) continue;
            Class410 class410 = class1862.Method6960();
            if (class410 == null) {
                return;
            }
            if (class410 == Class410.Field9699 && !this.Field11695.Method365() || !this.Field11692.Method365() || (class2125 = (Class2125)this.Field11700.get(class1862)) == null || hashSet.contains(class1862.Method6961())) continue;
            Class1240 class1240 = new Class1240(class1862.Method6961());
            class1240.Field13621 = class1240.Field13618 + this.Field11694.Method367();
            if (class410 == Class410.Field9697) {
                class1240.Field13621 = class1240.Field13618 + this.Field11697.Method367();
            }
            class2125.Method7308(class1240).Method7317();
            hashSet.add(class1862.Method6961());
        }
    }

    private List Method3673() {
        ArrayList arrayList = new ArrayList(64);
        float f = this.Field11690.Method368();
        Set set = this.Method3675(f);
        this.Field11698 = 0;
        this.Field11700.clear();
        if (this.Field11688.Method365()) {
            arrayList.addAll(this.Method3674(set, Class422.Field9768));
        }
        if (!this.Field11689.Method365()) return arrayList;
        arrayList.addAll(this.Method3674(set, Class422.Field9769));
        return arrayList;
    }

    private List Method3674(Set set, Class422 class422) {
        ArrayList<Class1862> arrayList = new ArrayList<Class1862>(32);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (this.Field11691.Method335() != 0 && this.Field11698 > this.Field11691.Method335()) {
                return arrayList;
            }
            Class1862 class1862 = Class1914.Method7131(blockPos, false, false);
            Class422 class4222 = class1862.Method6959();
            Class410 class410 = class1862.Method6960();
            if (class4222 != class422) continue;
            if (class410 == Class410.Field9697 && this.Field11687.Method365()) {
                arrayList.add(class1862);
                this.Field11700.put(class1862, this.Field11696.Method2732());
                ++this.Field11698;
                continue;
            }
            if (!this.Field11686.Method365()) continue;
            arrayList.add(class1862);
            this.Field11700.put(class1862, this.Field11693.Method2732());
            ++this.Field11698;
        }
        return arrayList;
    }

    private Set Method3675(float f) {
        HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
        List list = Class394.Method1946(new BlockPos(Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), f, (int)f, false, true, 0);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
            if (!Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).isEmpty() || !Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock().equals(Blocks.AIR) || !Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.AIR) || !Class877.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) continue;
            hashSet.add(blockPos);
        }
        return hashSet;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 85;
            cArray2[n] = (char)(cArray[n] ^ (0x2DDF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

