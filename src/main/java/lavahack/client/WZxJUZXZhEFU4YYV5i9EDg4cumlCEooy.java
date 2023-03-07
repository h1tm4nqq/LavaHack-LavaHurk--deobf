//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.BlockShulkerBox
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemPickaxe
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import net.minecraft.block.BlockShulkerBox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/features/module/misc/AntiRegear;", "Lcom/kisman/cc/features/module/Module;", "()V", "breakQueue", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "Lkotlin/collections/ArrayList;", "oldSlot", "", "getOldSlot", "()I", "setOldSlot", "(I)V", "range", "Lcom/kisman/cc/settings/Setting;", "getRange", "()Lcom/kisman/cc/settings/Setting;", "switchToPick", "update", "", "kisman.cc"})
public final class WZxJUZXZhEFU4YYV5i9EDg4cumlCEooy
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12980 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x29FE51AA8AC58D65L ^ 0x69EA51AA8AC58D65L), 0.0, Double.longBitsToDouble((long)1414134738 ^ 0x401800005449FBD2L), ((int)-1847819961L ^ 0x91DC8146) != 0);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12981 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Switch To Pick", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1239134006L ^ 0x49DBAF37) != 0);
    private int Field12982 = (int)-1503247985L ^ 0x5999BE70;
    private final ArrayList Field12983 = new ArrayList();
    private String Field12984 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4520() {
        return this.Field12980;
    }

    public final int Method4521() {
        return this.Field12982;
    }

    public final void Method4522(int n) {
        this.Field12982 = n;
    }

    @Override
    public void Method45() {
        int n;
        Object object2;
        if (WZxJUZXZhEFU4YYV5i9EDg4cumlCEooy.Method4523().player == null) return;
        if (WZxJUZXZhEFU4YYV5i9EDg4cumlCEooy.Method4523().world == null) {
            return;
        }
        if (this.Field12983.isEmpty() && this.Field12982 != ((int)-1541241914L ^ 0x5BDD7C39)) {
            EntityPlayerSP entityPlayerSP = WZxJUZXZhEFU4YYV5i9EDg4cumlCEooy.Method4523().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (entityPlayerSP.getHeldItemMainhand().item instanceof ItemPickaxe && this.Field12981.Method365()) {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("Switching back to original slot.");
                lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(this.Field12982, ((int)-1449658155L ^ 0xA997F8D5) != 0);
                this.Field12982 = (int)-129097715L ^ 0x7B1DFF2;
            }
        }
        for (Object object2 : vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7756((Entity)WZxJUZXZhEFU4YYV5i9EDg4cumlCEooy.Method4523().player, this.Field12980.Method368(), ((int)-1547858476L ^ 0xA3BD8DD4) != 0, (boolean)((long)-880558615 ^ (long)-880558616))) {
            IBlockState iBlockState = WZxJUZXZhEFU4YYV5i9EDg4cumlCEooy.Method4523().world.getBlockState((BlockPos)object2);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
            if (!(iBlockState.getBlock() instanceof BlockShulkerBox) || this.Field12983.contains(object2)) continue;
            this.Field12983.add(object2);
        }
        object2 = this.Field12983;
        int n2 = (int)-1341422047L ^ 0xB00B8621;
        if (!object2.isEmpty()) {
            n = (int)-1346604650L ^ 0xAFBC7197;
            return;
        }
        n = (int)1758452373L ^ 0x68CFDA95;
    }

    public WZxJUZXZhEFU4YYV5i9EDg4cumlCEooy() {
        super("AntiRegear", "Breaks shulkers for you.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    public static final Minecraft Method4523() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4524(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-386690239 ^ (long)-386690239);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)366167915L ^ 0x15D34794);
            int n2 = (int)((long)-330577664 ^ (long)-330577633) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1137535983 ^ (long)1137515322) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

