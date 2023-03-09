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

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class117;
import lavahack.client.Class1334;
import lavahack.client.Class254;
import lavahack.client.Class256;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventPlayerMove;", "kotlin.jvm.PlatformType", "invoke"})
final class Class143
implements Class254 {
    public static final Class143 Field8568 = new Class143();
    private String Field8569 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method980((Class1334)object);
    }

    public final void Method980(Class1334 class1334) {
        if (!Class256.Method1409(Class256.Field9152)) {
            return;
        }
        if (Class256.Field9152.Method1369() != null) {
            if (Class256.Field9152.Method1375()) {
                WorldClient worldClient = Class2142.Field17803.world;
                BlockPos blockPos = Class256.Field9152.Method1369();
                if (blockPos == null) {
                    Intrinsics.throwNpe();
                }
                IBlockState iBlockState = worldClient.getBlockState(blockPos);
                Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)Class143.Method981("\u6fa0\u6fd2\u6fbc\u6f57\u6fc0\u6f29\u6fb1\u6fa9\u6fed\u6f20\u6f67\u6f28\u6f38\u6fda\u6f1e\u6fa4\u6ff2\u6f44\u6f11\u6f85\u6fdb\u6f92\u6fea\u6f9a\u6fa6\u6f2a\u6fc8\u6fdd\u6fca\u6fb2\u6f7d\u6f85\u6f95\u6f3a"));
                if (Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR)) {
                    if (!Class256.Field9152.Method1393()) {
                        Class256.Field9152.Method1396(0);
                        Class256.Field9152.Method1394(true);
                        Class256.Field9152.Method1398(System.currentTimeMillis());
                        Class256.Field9152.Method1392(false);
                    }
                } else {
                    if (Class256.Field9152.Method1377() && !Class256.Field9152.Method1391()) {
                        WorldClient worldClient2 = Class2142.Field17803.world;
                        BlockPos blockPos2 = Class256.Field9152.Method1369();
                        if (blockPos2 == null) {
                            Intrinsics.throwNpe();
                        }
                        IBlockState iBlockState2 = worldClient2.getBlockState(blockPos2);
                        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState2, (String)Class143.Method981("\u6fa0\u6fd2\u6fbc\u6f57\u6fc0\u6f29\u6fb1\u6fa9\u6fed\u6f20\u6f67\u6f28\u6f38\u6fda\u6f1e\u6fa4\u6ff2\u6f44\u6f11\u6f85\u6fdb\u6f92\u6fea\u6f9a\u6fa6\u6f2a\u6fc8\u6fdd\u6fca\u6fb2\u6f7d\u6f85\u6f95\u6f3a"));
                        Block block = iBlockState2.getBlock();
                        if (!Intrinsics.areEqual((Object)block, (Object)Blocks.ENDER_CHEST) && !Intrinsics.areEqual((Object)block, (Object)Blocks.ANVIL)) {
                            Class256.Field9152.Method1396(0);
                            Class256.Field9152.Method1370(null);
                            Class256.Field9152.Method1392(true);
                            return;
                        }
                    }
                    Class256.Field9152.Method1394(false);
                }
            }
            if (Class256.Method1410(Class256.Field9152)) {
                WorldClient worldClient = Class2142.Field17803.world;
                BlockPos blockPos = Class256.Field9152.Method1369();
                if (blockPos == null) {
                    Intrinsics.throwNpe();
                }
                IBlockState iBlockState = worldClient.getBlockState(blockPos);
                Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)Class143.Method981("\u6fa0\u6fd2\u6fbc\u6f57\u6fc0\u6f29\u6fb1\u6fa9\u6fed\u6f20\u6f67\u6f28\u6f38\u6fda\u6f1e\u6fa4\u6ff2\u6f44\u6f11\u6f85\u6fdb\u6f92\u6fea\u6f9a\u6fa6\u6f2a\u6fc8\u6fdd\u6fca\u6fb2\u6f7d\u6f85\u6f95\u6f3a"));
                if (Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ true && Class256.Field9152.Method1383()) {
                    Class117 class117 = Class256.Method1411(Class256.Field9152);
                    Boolean bl = class117 != null ? Boolean.valueOf(class117.Method844()) : null;
                    if (bl == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!bl.booleanValue()) {
                        return;
                    }
                }
            }
            if (!Class256.Field9152.Method1389()) {
                Class256.Field9152.Method1402(Class2142.Field17803.player.inventory.currentItem);
            }
            if (Class256.Field9152.Method1369() != null) {
                EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
                BlockPos blockPos = Class256.Field9152.Method1369();
                if (blockPos == null) {
                    Intrinsics.throwNpe();
                }
                double d = entityPlayerSP.getDistanceSq(blockPos);
                double d2 = Class256.Field9152.Method1381();
                return (void)(d2 * d2);
            }
        }
        Class2142.Field17803.playerController.blockHitDelay = 0;
    }

    Class143() {
    }

    private static String Method981(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 129;
            cArray2[n] = (char)(cArray[n] ^ (0x6F4C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

