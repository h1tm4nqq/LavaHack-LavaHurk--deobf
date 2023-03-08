//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.tileentity.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004?\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/util/enums/StorageESPTileEntities$Validator;", "Lcom/kisman/cc/util/interfaces/Validable;", "Lnet/minecraft/tileentity/TileEntity;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getClazz", "()Ljava/lang/Class;", "valid", "", "t", "kisman.cc" })
public final class Class1680 implements Class1776
{
    @NotNull
    private final Class Field15819;
    private String Field15820 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public boolean Method6471(@NotNull @NotNull final TileEntity tileEntity) {
        Intrinsics.checkParameterIsNotNull((Object)tileEntity, "t");
        return this.Field15819.isInstance(tileEntity);
    }
    
    @Override
    public boolean Method5352(final Object o) {
        return this.Method6471((TileEntity)o);
    }
    
    @NotNull
    @NotNull
    public final Class Method6472() {
        return this.Field15819;
    }
    
    public Class1680(@NotNull @NotNull final Class field15819) {
        Intrinsics.checkParameterIsNotNull((Object)field15819, "clazz");
        this.Field15819 = field15819;
    }
    
    private static String Method6473(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4962 ^ 0xAD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
