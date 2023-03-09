//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import java.util.HashMap;
import lavahack.client.Class1368;
import lavahack.client.Class1563;
import lavahack.client.Class2080;
import lavahack.client.Class222;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public abstract class Class158
extends Class1563
implements Class2080 {
    protected static Minecraft Field8619 = Minecraft.getMinecraft();
    private final String Field8620;
    private String Field8621;
    private int Field8622;
    private final HashMap Field8623 = new HashMap();
    private int Field8624;

    protected Class1368 Method444(String string) {
        return (Class1368)this.Field8623.get(string);
    }

    public Class158(String string) {
        this.Field8620 = string;
        this.Field8622 = -1;
    }

    protected void Method445(Class1368 ... class1368Array) {
        Class1368[] class1368Array2 = class1368Array;
        int n = class1368Array2.length;
        int n2 = 0;
        while (n2 < n) {
            Class1368 class1368 = class1368Array2[n2];
            if (this.Field8623.get(class1368.Method442()) != null) {
                throw new Class222(class1368, (Class2080)this.Field8623.get(class1368.Method442()));
            }
            this.Field8623.put(class1368.Method442(), class1368);
            ++n2;
        }
    }

    protected void Method446(String string, String[] stringArray) {
        ((Class1368)this.Field8623.get(stringArray[0])).Method443(string, stringArray);
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

