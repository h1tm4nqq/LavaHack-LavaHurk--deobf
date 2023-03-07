//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiTextField
 */
package lavahack.client;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiTextField;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/gui/other/container/ItemESP;", "", "()V", "guiTextField", "Lnet/minecraft/client/gui/GuiTextField;", "getGuiTextField", "()Lnet/minecraft/client/gui/GuiTextField;", "setGuiTextField", "(Lnet/minecraft/client/gui/GuiTextField;)V", "height", "", "getHeight", "()I", "itemStacks", "Ljava/util/ArrayList;", "Lnet/minecraft/item/ItemStack;", "Lkotlin/collections/ArrayList;", "getItemStacks", "()Ljava/util/ArrayList;", "setItemStacks", "(Ljava/util/ArrayList;)V", "offset", "getOffset", "update", "", "x", "y", "width", "kisman.cc"})
public final class iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO {
    @NotNull
    private GuiTextField Field10234;
    @NotNull
    private ArrayList Field10235;
    private final int Field10236 = 5;
    private final int Field10237 = 22;
    private String Field10238 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final GuiTextField Method2401() {
        return this.Field10234;
    }

    public final void Method2402(@NotNull @NotNull GuiTextField guiTextField) {
        Intrinsics.checkParameterIsNotNull((Object)guiTextField, (String)"<set-?>");
        this.Field10234 = guiTextField;
    }

    @NotNull
    @NotNull
    public final ArrayList Method2403() {
        return this.Field10235;
    }

    public final void Method2404(@NotNull @NotNull ArrayList arrayList) {
        Intrinsics.checkParameterIsNotNull((Object)arrayList, (String)"<set-?>");
        this.Field10235 = arrayList;
    }

    public final int Method2405() {
        return this.Field10236;
    }

    public final int Method2406() {
        return this.Field10237;
    }

    public final void Method2407(int n, int n2, int n3, int n4) {
        this.Field10234.x = n;
        this.Field10234.y = n2 - this.Field10236 - this.Field10237;
        this.Field10234.width = n3;
        this.Field10234.height = this.Field10237;
    }

    public iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO() {
        this.Field10234 = new GuiTextField((int)((long)1965873923 ^ (long)1965882380), Minecraft.getMinecraft().fontRenderer, (int)((long)-1566663633 ^ (long)-1566663633), (int)606842991L ^ 0x242BB06F, (int)236563381L ^ 0xE19ABB5, (int)-797126501L ^ 0xD07CD09B);
        this.Field10235 = new ArrayList();
        this.Field10236 = (int)((long)-729369794 ^ (long)-729369797);
        this.Field10237 = (int)((long)1388229675 ^ (long)1388229664) << 1;
    }

    private static String Method2408(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)368599020L ^ 0x15F85FEC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)270573943L ^ 0x1020A188);
            int n2 = (int)865599271L ^ 0x3397FFD4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1184750157 ^ (long)1184745086) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

