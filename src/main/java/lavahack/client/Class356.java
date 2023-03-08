//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import net.minecraft.entity.player.*;
import org.lwjgl.opengl.*;
import net.minecraft.util.math.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012?\u0006\u0017" }, d2 = { "Lcom/kisman/cc/util/render/objects/world/TextOnEntityObject;", "Lcom/kisman/cc/util/render/objects/world/Abstract3dObject;", "text", "", "entity", "Lnet/minecraft/entity/Entity;", "color", "Lcom/kisman/cc/util/Colour;", "(Ljava/lang/String;Lnet/minecraft/entity/Entity;Lcom/kisman/cc/util/Colour;)V", "getColor", "()Lcom/kisman/cc/util/Colour;", "getEntity", "()Lnet/minecraft/entity/Entity;", "getText", "()Ljava/lang/String;", "type", "Lcom/kisman/cc/util/enums/Object3dTypes;", "getType", "()Lcom/kisman/cc/util/enums/Object3dTypes;", "draw", "", "ticks", "", "kisman.cc" })
public final class Class356 extends Class199
{
    @NotNull
    private final Class760 Field9484;
    @NotNull
    private final String Field9485;
    @NotNull
    private final Entity Field9486;
    @NotNull
    private final Class2027 Field9487;
    private int Field9488;
    
    @NotNull
    @NotNull
    public Class760 Method1184() {
        return this.Field9484;
    }
    
    public void Method1186(final float n) {
        Class674.Field10864.Method4042(Class1831.Field16464);
        final AxisAlignedBB getEntityBoundingBox = this.Field9486.getEntityBoundingBox();
        Intrinsics.checkExpressionValueIsNotNull((Object)getEntityBoundingBox, "entity.entityBoundingBox");
        final Vec3d getCenter = getEntityBoundingBox.getCenter();
        Intrinsics.checkExpressionValueIsNotNull((Object)getCenter, "entity.entityBoundingBox.center");
        final EntityPlayerSP player = Minecraft.getMinecraft().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "Minecraft.getMinecraft().player");
        this.Method1189(getCenter, (EntityPlayer)player, 1.0f);
        GL11.glTranslated((double)(-(Class1178.Method4741(this.Field9485) / 2)), 0.0, 0.0);
        Class1178.Method4745(this.Field9485, 0.0, 0.0, this.Method1185().Method3626());
        Class674.Field10864.Method4043(Class1831.Field16464);
    }
    
    @NotNull
    @NotNull
    public final String Method1790() {
        return this.Field9485;
    }
    
    @NotNull
    @NotNull
    public final Entity Method1791() {
        return this.Field9486;
    }
    
    @NotNull
    @NotNull
    public Class2027 Method1185() {
        return this.Field9487;
    }
    
    public Class356(@NotNull @NotNull final String field9485, @NotNull @NotNull final Entity field9486, @NotNull @NotNull final Class2027 field9487) {
        Intrinsics.checkParameterIsNotNull((Object)field9485, "text");
        Intrinsics.checkParameterIsNotNull((Object)field9486, "entity");
        Intrinsics.checkParameterIsNotNull((Object)field9487, "color");
        this.Field9485 = field9485;
        this.Field9486 = field9486;
        this.Field9487 = field9487;
        this.Field9484 = Class760.Field11218;
    }
    
    private static String Method1191(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xB0F ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
