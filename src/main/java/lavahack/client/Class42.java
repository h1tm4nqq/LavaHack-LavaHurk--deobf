//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import java.util.function.*;
import java.util.*;
import java.lang.annotation.*;
import java.lang.reflect.*;
import net.minecraft.util.text.*;
import net.minecraftforge.common.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.player.*;

public class Class42 implements Class1320, Class695
{
    protected static Minecraft Field8052;
    protected static Class2047 Field8053;
    private String Field8054;
    private String Field8055;
    private String Field8056;
    private int Field8057;
    public int Field8058;
    public Class955 Field8059;
    private final Class97 Field8060;
    public boolean Field8061;
    public boolean Field8062;
    public boolean Field8063;
    public boolean Field8064;
    public boolean Field8065;
    public boolean Field8066;
    private Supplier Field8067;
    public Supplier Field8068;
    public boolean Field8069;
    public ArrayList Field8070;
    private String Field8071 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class42(final String s, final Class97 class97) {
        this(s, "", class97, 0, true);
    }
    
    public Class42(final String s, final Class97 class97, final boolean b) {
        this(s, "", class97, 0, b);
    }
    
    public Class42(final String s, final String s2, final Class97 class97) {
        this(s, s2, class97, 0, true);
    }
    
    public Class42(final String field8054, final String field8055, final Class97 class97, final int field8056, final boolean field8057) {
        this.Field8058 = -1;
        this.Field8059 = Class955.Field12068;
        this.Field8062 = true;
        this.Field8063 = true;
        this.Field8064 = true;
        this.Field8065 = false;
        this.Field8066 = false;
        this.Field8067 = null;
        this.Field8068 = null;
        this.Field8069 = true;
        this.Field8070 = new ArrayList();
        this.Field8054 = field8054;
        this.Field8055 = field8055;
        this.Field8056 = "";
        this.Field8057 = field8056;
        this.Field8060 = (this.getClass().isAnnotationPresent((Class<? extends Annotation>)Class1887.class) ? Class97.Field8346 : class97);
        this.Field8061 = false;
        this.Field8063 = field8057;
        Class42.Field8053 = Class1796.Field16241.Field16258;
        Class1571.Method6196((Object)this);
        for (final Field field8058 : this.getClass().getDeclaredFields()) {
            if (field8058.isAnnotationPresent(Class873.class)) {
                field8058.set(null, this);
            }
            else if (field8058.isAnnotationPresent((Class<? extends Annotation>)Class1274.class)) {
                this.Method19(field8058);
            }
        }
        if (this.Field8068 == null) {
            for (final Field field8059 : this.getClass().getFields()) {
                if (field8059.isAnnotationPresent((Class<? extends Annotation>)Class1274.class) && this.Method19(field8059)) {
                    break;
                }
            }
        }
        if (this.Field8068 == null) {
            this.Field8068 = Class42::DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB;
        }
    }
    
    private boolean Method19(final Field field) {
        field.get(this);
        this.Field8068 = this::Method56;
        return false;
    }
    
    private void Method20() {
        if (this.Field8069 && Class1796.Field16241.Field16251 && null.Field11785.Method365()) {
            Class1393.Method5506().Method1882(TextFormatting.GRAY + "Module " + (this.Method35() ? TextFormatting.GREEN : TextFormatting.RED) + this.Method40() + TextFormatting.GRAY + " has been " + (this.Method35() ? "enabled" : "disabled") + "!");
        }
    }
    
    public void Method21(final boolean b) {
        if (this.Field8066) {
            return;
        }
        this.Method20();
        if (b) {
            this.Method36();
        }
        else {
            this.Method37();
        }
    }
    
    public void Method22() {
        if (this.Field8066) {
            return;
        }
        if (!this.Field8061) {
            this.Method36();
        }
        else {
            this.Method37();
        }
        this.Method20();
    }
    
    public Class44 Method23(final Class44 class44) {
        Class42.Field8053.Method7569(class44);
        return class44;
    }
    
    public Class1996 Method24(final Class1996 class1996) {
        Class42.Field8053.Method7569((Class44)class1996);
        return class1996;
    }
    
    public Class1303 Method25(final Class1303 class1303) {
        return (Class1303)this.Method23((Class44)class1303);
    }
    
    public Class941 Method26(final Class941 class941) {
        return (Class941)this.Method23(class941);
    }
    
    private boolean Method27() {
        return this.getClass().getAnnotation(Class794.class) != null;
    }
    
    private boolean Method28() {
        return this.getClass().getAnnotation(Class1270.class) != null;
    }
    
    private boolean Method29() {
        return this.getClass().getAnnotation(Class2012.class) != null;
    }
    
    public boolean Method30() {
        return this.Method29();
    }
    
    public String Method31() {
        return this.Field8055;
    }
    
    public void Method32(final String field8055) {
        this.Field8055 = field8055;
    }
    
    public int Method33() {
        return this.Field8057;
    }
    
    public void Method34(final int field8057) {
        this.Field8057 = field8057;
    }
    
    public boolean Method35() {
        return this.Field8061;
    }
    
    public final void Method36() {
        if (this.Field8061) {
            return;
        }
        this.Field8061 = true;
        this.Method38();
        if (this.Field8063) {
            MinecraftForge.EVENT_BUS.register((Object)this);
        }
        final Class1859 class1859 = this.getClass().getAnnotation(Class1859.class);
        if (class1859 == null) {
            return;
        }
        Class228.Method1290(class1859, (Object)this);
    }
    
    public final void Method37() {
        if (!this.Field8061) {
            return;
        }
        this.Field8061 = false;
        this.Method39();
        if (this.Field8063) {
            MinecraftForge.EVENT_BUS.unregister((Object)this);
        }
        final Class1859 class1859 = this.getClass().getAnnotation(Class1859.class);
        if (class1859 == null) {
            return;
        }
        Class228.Method1291(class1859, (Object)this);
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
        return (this.Field8067 == null) ? this.Field8056 : this.Field8067.get();
    }
    
    public void Method43(final String field8056) {
        this.Field8056 = field8056;
    }
    
    public void Method44(final Supplier field8067) {
        this.Field8067 = field8067;
    }
    
    public void Method45() {
    }
    
    public void Method46() {
    }
    
    public void Method47() {
    }
    
    public void Method48() {
    }
    
    public void Method49(final int n) {
    }
    
    public void Method50(final char c, final int n) {
    }
    
    @Override
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
    
    @NotNull
    @NotNull
    public Class955 Method12() {
        return this.Field8059;
    }
    
    public void Method13(@NotNull @NotNull final Class955 field8059) {
        this.Field8059 = field8059;
    }
    
    public boolean Method14() {
        return this.Field8065;
    }
    
    public void Method15(final boolean field8065) {
        this.Field8065 = field8065;
    }
    
    public int Method8() {
        return this.Field8057;
    }
    
    public void Method9(final int field8057) {
        this.Field8057 = field8057;
    }
    
    public int Method10() {
        return this.Field8058;
    }
    
    public void Method11(final int field8058) {
        this.Field8058 = field8058;
    }
    
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
    
    private EntityPlayer Method56(final Field field) {
        return (EntityPlayer)field.get(this);
    }
    
    static {
        Class42.Field8052 = Minecraft.getMinecraft();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x252F ^ 0x17));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
