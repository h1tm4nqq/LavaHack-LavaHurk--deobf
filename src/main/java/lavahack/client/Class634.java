//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.resources.*;
import kotlin.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import java.nio.charset.*;
import org.apache.commons.io.*;
import net.minecraft.util.*;
import com.google.gson.*;
import java.util.*;
import net.minecraft.client.util.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.shader.*;
import net.minecraft.client.renderer.texture.*;
import java.io.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t?\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0017" }, d2 = { "Lcom/kisman/cc/util/minecraft/ShaderGroupHandler;", "Lnet/minecraft/client/shader/ShaderGroup;", "textureManager", "Lnet/minecraft/client/renderer/texture/TextureManager;", "resourceManager", "Lnet/minecraft/client/resources/IResourceManager;", "mainFramebuffer", "Lnet/minecraft/client/shader/Framebuffer;", "resourceLocation", "Lnet/minecraft/util/ResourceLocation;", "(Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/client/resources/IResourceManager;Lnet/minecraft/client/shader/Framebuffer;Lnet/minecraft/util/ResourceLocation;)V", "getFramebufferHook", "string", "", "initTargetHook", "", "element", "Lcom/google/gson/JsonElement;", "initUniformHook", "json", "parseGroup", "parsePass", "p_152764_1_", "kisman.cc" })
public final class Class634 extends ShaderGroup
{
    private final IResourceManager Field10716;
    private final Framebuffer Field10717;
    private String Field10718 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void parseGroup(@NotNull @NotNull final TextureManager textureManager, @NotNull @NotNull final ResourceLocation resourceLocation) {
        Intrinsics.checkParameterIsNotNull((Object)textureManager, "textureManager");
        Intrinsics.checkParameterIsNotNull((Object)resourceLocation, "resourceLocation");
        final JsonParser jsonParser = new JsonParser();
        final IResource resource = null;
        if (this == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorShaderGroup");
        }
        final IResource getResource = ((AccessorShaderGroup)this).Method5560().getResource(resourceLocation);
        JsonObject jsonObject;
        if (resourceLocation instanceof Class1465) {
            final JsonElement parse = jsonParser.parse(((Class1465)resourceLocation).getShader());
            Intrinsics.checkExpressionValueIsNotNull((Object)parse, "jsonparser.parse(resourceLocation.shader)");
            jsonObject = parse.getAsJsonObject();
        }
        else {
            final JsonParser jsonParser2 = jsonParser;
            final IResource resource2 = getResource;
            Intrinsics.checkExpressionValueIsNotNull((Object)resource2, "iresource");
            final JsonElement parse2 = jsonParser2.parse(IOUtils.toString(resource2.getInputStream(), StandardCharsets.UTF_8));
            Intrinsics.checkExpressionValueIsNotNull((Object)parse2, "jsonparser.parse(IOUtils\u2026 StandardCharsets.UTF_8))");
            jsonObject = parse2.getAsJsonObject();
        }
        final JsonObject jsonObject2 = jsonObject;
        if (JsonUtils.isJsonArray(jsonObject2, "targets")) {
            final JsonArray asJsonArray = jsonObject2.getAsJsonArray("targets");
            Intrinsics.checkExpressionValueIsNotNull((Object)asJsonArray, "jsonobject.getAsJsonArray(\"targets\")");
            final JsonArray jsonArray = asJsonArray;
            int n = 0;
            final Iterator iterator = jsonArray.iterator();
            Intrinsics.checkExpressionValueIsNotNull((Object)iterator, "jsonarray1.iterator()");
            final Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                final JsonElement next = iterator2.next();
                Intrinsics.checkExpressionValueIsNotNull((Object)next, "var8.next()");
                this.initTargetHook(next);
                ++n;
            }
        }
        if (JsonUtils.isJsonArray(jsonObject2, "passes")) {
            final JsonArray asJsonArray2 = jsonObject2.getAsJsonArray("passes");
            Intrinsics.checkExpressionValueIsNotNull((Object)asJsonArray2, "jsonobject.getAsJsonArray(\"passes\")");
            final JsonArray jsonArray2 = asJsonArray2;
            int n2 = 0;
            final Iterator iterator3 = jsonArray2.iterator();
            Intrinsics.checkExpressionValueIsNotNull((Object)iterator3, "jsonarray1.iterator()");
            final Iterator iterator4 = iterator3;
            while (iterator4.hasNext()) {
                final JsonElement next2 = iterator4.next();
                Intrinsics.checkExpressionValueIsNotNull((Object)next2, "var8.next()");
                this.parsePass(textureManager, next2);
                ++n2;
            }
        }
        IOUtils.closeQuietly((Closeable)getResource);
    }
    
    private final void parsePass(final TextureManager textureManager, final JsonElement jsonElement) throws JsonException, IOException {
        final JsonObject getJsonObject = JsonUtils.getJsonObject(jsonElement, "pass");
        final String getString = JsonUtils.getString(getJsonObject, "name");
        final String getString2 = JsonUtils.getString(getJsonObject, "intarget");
        final String getString3 = JsonUtils.getString(getJsonObject, "outtarget");
        final Framebuffer framebufferHook = this.getFramebufferHook(getString2);
        final Framebuffer framebufferHook2 = this.getFramebufferHook(getString3);
        if (framebufferHook == null) {
            throw (Throwable)new JsonException("Input target '" + getString2 + "' does not exist");
        }
        if (framebufferHook2 == null) {
            throw (Throwable)new JsonException("Output target '" + getString3 + "' does not exist");
        }
        final Shader addShader = this.addShader(getString, framebufferHook, framebufferHook2);
        final JsonArray getJsonArray = JsonUtils.getJsonArray(getJsonObject, "auxtargets", (JsonArray)null);
        if (getJsonArray != null) {
            int n = 0;
            final Iterator iterator = getJsonArray.iterator();
            Intrinsics.checkExpressionValueIsNotNull((Object)iterator, "jsonarray.iterator()");
            final Iterator<JsonElement> iterator2 = (Iterator<JsonElement>)iterator;
            while (iterator2.hasNext()) {
                final JsonElement next = iterator2.next();
                if (next == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.google.gson.JsonElement");
                }
                final JsonObject getJsonObject2 = JsonUtils.getJsonObject((JsonElement)next, "auxtarget");
                final String getString4 = JsonUtils.getString(getJsonObject2, "name");
                final String getString5 = JsonUtils.getString(getJsonObject2, "id");
                final Framebuffer framebufferHook3 = this.getFramebufferHook(getString5);
                if (framebufferHook3 == null) {
                    final String[] splitObjectName = ResourceLocation.splitObjectName(getString5);
                    final ResourceLocation resourceLocation = new ResourceLocation(splitObjectName[0], "textures/effect/" + splitObjectName[1] + ".png");
                    final IResource resource = null;
                    this.Field10716.getResource(resourceLocation);
                    IOUtils.closeQuietly((Closeable)resource);
                    textureManager.bindTexture(resourceLocation);
                    final ITextureObject getTexture = textureManager.getTexture(resourceLocation);
                    final int getInt = JsonUtils.getInt(getJsonObject2, "width");
                    final int getInt2 = JsonUtils.getInt(getJsonObject2, "height");
                    if (JsonUtils.getBoolean(getJsonObject2, "bilinear")) {
                        GlStateManager.glTexParameteri(3553, 10241, 9729);
                        GlStateManager.glTexParameteri(3553, 10240, 9729);
                    }
                    else {
                        GlStateManager.glTexParameteri(3553, 10241, 9728);
                        GlStateManager.glTexParameteri(3553, 10240, 9728);
                    }
                    final Shader shader = addShader;
                    final String s = getString4;
                    final ITextureObject textureObject = getTexture;
                    Intrinsics.checkExpressionValueIsNotNull((Object)textureObject, "lvt_20_2_");
                    shader.addAuxFramebuffer(s, (Object)textureObject.getGlTextureId(), getInt, getInt2);
                }
                else {
                    addShader.addAuxFramebuffer(getString4, (Object)framebufferHook3, framebufferHook3.framebufferTextureWidth, framebufferHook3.framebufferTextureHeight);
                }
                ++n;
            }
        }
        final JsonArray getJsonArray2 = JsonUtils.getJsonArray(getJsonObject, "uniforms", (JsonArray)null);
        if (getJsonArray2 != null) {
            int n2 = 0;
            final Iterator iterator3 = getJsonArray2.iterator();
            Intrinsics.checkExpressionValueIsNotNull((Object)iterator3, "jsonarray1.iterator()");
            final Iterator<JsonElement> iterator4 = (Iterator<JsonElement>)iterator3;
            while (iterator4.hasNext()) {
                final JsonElement next2 = iterator4.next();
                if (next2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.google.gson.JsonElement");
                }
                this.initUniformHook(next2);
                ++n2;
            }
        }
    }
    
    private final Framebuffer getFramebufferHook(final String s) {
        return (s == null) ? null : (Intrinsics.areEqual((Object)s, (Object)"minecraft:main") ? this.Field10717 : this.getFramebufferRaw(s));
    }
    
    private final void initTargetHook(final JsonElement jsonElement) {
        if (JsonUtils.isString(jsonElement)) {
            this.addFramebuffer(jsonElement.getAsString(), this.Field10717.framebufferWidth, this.Field10717.framebufferHeight);
        }
        else {
            final JsonObject getJsonObject = JsonUtils.getJsonObject(jsonElement, "target");
            final String getString = JsonUtils.getString(getJsonObject, "name");
            final int getInt = JsonUtils.getInt(getJsonObject, "width", this.Field10717.framebufferWidth);
            final int getInt2 = JsonUtils.getInt(getJsonObject, "height", this.Field10717.framebufferHeight);
            if (this.getFramebufferRaw(getString) != null) {
                throw (Throwable)new JsonException(getString + " is already defined");
            }
            this.addFramebuffer(getString, getInt, getInt2);
        }
    }
    
    private final void initUniformHook(final JsonElement jsonElement) throws JsonException {
        final JsonObject getJsonObject = JsonUtils.getJsonObject(jsonElement, "uniform");
        final String getString = JsonUtils.getString(getJsonObject, "name");
        if (this == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorShaderGroup");
        }
        final Shader value = ((AccessorShaderGroup)this).Method5561().get(((AccessorShaderGroup)this).Method5561().size() - 1);
        if (value == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.client.shader.Shader");
        }
        if (value.getShaderManager().getShaderUniform(getString) == null) {
            throw (Throwable)new JsonException("Uniform '" + getString + "' does not exist");
        }
        final float[] array = new float[4];
        int n = 0;
        final Iterator iterator = JsonUtils.getJsonArray(getJsonObject, "values").iterator();
        Intrinsics.checkExpressionValueIsNotNull((Object)iterator, "JsonUtils.getJsonArray(j\u2026ect, \"values\").iterator()");
        final Iterator<JsonElement> iterator2 = (Iterator<JsonElement>)iterator;
        while (iterator2.hasNext()) {
            final JsonElement next = iterator2.next();
            if (next == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.google.gson.JsonElement");
            }
            array[n] = JsonUtils.getFloat((JsonElement)next, "value");
            ++n;
        }
    }
    
    public Class634(@NotNull @NotNull final TextureManager textureManager, @NotNull @NotNull final IResourceManager field10716, @NotNull @NotNull final Framebuffer field10717, @NotNull @NotNull final ResourceLocation resourceLocation) {
        Intrinsics.checkParameterIsNotNull((Object)textureManager, "textureManager");
        Intrinsics.checkParameterIsNotNull((Object)field10716, "resourceManager");
        Intrinsics.checkParameterIsNotNull((Object)field10717, "mainFramebuffer");
        Intrinsics.checkParameterIsNotNull((Object)resourceLocation, "resourceLocation");
        super(textureManager, field10716, field10717, resourceLocation);
        this.Field10716 = field10716;
        this.Field10717 = field10717;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x45D4 ^ 0x42));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
