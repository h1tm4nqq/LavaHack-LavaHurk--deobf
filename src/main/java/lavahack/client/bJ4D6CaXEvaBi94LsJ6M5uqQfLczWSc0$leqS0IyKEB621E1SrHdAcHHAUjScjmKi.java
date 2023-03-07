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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import com.sun.javafx.geom.Vec2d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.bJ4D6CaXEvaBi94LsJ6M5uqQfLczWSc0;
import lavahack.client.xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh;
import net.minecraft.client.renderer.GlStateManager;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/util/render/objects/screen/AbstractCircle$Shadow;", "Lcom/kisman/cc/util/render/objects/screen/AbstractCircle;", "pos", "Lcom/sun/javafx/geom/Vec2d;", "radius", "", "color1", "Lcom/kisman/cc/util/Colour;", "color2", "corner", "Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "(Lcom/sun/javafx/geom/Vec2d;ILcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/render/objects/screen/CornerObject;)V", "getColor1", "()Lcom/kisman/cc/util/Colour;", "getColor2", "getCorner", "()Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "getPos", "()Lcom/sun/javafx/geom/Vec2d;", "getRadius", "()I", "draw", "", "kisman.cc"})
public final class bJ4D6CaXEvaBi94LsJ6M5uqQfLczWSc0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends bJ4D6CaXEvaBi94LsJ6M5uqQfLczWSc0 {
    @NotNull
    private final Vec2d Field12535;
    private final int Field12536;
    @NotNull
    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field12537;
    @NotNull
    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field12538;
    @NotNull
    private final xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh Field12539;
    private String Field12540 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method3528() {
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)((int)-1105770160L ^ 0xBE175451));
        GL11.glBegin((int)((int)((long)602266608 ^ (long)602266611) << 1));
        this.Method3531().Method3632();
        GL11.glVertex2d((double)this.Method3529().x, (double)this.Method3529().y);
        this.Method3532().Method3632();
        int n = this.Method3533().Method5464();
        int n2 = this.Method3533().Method5466();
        int n3 = n;
        int n4 = n2;
        if (n3 <= n4) {
            while (true) {
                double d = (double)n3 * Double.longBitsToDouble(0xC062AF0BED315575L ^ 0x806B8EF0B975786DL) / (double)((int)((long)-754816575 ^ (long)-754816542) << 3);
                double d2 = this.Method3529().x;
                int n5 = (int)1036594900L ^ 0x3DC92ED4;
                double d3 = Math.sin(d);
                double d4 = d2 + d3 * (double)this.Method3530();
                d = (double)n3 * Double.longBitsToDouble((long)1099286091 ^ 0x400921FB15C1EB53L) / (double)((int)((long)477240067 ^ (long)477240096) << 3);
                d3 = this.Method3529().y;
                d2 = d4;
                n5 = (int)896525820L ^ 0x356FE5FC;
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
        GlStateManager.shadeModel((int)((int)((long)-981167974 ^ (long)-981167993) << 8));
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
    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3531() {
        return this.Field12537;
    }

    @Override
    @NotNull
    @NotNull
    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3532() {
        return this.Field12538;
    }

    @Override
    @NotNull
    @NotNull
    public xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh Method3533() {
        return this.Field12539;
    }

    public bJ4D6CaXEvaBi94LsJ6M5uqQfLczWSc0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull Vec2d vec2d, int n, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, @NotNull @NotNull xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh2) {
        Intrinsics.checkParameterIsNotNull((Object)vec2d, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"color2");
        Intrinsics.checkParameterIsNotNull((Object)xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh2, (String)"corner");
        super(vec2d, n, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh2);
        this.Field12535 = vec2d;
        this.Field12536 = n;
        this.Field12537 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        this.Field12538 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
        this.Field12539 = xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh2;
    }

    private static String Method3534(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-610942011 ^ (long)-610942011);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1393347222L ^ 0x530CCA69);
            int n2 = (int)((long)-1773835672 ^ (long)-1773835681) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)2078774329L ^ 0x7BE78ADA) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

