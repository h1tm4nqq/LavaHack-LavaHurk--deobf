//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/util/enums/Fonts;", "", "font", "Lcom/kisman/cc/util/render/customfont/AbstractFontRenderer;", "(Ljava/lang/String;ILcom/kisman/cc/util/render/customfont/AbstractFontRenderer;)V", "getFont", "()Lcom/kisman/cc/util/render/customfont/AbstractFontRenderer;", "Verdana", "Comfortaa", "ComfortaaLight", "ComfortaaBold", "Consolas", "LexendDeca", "Futura", "SfUi", "Century", "JelleeBold", "MinecraftRus", "kisman.cc" })
public enum Class1427
{
    Field14654(s, n2, field14666), 
    Field14655(s2, n4, field14667), 
    Field14656(s3, n6, field14668), 
    Field14657(s4, n8, field14669), 
    Field14658(s5, n10, field14670), 
    Field14659(s6, n12, field14671), 
    Field14660(s7, n14, field14672), 
    Field14661(s8, n16, field14673), 
    Field14662(s9, n18, field14674), 
    Field14663(s10, n20, field14675), 
    Field14664(s11, n22, field14676);
    
    private static final Class1427[] Field14665;
    @NotNull
    private final Class88 Field14666;
    private String Field14667 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        final Class1427[] field14665 = new Class1427[11];
        final int n = 0;
        final String s = "Verdana";
        final int n2 = 0;
        final Class88 field14666 = Class1178.Field13333;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14666, "verdana18");
        final int n3 = 1;
        final String s2 = "Comfortaa";
        final int n4 = 1;
        final Class88 field14667 = Class1178.Field13321;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14667, "comfortaa18");
        final int n5 = 2;
        final String s3 = "ComfortaaLight";
        final int n6 = 2;
        final Class88 field14668 = Class1178.Field13310;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14668, "comfortaal18");
        final int n7 = 3;
        final String s4 = "ComfortaaBold";
        final int n8 = 3;
        final Class88 field14669 = Class1178.Field13317;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14669, "comfortaab18");
        final int n9 = 4;
        final String s5 = "Consolas";
        final int n10 = 4;
        final Class88 field14670 = Class1178.Field13324;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14670, "consolas18");
        final int n11 = 5;
        final String s6 = "LexendDeca";
        final int n12 = 5;
        final Class88 field14671 = Class1178.Field13331;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14671, "lexendDeca18");
        final int n13 = 6;
        final String s7 = "Futura";
        final int n14 = 6;
        final Class88 field14672 = Class1178.Field13329;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14672, "futura20");
        final int n15 = 7;
        final String s8 = "SfUi";
        final int n16 = 7;
        final Class88 field14673 = Class1178.Field13327;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14673, "sfui19");
        final int n17 = 8;
        final String s9 = "Century";
        final int n18 = 8;
        final Class88 field14674 = Class1178.Field13332;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14674, "century18");
        final int n19 = 9;
        final String s10 = "JelleeBold";
        final int n20 = 9;
        final Class88 field14675 = Class1178.Field13334;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14675, "jelleeb18");
        final int n21 = 10;
        final String s11 = "MinecraftRus";
        final int n22 = 10;
        final Class88 field14676 = Class1178.Field13335;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14676, "minecraftRus13");
        Field14665 = field14665;
    }
    
    @NotNull
    @NotNull
    public final Class88 Method5712() {
        return this.Field14666;
    }
    
    private Class1427(final String name, final int ordinal, final Class88 field14666) {
        this.Field14666 = field14666;
    }
    
    private static String Method5713(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x71FF ^ 0x39));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
