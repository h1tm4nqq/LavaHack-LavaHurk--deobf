//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import com.kisman.cc.util.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.function.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import java.util.concurrent.*;

@Class2012
@Class99
public class Class1043 extends Class42
{
    @Class873
    public static Class1043 Field12594;
    private final Class1996 Field12595;
    private final Class1996 Field12596;
    private final Class1996 Field12597;
    private final Class44 Field12598;
    private final Class44 Field12599;
    private final Class44 Field12600;
    private final Class44 Field12601;
    private final Class44 Field12602;
    private final Class44 Field12603;
    private final Class44 Field12604;
    private final Class1303 Field12605;
    private final Class44 Field12606;
    private final Class44 Field12607;
    private final Class44 Field12608;
    private final Class44 Field12609;
    private final Class44 Field12610;
    private final Class44 Field12611;
    private final Class44 Field12612;
    private final Class44 Field12613;
    private final Class44 Field12614;
    private final Class1515 Field12615;
    private final Class411 Field12616;
    private final Class61 Field12617;
    private final Class1352 Field12618;
    @Class1274
    public Entity Field12619;
    private List Field12620;
    private final Class650 Field12621;
    private final Set Field12622;
    private int Field12623;
    private BlockPos Field12624;
    private String Field12625 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1043() {
        super("HoleFillerRewrite", Class97.Field8338);
        this.Field12595 = this.Method24(new Class1996(new Class44("Logic", this)));
        this.Field12596 = this.Method24(new Class1996(new Class44("Render", this)));
        this.Field12597 = this.Method24(this.Field12595.Method7406(new Class1996(new Class44("Holes", this))));
        this.Field12598 = this.Method23(this.Field12597.Method7405(new Class44("ObsidianHoles", this, true).Method355("Obby")));
        this.Field12599 = this.Method23(this.Field12597.Method7405(new Class44("BedrockHoles", this, true).Method355("Bebrock")));
        this.Field12600 = this.Method23(this.Field12597.Method7405(new Class44("SingleHoles", this, true).Method355("1x1")));
        this.Field12601 = this.Method23(this.Field12597.Method7405(new Class44("DoubleHoles", this, true).Method355("2x1")));
        this.Field12602 = this.Method23(this.Field12597.Method7405(new Class44("CustomHoles", this, true).Method355("Custom")));
        this.Field12603 = this.Method23(this.Field12595.Method7405(new Class44("Blocks", this, "Obsidian", Arrays.asList("Obsidian", "EnderChest"))));
        this.Field12604 = this.Method23(this.Field12595.Method7405(new Class44("Switch", this, "Silent", Arrays.asList("None", "Vanilla", "Normal", "Packet", "Silent"))));
        this.Field12605 = this.Method25(this.Field12595.Method7407(new Class1303("Rotate", this, Class135.Field8498)));
        this.Field12606 = this.Method23(this.Field12595.Method7405(new Class44("Packet", this, false)));
        this.Field12607 = this.Method23(this.Field12595.Method7405(new Class44("Place", this, "Instant", Arrays.asList("Instant", "Tick", "Delay"))));
        this.Field12608 = this.Method23(this.Field12595.Method7405(new Class44("Entity Check", this, false)));
        this.Field12609 = this.Method23(this.Field12595.Method7405(new Class44("Delay", this, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble((long)2127216719 ^ 0x407F40007ECAC04FL), Class467.Field9943).Method313(this::Method4270)));
        this.Field12610 = this.Method23(this.Field12595.Method7405(new Class44("PlaceMode", this, "All", Arrays.asList("All", "Target"))));
        this.Field12611 = this.Method23(this.Field12595.Method7405(new Class44("TargetRange", this, Double.longBitsToDouble(4621819117588971520L), 1.0, Double.longBitsToDouble((long)2025165580 ^ 0x402E000078B5930CL), false).Method313(this::Method4269)));
        this.Field12612 = this.Method23(this.Field12595.Method7405(new Class44("TargetHoleRange", this, Double.longBitsToDouble((long)289960835 ^ 0x4010000011487383L), 1.0, Double.longBitsToDouble((long)860736168 ^ 0x40240000334DCAA8L), false).Method313(this::Method4268)));
        this.Field12613 = this.Method23(this.Field12595.Method7405(new Class44("HoleRange", this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble(4621819117588971520L), false)));
        this.Field12614 = this.Method23(this.Field12595.Method7405(new Class44("Limit", this, 0.0, 0.0, Double.longBitsToDouble((long)1426651140 ^ 0x404900005508F804L), true)));
        this.Field12615 = new Class1515(this).Method6046(this.Field12596).Method6042().Method6043();
        this.Field12616 = this.Method54();
        this.Field12617 = new Class61(this.Field12611::Method367, this::Method4267, this.Field12616.Method2001()::Method365);
        this.Field12618 = new Class1352();
        this.Field12619 = null;
        this.Field12620 = new ArrayList();
        this.Field12621 = new Class650();
        this.Field12622 = new HashSet(512);
        this.Field12623 = 0;
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
        if (Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field12617.Method499();
        this.Field12619 = (Entity)(this.Field12610.Method359().equals("All") ? Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player : this.Field12617.Method496());
        if (this.Field12619 == null) {
            return;
        }
        this.Field12616.Method2005(this::Method4264);
        this.Method4253(this.Field12619);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4252(final RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field12615.Method3790()) {
            this.Field12618.Method2990(this.Field12615, this.Field12624, null);
        }
    }
    
    private void Method4253(final Entity entity) {
        final int method4260 = this.Method4260();
        if (method4260 == -1) {
            return;
        }
        if (this.Field12607.Method359().equals("Instant")) {
            this.Field12620.forEach(this::Method4263);
        }
        else if (this.Field12607.Method359().equals("Tick")) {
            this.Method4254(entity, method4260);
        }
        else if (this.Field12607.Method359().equals("Delay") && this.Field12621.Method2797((long)this.Field12609.Method335())) {
            this.Method4254(entity, method4260);
        }
        this.Field12621.Method2801();
    }
    
    private void Method4254(final Entity entity, final int n) {
        for (final BlockPos field12624 : this.Field12620) {
            if (this.Field12622.contains(field12624)) {
                continue;
            }
            if (!Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity((Entity)null, Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(field12624).getSelectedBoundingBox((World)Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, field12624)).isEmpty()) {
                continue;
            }
            this.Method4261(this.Field12624 = field12624, n);
            this.Field12622.add(field12624);
            break;
        }
        this.Field12622.clear();
    }
    
    private List Method4255(final Entity entity) {
        final Class931 class931 = new Class931();
        final Set method4257 = this.Method4257(entity, entity.equals((Object)Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) ? this.Field12613.Method368() : this.Field12612.Method368());
        this.Field12623 = 0;
        if (this.Field12600.Method365()) {
            class931.Method3856(this.Method4256(method4257, Class422.Field9768), this.Field12608.Method365());
        }
        if (this.Field12601.Method365()) {
            class931.Method3856(this.Method4256(method4257, Class422.Field9769), this.Field12608.Method365());
        }
        if (this.Field12602.Method365()) {
            class931.Method3856(this.Method4256(method4257, Class422.Field9770), this.Field12608.Method365());
        }
        return class931;
    }
    
    private List Method4256(final Set set, final Class422 class422) {
        final ArrayList list = new ArrayList(32);
        for (final BlockPos blockPos : set) {
            if (this.Field12614.Method335() != 0 && this.Field12623 > this.Field12614.Method335()) {
                break;
            }
            final Class1862 method7131 = Class1914.Method7131(blockPos, false, false);
            final Class422 method7132 = method7131.Method6959();
            final Class410 method7133 = method7131.Method6960();
            if (method7132 != class422) {
                continue;
            }
            if (method7133 == Class410.Field9697 && this.Field12599.Method365()) {
                list.addAll(this.Method4259(method7131.Method6961()));
                ++this.Field12623;
            }
            else {
                if (!this.Field12598.Method365()) {
                    continue;
                }
                list.addAll(this.Method4259(method7131.Method6961()));
                ++this.Field12623;
            }
        }
        return list;
    }
    
    private Set Method4257(final Entity entity, final float n) {
        final HashSet<BlockPos> set = new HashSet<BlockPos>();
        for (final BlockPos blockPos : Class394.Method1946(this.Method4258(entity), n, (int)n, false, true, 0)) {
            if (!Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos)).isEmpty()) {
                continue;
            }
            if (!Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (!Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (!Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            set.add(blockPos);
        }
        return set;
    }
    
    private BlockPos Method4258(final Entity entity) {
        return new BlockPos(entity.posX, entity.posY, entity.posZ);
    }
    
    private List Method4259(final AxisAlignedBB axisAlignedBB) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final double n = axisAlignedBB.maxX - axisAlignedBB.minX;
        final double n2 = axisAlignedBB.maxZ - axisAlignedBB.minZ;
        if (n > Double.longBitsToDouble(4611686018427387904L) && n2 > Double.longBitsToDouble((long)1419744139 ^ 0x40000000549F938BL)) {
            return list;
        }
        if (n > n2) {
            for (int i = (int)axisAlignedBB.minX; i < (int)axisAlignedBB.maxX; ++i) {
                list.add(new BlockPos(i, (int)axisAlignedBB.minY, (int)axisAlignedBB.minZ));
            }
        }
        else {
            for (int j = (int)axisAlignedBB.minZ; j < (int)axisAlignedBB.maxZ; ++j) {
                list.add(new BlockPos((int)axisAlignedBB.minX, (int)axisAlignedBB.minY, j));
            }
        }
        return list;
    }
    
    private int Method4260() {
        if (this.Field12603.Method359().equals("Obsidian")) {
            return Class9.Method127(Blocks.OBSIDIAN);
        }
        return Class9.Method127(Blocks.ENDER_CHEST);
    }
    
    private void Method4261(final BlockPos blockPos, final int n) {
        if (Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory == null) {
            return;
        }
        final int currentItem = Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method4262(n, false);
        Class1036.Method4209(blockPos, EnumHand.MAIN_HAND, (Class135)this.Field12605.Method341(), this.Field12606.Method365());
        this.Method4262(currentItem, true);
        Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
    }
    
    private void Method4262(final int n, final boolean b) {
        final String method359 = this.Field12604.Method359();
        switch (method359.hashCode()) {
            case 2433880: {
                if (method359.equals("None")) {
                    break;
                }
                break;
            }
            case 1897755483: {
                if (method359.equals("Vanilla")) {
                    break;
                }
                break;
            }
            case -1955878649: {
                if (method359.equals("Normal")) {
                    break;
                }
                break;
            }
            case -1911998296: {
                if (method359.equals("Packet")) {
                    break;
                }
                break;
            }
            case -1818460043: {
                if (method359.equals("Silent")) {
                    break;
                }
                break;
            }
        }
    }
    
    @Override
    public boolean Method52() {
        return true;
    }
    
    private void Method4263(final int n, final BlockPos blockPos) {
        this.Method4261(blockPos, n);
    }
    
    private void Method4264() {
        Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask((Callable)this::Method4265);
    }
    
    private List Method4265() throws Exception {
        return this.Field12620 = this.Method4255(this.Field12619);
    }
    
    private String Method4266() {
        return (this.Field12619 == null) ? " no target no fun" : ("[" + ((this.Field12619 != Class1043.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) ? this.Field12619.getName() : "Self") + "]");
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
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x603E ^ 0x41));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
