//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.javafx.geom.Vec2d
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.sun.javafx.geom.Vec2d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1370;
import lavahack.client.Class825;
import net.minecraft.client.renderer.GlStateManager;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/util/render/objects/screen/AbstractCircle$Shadow;", "Lcom/kisman/cc/util/render/objects/screen/AbstractCircle;", "pos", "Lcom/sun/javafx/geom/Vec2d;", "radius", "", "color1", "Lcom/kisman/cc/util/Colour;", "color2", "corner", "Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "(Lcom/sun/javafx/geom/Vec2d;ILcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/render/objects/screen/CornerObject;)V", "getColor1", "()Lcom/kisman/cc/util/Colour;", "getColor2", "getCorner", "()Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "getPos", "()Lcom/sun/javafx/geom/Vec2d;", "getRadius", "()I", "draw", "", "kisman.cc"})
public final class Class1034
extends Class825 {
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
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)7425);
        GL11.glBegin((int)6);
        this.Method3531().Method3632();
        GL11.glVertex2d((double)this.Method3529().x, (double)this.Method3529().y);
        this.Method3532().Method3632();
        int n = this.Method3533().Method5464();
        int n2 = this.Method3533().Method5466();
        int n3 = n;
        int n4 = n2;
        if (n3 <= n4) {
            while (true) {
                double d = (double)n3 * Double.longBitsToDouble(4614256656552045848L) / (double)280;
                double d2 = this.Method3529().x;
                boolean bl = false;
                double d3 = Math.sin(d);
                double d4 = d2 + d3 * (double)this.Method3530();
                d = (double)n3 * Double.longBitsToDouble((long)1099286091 ^ 0x400921FB15C1EB53L) / (double)280;
                d3 = this.Method3529().y;
                d2 = d4;
                bl = false;
                double d5 = Math.cos(d);
                GL11.glVertex2d((double)d2, (double)(d3 + d5 * (double)this.Method3530()));
                if (n3 == n4) break;
                ++n3;
            }
        }
        GL11.glEnd();
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel((int)7424);
    }

    @Override
    @NotNull
    @NotNull
    public Vec2d Method3529() {
        return this.Field12535;
    }

    @Override
    public int Method3530() {
        return this.Field12536;
    }

    @Override
    @NotNull
    @NotNull
    public Class2027 Method3531() {
        return this.Field12537;
    }

    @Override
    @NotNull
    @NotNull
    public Class2027 Method3532() {
        return this.Field12538;
    }

    @Override
    @NotNull
    @NotNull
    public Class1370 Method3533() {
        return this.Field12539;
    }

    public Class1034(@NotNull @NotNull Vec2d vec2d, int n, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @NotNull @NotNull Class1370 class1370) {
        Intrinsics.checkParameterIsNotNull((Object)vec2d, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"color2");
        Intrinsics.checkParameterIsNotNull((Object)class1370, (String)"corner");
        super(vec2d, n, class2027, class20272, class1370);
        this.Field12535 = vec2d;
        this.Field12536 = n;
        this.Field12537 = class2027;
        this.Field12538 = class20272;
        this.Field12539 = class1370;
    }

    private static String Method3534(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 110;
            cArray2[n] = (char)(cArray[n] ^ (0x3DC6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

