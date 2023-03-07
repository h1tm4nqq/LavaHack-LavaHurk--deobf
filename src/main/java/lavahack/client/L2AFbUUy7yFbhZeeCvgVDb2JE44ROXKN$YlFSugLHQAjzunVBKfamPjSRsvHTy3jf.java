//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.G4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8;
import lavahack.client.L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventPlayerMove;", "kotlin.jvm.PlatformType", "invoke"})
final class L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field8568 = new L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
    private String Field8569 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method980((uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x)object);
    }

    public final void Method980(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2) {
        if (!L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Method1409(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152)) {
            return;
        }
        if (L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369() != null) {
            if (L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1375()) {
                WorldClient worldClient = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world;
                BlockPos blockPos = L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369();
                if (blockPos == null) {
                    Intrinsics.throwNpe();
                }
                IBlockState iBlockState = worldClient.getBlockState(blockPos);
                Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method981("\u6fa0\u6fd2\u6fbc\u6f57\u6fc0\u6f29\u6fb1\u6fa9\u6fed\u6f20\u6f67\u6f28\u6f38\u6fda\u6f1e\u6fa4\u6ff2\u6f44\u6f11\u6f85\u6fdb\u6f92\u6fea\u6f9a\u6fa6\u6f2a\u6fc8\u6fdd\u6fca\u6fb2\u6f7d\u6f85\u6f95\u6f3a"));
                if (Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR)) {
                    if (!L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1393()) {
                        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1396((int)-222586391L ^ 0xF2BB99E9);
                        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1394(((int)1371128750L ^ 0x51B9C3AF) != 0);
                        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1398(System.currentTimeMillis());
                        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1392(((int)1370407341L ^ 0x51AEC1AD) != 0);
                    }
                } else {
                    if (L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1377() && !L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1391()) {
                        WorldClient worldClient2 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world;
                        BlockPos blockPos2 = L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369();
                        if (blockPos2 == null) {
                            Intrinsics.throwNpe();
                        }
                        IBlockState iBlockState2 = worldClient2.getBlockState(blockPos2);
                        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState2, (String)L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method981("\u6fa0\u6fd2\u6fbc\u6f57\u6fc0\u6f29\u6fb1\u6fa9\u6fed\u6f20\u6f67\u6f28\u6f38\u6fda\u6f1e\u6fa4\u6ff2\u6f44\u6f11\u6f85\u6fdb\u6f92\u6fea\u6f9a\u6fa6\u6f2a\u6fc8\u6fdd\u6fca\u6fb2\u6f7d\u6f85\u6f95\u6f3a"));
                        Block block = iBlockState2.getBlock();
                        if (!Intrinsics.areEqual((Object)block, (Object)Blocks.ENDER_CHEST) && !Intrinsics.areEqual((Object)block, (Object)Blocks.ANVIL)) {
                            L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1396((int)1209403477L ^ 0x48160855);
                            L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1370(null);
                            L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1392((boolean)((long)-1682976924 ^ (long)-1682976923));
                            return;
                        }
                    }
                    L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1394((boolean)((long)958125918 ^ (long)958125918));
                }
            }
            if (L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Method1410(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152)) {
                WorldClient worldClient = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world;
                BlockPos blockPos = L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369();
                if (blockPos == null) {
                    Intrinsics.throwNpe();
                }
                IBlockState iBlockState = worldClient.getBlockState(blockPos);
                Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method981("\u6fa0\u6fd2\u6fbc\u6f57\u6fc0\u6f29\u6fb1\u6fa9\u6fed\u6f20\u6f67\u6f28\u6f38\u6fda\u6f1e\u6fa4\u6ff2\u6f44\u6f11\u6f85\u6fdb\u6f92\u6fea\u6f9a\u6fa6\u6f2a\u6fc8\u6fdd\u6fca\u6fb2\u6f7d\u6f85\u6f95\u6f3a"));
                if ((Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ (int)((long)948766579 ^ (long)948766578)) != 0 && L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1383()) {
                    G4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8 g4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8 = L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Method1411(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152);
                    Boolean bl = g4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8 != null ? Boolean.valueOf(g4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8.Method844()) : null;
                    if (bl == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!bl.booleanValue()) {
                        return;
                    }
                }
            }
            if (!L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1389()) {
                L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1402(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.inventory.currentItem);
            }
            if (L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369() != null) {
                EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
                BlockPos blockPos = L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369();
                if (blockPos == null) {
                    Intrinsics.throwNpe();
                }
                double d = entityPlayerSP.getDistanceSq(blockPos);
                double d2 = L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1381();
                return (void)(d2 * d2);
            }
        }
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.playerController.blockHitDelay = (int)((long)937124717 ^ (long)937124717);
    }

    L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    private static String Method981(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)963771811 ^ (long)963771811);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1891435914 ^ (long)-1891435895);
            int n2 = (int)((long)1339346047 ^ (long)1339346174);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)648089416 ^ (long)648090779) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

