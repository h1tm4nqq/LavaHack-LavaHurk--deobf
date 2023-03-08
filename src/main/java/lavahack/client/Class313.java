//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.util.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/util/render/image/ImageUtil$Companion;", "", "()V", "bufferedImageFromFile", "Ljava/awt/image/BufferedImage;", "file", "Ljava/io/File;", "cacheBufferedImage", "Lnet/minecraft/client/renderer/texture/DynamicTexture;", "image", "format", "", "name", "createFlipped", "createTransformed", "at", "Ljava/awt/geom/AffineTransform;", "kisman.cc" })
public final class Class313
{
    private String Field9328 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final DynamicTexture Method1593(@NotNull @NotNull final BufferedImage bufferedImage, @NotNull @NotNull final String s, @NotNull @NotNull final String s2) {
        Intrinsics.checkParameterIsNotNull((Object)bufferedImage, "image");
        Intrinsics.checkParameterIsNotNull((Object)s, "format");
        Intrinsics.checkParameterIsNotNull((Object)s2, "name");
        final DynamicTexture dynamicTexture = new DynamicTexture(bufferedImage);
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        Intrinsics.checkExpressionValueIsNotNull((Object)getMinecraft, "Minecraft.getMinecraft()");
        final ResourceLocation getDynamicTextureLocation = getMinecraft.getTextureManager().getDynamicTextureLocation(s2, dynamicTexture);
        final Minecraft getMinecraft2 = Minecraft.getMinecraft();
        Intrinsics.checkExpressionValueIsNotNull((Object)getMinecraft2, "Minecraft.getMinecraft()");
        getMinecraft2.getTextureManager().loadTexture(getDynamicTextureLocation, (ITextureObject)dynamicTexture);
        return dynamicTexture;
    }
    
    @NotNull
    @NotNull
    public final BufferedImage Method1594(@NotNull @NotNull final BufferedImage bufferedImage) {
        Intrinsics.checkParameterIsNotNull((Object)bufferedImage, "image");
        final AffineTransform affineTransform = new AffineTransform();
        affineTransform.concatenate(AffineTransform.getScaleInstance(Double.longBitsToDouble((long)863915094 ^ 0xBFF00000337E4C56L), 1.0));
        affineTransform.concatenate(AffineTransform.getTranslateInstance(Double.longBitsToDouble(-4616189618054758400L), -bufferedImage.getHeight()));
        return this.Method1595(bufferedImage, affineTransform);
    }
    
    @NotNull
    @NotNull
    public final BufferedImage Method1595(@NotNull @NotNull final BufferedImage bufferedImage, @NotNull @NotNull final AffineTransform affineTransform) {
        Intrinsics.checkParameterIsNotNull((Object)bufferedImage, "image");
        Intrinsics.checkParameterIsNotNull((Object)affineTransform, "at");
        final BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
        final Graphics2D graphics = bufferedImage2.createGraphics();
        graphics.transform(affineTransform);
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        return bufferedImage2;
    }
    
    @NotNull
    @NotNull
    public final BufferedImage Method1596(@NotNull @NotNull final File input) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)input, "file");
        final BufferedImage read = ImageIO.read(input);
        final BufferedImage bufferedImage = new BufferedImage(read.getWidth(null), read.getHeight(null), 2);
        final Graphics2D graphics = bufferedImage.createGraphics();
        graphics.drawImage(read, 0, 0, null);
        graphics.dispose();
        return bufferedImage;
    }
    
    private Class313() {
    }
    
    public Class313(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method1597(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x79E2 ^ 0xE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
