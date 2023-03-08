//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f?\u0006 " }, d2 = { "Lcom/kisman/cc/util/enums/CharmsRewriteTypes;", "", "mode", "Lcom/kisman/cc/util/enums/CharmsRewriteTypeModes;", "(Ljava/lang/String;ILcom/kisman/cc/util/enums/CharmsRewriteTypeModes;)V", "getMode", "()Lcom/kisman/cc/util/enums/CharmsRewriteTypeModes;", "Mode", "Width", "NoHurt", "WireDepth", "WireLighting", "WireCulling", "WireBlend", "WireTranslucent", "WireTexture2D", "WireCrowdAlpha", "WireCrowdAlphaRange", "WireCustomColor", "WireColor", "WireFriendColor", "ModelDepth", "ModelLighting", "ModelCulling", "ModelBlend", "ModelTranslucent", "ModelTexture2D", "ModelCrowdAlpha", "ModelCrowdAlphaRange", "ModelCustomColor", "ModelColor", "ModelFriendColor", "kisman.cc" })
public enum Class162
{
    Field8648("Mode", 0, Class263.Field9166), 
    Field8649("Width", 1, Class263.Field9166), 
    Field8650("NoHurt", 2, Class263.Field9166), 
    Field8651("WireDepth", 3, Class263.Field9167), 
    Field8652("WireLighting", 4, Class263.Field9167), 
    Field8653("WireCulling", 5, Class263.Field9167), 
    Field8654("WireBlend", 6, Class263.Field9167), 
    Field8655("WireTranslucent", 7, Class263.Field9167), 
    Field8656("WireTexture2D", 8, Class263.Field9167), 
    Field8657("WireCrowdAlpha", 9, Class263.Field9167), 
    Field8658("WireCrowdAlphaRange", 10, Class263.Field9167), 
    Field8659("WireCustomColor", 11, Class263.Field9167), 
    Field8660("WireColor", 12, Class263.Field9167), 
    Field8661("WireFriendColor", 13, Class263.Field9167), 
    Field8662("ModelDepth", 14, Class263.Field9168), 
    Field8663("ModelLighting", 15, Class263.Field9168), 
    Field8664("ModelCulling", 16, Class263.Field9168), 
    Field8665("ModelBlend", 17, Class263.Field9168), 
    Field8666("ModelTranslucent", 18, Class263.Field9168), 
    Field8667("ModelTexture2D", 19, Class263.Field9168), 
    Field8668("ModelCrowdAlpha", 20, Class263.Field9168), 
    Field8669("ModelCrowdAlphaRange", 21, Class263.Field9168), 
    Field8670("ModelCustomColor", 22, Class263.Field9168), 
    Field8671("ModelColor", 23, Class263.Field9168), 
    Field8672("ModelFriendColor", 24, Class263.Field9168);
    
    private static final Class162[] Field8673;
    @NotNull
    private final Class263 Field8674;
    private String Field8675 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class263 Method1055() {
        return this.Field8674;
    }
    
    private Class162(final String name, final int ordinal, final Class263 field8674) {
        this.Field8674 = field8674;
    }
    
    private static String Method1056(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3F2F ^ 0xCB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
