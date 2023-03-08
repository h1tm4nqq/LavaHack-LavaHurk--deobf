//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n?\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u001f" }, d2 = { "Lcom/kisman/cc/features/Binder;", "Lcom/kisman/cc/features/module/IBindable;", "name", "", "type", "Lcom/kisman/cc/features/module/BindType;", "key", "", "mouse", "hold", "", "(Ljava/lang/String;Lcom/kisman/cc/features/module/BindType;IIZ)V", "getKey", "()I", "setKey", "(I)V", "getMouse", "setMouse", "getName", "()Ljava/lang/String;", "getButtonName", "getKeyboardKey", "getMouseButton", "getType", "isHold", "setHold", "", "setKeyboardKey", "setMouseButton", "button", "setType", "kisman.cc" })
public final class Class1929 implements Class695
{
    @NotNull
    private final String Field16949;
    private Class955 Field16950;
    private int Field16951;
    private int Field16952;
    private boolean Field16953;
    private int Field16954;
    
    @Override
    public int Method8() {
        return this.Field16951;
    }
    
    @Override
    public void Method9(final int field16951) {
        this.Field16951 = field16951;
    }
    
    @Override
    public int Method10() {
        return this.Field16952;
    }
    
    @Override
    public void Method11(final int field16952) {
        this.Field16952 = field16952;
    }
    
    @NotNull
    @NotNull
    @Override
    public Class955 Method12() {
        return this.Field16950;
    }
    
    @Override
    public void Method13(@NotNull @NotNull final Class955 field16950) {
        Intrinsics.checkParameterIsNotNull((Object)field16950, "type");
        this.Field16950 = field16950;
    }
    
    @Override
    public boolean Method14() {
        return this.Field16953;
    }
    
    @Override
    public void Method15(final boolean field16953) {
        this.Field16953 = field16953;
    }
    
    @NotNull
    @NotNull
    @Override
    public String Method16() {
        return this.Field16949;
    }
    
    @NotNull
    @NotNull
    public final String Method7178() {
        return this.Field16949;
    }
    
    public final int Method7179() {
        return this.Field16951;
    }
    
    public final void Method7180(final int field16951) {
        this.Field16951 = field16951;
    }
    
    public final int Method7181() {
        return this.Field16952;
    }
    
    public final void Method7182(final int field16952) {
        this.Field16952 = field16952;
    }
    
    public Class1929(@NotNull @NotNull final String field16949, @NotNull @NotNull final Class955 field16950, final int field16951, final int field16952, final boolean field16953) {
        Intrinsics.checkParameterIsNotNull((Object)field16949, "name");
        Intrinsics.checkParameterIsNotNull((Object)field16950, "type");
        this.Field16949 = field16949;
        this.Field16950 = field16950;
        this.Field16951 = field16951;
        this.Field16952 = field16952;
        this.Field16953 = field16953;
    }
    
    private static String Method7183(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6E7A ^ 0xC3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
