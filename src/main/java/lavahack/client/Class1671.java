//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018?\u0006\u0019" }, d2 = { "Lcom/kisman/cc/util/enums/ShaderModes;", "", "(Ljava/lang/String;I)V", "AQUA", "RED", "SMOKE", "FLOW", "ITEMGLOW", "PURPLE", "GRADIENT", "UNU", "GLOW", "OUTLINE", "BlueFlames", "CodeX", "Crazy", "Golden", "HideF", "HotShit", "Kfc", "Sheldon", "Smoky", "SNOW", "Techno", "Circle", "kisman.cc" })
public enum Class1671
{
    Field15778("AQUA", 0), 
    Field15779("RED", 1), 
    Field15780("SMOKE", 2), 
    Field15781("FLOW", 3), 
    Field15782("ITEMGLOW", 4), 
    Field15783("PURPLE", 5), 
    Field15784("GRADIENT", 6), 
    Field15785("UNU", 7), 
    Field15786("GLOW", 8), 
    Field15787("OUTLINE", 9), 
    Field15788("BlueFlames", 10), 
    Field15789("CodeX", 11), 
    Field15790("Crazy", 12), 
    Field15791("Golden", 13), 
    Field15792("HideF", 14), 
    Field15793("HotShit", 15), 
    Field15794("Kfc", 16), 
    Field15795("Sheldon", 17), 
    Field15796("Smoky", 18), 
    Field15797("SNOW", 19), 
    Field15798("Techno", 20), 
    Field15799("Circle", 21);
    
    private static final Class1671[] Field15800;
    private int Field15801;
    
    private Class1671(final String name, final int ordinal) {
    }
    
    private static String Method6448(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3E46 ^ 0xED));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
