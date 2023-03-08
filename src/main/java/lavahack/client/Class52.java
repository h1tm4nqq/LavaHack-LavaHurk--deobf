//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import net.minecraft.util.math.*;
import java.util.stream.*;
import java.util.*;
import net.minecraft.util.*;
import java.util.function.*;

@Class1887
public class Class52 extends Class42
{
    private final Class1996 Field8152;
    private final List Field8153;
    private Map Field8154;
    private String Field8155 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private void Method20() {
        this.Field8153.add(new Class1919(this.Field8152));
    }
    
    public Class52() {
        super("Blocker", Class97.Field8338);
        this.Field8152 = this.Method24(new Class1996(new Class44("CrystalPushBlocker", (Class42)this)));
        this.Field8154 = new ConcurrentHashMap();
        this.Field8153 = new Vector();
        Class1629.Field15608 = this::Method462;
        this.Method20();
    }
    
    public void Method39() {
        super.Method39();
        this.Field8154.clear();
    }
    
    private List Method458() {
        final List<BlockPos> list = Arrays.asList(new BlockPos(Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble(4599075939470750515L), Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(4599075939470750515L)), new BlockPos(Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)779481584 ^ 0x3FD333331D46C2C3L), Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(4599075939470750515L)), new BlockPos(Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble(4599075939470750515L), Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(4599075939470750515L)), new BlockPos(Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)448151814 ^ 0x3FD3333329857235L), Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(4599075939470750515L)));
        final ArrayList list2 = new ArrayList<Object>(list);
        list.forEach((Consumer<? super Object>)Class52::Method461);
        list2.removeAll(list);
        return list2.stream().distinct().filter((Predicate<? super Object>)Class52::Method460).filter((Predicate<? super Object>)Class52::Method459).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
    }
    
    public void Method45() {
        final ConcurrentHashMap<Class1629, Boolean> field8154 = new ConcurrentHashMap<Class1629, Boolean>();
        for (final Class1629 class1629 : this.Field8153) {
            final Boolean b = this.Field8154.get(class1629);
            if (b != null) {
                if (b != class1629.Method6362()) {
                    if (class1629.Method6362()) {
                        class1629.Method6364();
                    }
                    else {
                        class1629.Method6365();
                    }
                }
            }
            else if (class1629.Method6362()) {
                class1629.Method6364();
            }
            field8154.put(class1629, class1629.Method6362());
            if (class1629.Method6362()) {
                class1629.Method6366();
            }
        }
        this.Field8154 = field8154;
    }
    
    private static boolean Method459(final BlockPos blockPos) {
        return !Class1036.Method4213(blockPos).isEmpty();
    }
    
    private static boolean Method460(final BlockPos blockPos) {
        return Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable();
    }
    
    private static void Method461(final List list, final BlockPos blockPos) {
        list.addAll(Arrays.stream(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)blockPos::offset).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
    }
    
    private Class52 Method462() {
        return this;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x42DB ^ 0x51));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
