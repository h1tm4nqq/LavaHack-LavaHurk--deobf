//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0000H\u0016J\b\u0010\u0011\u001a\u00020\u0000H\u0016R\u0011\u0010\u0007\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/settings/util/EntityCullingPattern;", "Lcom/kisman/cc/settings/util/AbstractPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "customGroup", "", "(Lcom/kisman/cc/features/module/Module;Z)V", "culling", "Lcom/kisman/cc/settings/Setting;", "getCulling", "()Lcom/kisman/cc/settings/Setting;", "customGroup_", "Lcom/kisman/cc/settings/types/SettingGroup;", "check", "entity", "Lnet/minecraft/entity/Entity;", "init", "preInit", "kisman.cc" })
public final class Class1162 extends Class91
{
    private final Class1996 Field13250;
    @NotNull
    private final Class44 Field13251;
    private final boolean Field13252;
    private int Field13253;
    
    @NotNull
    @NotNull
    public final Class44 Method4685() {
        return this.Field13251;
    }
    
    @NotNull
    @NotNull
    public Class1162 Method4686() {
        if (this.Method769() != null) {
            if (this.Field13252) {
                this.Field13250.Method7405(this.Field13251);
                final Class1996 method769 = this.Method769();
                if (method769 != null) {
                    method769.Method7406(this.Field13250);
                }
            }
            else {
                final Class1996 method770 = this.Method769();
                if (method770 != null) {
                    method770.Method7405(this.Field13251);
                }
            }
        }
        return this;
    }
    
    @Override
    public Object Method778() {
        return this.Method4686();
    }
    
    @NotNull
    @NotNull
    public Class1162 Method4687() {
        if (this.Field13252) {
            this.Method780().Method24(this.Field13250);
        }
        this.Method780().Method23(this.Field13251);
        return this;
    }
    
    @Override
    public Object Method779() {
        return this.Method4687();
    }
    
    public final boolean Method4688(@NotNull @NotNull final Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        return !this.Field13251.Method365() || Class721.Method3010(entity);
    }
    
    public Class1162(@NotNull @NotNull final Class42 class42, final boolean field13252) {
        Intrinsics.checkParameterIsNotNull((Object)class42, "module");
        super(class42);
        this.Field13252 = field13252;
        this.Field13250 = this.Method776(new Class1996(new Class44("Culling", class42)));
        this.Field13251 = new Class44("Culling", class42, false);
    }
    
    private static String Method781(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6475 ^ 0xD9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
