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
import lavahack.client.PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.z8jqWjC6qe83En2OBrLpROsiqSx1KUxr;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
public class N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8152 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CrystalPushBlocker", this)));
    private final List Field8153;
    private Map Field8154 = new ConcurrentHashMap();
    private String Field8155 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private void Method20() {
        PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL pTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL = new PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL(this.Field8152);
        this.Field8153.add(pTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL);
    }

    public N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb() {
        super("Blocker", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        this.Field8153 = new Vector();
        z8jqWjC6qe83En2OBrLpROsiqSx1KUxr.Field15608 = this::Method462;
        this.Method20();
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field8154.clear();
    }

    private List Method458() {
        BlockPos[] blockPosArray = new BlockPos[((int)458583606L ^ 0x1B556E37) << 2];
        blockPosArray[(int)-1515821110L ^ 0xA5A667CA] = new BlockPos(N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble(0xB1F0ACD416A2C61L ^ 0x34CC39FE72591F52L), N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(0xD446EB9EE08891ACL ^ 0xEB95D8ADD3BBA29FL));
        blockPosArray[(int)868155985L ^ 0x33BF0250] = new BlockPos(N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)779481584 ^ 0x3FD333331D46C2C3L), N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(0x6B5F99BF8283F28DL ^ 0x548CAA8CB1B0C1BEL));
        blockPosArray[(int)((long)-572219838 ^ (long)-572219837) << 1] = new BlockPos(N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble(0xAE4CE93F5E743ACBL ^ 0x919FDA0C6D4709F8L), N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(0xD0D4587AD0A4A8DDL ^ 0xEF076B49E3979BEEL));
        blockPosArray[(int)-353790299L ^ 0xEAE996A6] = new BlockPos(N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)448151814 ^ 0x3FD3333329857235L), N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(0xE0C68607043A0C73L ^ 0xDF15B53437093F40L));
        List<BlockPos> list = Arrays.asList(blockPosArray);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(list);
        list.forEach(arg_0 -> N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.Method461(arrayList, arg_0));
        arrayList.removeAll(list);
        return arrayList.stream().distinct().filter(N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb::Method460).filter(N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb::Method459).collect(Collectors.toList());
    }

    @Override
    public void Method45() {
        ConcurrentHashMap<z8jqWjC6qe83En2OBrLpROsiqSx1KUxr, Boolean> concurrentHashMap = new ConcurrentHashMap<z8jqWjC6qe83En2OBrLpROsiqSx1KUxr, Boolean>();
        Iterator iterator = this.Field8153.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field8154 = concurrentHashMap;
                return;
            }
            z8jqWjC6qe83En2OBrLpROsiqSx1KUxr z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2 = (z8jqWjC6qe83En2OBrLpROsiqSx1KUxr)iterator.next();
            Boolean bl = (Boolean)this.Field8154.get(z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2);
            if (bl != null) {
                if (bl.booleanValue() != z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2.Method6362()) {
                    if (z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2.Method6362()) {
                        z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2.Method6364();
                    } else {
                        z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2.Method6365();
                    }
                }
            } else if (z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2.Method6362()) {
                z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2.Method6364();
            }
            concurrentHashMap.put(z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2, z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2.Method6362());
            if (!z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2.Method6362()) continue;
            z8jqWjC6qe83En2OBrLpROsiqSx1KUxr2.Method6366();
        }
    }

    private static boolean Method459(BlockPos blockPos) {
        int n;
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty()) {
            n = (int)-719745453L ^ 0xD5198E52;
            return n != 0;
        }
        n = (int)((long)1069711048 ^ (long)1069711048);
        return n != 0;
    }

    private static boolean Method460(BlockPos blockPos) {
        return N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable();
    }

    private static void Method461(List list, BlockPos blockPos) {
        list.addAll(Arrays.stream(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).collect(Collectors.toList()));
    }

    private N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb Method462() {
        return this;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)800429507L ^ 0x2FB595C3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1287806039 ^ (long)1287806120);
            int n2 = (int)((long)-1013270193 ^ (long)-1013270242);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-775938620 ^ (long)-775921889) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

