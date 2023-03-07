//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import java.util.HashMap;
import lavahack.client.DcOePtwa3mbm08qEwXWa3EPFsCiiyIad;
import lavahack.client.NqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu;
import lavahack.client.QCxR4vWzYmQVNFEAY6s1FLZAL1Rt7JKK;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public abstract class FrvoqED59Mj96pmO7hxn2tEew1fZAOzj
extends DcOePtwa3mbm08qEwXWa3EPFsCiiyIad
implements NqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu {
    protected static Minecraft Field8619 = Minecraft.getMinecraft();
    private final String Field8620;
    private String Field8621;
    private int Field8622;
    private final HashMap Field8623 = new HashMap();
    private int Field8624;

    protected hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb Method444(String string) {
        return (hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb)this.Field8623.get(string);
    }

    public FrvoqED59Mj96pmO7hxn2tEew1fZAOzj(String string) {
        this.Field8620 = string;
        this.Field8622 = (int)((long)1938318386 ^ (long)-1938318387);
    }

    protected void Method445(hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb ... hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray) {
        hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb[] hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray2 = hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray;
        int n = hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray2.length;
        int n2 = (int)((long)-1806245625 ^ (long)-1806245625);
        while (n2 < n) {
            hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb2 = hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray2[n2];
            if (this.Field8623.get(hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb2.Method442()) != null) {
                throw new QCxR4vWzYmQVNFEAY6s1FLZAL1Rt7JKK(hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb2, (NqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu)this.Field8623.get(hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb2.Method442()));
            }
            this.Field8623.put(hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb2.Method442(), hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb2);
            ++n2;
        }
    }

    protected void Method446(String string, String[] stringArray) {
        ((hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb)this.Field8623.get(stringArray[(int)((long)2081617739 ^ (long)2081617739)])).Method443(string, stringArray);
    }

    public abstract String Method447();

    public abstract String Method448();

    @Override
    @NotNull
    @NotNull
    public String Method442() {
        return this.Field8620;
    }

    public int Method449() {
        return this.Field8622;
    }

    public void Method450(int n) {
        this.Field8622 = n;
    }

    public String Method451() {
        return this.Field8621;
    }

    public void Method452(String string) {
        this.Field8621 = string;
    }
}

