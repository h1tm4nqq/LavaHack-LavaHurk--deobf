//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.google.gson.annotations.*;

public final class Class1669
{
    @SerializedName("name")
    private String Field15764;
    @SerializedName("displayName")
    private String Field15765;
    @SerializedName("version")
    private String Field15766;
    @SerializedName("prefix")
    private String Field15767;
    @SerializedName("mainClass")
    private String Field15768;
    @SerializedName("mixinConfig")
    private String Field15769;
    private int Field15770;
    
    public String Method6438() {
        return null;
    }
    
    public String Method6439() {
        return null.replaceAll("&", "§");
    }
    
    public String Method6440() {
        return null;
    }
    
    public String Method6441() {
        return null;
    }
    
    public String Method6442() {
        return null;
    }
    
    public String Method6443() {
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof Class1669 && false);
    }
    
    @Override
    public int hashCode() {
        return null.hashCode();
    }
    
    private static String Method6444(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2F22 ^ 0xED));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
