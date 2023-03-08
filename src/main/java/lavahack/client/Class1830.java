//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.player.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0016" }, d2 = { "Lcom/kisman/cc/features/capes/CapeManager;", "", "()V", "capes", "Ljava/util/HashMap;", "", "Lcom/kisman/cc/features/capes/Capes;", "Lkotlin/collections/HashMap;", "add", "", "uuid", "cape", "name", "clear", "get", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "getCape", "name0", "has", "", "remove", "kisman.cc" })
public final class Class1830
{
    private static final HashMap Field16450;
    public static final Class1830 Field16451;
    private int Field16452;
    
    public final void Method6888() {
        Class1830.Field16450.clear();
    }
    
    public final void Method6889(@NotNull @NotNull final String s, @NotNull @NotNull final Class1670 class1670) {
        Intrinsics.checkParameterIsNotNull((Object)s, "uuid");
        Intrinsics.checkParameterIsNotNull((Object)class1670, "cape");
        Class1830.Field16450.put(s, class1670);
    }
    
    public final void Method6890(@NotNull @NotNull final String s, @NotNull @NotNull final String s2) {
        Intrinsics.checkParameterIsNotNull((Object)s, "uuid");
        Intrinsics.checkParameterIsNotNull((Object)s2, "name");
        this.Method6889(s, Class1670.valueOf(s2));
    }
    
    public final void Method6891(@NotNull @NotNull final String key) {
        Intrinsics.checkParameterIsNotNull((Object)key, "uuid");
        if (this.Method6895(key)) {
            Class1830.Field16450.remove(key);
        }
    }
    
    public final void Method6892(@NotNull @NotNull final EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, "player");
        final String string = entityPlayer.getUniqueID().toString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, "player.uniqueID.toString()");
        this.Method6891(string);
    }
    
    @Nullable
    @Nullable
    public final Class1670 Method6893(@NotNull @NotNull final EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, "player");
        final String string = entityPlayer.getUniqueID().toString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, "player.uniqueID.toString()");
        return this.Method6894(string);
    }
    
    @Nullable
    @Nullable
    public final Class1670 Method6894(@NotNull @NotNull final String key) {
        Intrinsics.checkParameterIsNotNull((Object)key, "uuid");
        return Class1830.Field16450.get(key);
    }
    
    public final boolean Method6895(@NotNull @NotNull final String key) {
        Intrinsics.checkParameterIsNotNull((Object)key, "uuid");
        return Class1830.Field16450.containsKey(key);
    }
    
    public final boolean Method6896(@NotNull @NotNull final EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, "player");
        final String string = entityPlayer.getUniqueID().toString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, "player.uniqueID.toString()");
        return this.Method6895(string);
    }
    
    @NotNull
    @NotNull
    public final Class1670 Method6897(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "name0");
        return Class1670.valueOf(s);
    }
    
    private Class1830() {
    }
    
    static {
        Field16451 = new Class1830();
        Field16450 = new HashMap();
    }
    
    private static String Method6898(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x179A ^ 0xC1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
