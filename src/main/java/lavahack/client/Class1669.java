/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.google.gson.annotations.SerializedName;

public final class Class1669 {
    @SerializedName(value="name")
    private String Field15764;
    @SerializedName(value="displayName")
    private String Field15765;
    @SerializedName(value="version")
    private String Field15766;
    @SerializedName(value="prefix")
    private String Field15767;
    @SerializedName(value="mainClass")
    private String Field15768;
    @SerializedName(value="mixinConfig")
    private String Field15769;
    private int Field15770;

    public String Method6438() {
        Class1669 class1669 = this;
        return null;
    }

    public String Method6439() {
        Class1669 class1669 = this;
        return ((String)null).replaceAll("&", "\u00a7");
    }

    public String Method6440() {
        Class1669 class1669 = this;
        return null;
    }

    public String Method6441() {
        Class1669 class1669 = this;
        return null;
    }

    public String Method6442() {
        Class1669 class1669 = this;
        return null;
    }

    public String Method6443() {
        Class1669 class1669 = this;
        return null;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Class1669)) return false;
        Class1669 class1669 = this;
        return false;
    }

    public int hashCode() {
        Class1669 class1669 = this;
        return ((String)null).hashCode();
    }

    private static String Method6444(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 237;
            cArray2[n] = (char)(cArray[n] ^ (0x2F22 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

