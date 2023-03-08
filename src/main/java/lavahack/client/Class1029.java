//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import com.kisman.cc.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004H\u0016?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/util/enums/ShadersObjectTypes$Entity;", "Lcom/kisman/cc/util/enums/ShadersObjectTypes;", "list", "", "T", "kisman.cc" })
final class Class1029 extends Class1736
{
    private int Field12520;
    
    @NotNull
    @NotNull
    @Override
    public List Method1305() {
        final List loadedEntityList = Class2142.Field17803.world.loadedEntityList;
        if (loadedEntityList == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<T>");
        }
        return TypeIntrinsics.asMutableList((Object)loadedEntityList);
    }
    
    Class1029(final String s, final int n) {
        super(s, n, null);
    }
    
    private static String Method1306(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7570 ^ 0x7C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
