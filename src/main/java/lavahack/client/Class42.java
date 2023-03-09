//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.common.MinecraftForge
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.function.Supplier;
import lavahack.client.Class1270;
import lavahack.client.Class1274;
import lavahack.client.Class1303;
import lavahack.client.Class1320;
import lavahack.client.Class1393;
import lavahack.client.Class1571;
import lavahack.client.Class1796;
import lavahack.client.Class1859;
import lavahack.client.Class1887;
import lavahack.client.Class1996;
import lavahack.client.Class2012;
import lavahack.client.Class2047;
import lavahack.client.Class228;
import lavahack.client.Class411;
import lavahack.client.Class44;
import lavahack.client.Class695;
import lavahack.client.Class794;
import lavahack.client.Class873;
import lavahack.client.Class941;
import lavahack.client.Class955;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.MinecraftForge;
import org.jetbrains.annotations.NotNull;

public class Class42
implements Class1320,
Class695 {
    protected static Minecraft Field8052 = Minecraft.getMinecraft();
    protected static Class2047 Field8053;
    private String Field8054;
    private String Field8055;
    private String Field8056;
    private int Field8057;
    public int Field8058 = -1;
    public Class955 Field8059 = Class955.Field12068;
    private final Class97 Field8060;
    public boolean Field8061;
    public boolean Field8062 = true;
    public boolean Field8063 = true;
    public boolean Field8064 = true;
    public boolean Field8065 = false;
    public boolean Field8066 = false;
    private Supplier Field8067 = null;
    public Supplier Field8068 = null;
    public boolean Field8069 = true;
    public ArrayList Field8070 = new ArrayList();
    private String Field8071 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class42(String string, Class97 class97) {
        this(string, "", class97, 0, true);
    }

    public Class42(String string, Class97 class97, boolean bl) {
        this(string, "", class97, 0, bl);
    }

    public Class42(String string, String string2, Class97 class97) {
        this(string, string2, class97, 0, true);
    }

    public Class42(String string, String string2, Class97 class97, int n, boolean bl) {
        this.Field8054 = string;
        this.Field8055 = string2;
        this.Field8056 = "";
        this.Field8057 = n;
        this.Field8060 = this.getClass().isAnnotationPresent(Class1887.class) ? Class97.Field8346 : class97;
        this.Field8061 = false;
        this.Field8063 = bl;
        Field8053 = Class1796.Field16241.Field16258;
        Class1571.Method6196(this);
        for (Field field : this.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Class873.class)) {
                field.set(null, this);
                continue;
            }
            if (!field.isAnnotationPresent(Class1274.class)) continue;
            this.Method19(field);
        }
        if (this.Field8068 == null) {
            Field field;
            Field[] fieldArray = this.getClass().getFields();
            int n2 = fieldArray.length;
            for (int i = 0; !(i >= n2 || (field = fieldArray[i]).isAnnotationPresent(Class1274.class) && this.Method19(field)); ++i) {
            }
        }
        if (this.Field8068 != null) return;
        this.Field8068 = (Supplier<EntityPlayer>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB(), ()Lnet/minecraft/entity/player/EntityPlayer;)();
    }

    private boolean Method19(Field field) {
        field.get(this);
        this.Field8068 = () -> this.Method56(field);
        return false;
    }

    private void Method20() {
        if (!this.Field8069) return;
        if (!Class1796.Field16241.Field16251) return;
        if (!null.Field11785.Method365()) return;
        Class1393.Method5506().Method1882(TextFormatting.GRAY + "Module " + (this.Method35() ? TextFormatting.GREEN : TextFormatting.RED) + this.Method40() + TextFormatting.GRAY + " has been " + (this.Method35() ? "enabled" : "disabled") + "!");
    }

    public void Method21(boolean bl) {
        if (this.Field8066) {
            return;
        }
        this.Method20();
        if (bl) {
            this.Method36();
            return;
        }
        this.Method37();
    }

    public void Method22() {
        if (this.Field8066) {
            return;
        }
        if (!this.Field8061) {
            this.Method36();
        } else {
            this.Method37();
        }
        this.Method20();
    }

    public Class44 Method23(Class44 class44) {
        Field8053.Method7569(class44);
        return class44;
    }

    public Class1996 Method24(Class1996 class1996) {
        Field8053.Method7569(class1996);
        return class1996;
    }

    public Class1303 Method25(Class1303 class1303) {
        return (Class1303)this.Method23(class1303);
    }

    public Class941 Method26(Class941 class941) {
        return (Class941)this.Method23(class941);
    }

    private boolean Method27() {
        if (this.getClass().getAnnotation(Class794.class) == null) return false;
        return true;
    }

    private boolean Method28() {
        if (this.getClass().getAnnotation(Class1270.class) == null) return false;
        return true;
    }

    private boolean Method29() {
        if (this.getClass().getAnnotation(Class2012.class) == null) return false;
        return true;
    }

    public boolean Method30() {
        return this.Method29();
    }

    public String Method31() {
        return this.Field8055;
    }

    public void Method32(String string) {
        this.Field8055 = string;
    }

    public int Method33() {
        return this.Field8057;
    }

    public void Method34(int n) {
        this.Field8057 = n;
    }

    public boolean Method35() {
        return this.Field8061;
    }

    public final void Method36() {
        Class1859 class1859;
        if (this.Field8061) {
            return;
        }
        this.Field8061 = true;
        boolean bl = false;
        this.Method38();
        if (this.Field8063) {
            MinecraftForge.EVENT_BUS.register((Object)this);
        }
        if ((class1859 = this.getClass().getAnnotation(Class1859.class)) == null) {
            return;
        }
        Class228.Method1290(class1859, this);
    }

    public final void Method37() {
        Class1859 class1859;
        if (!this.Field8061) {
            return;
        }
        this.Field8061 = false;
        this.Method39();
        if (this.Field8063) {
            MinecraftForge.EVENT_BUS.unregister((Object)this);
        }
        if ((class1859 = this.getClass().getAnnotation(Class1859.class)) == null) {
            return;
        }
        Class228.Method1291(class1859, this);
    }

    public void Method38() {
    }

    public void Method39() {
    }

    public String Method40() {
        return this.Field8054;
    }

    public Class97 Method41() {
        return this.Field8060;
    }

    public String Method42() {
        String string;
        if (this.Field8067 == null) {
            string = this.Field8056;
            return string;
        }
        string = (String)this.Field8067.get();
        return string;
    }

    public void Method43(String string) {
        this.Field8056 = string;
    }

    public void Method44(Supplier supplier) {
        this.Field8067 = supplier;
    }

    public void Method45() {
    }

    public void Method46() {
    }

    public void Method47() {
    }

    public void Method48() {
    }

    public void Method49(int n) {
    }

    public void Method50(char c, int n) {
    }

    public String toString() {
        return this.Method40();
    }

    public boolean Method51() {
        return this.Field8064;
    }

    public boolean Method52() {
        return this.Method27();
    }

    public boolean Method53() {
        return this.Method28();
    }

    @Override
    @NotNull
    @NotNull
    public Class955 Method12() {
        return this.Field8059;
    }

    @Override
    public void Method13(@NotNull @NotNull Class955 class955) {
        this.Field8059 = class955;
    }

    @Override
    public boolean Method14() {
        return this.Field8065;
    }

    @Override
    public void Method15(boolean bl) {
        this.Field8065 = bl;
    }

    @Override
    public int Method8() {
        return this.Field8057;
    }

    @Override
    public void Method9(int n) {
        this.Field8057 = n;
    }

    @Override
    public int Method10() {
        return this.Field8058;
    }

    @Override
    public void Method11(int n) {
        this.Field8058 = n;
    }

    @Override
    @NotNull
    @NotNull
    public String Method16() {
        return "Bind";
    }

    public Class411 Method54() {
        return new Class411(this).Method2002().Method2003();
    }

    protected void Method55() {
        this.Field8069 = false;
    }

    private EntityPlayer Method56(Field field) {
        return (EntityPlayer)field.get(this);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 23;
            cArray2[n] = (char)(cArray[n] ^ (0x252F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

