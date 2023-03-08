//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class Class600 extends Class42
{
    private final Class1303 Field10545;
    private final Class1303 Field10546;
    private final Class1303 Field10547;
    private final Class44 Field10548;
    private final Class44 Field10549;
    private final Class1303 Field10550;
    private final Class44 Field10551;
    private final Class44 Field10552;
    private final Class44 Field10553;
    private final Class44 Field10554;
    private final Class44 Field10555;
    private EnumFacing Field10556;
    private String Field10557 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class600() {
        super("SelfTrapRewrite", Class97.Field8338, true);
        this.Field10545 = new Class1303("EventMode", (Class42)this, (Enum)Class1507.Field15059).Method5303();
        this.Field10546 = new Class1303("Mode", (Class42)this, (Enum)Class973.Field12174).Method5303();
        this.Field10547 = new Class1303("Switch", (Class42)this, (Enum)Class711.Field11028);
        this.Field10548 = this.Method23(new Class44("Smart", (Class42)this, false));
        this.Field10549 = this.Method23(new Class44("SurroundBlocks", (Class42)this, true));
        this.Field10550 = new Class1303("HelpingBlocks", (Class42)this, (Enum)Class1832.Field16467).Method5303();
        this.Field10551 = this.Method23(new Class44("Down", (Class42)this, true));
        this.Field10552 = this.Method23(new Class44("Center", (Class42)this, false));
        this.Field10553 = this.Method23(new Class44("Rotate", (Class42)this, false));
        this.Field10554 = this.Method23(new Class44("Packet", (Class42)this, false));
        this.Field10555 = this.Method23(new Class44("DisableOnComplete", (Class42)this, true));
        this.Field10556 = null;
    }
    
    public void Method38() {
        if (Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        super.Method38();
        if (!this.Field10552.Method365()) {
            return;
        }
        final double n = Math.floor(Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)113430872 ^ 0x3FE0000006C2D158L);
        final double n2 = Math.floor(Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4602678819172646912L);
        Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(n, Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, n2, Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(n, Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, n2);
    }
    
    public void Method39() {
        super.Method39();
        this.Field10556 = null;
    }
    
    public void Method45() {
        if (this.Field10545.Method341() != Class1507.Field15060) {
            return;
        }
        this.Method20();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2583(final TickEvent tickEvent) {
        if (this.Field10545.Method341() != Class1507.Field15059) {
            return;
        }
        this.Method20();
    }
    
    private void Method20() {
        if (Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final List method2587 = this.Method2587();
        method2587.addAll(0, this.Method2588());
        if (this.Field10551.Method365()) {
            method2587.add(0, this.Method2589().down());
        }
        if (this.Field10555.Method365() && this.Method2584(method2587)) {
            this.Field10556 = null;
            this.Method22();
            return;
        }
        this.Method2585(method2587);
    }
    
    private boolean Method2584(final List list) {
        for (final BlockPos blockPos : list) {
            if (Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
                return false;
            }
        }
        return true;
    }
    
    private void Method2585(final List list) {
        final int method127 = Class9.Method127(Blocks.OBSIDIAN);
        if (method127 == -1) {
            return;
        }
        final int currentItem = Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        for (final BlockPos blockPos : list) {
            if (Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
                if (this.Method2586(blockPos)) {
                    continue;
                }
                ((Class711)this.Field10547.Method341()).Method2972().Method1726(new Object[] { method127, false });
                Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field10553.Method365(), this.Field10554.Method365());
                ((Class711)this.Field10547.Method341()).Method2972().Method1726(new Object[] { currentItem, true });
            }
        }
    }
    
    private boolean Method2586(final BlockPos blockPos) {
        for (final Entity entity : Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
            if (!(entity instanceof EntityItem)) {
                if (entity instanceof EntityXPOrb) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    private List Method2587() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        if (this.Field10556 == null) {
            this.Field10556 = Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing().getOpposite();
        }
        if (this.Field10546.Method341() == Class973.Field12174 || this.Field10549.Method365()) {
            list.addAll((Collection<?>)Arrays.stream(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)this::Method2596).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
        }
        else {
            list.add(this.Method2589().offset(this.Field10556));
        }
        list.addAll((Collection<?>)Arrays.stream(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)this::Method2595).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
        if (this.Field10548.Method365()) {
            if (Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(this.Method2589().up(2)).getBlock().isReplaceable((IBlockAccess)Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Method2589().up(2))) {
                list.add(this.Method2589().up(2).offset(this.Field10556));
                list.add(this.Method2589().up(2));
            }
        }
        else {
            list.add(this.Method2589().up(2).offset(this.Field10556));
            list.add(this.Method2589().up(2));
        }
        if (this.Field10546.Method341() == Class973.Field12174) {
            return list;
        }
        list.removeAll(Arrays.stream(EnumFacing.HORIZONTALS).filter(this::Method2594).map((Function<? super EnumFacing, ?>)this::Method2593).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
        return list;
    }
    
    private List Method2588() {
        if (this.Field10550.Method341() == Class1832.Field16467) {
            return Collections.emptyList();
        }
        if (this.Field10550.Method341() == Class1832.Field16468) {
            return Arrays.stream(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)this::Method2592).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
        }
        return Arrays.stream(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)this::Method2591).filter((Predicate<? super Object>)Class600::Method2590).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
    }
    
    private BlockPos Method2589() {
        return new BlockPos(Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }
    
    private static boolean Method2590(final BlockPos blockPos) {
        return Class1036.Method4213(blockPos.up()).isEmpty();
    }
    
    private BlockPos Method2591(final EnumFacing enumFacing) {
        return this.Method2589().down().offset(enumFacing);
    }
    
    private BlockPos Method2592(final EnumFacing enumFacing) {
        return this.Method2589().down().offset(enumFacing);
    }
    
    private BlockPos Method2593(final EnumFacing enumFacing) {
        return this.Method2589().up().offset(enumFacing);
    }
    
    private boolean Method2594(final EnumFacing enumFacing) {
        return enumFacing != this.Field10556;
    }
    
    private BlockPos Method2595(final EnumFacing enumFacing) {
        return this.Method2589().up().offset(enumFacing);
    }
    
    private BlockPos Method2596(final EnumFacing enumFacing) {
        return this.Method2589().offset(enumFacing);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3059 ^ 0x90));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
