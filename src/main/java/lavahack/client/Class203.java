//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class203 implements Supplier
{
    final Class1281 Field8883;
    private int Field8884;
    
    @Override
    public Object get() {
        return this.Method1197();
    }
    
    @NotNull
    @NotNull
    public final String Method1197() {
        final StringBuilder append = new StringBuilder().append('[');
        String string;
        if (Class1281.Method5186(this.Field8883) == null) {
            string = "no target no fun";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            final EntityPlayer method5186 = Class1281.Method5186(this.Field8883);
            if (method5186 == null) {
                Intrinsics.throwNpe();
            }
            final StringBuilder append2 = sb.append(method5186.getName()).append("} | Operation: ");
            final Class1277 method5187 = Class1281.Method5188(this.Field8883);
            String name;
            if (method5187 == null || (name = method5187.name()) == null) {
                name = "nothing";
            }
            final StringBuilder append3 = append2.append(name).append(" | Next Hole: ");
            String string2;
            if (Class1281.Method5190(this.Field8883) == null) {
                string2 = "no hole no fun";
            }
            else {
                final StringBuilder sb2 = new StringBuilder();
                final BlockPos method5188 = Class1281.Method5190(this.Field8883);
                if (method5188 == null) {
                    Intrinsics.throwNpe();
                }
                final StringBuilder append4 = sb2.append(method5188.getX()).append('|');
                final BlockPos method5189 = Class1281.Method5190(this.Field8883);
                if (method5189 == null) {
                    Intrinsics.throwNpe();
                }
                string2 = append4.append(method5189.getZ()).toString();
            }
            string = append3.append(string2).toString();
        }
        return append.append(string).append(']').toString();
    }
    
    Class203(final Class1281 field8883) {
        this.Field8883 = field8883;
    }
    
    private static String Method1198(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3CEB ^ 0xFA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
