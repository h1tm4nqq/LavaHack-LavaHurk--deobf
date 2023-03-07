//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.resources.IResource
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.Shader
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.client.shader.ShaderUniform
 *  net.minecraft.client.util.JsonException
 *  net.minecraft.util.JsonUtils
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kisman.cc.mixin.mixins.accessor.AccessorShaderGroup;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.AYUeccr5wExGiEMVsRSJEFx8ctb05ddX;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderUniform;
import net.minecraft.client.util.JsonException;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/util/minecraft/ShaderGroupHandler;", "Lnet/minecraft/client/shader/ShaderGroup;", "textureManager", "Lnet/minecraft/client/renderer/texture/TextureManager;", "resourceManager", "Lnet/minecraft/client/resources/IResourceManager;", "mainFramebuffer", "Lnet/minecraft/client/shader/Framebuffer;", "resourceLocation", "Lnet/minecraft/util/ResourceLocation;", "(Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/client/resources/IResourceManager;Lnet/minecraft/client/shader/Framebuffer;Lnet/minecraft/util/ResourceLocation;)V", "getFramebufferHook", "string", "", "initTargetHook", "", "element", "Lcom/google/gson/JsonElement;", "initUniformHook", "json", "parseGroup", "parsePass", "p_152764_1_", "kisman.cc"})
public final class r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv
extends ShaderGroup {
    private final IResourceManager Field10716;
    private final Framebuffer Field10717;
    private String Field10718 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void parseGroup(@NotNull @NotNull TextureManager textureManager, @NotNull @NotNull ResourceLocation resourceLocation) {
        JsonObject jsonObject;
        Intrinsics.checkParameterIsNotNull((Object)textureManager, (String)"textureManager");
        Intrinsics.checkParameterIsNotNull((Object)resourceLocation, (String)"resourceLocation");
        JsonParser jsonParser = new JsonParser();
        IResource iResource = null;
        r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv2 = this;
        if (r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorShaderGroup");
        }
        iResource = ((AccessorShaderGroup)((Object)r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv2)).Method5560().getResource(resourceLocation);
        if (resourceLocation instanceof AYUeccr5wExGiEMVsRSJEFx8ctb05ddX) {
            JsonElement jsonElement = jsonParser.parse(((AYUeccr5wExGiEMVsRSJEFx8ctb05ddX)resourceLocation).getShader());
            Intrinsics.checkExpressionValueIsNotNull((Object)jsonElement, (String)"jsonparser.parse(resourceLocation.shader)");
            jsonObject = jsonElement.getAsJsonObject();
        } else {
            IResource iResource2 = iResource;
            Intrinsics.checkExpressionValueIsNotNull((Object)iResource2, (String)"iresource");
            JsonElement jsonElement = jsonParser.parse(IOUtils.toString(iResource2.getInputStream(), StandardCharsets.UTF_8));
            Intrinsics.checkExpressionValueIsNotNull((Object)jsonElement, (String)"jsonparser.parse(IOUtils\u2026 StandardCharsets.UTF_8))");
            jsonObject = jsonElement.getAsJsonObject();
        }
        JsonObject jsonObject2 = jsonObject;
        int n = (int)629406837L ^ 0x2583FC75;
        Iterator<JsonElement> iterator = null;
        JsonElement jsonElement = null;
        Object var9_9 = null;
        JsonArray jsonArray = null;
        if (JsonUtils.isJsonArray((JsonObject)jsonObject2, (String)"targets")) {
            JsonArray jsonArray2 = jsonObject2.getAsJsonArray("targets");
            Intrinsics.checkExpressionValueIsNotNull((Object)jsonArray2, (String)"jsonobject.getAsJsonArray(\"targets\")");
            jsonArray = jsonArray2;
            n = (int)-98125353L ^ 0xFA26B9D7;
            Iterator<JsonElement> iterator2 = jsonArray.iterator();
            Intrinsics.checkExpressionValueIsNotNull(iterator2, (String)"jsonarray1.iterator()");
            iterator = iterator2;
            while (iterator.hasNext()) {
                Intrinsics.checkExpressionValueIsNotNull((Object)iterator.next(), (String)"var8.next()");
                this.initTargetHook(jsonElement);
                ++n;
            }
        }
        if (JsonUtils.isJsonArray((JsonObject)jsonObject2, (String)"passes")) {
            JsonArray jsonArray3 = jsonObject2.getAsJsonArray("passes");
            Intrinsics.checkExpressionValueIsNotNull((Object)jsonArray3, (String)"jsonobject.getAsJsonArray(\"passes\")");
            jsonArray = jsonArray3;
            n = (int)-330024047L ^ 0xEC543B91;
            Iterator<JsonElement> iterator3 = jsonArray.iterator();
            Intrinsics.checkExpressionValueIsNotNull(iterator3, (String)"jsonarray1.iterator()");
            iterator = iterator3;
            while (iterator.hasNext()) {
                Intrinsics.checkExpressionValueIsNotNull((Object)iterator.next(), (String)"var8.next()");
                this.parsePass(textureManager, jsonElement);
                ++n;
            }
        }
        IOUtils.closeQuietly((Closeable)iResource);
    }

    private final void parsePass(TextureManager textureManager, JsonElement jsonElement) throws JsonException, IOException {
        JsonArray jsonArray;
        JsonElement jsonElement2;
        Iterator<JsonElement> iterator;
        JsonObject jsonObject = JsonUtils.getJsonObject((JsonElement)jsonElement, (String)"pass");
        String string = JsonUtils.getString((JsonObject)jsonObject, (String)"name");
        String string2 = JsonUtils.getString((JsonObject)jsonObject, (String)"intarget");
        String string3 = JsonUtils.getString((JsonObject)jsonObject, (String)"outtarget");
        Framebuffer framebuffer = this.getFramebufferHook(string2);
        Framebuffer framebuffer2 = this.getFramebufferHook(string3);
        if (framebuffer == null) {
            throw (Throwable)new JsonException("Input target '" + string2 + "' does not exist");
        }
        if (framebuffer2 == null) {
            throw (Throwable)new JsonException("Output target '" + string3 + "' does not exist");
        }
        Shader shader = this.addShader(string, framebuffer, framebuffer2);
        JsonArray jsonArray2 = JsonUtils.getJsonArray((JsonObject)jsonObject, (String)"auxtargets", (JsonArray)null);
        if (jsonArray2 != null) {
            int n = (int)((long)291034093 ^ (long)291034093);
            Iterator<JsonElement> iterator2 = jsonArray2.iterator();
            Intrinsics.checkExpressionValueIsNotNull(iterator2, (String)"jsonarray.iterator()");
            Iterator<JsonElement> iterator3 = iterator2;
            while (iterator3.hasNext()) {
                if (iterator3.next() == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.google.gson.JsonElement");
                }
                jsonElement2 = JsonUtils.getJsonObject((JsonElement)((Object)iterator), (String)"auxtarget");
                String string4 = JsonUtils.getString((JsonObject)jsonElement2, (String)"name");
                String string5 = JsonUtils.getString((JsonObject)jsonElement2, (String)"id");
                Framebuffer framebuffer3 = this.getFramebufferHook(string5);
                if (framebuffer3 == null) {
                    String[] stringArray = ResourceLocation.splitObjectName((String)string5);
                    ResourceLocation resourceLocation = new ResourceLocation(stringArray[(int)((long)-1878837704 ^ (long)-1878837704)], "textures/effect/" + stringArray[(int)((long)108188532 ^ (long)108188533)] + ".png");
                    IResource iResource = null;
                    IResource iResource2 = this.Field10716.getResource(resourceLocation);
                    IOUtils.closeQuietly((Closeable)iResource);
                    iResource = iResource2;
                    textureManager.bindTexture(resourceLocation);
                    iResource2 = textureManager.getTexture(resourceLocation);
                    int n2 = JsonUtils.getInt((JsonObject)jsonElement2, (String)"width");
                    int n3 = JsonUtils.getInt((JsonObject)jsonElement2, (String)"height");
                    boolean bl = JsonUtils.getBoolean((JsonObject)jsonElement2, (String)"bilinear");
                    if (bl) {
                        GlStateManager.glTexParameteri((int)((int)((long)1719922294 ^ (long)1719919511)), (int)((int)((long)1210052797 ^ (long)1210046652)), (int)((int)-1479636358L ^ 0xA7CEAC7B));
                        GlStateManager.glTexParameteri((int)((int)((long)-1588076544 ^ (long)-1588072991)), (int)(((int)-2032791512L ^ 0x86D6102D) << 11), (int)((int)531092145L ^ 0x1FA7F4B0));
                    } else {
                        GlStateManager.glTexParameteri((int)((int)((long)1909927297 ^ (long)1909923936)), (int)((int)1330230510L ^ 0x4F499CEF), (int)((int)((long)-698502466 ^ (long)-698502483) << 9));
                        GlStateManager.glTexParameteri((int)((int)((long)-704824309 ^ (long)-704826902)), (int)((int)((long)-1194992061 ^ (long)-1194992058) << 11), (int)(((int)1263501635L ^ 0x4B4F8150) << 9));
                    }
                    IResource iResource3 = iResource2;
                    Intrinsics.checkExpressionValueIsNotNull((Object)iResource3, (String)"lvt_20_2_");
                    shader.addAuxFramebuffer(string4, (Object)iResource3.getGlTextureId(), n2, n3);
                } else {
                    shader.addAuxFramebuffer(string4, (Object)framebuffer3, framebuffer3.framebufferTextureWidth, framebuffer3.framebufferTextureHeight);
                }
                ++n;
            }
        }
        if ((jsonArray = JsonUtils.getJsonArray((JsonObject)jsonObject, (String)"uniforms", (JsonArray)null)) == null) return;
        int n = (int)((long)39132001 ^ (long)39132001);
        Iterator<JsonElement> iterator4 = jsonArray.iterator();
        Intrinsics.checkExpressionValueIsNotNull(iterator4, (String)"jsonarray1.iterator()");
        iterator = iterator4;
        while (iterator.hasNext()) {
            Object e = iterator.next();
            if (e == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.google.gson.JsonElement");
            }
            jsonElement2 = (JsonElement)e;
            this.initUniformHook(jsonElement2);
            ++n;
        }
    }

    private final Framebuffer getFramebufferHook(String string) {
        Framebuffer framebuffer;
        if (string == null) {
            return null;
        }
        if (Intrinsics.areEqual((Object)string, (Object)"minecraft:main")) {
            framebuffer = this.Field10717;
            return framebuffer;
        }
        framebuffer = this.getFramebufferRaw(string);
        return framebuffer;
    }

    private final void initTargetHook(JsonElement jsonElement) {
        if (JsonUtils.isString((JsonElement)jsonElement)) {
            this.addFramebuffer(jsonElement.getAsString(), this.Field10717.framebufferWidth, this.Field10717.framebufferHeight);
            return;
        }
        JsonObject jsonObject = JsonUtils.getJsonObject((JsonElement)jsonElement, (String)"target");
        String string = JsonUtils.getString((JsonObject)jsonObject, (String)"name");
        int n = JsonUtils.getInt((JsonObject)jsonObject, (String)"width", (int)this.Field10717.framebufferWidth);
        int n2 = JsonUtils.getInt((JsonObject)jsonObject, (String)"height", (int)this.Field10717.framebufferHeight);
        if (this.getFramebufferRaw(string) != null) {
            throw (Throwable)new JsonException(string + " is already defined");
        }
        this.addFramebuffer(string, n, n2);
    }

    private final void initUniformHook(JsonElement jsonElement) throws JsonException {
        JsonObject jsonObject = JsonUtils.getJsonObject((JsonElement)jsonElement, (String)"uniform");
        String string = JsonUtils.getString((JsonObject)jsonObject, (String)"name");
        r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv2 = this;
        if (r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorShaderGroup");
        }
        Object e = ((AccessorShaderGroup)((Object)r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv2)).Method5561().get(((AccessorShaderGroup)((Object)this)).Method5561().size() - (int)((long)964784181 ^ (long)964784180));
        if (e == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.client.shader.Shader");
        }
        ShaderUniform shaderUniform = ((Shader)e).getShaderManager().getShaderUniform(string);
        if (shaderUniform == null) {
            throw (Throwable)new JsonException("Uniform '" + string + "' does not exist");
        }
        float[] fArray = new float[(int)((long)398198615 ^ (long)398198614) << 2];
        int n = (int)362675970L ^ 0x159DFF02;
        Iterator<JsonElement> iterator = JsonUtils.getJsonArray((JsonObject)jsonObject, (String)"values").iterator();
        Intrinsics.checkExpressionValueIsNotNull(iterator, (String)"JsonUtils.getJsonArray(j\u2026ect, \"values\").iterator()");
        Iterator<JsonElement> iterator2 = iterator;
        while (iterator2.hasNext()) {
            JsonElement jsonElement2;
            if (iterator2.next() == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.google.gson.JsonElement");
            }
            fArray[n] = JsonUtils.getFloat((JsonElement)jsonElement2, (String)"value");
            ++n;
        }
    }

    public r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv(@NotNull @NotNull TextureManager textureManager, @NotNull @NotNull IResourceManager iResourceManager, @NotNull @NotNull Framebuffer framebuffer, @NotNull @NotNull ResourceLocation resourceLocation) {
        Intrinsics.checkParameterIsNotNull((Object)textureManager, (String)"textureManager");
        Intrinsics.checkParameterIsNotNull((Object)iResourceManager, (String)"resourceManager");
        Intrinsics.checkParameterIsNotNull((Object)framebuffer, (String)"mainFramebuffer");
        Intrinsics.checkParameterIsNotNull((Object)resourceLocation, (String)"resourceLocation");
        super(textureManager, iResourceManager, framebuffer, resourceLocation);
        this.Field10716 = iResourceManager;
        this.Field10717 = framebuffer;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)473392172L ^ 0x1C37642C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)675373263 ^ (long)675373104);
            int n2 = (int)((long)6598405 ^ (long)6598436) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1180019091L ^ 0x4655B8E6) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

