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
import lavahack.client.Class1670;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/features/capes/CapeManager;", "", "()V", "capes", "Ljava/util/HashMap;", "", "Lcom/kisman/cc/features/capes/Capes;", "Lkotlin/collections/HashMap;", "add", "", "uuid", "cape", "name", "clear", "get", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "getCape", "name0", "has", "", "remove", "kisman.cc"})
public final class Class1830 {
    private static final HashMap Field16450;
    public static final Class1830 Field16451;
    private int Field16452;

    public final void Method6888() {
        Field16450.clear();
    }

    public final void Method6889(@NotNull @NotNull String string, @NotNull @NotNull Class1670 class1670) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"uuid");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1670), (String)"cape");
        Map map = Field16450;
        Class1670 class16702 = class1670;
        boolean bl = false;
        map.put(string, class16702);
    }

    public final void Method6890(@NotNull @NotNull String string, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"uuid");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"name");
        this.Method6889(string, Class1670.valueOf(string2));
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
    public final Class1670 Method6893(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        String string = entityPlayer.getUniqueID().toString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"player.uniqueID.toString()");
        return this.Method6894(string);
    }

    @Nullable
    @Nullable
    public final Class1670 Method6894(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"uuid");
        return (Class1670)((Object)Field16450.get(string));
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
    public final Class1670 Method6897(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name0");
        return Class1670.valueOf(string);
    }

    private Class1830() {
    }

    static {
        Class1830 class1830;
        Field16451 = class1830 = new Class1830();
        Field16450 = new HashMap();
    }

    private static String Method6898(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 193;
            cArray2[n] = (char)(cArray[n] ^ (0x179A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

