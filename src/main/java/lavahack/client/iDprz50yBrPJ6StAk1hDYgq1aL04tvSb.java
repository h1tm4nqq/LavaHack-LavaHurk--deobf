//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.fdljcT89CBPrL7HBEVQFJfXSVaiifxsj;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/features/capes/CapeManager;", "", "()V", "capes", "Ljava/util/HashMap;", "", "Lcom/kisman/cc/features/capes/Capes;", "Lkotlin/collections/HashMap;", "add", "", "uuid", "cape", "name", "clear", "get", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "getCape", "name0", "has", "", "remove", "kisman.cc"})
public final class iDprz50yBrPJ6StAk1hDYgq1aL04tvSb {
    private static final HashMap Field16450;
    public static final iDprz50yBrPJ6StAk1hDYgq1aL04tvSb Field16451;
    private int Field16452;

    public final void Method6888() {
        Field16450.clear();
    }

    public final void Method6889(@NotNull @NotNull String string, @NotNull @NotNull fdljcT89CBPrL7HBEVQFJfXSVaiifxsj fdljcT89CBPrL7HBEVQFJfXSVaiifxsj2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"uuid");
        Intrinsics.checkParameterIsNotNull((Object)((Object)fdljcT89CBPrL7HBEVQFJfXSVaiifxsj2), (String)"cape");
        Map map = Field16450;
        fdljcT89CBPrL7HBEVQFJfXSVaiifxsj fdljcT89CBPrL7HBEVQFJfXSVaiifxsj3 = fdljcT89CBPrL7HBEVQFJfXSVaiifxsj2;
        int n = (int)-909772607L ^ 0xC9C5F8C1;
        map.put(string, fdljcT89CBPrL7HBEVQFJfXSVaiifxsj3);
    }

    public final void Method6890(@NotNull @NotNull String string, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"uuid");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"name");
        this.Method6889(string, fdljcT89CBPrL7HBEVQFJfXSVaiifxsj.valueOf(string2));
    }

    public final void Method6891(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"uuid");
        if (!this.Method6895(string)) return;
        Field16450.remove(string);
    }

    public final void Method6892(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        String string = entityPlayer.getUniqueID().toString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"player.uniqueID.toString()");
        this.Method6891(string);
    }

    @Nullable
    @Nullable
    public final fdljcT89CBPrL7HBEVQFJfXSVaiifxsj Method6893(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        String string = entityPlayer.getUniqueID().toString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"player.uniqueID.toString()");
        return this.Method6894(string);
    }

    @Nullable
    @Nullable
    public final fdljcT89CBPrL7HBEVQFJfXSVaiifxsj Method6894(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"uuid");
        return (fdljcT89CBPrL7HBEVQFJfXSVaiifxsj)((Object)Field16450.get(string));
    }

    public final boolean Method6895(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"uuid");
        return Field16450.containsKey(string);
    }

    public final boolean Method6896(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        String string = entityPlayer.getUniqueID().toString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"player.uniqueID.toString()");
        return this.Method6895(string);
    }

    @NotNull
    @NotNull
    public final fdljcT89CBPrL7HBEVQFJfXSVaiifxsj Method6897(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name0");
        return fdljcT89CBPrL7HBEVQFJfXSVaiifxsj.valueOf(string);
    }

    private iDprz50yBrPJ6StAk1hDYgq1aL04tvSb() {
    }

    static {
        iDprz50yBrPJ6StAk1hDYgq1aL04tvSb iDprz50yBrPJ6StAk1hDYgq1aL04tvSb2;
        Field16451 = iDprz50yBrPJ6StAk1hDYgq1aL04tvSb2 = new iDprz50yBrPJ6StAk1hDYgq1aL04tvSb();
        Field16450 = new HashMap();
    }

    private static String Method6898(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1244264711L ^ 0x4A29F907;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1641257882 ^ (long)1641257829);
            int n2 = (int)((long)-1150258883 ^ (long)-1150258692);
            cArray2[n] = (char)(cArray[n] ^ (((int)-210978060L ^ 0xF36CB139) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

