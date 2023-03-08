//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.block.state.*;
import net.minecraft.block.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventPlayerMove;", "kotlin.jvm.PlatformType", "invoke" })
final class Class143 implements Class254
{
    public static final Class143 Field8568;
    private String Field8569 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method980((Class1334)o);
    }
    
    public final void Method980(final Class1334 class1334) {
        if (!Class256.Method1409(Class256.Field9152)) {
            return;
        }
        if (Class256.Field9152.Method1369() != null) {
            if (Class256.Field9152.Method1375()) {
                final WorldClient world = Class2142.Field17803.world;
                final BlockPos method1369 = Class256.Field9152.Method1369();
                if (method1369 == null) {
                    Intrinsics.throwNpe();
                }
                final IBlockState getBlockState = world.getBlockState(method1369);
                Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, Method981("\u6fa0\u6fd2\u6fbc\u6f57\u6fc0\u6f29\u6fb1\u6fa9\u6fed\u6f20\u6f67\u6f28\u6f38\u6fda\u6f1e\u6fa4\u6ff2\u6f44\u6f11\u6f85\u6fdb\u6f92\u6fea\u6f9a\u6fa6\u6f2a\u6fc8\u6fdd\u6fca\u6fb2\u6f7d\u6f85\u6f95\u6f3a"));
                if (Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR)) {
                    if (!Class256.Field9152.Method1393()) {
                        Class256.Field9152.Method1396(0);
                        Class256.Field9152.Method1394(true);
                        Class256.Field9152.Method1398(System.currentTimeMillis());
                        Class256.Field9152.Method1392(false);
                    }
                }
                else {
                    if (Class256.Field9152.Method1377() && !Class256.Field9152.Method1391()) {
                        final WorldClient world2 = Class2142.Field17803.world;
                        final BlockPos method1370 = Class256.Field9152.Method1369();
                        if (method1370 == null) {
                            Intrinsics.throwNpe();
                        }
                        final IBlockState getBlockState2 = world2.getBlockState(method1370);
                        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState2, Method981("\u6fa0\u6fd2\u6fbc\u6f57\u6fc0\u6f29\u6fb1\u6fa9\u6fed\u6f20\u6f67\u6f28\u6f38\u6fda\u6f1e\u6fa4\u6ff2\u6f44\u6f11\u6f85\u6fdb\u6f92\u6fea\u6f9a\u6fa6\u6f2a\u6fc8\u6fdd\u6fca\u6fb2\u6f7d\u6f85\u6f95\u6f3a"));
                        final Block getBlock = getBlockState2.getBlock();
                        if (!Intrinsics.areEqual((Object)getBlock, (Object)Blocks.ENDER_CHEST) && !Intrinsics.areEqual((Object)getBlock, (Object)Blocks.ANVIL)) {
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
                final WorldClient world3 = Class2142.Field17803.world;
                final BlockPos method1371 = Class256.Field9152.Method1369();
                if (method1371 == null) {
                    Intrinsics.throwNpe();
                }
                final IBlockState getBlockState3 = world3.getBlockState(method1371);
                Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState3, Method981("\u6fa0\u6fd2\u6fbc\u6f57\u6fc0\u6f29\u6fb1\u6fa9\u6fed\u6f20\u6f67\u6f28\u6f38\u6fda\u6f1e\u6fa4\u6ff2\u6f44\u6f11\u6f85\u6fdb\u6f92\u6fea\u6f9a\u6fa6\u6f2a\u6fc8\u6fdd\u6fca\u6fb2\u6f7d\u6f85\u6f95\u6f3a"));
                if ((Intrinsics.areEqual((Object)getBlockState3.getBlock(), (Object)Blocks.AIR) ^ true) && Class256.Field9152.Method1383()) {
                    final Class117 method1372 = Class256.Method1411(Class256.Field9152);
                    final Boolean b = (method1372 != null) ? Boolean.valueOf(method1372.Method844()) : null;
                    if (b == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!b) {
                        return;
                    }
                }
            }
            if (!Class256.Field9152.Method1389()) {
                Class256.Field9152.Method1402(Class2142.Field17803.player.inventory.currentItem);
            }
            if (Class256.Field9152.Method1369() != null) {
                final EntityPlayerSP player = Class2142.Field17803.player;
                final BlockPos method1373 = Class256.Field9152.Method1369();
                if (method1373 == null) {
                    Intrinsics.throwNpe();
                }
                player.getDistanceSq(method1373);
                final double n = Class256.Field9152.Method1381();
                return (void)(n * n);
            }
        }
        Class2142.Field17803.playerController.blockHitDelay = 0;
    }
    
    static {
        Field8568 = new Class143();
    }
    
    private static String Method981(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6F4C ^ 0x81));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
