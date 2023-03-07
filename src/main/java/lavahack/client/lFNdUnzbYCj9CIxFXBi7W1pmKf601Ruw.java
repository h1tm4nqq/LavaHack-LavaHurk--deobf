//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU;
import org.lwjgl.opengl.GL20;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/features/module/Debug/futureshader/shaders/outline/OutlineShader;", "Lcom/kisman/cc/features/module/Debug/futureshader/FramebufferShader;", "()V", "opacity", "", "getOpacity", "()F", "setOpacity", "(F)V", "quality", "getQuality", "setQuality", "width", "getWidth", "setWidth", "setupUniforms", "", "updateUniforms", "kisman.cc"})
public final class lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw
extends RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU {
    private static float Field11893;
    private static float Field11894;
    private static float Field11895;
    public static final lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw Field11896;
    private int Field11897;

    public final float Method3835() {
        return Field11893;
    }

    public final void Method3836(float f) {
        Field11893 = f;
    }

    public final float Method3837() {
        return Field11894;
    }

    public final void Method3838(float f) {
        Field11894 = f;
    }

    public final float Method3839() {
        return Field11895;
    }

    public final void Method3840(float f) {
        Field11895 = f;
    }

    @Override
    public void Method1705() {
        this.Method1710("texture");
        this.Method1710("texelSize");
        this.Method1710("opacityModifier");
    }

    @Override
    public void Method1706() {
        GL20.glUniform1i((int)this.Method1711("texture"), (int)((int)((long)866461281 ^ (long)866461281)));
        GL20.glUniform2f((int)this.Method1711("texelSize"), (float)((float)((int)((long)-2100999581 ^ (long)-2100999582) / this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.displayWidth) * Field11894 * Field11895), (float)((float)(((int)1252375198L ^ 0x4AA5BA9F) / this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.displayHeight) * Field11894 * Field11895));
        GL20.glUniform1f((int)this.Method1711("opacityModifier"), (float)Field11893);
    }

    private lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw() {
        super("outline", "outline");
    }

    static {
        lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw2;
        Field11896 = lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw2 = new lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw();
        Field11893 = 1.0f;
        Field11894 = 1.0f;
        Field11895 = 1.0f;
    }

    private static String Method1713(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1257697870 ^ (long)1257697870);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1492707142L ^ 0x58F8E7B9);
            int n2 = ((int)171381239L ^ 0xA37118E) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-2090195690L ^ 0x836A32CF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

