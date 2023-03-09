//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import lavahack.client.Class1036;
import lavahack.client.Class1629;
import lavahack.client.Class1887;
import lavahack.client.Class1919;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

@Class1887
public class Class52
extends Class42 {
    private final Class1996 Field8152 = this.Method24(new Class1996(new Class44("CrystalPushBlocker", this)));
    private final List Field8153;
    private Map Field8154 = new ConcurrentHashMap();
    private String Field8155 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private void Method20() {
        Class1919 class1919 = new Class1919(this.Field8152);
        this.Field8153.add(class1919);
    }

    public Class52() {
        super("Blocker", Class97.Field8338);
        this.Field8153 = new Vector();
        Class1629.Field15608 = this::Method462;
        this.Method20();
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field8154.clear();
    }

    private List Method458() {
        List<BlockPos> list = Arrays.asList(new BlockPos(Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble(0x3FD3333333333333L), Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(0x3FD3333333333333L)), new BlockPos(Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)779481584 ^ 0x3FD333331D46C2C3L), Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(0x3FD3333333333333L)), new BlockPos(Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble(0x3FD3333333333333L), Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(0x3FD3333333333333L)), new BlockPos(Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)448151814 ^ 0x3FD3333329857235L), Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(0x3FD3333333333333L)));
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(list);
        list.forEach(arg_0 -> Class52.Method461(arrayList, arg_0));
        arrayList.removeAll(list);
        return arrayList.stream().distinct().filter(Class52::Method460).filter(Class52::Method459).collect(Collectors.toList());
    }

    @Override
    public void Method45() {
        ConcurrentHashMap<Class1629, Boolean> concurrentHashMap = new ConcurrentHashMap<Class1629, Boolean>();
        Iterator iterator = this.Field8153.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field8154 = concurrentHashMap;
                return;
            }
            Class1629 class1629 = (Class1629)iterator.next();
            Boolean bl = (Boolean)this.Field8154.get(class1629);
            if (bl != null) {
                if (bl.booleanValue() != class1629.Method6362()) {
                    if (class1629.Method6362()) {
                        class1629.Method6364();
                    } else {
                        class1629.Method6365();
                    }
                }
            } else if (class1629.Method6362()) {
                class1629.Method6364();
            }
            concurrentHashMap.put(class1629, class1629.Method6362());
            if (!class1629.Method6362()) continue;
            class1629.Method6366();
        }
    }

    private static boolean Method459(BlockPos blockPos) {
        if (Class1036.Method4213(blockPos).isEmpty()) return false;
        return true;
    }

    private static boolean Method460(BlockPos blockPos) {
        return Class52.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable();
    }

    private static void Method461(List list, BlockPos blockPos) {
        list.addAll(Arrays.stream(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).collect(Collectors.toList()));
    }

    private Class52 Method462() {
        return this;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 81;
            cArray2[n] = (char)(cArray[n] ^ (0x42DB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

