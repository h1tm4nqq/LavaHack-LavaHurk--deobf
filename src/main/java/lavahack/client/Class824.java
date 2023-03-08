//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003?\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/util/math/vectors/xyz/Vec3f;", "", "x", "", "y", "z", "(FFF)V", "getX", "()F", "setX", "(F)V", "getY", "setY", "getZ", "setZ", "Companion", "kisman.cc" })
public final class Class824
{
    private float Field11508;
    private float Field11509;
    private float Field11510;
    @NotNull
    private static final Class824 Field11511;
    public static final Class1038 Field11512;
    private int Field11513;
    
    public final float Method3521() {
        return this.Field11508;
    }
    
    public final void Method3522(final float field11508) {
        this.Field11508 = field11508;
    }
    
    public final float Method3523() {
        return this.Field11509;
    }
    
    public final void Method3524(final float field11509) {
        this.Field11509 = field11509;
    }
    
    public final float Method3525() {
        return this.Field11510;
    }
    
    public final void Method3526(final float field11510) {
        this.Field11510 = field11510;
    }
    
    public Class824(final float field11508, final float field11509, final float field11510) {
        this.Field11508 = field11508;
        this.Field11509 = field11509;
        this.Field11510 = field11510;
    }
    
    static {
        Field11512 = new Class1038((DefaultConstructorMarker)null);
        Field11511 = new Class824(0.0f, 0.0f, 0.0f);
    }
    
    public static final Class824 Method3527() {
        return Class824.Field11511;
    }
}
