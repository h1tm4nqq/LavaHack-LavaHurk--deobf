//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.sun.javafx.geom.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n?\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014?\u0006\u0017" }, d2 = { "Lcom/kisman/cc/util/render/objects/screen/AbstractCircle$Shadow;", "Lcom/kisman/cc/util/render/objects/screen/AbstractCircle;", "pos", "Lcom/sun/javafx/geom/Vec2d;", "radius", "", "color1", "Lcom/kisman/cc/util/Colour;", "color2", "corner", "Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "(Lcom/sun/javafx/geom/Vec2d;ILcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/render/objects/screen/CornerObject;)V", "getColor1", "()Lcom/kisman/cc/util/Colour;", "getColor2", "getCorner", "()Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "getPos", "()Lcom/sun/javafx/geom/Vec2d;", "getRadius", "()I", "draw", "", "kisman.cc" })
public final class Class1034 extends Class825
{
    @NotNull
    private final Vec2d Field12535;
    private final int Field12536;
    @NotNull
    private final Class2027 Field12537;
    @NotNull
    private final Class2027 Field12538;
    @NotNull
    private final Class1370 Field12539;
    private String Field12540 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method3528() {
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.shadeModel(7425);
        GL11.glBegin(6);
        this.Method3531().Method3632();
        GL11.glVertex2d(this.Method3529().x, this.Method3529().y);
        this.Method3532().Method3632();
        final int method5464 = this.Method3533().Method5464();
        final int method5465 = this.Method3533().Method5466();
        int n = method5464;
        final int n2 = method5465;
        if (n <= n2) {
            while (true) {
                GL11.glVertex2d(this.Method3529().x + Math.sin(n * Double.longBitsToDouble(4614256656552045848L) / 280) * this.Method3530(), this.Method3529().y + Math.cos(n * Double.longBitsToDouble((long)1099286091 ^ 0x400921FB15C1EB53L) / 280) * this.Method3530());
                if (n == n2) {
                    break;
                }
                ++n;
            }
        }
        GL11.glEnd();
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel(7424);
    }
    
    @NotNull
    @NotNull
    @Override
    public Vec2d Method3529() {
        return this.Field12535;
    }
    
    @Override
    public int Method3530() {
        return this.Field12536;
    }
    
    @NotNull
    @NotNull
    @Override
    public Class2027 Method3531() {
        return this.Field12537;
    }
    
    @NotNull
    @NotNull
    @Override
    public Class2027 Method3532() {
        return this.Field12538;
    }
    
    @NotNull
    @NotNull
    @Override
    public Class1370 Method3533() {
        return this.Field12539;
    }
    
    public Class1034(@NotNull @NotNull final Vec2d field12535, final int field12536, @NotNull @NotNull final Class2027 field12537, @NotNull @NotNull final Class2027 field12538, @NotNull @NotNull final Class1370 field12539) {
        Intrinsics.checkParameterIsNotNull((Object)field12535, "pos");
        Intrinsics.checkParameterIsNotNull((Object)field12537, "color1");
        Intrinsics.checkParameterIsNotNull((Object)field12538, "color2");
        Intrinsics.checkParameterIsNotNull((Object)field12539, "corner");
        super(field12535, field12536, field12537, field12538, field12539);
        this.Field12535 = field12535;
        this.Field12536 = field12536;
        this.Field12537 = field12537;
        this.Field12538 = field12538;
        this.Field12539 = field12539;
    }
    
    private static String Method3534(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3DC6 ^ 0x6E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
