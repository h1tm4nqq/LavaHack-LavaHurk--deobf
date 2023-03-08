//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.init.*;
import java.util.function.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import java.util.stream.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import java.util.*;

public class Class469 extends Class42
{
    private final Class1303 Field9950;
    private final Class44 Field9951;
    private final Class44 Field9952;
    private int Field9953;
    private List Field9954;
    private String Field9955 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class469() {
        super("ScaffoldTest2", Class97.Field8345);
        this.Field9950 = new Class1303("Switch", (Class42)this, (Enum)Class711.Field11028).Method5303();
        this.Field9951 = this.Method23(new Class44("Rotate", (Class42)this, false));
        this.Field9952 = this.Method23(new Class44("Packet", (Class42)this, false));
        this.Field9954 = new ArrayList();
    }
    
    public void Method38() {
        if (Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        this.Field9953 = (int)Math.floor(Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        this.Field9954.clear();
    }
    
    public void Method45() {
        if (Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final int method127 = Class9.Method127(Blocks.OBSIDIAN);
        if (method127 == -1) {
            return;
        }
        final int currentItem = Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        final int n = (int)Math.floor(Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        final BlockPos blockPos = new BlockPos(Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)this.Field9953, Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        List<BlockPos> field9954 = (List<BlockPos>)this.Method2198(Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, this.Field9953 - 1, Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (!Class1036.Method4213(blockPos).isEmpty()) {
            field9954 = Arrays.asList(blockPos);
        }
        if (this.Method2196(Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, this.Field9953 - 1, Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) || (this.Field9954.size() >= 2 && field9954.stream().filter((Predicate<? super Object>)this::Method2203).count() > 1L)) {
            this.Field9953 = n;
            return;
        }
        ((Class711)this.Field9950.Method341()).Method2972().Method1726(new Object[] { method127, false });
        for (final BlockPos blockPos2 : field9954) {
            if (Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getBlock().isReplaceable((IBlockAccess)Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2)) {
                if (this.Method2197(blockPos2)) {
                    continue;
                }
                Class1036.Method4208(blockPos2, EnumHand.MAIN_HAND, this.Field9951.Method365(), this.Field9952.Method365());
            }
        }
        ((Class711)this.Field9950.Method341()).Method2972().Method1726(new Object[] { currentItem, true });
        this.Field9953 = n;
        this.Field9954 = field9954;
    }
    
    private boolean Method2196(final double n, final double n2, final double n3) {
        final List<? super BlockPos> list = Stream.of(new BlockPos[] { new BlockPos(n + Double.longBitsToDouble((long)778156855 ^ 0x3FD333331D528804L), n2, n3 + Double.longBitsToDouble(4599075939470750515L)), new BlockPos(n + Double.longBitsToDouble((long)74929198 ^ 0x3FD333333744671DL), n2, n3 - Double.longBitsToDouble((long)1214751420 ^ 0x3FD333337B54918FL)), new BlockPos(n - Double.longBitsToDouble(4599075939470750515L), n2, n3 + Double.longBitsToDouble((long)18635702 ^ 0x3FD33333322F6885L)), new BlockPos(n - Double.longBitsToDouble((long)893733392 ^ 0x3FD3333306767923L), n2, n3 - Double.longBitsToDouble(4599075939470750515L)) }).distinct().collect((Collector<? super BlockPos, ?, List<? super BlockPos>>)Collectors.toList());
        int n4 = 0;
        for (final BlockPos blockPos : list) {
            if (!Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
                ++n4;
            }
        }
        return false;
    }
    
    private boolean Method2197(final BlockPos blockPos) {
        for (final Entity entity : Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
            if (!(entity instanceof EntityItem)) {
                if (entity instanceof EntityXPOrb) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    private List Method2198(final double n, final double n2, final double n3) {
        final List method2199 = this.Method2199(n, n2, n3);
        if (method2199.size() == 0) {
            return Arrays.asList(new BlockPos[0]);
        }
        if (method2199.size() == 1) {
            return Arrays.asList((BlockPos)method2199.iterator().next().Method6308());
        }
        final ArrayList<Object> list = new ArrayList<Object>();
        final Iterator<Class1621> iterator = method2199.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().Method6308());
        }
        if (list.size() == 2) {
            return list;
        }
        final ArrayList<Object> list2 = new ArrayList<Object>();
        list2.add(method2199.stream().max(Class469::Method2202).get().Method6308());
        list2.add(method2199.stream().min(Class469::Method2201).get().Method6308());
        method2199.removeAll(list2);
        list2.add(method2199.stream().max(Class469::Method2200).get().Method6308());
        return list2;
    }
    
    private List Method2199(final double n, final double n2, final double n3) {
        final List<? super BlockPos> list = Stream.of(new BlockPos[] { new BlockPos(n + Double.longBitsToDouble((long)459527121 ^ 0x3FD333332850E0E2L), n2, n3 + Double.longBitsToDouble(4599075939470750515L)), new BlockPos(n + Double.longBitsToDouble((long)1004576582 ^ 0x3FD3333308D3AC75L), n2, n3 - Double.longBitsToDouble(4599075939470750515L)), new BlockPos(n - Double.longBitsToDouble(4599075939470750515L), n2, n3 + Double.longBitsToDouble((long)26196296 ^ 0x3FD3333332BC8A7BL)), new BlockPos(n - Double.longBitsToDouble((long)2141068506 ^ 0x3FD333334CAD2FE9L), n2, n3 - Double.longBitsToDouble(4599075939470750515L)) }).distinct().collect((Collector<? super BlockPos, ?, List<? super BlockPos>>)Collectors.toList());
        if (list.size() < 1) {
            return Collections.emptyList();
        }
        if (list.size() == 1) {
            return Collections.singletonList(new Class1621((Object)Double.longBitsToDouble((long)240002613 ^ 0x3FD70A3D7EEDF13FL), (Object)list.get(0)));
        }
        if (list.size() != 2) {
            final double n4 = (double)Math.round(n);
            final double n5 = (double)Math.round(n3);
            final double abs = Math.abs(n3 - Double.longBitsToDouble((long)1175244450 ^ 0x3FD33333753FFD91L) - n5);
            final double abs2 = Math.abs(n + Double.longBitsToDouble((long)684705496 ^ 0x3FD333331BFCF5EBL) - n4);
            final double abs3 = Math.abs(n3 + Double.longBitsToDouble((long)1008548294 ^ 0x3FD333330F2E0AF5L) - n5);
            final double abs4 = Math.abs(n - Double.longBitsToDouble((long)855547319 ^ 0x3FD3333301CDAE84L) - n4);
            final ArrayList<Class1621> list2 = new ArrayList<Class1621>();
            list2.add(new Class1621((Object)(abs3 * abs2), (Object)list.get(0)));
            list2.add(new Class1621((Object)(abs * abs2), (Object)list.get(1)));
            list2.add(new Class1621((Object)(abs4 * abs3), (Object)list.get(2)));
            list2.add(new Class1621((Object)(abs4 * abs), (Object)list.get(3)));
            return list2;
        }
        final BlockPos blockPos = list.get(0);
        final BlockPos blockPos2 = list.get(1);
        if (blockPos.getZ() == blockPos2.getZ()) {
            final double d = Double.longBitsToDouble((long)1703095147 ^ 0x3FE3333356B01858L) * Math.abs(n + Double.longBitsToDouble((long)846104959 ^ 0x3FD33333015DBA4CL) - Math.round(n));
            final ArrayList<Class1621> list3 = new ArrayList<Class1621>();
            list3.add(new Class1621((Object)d, (Object)((blockPos.getX() > blockPos2.getX()) ? blockPos : blockPos2)));
            list3.add(new Class1621((Object)(Double.longBitsToDouble((long)1001361411 ^ 0x3FD70A3D4B0C4709L) - d), (Object)((blockPos.getX() <= blockPos2.getX()) ? blockPos : blockPos2)));
            return list3;
        }
        final double d2 = Double.longBitsToDouble(4603579539098121011L) * Math.abs(n3 + Double.longBitsToDouble((long)819909931 ^ 0x3FD3333303EDE618L) - Math.round(n3));
        final ArrayList<Class1621> list4 = new ArrayList<Class1621>();
        list4.add(new Class1621((Object)d2, (Object)((blockPos.getZ() > blockPos2.getZ()) ? blockPos : blockPos2)));
        list4.add(new Class1621((Object)(Double.longBitsToDouble(4600156803381319434L) - d2), (Object)((blockPos.getZ() <= blockPos2.getZ()) ? blockPos : blockPos2)));
        return list4;
    }
    
    private static int Method2200(final Class1621 class1621, final Class1621 class1622) {
        return Double.compare((double)class1621.Method6307(), (double)class1622.Method6307());
    }
    
    private static int Method2201(final Class1621 class1621, final Class1621 class1622) {
        return Double.compare((double)class1621.Method6307(), (double)class1622.Method6307());
    }
    
    private static int Method2202(final Class1621 class1621, final Class1621 class1622) {
        return Double.compare((double)class1621.Method6307(), (double)class1622.Method6307());
    }
    
    private boolean Method2203(final BlockPos blockPos) {
        return this.Field9954.contains(blockPos);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x39B6 ^ 0xBD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
