//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  net.minecraft.client.renderer.texture.ITextureObject
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/util/render/image/ImageUtil$Companion;", "", "()V", "bufferedImageFromFile", "Ljava/awt/image/BufferedImage;", "file", "Ljava/io/File;", "cacheBufferedImage", "Lnet/minecraft/client/renderer/texture/DynamicTexture;", "image", "format", "", "name", "createFlipped", "createTransformed", "at", "Ljava/awt/geom/AffineTransform;", "kisman.cc"})
public final class NbhfvI825x7ikO8mf4BYe08WilIp6lqm$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private String Field9328 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final DynamicTexture Method1593(@NotNull @NotNull BufferedImage bufferedImage, @NotNull @NotNull String string, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)bufferedImage, (String)"image");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"format");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"name");
        DynamicTexture dynamicTexture = new DynamicTexture(bufferedImage);
        Minecraft minecraft = Minecraft.getMinecraft();
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"Minecraft.getMinecraft()");
        ResourceLocation resourceLocation = minecraft.getTextureManager().getDynamicTextureLocation(string2, dynamicTexture);
        Minecraft minecraft2 = Minecraft.getMinecraft();
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft2, (String)"Minecraft.getMinecraft()");
        minecraft2.getTextureManager().loadTexture(resourceLocation, (ITextureObject)dynamicTexture);
        return dynamicTexture;
    }

    @NotNull
    @NotNull
    public final BufferedImage Method1594(@NotNull @NotNull BufferedImage bufferedImage) {
        Intrinsics.checkParameterIsNotNull((Object)bufferedImage, (String)"image");
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.concatenate(AffineTransform.getScaleInstance(Double.longBitsToDouble((long)863915094 ^ 0xBFF00000337E4C56L), 1.0));
        affineTransform.concatenate(AffineTransform.getTranslateInstance(Double.longBitsToDouble(0xC534762AFA3D7780L ^ 0x7AC4762AFA3D7780L), -bufferedImage.getHeight()));
        return this.Method1595(bufferedImage, affineTransform);
    }

    @NotNull
    @NotNull
    public final BufferedImage Method1595(@NotNull @NotNull BufferedImage bufferedImage, @NotNull @NotNull AffineTransform affineTransform) {
        Intrinsics.checkParameterIsNotNull((Object)bufferedImage, (String)"image");
        Intrinsics.checkParameterIsNotNull((Object)affineTransform, (String)"at");
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), (int)((long)1853074293 ^ (long)1853074292) << 1);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.transform(affineTransform);
        graphics2D.drawImage((Image)bufferedImage, (int)((long)1592468601 ^ (long)1592468601), (int)((long)1434689261 ^ (long)1434689261), null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    @NotNull
    @NotNull
    public final BufferedImage Method1596(@NotNull @NotNull File file) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"file");
        BufferedImage bufferedImage = ImageIO.read(file);
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(null), bufferedImage.getHeight(null), (int)((long)-494143469 ^ (long)-494143470) << 1);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.drawImage((Image)bufferedImage, (int)1328527684L ^ 0x4F2FB944, (int)((long)-933761774 ^ (long)-933761774), null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    private NbhfvI825x7ikO8mf4BYe08WilIp6lqm$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public NbhfvI825x7ikO8mf4BYe08WilIp6lqm$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method1597(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1821234697L ^ 0x937229F7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2101348644 ^ (long)-2101348829);
            int n2 = ((int)-125379149L ^ 0xF886DDB4) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1567744168L ^ 0x5D71DC59) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

