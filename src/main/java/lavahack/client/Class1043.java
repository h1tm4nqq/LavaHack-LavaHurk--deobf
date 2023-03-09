//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lavahack.client.Class1036;
import lavahack.client.Class1274;
import lavahack.client.Class1303;
import lavahack.client.Class135;
import lavahack.client.Class1352;
import lavahack.client.Class1515;
import lavahack.client.Class1862;
import lavahack.client.Class1914;
import lavahack.client.Class1996;
import lavahack.client.Class2012;
import lavahack.client.Class394;
import lavahack.client.Class410;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class422;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class61;
import lavahack.client.Class873;
import lavahack.client.Class9;
import lavahack.client.Class931;
import lavahack.client.Class97;
import lavahack.client.Class99;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Class2012
@Class99
public class Class1043
extends Class42 {
    @Class873
    public static Class1043 Field12594;
    private final Class1996 Field12595 = this.Method24(new Class1996(new Class44("Logic", this)));
    private final Class1996 Field12596 = this.Method24(new Class1996(new Class44("Render", this)));
    private final Class1996 Field12597 = this.Method24(this.Field12595.Method7406(new Class1996(new Class44("Holes", this))));
    private final Class44 Field12598 = this.Method23(this.Field12597.Method7405(new Class44("ObsidianHoles", (Class42)this, true).Method355("Obby")));
    private final Class44 Field12599 = this.Method23(this.Field12597.Method7405(new Class44("BedrockHoles", (Class42)this, true).Method355("Bebrock")));
    private final Class44 Field12600 = this.Method23(this.Field12597.Method7405(new Class44("SingleHoles", (Class42)this, true).Method355("1x1")));
    private final Class44 Field12601 = this.Method23(this.Field12597.Method7405(new Class44("DoubleHoles", (Class42)this, true).Method355("2x1")));
    private final Class44 Field12602 = this.Method23(this.Field12597.Method7405(new Class44("CustomHoles", (Class42)this, true).Method355("Custom")));
    private final Class44 Field12603 = this.Method23(this.Field12595.Method7405(new Class44("Blocks", (Class42)this, "Obsidian", Arrays.asList("Obsidian", "EnderChest"))));
    private final Class44 Field12604 = this.Method23(this.Field12595.Method7405(new Class44("Switch", (Class42)this, "Silent", Arrays.asList("None", "Vanilla", "Normal", "Packet", "Silent"))));
    private final Class1303 Field12605 = this.Method25(this.Field12595.Method7407(new Class1303("Rotate", (Class42)this, Class135.Field8498)));
    private final Class44 Field12606 = this.Method23(this.Field12595.Method7405(new Class44("Packet", (Class42)this, false)));
    private final Class44 Field12607 = this.Method23(this.Field12595.Method7405(new Class44("Place", (Class42)this, "Instant", Arrays.asList("Instant", "Tick", "Delay"))));
    private final Class44 Field12608 = this.Method23(this.Field12595.Method7405(new Class44("Entity Check", (Class42)this, false)));
    private final Class44 Field12609 = this.Method23(this.Field12595.Method7405(new Class44("Delay", (Class42)this, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble((long)2127216719 ^ 0x407F40007ECAC04FL), Class467.Field9943).Method313(this::Method4270)));
    private final Class44 Field12610 = this.Method23(this.Field12595.Method7405(new Class44("PlaceMode", (Class42)this, "All", Arrays.asList("All", "Target"))));
    private final Class44 Field12611 = this.Method23(this.Field12595.Method7405(new Class44("TargetRange", (Class42)this, Double.longBitsToDouble(0x4024000000000000L), 1.0, Double.longBitsToDouble((long)2025165580 ^ 0x402E000078B5930CL), false).Method313(this::Method4269)));
    private final Class44 Field12612 = this.Method23(this.Field12595.Method7405(new Class44("TargetHoleRange", (Class42)this, Double.longBitsToDouble((long)289960835 ^ 0x4010000011487383L), 1.0, Double.longBitsToDouble((long)860736168 ^ 0x40240000334DCAA8L), false).Method313(this::Method4268)));
    private final Class44 Field12613 = this.Method23(this.Field12595.Method7405(new Class44("HoleRange", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble(0x4024000000000000L), false)));
    private final Class44 Field12614 = this.Method23(this.Field12595.Method7405(new Class44("Limit", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)1426651140 ^ 0x404900005508F804L), true)));
    private final Class1515 Field12615 = new Class1515(this).Method6046(this.Field12596).Method6042().Method6043();
    private final Class411 Field12616 = this.Method54();
    private final Class61 Field12617 = new Class61(this.Field12611::Method367, this::Method4267, this.Field12616.Method2001()::Method365);
    private final Class1352 Field12618 = new Class1352();
    @Class1274
    public Entity Field12619 = null;
    private List Field12620 = new ArrayList();
    private final Class650 Field12621 = new Class650();
    private final Set Field12622 = new HashSet(512);
    private int Field12623 = 0;
    private BlockPos Field12624;
    private String Field12625 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1043() {
        super("HoleFillerRewrite", Class97.Field8338);
        super.Method44(this::Method4266);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field12617.Method498();
        this.Field12616.Method2004();
        this.Field12618.Method2988();
        this.Field12624 = null;
    }

    @Override
    public void Method45() {
        if (Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field12617.Method499();
        Object object = this.Field12619 = this.Field12610.Method359().equals("All") ? Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player : this.Field12617.Method496();
        if (this.Field12619 == null) {
            return;
        }
        this.Field12616.Method2005(this::Method4264);
        this.Method4253(this.Field12619);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4252(RenderWorldLastEvent renderWorldLastEvent) {
        if (!this.Field12615.Method3790()) return;
        this.Field12618.Method2990(this.Field12615, this.Field12624, null);
    }

    private void Method4253(Entity entity) {
        int n = this.Method4260();
        if (n == -1) {
            return;
        }
        if (this.Field12607.Method359().equals("Instant")) {
            this.Field12620.forEach(arg_0 -> this.Method4263(n, arg_0));
        } else if (this.Field12607.Method359().equals("Tick")) {
            this.Method4254(entity, n);
        } else if (this.Field12607.Method359().equals("Delay") && this.Field12621.Method2797(this.Field12609.Method335())) {
            this.Method4254(entity, n);
        }
        this.Field12621.Method2801();
    }

    private void Method4254(Entity entity, int n) {
        boolean bl = true;
        for (BlockPos blockPos : this.Field12620) {
            if (this.Field12622.contains(blockPos) || !Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity(null, Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)).isEmpty()) continue;
            this.Field12624 = blockPos;
            this.Method4261(blockPos, n);
            this.Field12622.add(blockPos);
            bl = false;
            break;
        }
        this.Field12622.clear();
    }

    private List Method4255(Entity entity) {
        Class931 class931 = new Class931();
        float f = entity.equals((Object)Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) ? this.Field12613.Method368() : this.Field12612.Method368();
        Set set = this.Method4257(entity, f);
        this.Field12623 = 0;
        if (this.Field12600.Method365()) {
            class931.Method3856(this.Method4256(set, Class422.Field9768), this.Field12608.Method365());
        }
        if (this.Field12601.Method365()) {
            class931.Method3856(this.Method4256(set, Class422.Field9769), this.Field12608.Method365());
        }
        if (!this.Field12602.Method365()) return class931;
        class931.Method3856(this.Method4256(set, Class422.Field9770), this.Field12608.Method365());
        return class931;
    }

    private List Method4256(Set set, Class422 class422) {
        ArrayList arrayList = new ArrayList(32);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            List list;
            BlockPos blockPos = (BlockPos)iterator.next();
            if (this.Field12614.Method335() != 0 && this.Field12623 > this.Field12614.Method335()) {
                return arrayList;
            }
            Class1862 class1862 = Class1914.Method7131(blockPos, false, false);
            Class422 class4222 = class1862.Method6959();
            Class410 class410 = class1862.Method6960();
            if (class4222 != class422) continue;
            if (class410 == Class410.Field9697 && this.Field12599.Method365()) {
                list = this.Method4259(class1862.Method6961());
                arrayList.addAll(list);
                ++this.Field12623;
                continue;
            }
            if (!this.Field12598.Method365()) continue;
            list = this.Method4259(class1862.Method6961());
            arrayList.addAll(list);
            ++this.Field12623;
        }
        return arrayList;
    }

    private Set Method4257(Entity entity, float f) {
        HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
        List list = Class394.Method1946(this.Method4258(entity), f, (int)f, false, true, 0);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
            if (!Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).isEmpty() || !Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock().equals(Blocks.AIR) || !Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.AIR) || !Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) continue;
            hashSet.add(blockPos);
        }
        return hashSet;
    }

    private BlockPos Method4258(Entity entity) {
        return new BlockPos(entity.posX, entity.posY, entity.posZ);
    }

    private List Method4259(AxisAlignedBB axisAlignedBB) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        double d = axisAlignedBB.maxX - axisAlignedBB.minX;
        double d2 = axisAlignedBB.maxZ - axisAlignedBB.minZ;
        if (d > Double.longBitsToDouble(0x4000000000000000L) && d2 > Double.longBitsToDouble((long)1419744139 ^ 0x40000000549F938BL)) {
            return arrayList;
        }
        if (d > d2) {
            int n = (int)axisAlignedBB.minX;
            int n2 = (int)axisAlignedBB.maxX;
            while (n < n2) {
                arrayList.add(new BlockPos(n, (int)axisAlignedBB.minY, (int)axisAlignedBB.minZ));
                ++n;
            }
            return arrayList;
        }
        int n = (int)axisAlignedBB.minZ;
        int n3 = (int)axisAlignedBB.maxZ;
        while (n < n3) {
            arrayList.add(new BlockPos((int)axisAlignedBB.minX, (int)axisAlignedBB.minY, n));
            ++n;
        }
        return arrayList;
    }

    private int Method4260() {
        if (!this.Field12603.Method359().equals("Obsidian")) return Class9.Method127(Blocks.ENDER_CHEST);
        return Class9.Method127(Blocks.OBSIDIAN);
    }

    private void Method4261(BlockPos blockPos, int n) {
        if (Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory == null) {
            return;
        }
        int n2 = Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method4262(n, false);
        Class1036.Method4209(blockPos, EnumHand.MAIN_HAND, (Class135)this.Field12605.Method341(), this.Field12606.Method365());
        this.Method4262(n2, true);
        Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
    }

    private void Method4262(int n, boolean bl) {
        String string = this.Field12604.Method359();
        int n2 = -1;
        switch (string.hashCode()) {
            case 2433880: {
                if (!string.equals("None")) return;
                return;
            }
            case 1897755483: {
                if (!string.equals("Vanilla")) return;
                return;
            }
            case -1955878649: {
                if (!string.equals("Normal")) return;
                return;
            }
            case -1911998296: {
                if (!string.equals("Packet")) return;
                return;
            }
            case -1818460043: {
                if (!string.equals("Silent")) return;
                return;
            }
        }
    }

    @Override
    public boolean Method52() {
        return true;
    }

    private void Method4263(int n, BlockPos blockPos) {
        this.Method4261(blockPos, n);
    }

    private void Method4264() {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method4265);
    }

    private List Method4265() throws Exception {
        this.Field12620 = this.Method4255(this.Field12619);
        return this.Field12620;
    }

    private String Method4266() {
        if (this.Field12619 == null) {
            return " no target no fun";
        }
        String string = "[" + (this.Field12619 != Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player ? this.Field12619.getName() : "Self") + "]";
        return string;
    }

    private Long Method4267() {
        return this.Field12616.Method2000().Method369();
    }

    private Boolean Method4268() {
        return this.Field12610.Method359().equals("Target");
    }

    private Boolean Method4269() {
        return this.Field12610.Method359().equals("Target");
    }

    private Boolean Method4270() {
        return this.Field12607.Method359().equals("Delay");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 65;
            cArray2[n] = (char)(cArray[n] ^ (0x603E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

