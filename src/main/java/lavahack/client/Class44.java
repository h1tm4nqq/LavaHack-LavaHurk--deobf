//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.item.*;
import java.util.function.*;
import org.jetbrains.annotations.*;
import java.util.*;
import com.kisman.cc.util.*;

public class Class44 implements Class695
{
    public Supplier Field8073;
    public boolean Field8074;
    public Supplier Field8075;
    private Class2027 Field8076;
    private Class2027 Field8077;
    private Entity Field8078;
    private int Field8079;
    private int Field8080;
    public int Field8081;
    public Class955 Field8082;
    public boolean Field8083;
    private String Field8084;
    public Class42 Field8085;
    public Class44 Field8086;
    public String Field8087;
    private String Field8088;
    private String Field8089;
    private String Field8090;
    private String Field8091;
    private ArrayList Field8092;
    public Enum Field8093;
    private boolean Field8094;
    private boolean Field8095;
    private boolean Field8096;
    private boolean Field8097;
    private boolean Field8098;
    private boolean Field8099;
    private double Field8100;
    private double Field8101;
    private double Field8102;
    private double Field8103;
    private ItemStack[] Field8104;
    private int Field8105;
    private int Field8106;
    private int Field8107;
    private int Field8108;
    private float Field8109;
    private float Field8110;
    private float Field8111;
    private float Field8112;
    private boolean Field8113;
    private Class467 Field8114;
    public final HashMap Field8115;
    private int Field8116;
    
    public Class44(final String field8087) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8087 = field8087;
    }
    
    public Class44(final String s, final Class42 field8085, final int field8086) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = s;
        this.Field8085 = field8085;
        this.Field8088 = s;
        this.Field8080 = field8086;
        this.Field8087 = "Bind";
    }
    
    public Class44(final String s, final Class42 field8085, final String field8086, final String field8087, final boolean b) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = s;
        this.Field8085 = field8085;
        this.Field8088 = s;
        this.Field8089 = field8086;
        this.Field8091 = field8087;
        this.Field8097 = false;
        this.Field8098 = false;
        this.Field8087 = "String";
    }
    
    public Class44(final String s, final Class42 field8085, final String s2, final ArrayList field8086) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = s;
        this.Field8085 = field8085;
        this.Field8088 = s;
        this.Field8089 = s2;
        this.Field8090 = s2;
        this.Field8092 = field8086;
        this.Field8093 = null;
        this.Field8087 = "Combo";
        this.Method304(field8086);
    }
    
    public Class44(final String s, final Class42 field8085, final String s2, final List c) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = s;
        this.Field8085 = field8085;
        this.Field8088 = s;
        this.Field8089 = s2;
        this.Field8090 = s2;
        this.Field8092 = new ArrayList(c);
        this.Field8093 = null;
        this.Field8087 = "Combo";
        this.Method304(c);
    }
    
    public Class44(final String s, final Class42 field8085, final Enum field8086) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = s;
        this.Field8085 = field8085;
        this.Field8088 = s;
        this.Field8089 = field8086.name();
        this.Field8090 = this.Field8089;
        this.Field8092 = null;
        this.Field8093 = field8086;
        this.Field8099 = true;
        this.Field8087 = "Combo";
        this.Method304(Arrays.asList((Object[])Arrays.stream(field8086.getClass().getEnumConstants()).map((Function<? super Enum, ?>)Enum::toString).toArray((IntFunction<T[]>)Class44::Method406)));
    }
    
    public Class44(final String s, final Class42 field8085, final boolean b) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = s;
        this.Field8085 = field8085;
        this.Field8088 = s;
        this.Field8094 = b;
        this.Field8095 = b;
        this.Field8087 = "Check";
    }
    
    public Class44(final String s, final Class42 field8085, final double n, final double field8086, final double field8087, final Class467 field8088) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = s;
        this.Field8085 = field8085;
        this.Field8088 = s;
        this.Field8100 = n;
        this.Field8101 = n;
        this.Field8102 = field8086;
        this.Field8103 = field8087;
        this.Field8113 = field8088.equals(Class467.Field9945);
        this.Field8087 = "Slider";
        this.Field8114 = field8088;
    }
    
    public Class44(final String s, final Class42 field8085, final double n, final double field8086, final double field8087, final boolean field8088) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = s;
        this.Field8085 = field8085;
        this.Field8088 = s;
        this.Field8100 = n;
        this.Field8101 = n;
        this.Field8102 = field8086;
        this.Field8103 = field8087;
        this.Field8113 = field8088;
        this.Field8087 = "Slider";
        this.Field8114 = (field8088 ? Class467.Field9945 : Class467.Field9944);
    }
    
    public Class44(final String field8084, final Class42 field8085, final String field8086, final Class2027 class2027) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = field8084;
        this.Field8085 = field8085;
        this.Field8088 = field8086;
        this.Field8076 = class2027;
        this.Field8077 = class2027;
        this.Field8087 = "ColorPicker";
    }
    
    public Class44(final String s, final Class42 class42, final Class2027 class43) {
        this(s, class42, s, class43);
    }
    
    public Class44(final String field8084, final Class42 field8085, final String field8086, final Entity field8087) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = field8084;
        this.Field8085 = field8085;
        this.Field8088 = field8086;
        this.Field8078 = field8087;
        this.Field8087 = "Preview";
    }
    
    public Class44(final String field8084, final Class42 field8085, final String field8086, final ItemStack[] field8087) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = field8084;
        this.Field8085 = field8085;
        this.Field8088 = field8086;
        this.Field8104 = field8087;
        this.Field8087 = "Items";
    }
    
    public Class44(final String s, final Class42 class42) {
        this(s, class42, s);
    }
    
    public Class44(final String field8084, final Class42 field8085, final String field8086) {
        this.Field8073 = Class44::Method408;
        this.Field8074 = false;
        this.Field8075 = Class44::Method407;
        this.Field8079 = 0;
        this.Field8080 = 0;
        this.Field8081 = -1;
        this.Field8082 = Class955.Field12068;
        this.Field8083 = false;
        this.Field8086 = null;
        this.Field8087 = "";
        this.Field8099 = false;
        this.Field8113 = false;
        this.Field8114 = Class467.Field9944;
        this.Field8115 = new HashMap();
        this.Field8084 = field8084;
        this.Field8085 = field8085;
        this.Field8088 = field8086;
    }
    
    public void Method302() {
        if (this.Method385()) {
            this.Field8089 = this.Field8090;
        }
        if (this.Method386()) {
            this.Field8094 = this.Field8095;
        }
        if (this.Method387()) {
            this.Field8100 = this.Field8101;
        }
        if (this.Method389()) {
            this.Field8076 = this.Field8077;
        }
    }
    
    public Class44 Method303(final Supplier field8075) {
        this.Field8075 = field8075;
        this.Field8074 = true;
        return this;
    }
    
    protected void Method304(final List list) {
        for (final String key : list) {
            this.Field8115.put(key, new Class1929(key, Class955.Field12068, -1, -1, false));
        }
    }
    
    public Class44 Method305(final String s) {
        return this.Method303(Class44::vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi);
    }
    
    public String Method306() {
        return this.Field8074 ? this.Field8075.get() : "";
    }
    
    public Enum Method307() {
        if (this.Field8093 == null) {
            return null;
        }
        final Enum field8093 = this.Field8093;
        return (Enum)Enum.valueOf(field8093.getClass(), Arrays.stream(field8093.getClass().getEnumConstants()).map((Function<? super Enum, ?>)Enum::toString).toArray(Class44::Method405)[this.Field8079]);
    }
    
    @Override
    public boolean equals(final Object anObject) {
        return this.Method385() && this.Field8089.equals(anObject);
    }
    
    @Override
    public String toString() {
        if (this.Method385()) {
            return this.Method359();
        }
        if (this.Method386()) {
            return String.valueOf(this.Method365());
        }
        if (this.Method387()) {
            return String.valueOf(this.Field8113 ? this.Method335() : this.Method367());
        }
        if (this.Method383()) {
            return this.Method359();
        }
        if (this.Method389()) {
            return Class736.Field11115.Method6139(this.Field8076);
        }
        return super.toString();
    }
    
    public boolean Method308() {
        return this.Field8080 == 0;
    }
    
    public boolean Method309(final String anotherString) {
        return this.Field8089.equalsIgnoreCase(anotherString);
    }
    
    public boolean Method310(final Enum enum1) {
        return this.Method309(enum1.toString());
    }
    
    public boolean Method311() {
        return this.Field8073.get();
    }
    
    public Class44 Method312(final Class44 class44) {
        this.Field8073 = class44::Method365;
        return this;
    }
    
    public Class44 Method313(final Supplier field8073) {
        this.Field8073 = field8073;
        return this;
    }
    
    public Class44 Method314(final boolean b) {
        this.Field8073 = Class44::Method404;
        return this;
    }
    
    public String[] Method315() {
        if (!this.Field8099) {
            return this.Field8092.toArray(new String[this.Field8092.size()]);
        }
        return Arrays.stream(this.Field8093.getClass().getEnumConstants()).map((Function<? super Enum, ?>)Enum::toString).toArray(Class44::Method403);
    }
    
    public ArrayList Method316() {
        return new ArrayList((Collection<? extends E>)Arrays.asList(this.Method315()));
    }
    
    public String Method317(final int n) {
        if (n != -1) {
            return this.Method315()[n];
        }
        return "";
    }
    
    public int Method318() {
        final String[] method315 = this.Method315();
        int n = 0;
        for (int i = 0; i < method315.length; ++i) {
            if (method315[i].equalsIgnoreCase(this.Field8089)) {
                n = i;
            }
        }
        return n;
    }
    
    public boolean Method319() {
        return this.Field8113;
    }
    
    public Class467 Method320() {
        return this.Field8114;
    }
    
    public void Method321(final Class467 field8114) {
        this.Field8114 = field8114;
    }
    
    public float Method322() {
        return this.Field8109;
    }
    
    public void Method323(final float field8109) {
        this.Field8109 = field8109;
    }
    
    public float Method324() {
        return this.Field8110;
    }
    
    public void Method325(final float field8110) {
        this.Field8110 = field8110;
    }
    
    public float Method326() {
        return this.Field8111;
    }
    
    public void Method327(final float field8111) {
        this.Field8111 = field8111;
    }
    
    public float Method328() {
        return this.Field8112;
    }
    
    public void Method329(final float field8112) {
        this.Field8112 = field8112;
    }
    
    public boolean Method330() {
        return this.Field8098;
    }
    
    public Class44 Method331(final boolean field8098) {
        this.Field8098 = field8098;
        return this;
    }
    
    public ItemStack[] Method332() {
        return this.Field8104;
    }
    
    public void Method333(final ItemStack[] field8104) {
        this.Field8104 = field8104;
    }
    
    public Entity Method334() {
        return this.Field8078;
    }
    
    public int Method335() {
        return (int)this.Field8100;
    }
    
    public boolean Method336() {
        return this.Field8097;
    }
    
    public int Method337() {
        return this.Field8080;
    }
    
    public void Method338(final int field8080) {
        this.Field8080 = field8080;
    }
    
    public Class2027 Method339() {
        return this.Field8076;
    }
    
    public void Method340(final Class2027 field8076) {
        this.Field8076 = field8076;
        Class1796.Field16242.Method715(new Class1193(this));
    }
    
    public Enum Method341() {
        final Enum field8093 = this.Field8093;
        return (Enum)Enum.valueOf(this.Field8093.getClass(), this.Field8089);
    }
    
    public void Method342(final Enum enum1) {
        this.Field8089 = enum1.name();
    }
    
    public String Method343() {
        return this.Field8091;
    }
    
    public int Method344() {
        return this.Field8105;
    }
    
    public int Method345() {
        return this.Field8106;
    }
    
    public int Method346() {
        return this.Field8107;
    }
    
    public int Method347() {
        return this.Field8108;
    }
    
    public void Method348(final int field8105) {
        this.Field8105 = field8105;
    }
    
    public void Method349(final int field8106) {
        this.Field8106 = field8106;
    }
    
    public void Method350(final int field8107) {
        this.Field8107 = field8107;
    }
    
    public void Method351(final int field8108) {
        this.Field8108 = field8108;
    }
    
    public int Method352() {
        return this.Field8079;
    }
    
    public void Method353(final int field8079) {
        this.Field8079 = field8079;
    }
    
    public String Method354() {
        return this.Field8088;
    }
    
    public Class44 Method355(final String field8088) {
        this.Field8088 = field8088;
        return this;
    }
    
    @NotNull
    @NotNull
    @Override
    public String Method16() {
        return this.Method380() ? this.Field8084 : "Bind";
    }
    
    public String Method356() {
        return this.Field8084;
    }
    
    public Class44 Method357(final String field8084) {
        this.Field8084 = field8084;
        return this;
    }
    
    public Class42 Method358() {
        return this.Field8085;
    }
    
    public String Method359() {
        return this.Field8089;
    }
    
    public Class44 Method360(final String field8089) {
        this.Field8089 = field8089;
        Class1796.Field16242.Method715(new Class1193(this));
        return this;
    }
    
    public ArrayList Method361() {
        return this.Field8092;
    }
    
    public Class44 Method362(final String... a) {
        this.Field8092 = new ArrayList((Collection<? extends E>)Arrays.asList(a));
        return this;
    }
    
    public Class44 Method363(final List c) {
        this.Field8092 = new ArrayList(c);
        return this;
    }
    
    public Class44 Method364(final Class42 class42) {
        Class1796.Field16241.Field16258.Method7569(this);
        return this;
    }
    
    public boolean Method365() {
        return this.Field8094;
    }
    
    public Class44 Method366(final boolean field8094) {
        this.Field8094 = field8094;
        Class1796.Field16242.Method715(new Class1193(this));
        return this;
    }
    
    public double Method367() {
        if (this.Field8113) {
            this.Field8100 = (int)this.Field8100;
        }
        return this.Field8100;
    }
    
    public float Method368() {
        if (this.Field8113) {
            this.Field8100 = (int)this.Field8100;
        }
        return (float)this.Field8100;
    }
    
    public long Method369() {
        if (this.Field8113) {
            this.Field8100 = (int)this.Field8100;
        }
        return (long)this.Field8100;
    }
    
    public Class44 Method370(final double field8100) {
        this.Field8100 = field8100;
        Class1796.Field16242.Method715(new Class1193(this));
        return this;
    }
    
    public double Method371() {
        return this.Field8102;
    }
    
    public double Method372() {
        return this.Field8103;
    }
    
    public Class44 Method373(final double field8102) {
        this.Field8102 = field8102;
        return this;
    }
    
    public Class44 Method374(final double field8103) {
        this.Field8103 = field8103;
        return this;
    }
    
    public Class44 Method375(final String s) {
        this.Field8114 = Class1373.Method5471(s);
        return this;
    }
    
    public boolean Method376() {
        return this.Field8096;
    }
    
    public void Method377(final boolean field8096) {
        this.Field8096 = field8096;
    }
    
    public boolean Method378() {
        return this.Field8087.equalsIgnoreCase("Items");
    }
    
    public boolean Method379() {
        return this.Field8087.equalsIgnoreCase("Preview");
    }
    
    public boolean Method380() {
        return this.Field8087.equalsIgnoreCase("Bind");
    }
    
    public boolean Method381() {
        return this.Field8087.equalsIgnoreCase("Category");
    }
    
    public boolean Method382() {
        return this.Field8087.equalsIgnoreCase("Group");
    }
    
    public boolean Method383() {
        return this.Field8087.equalsIgnoreCase("String");
    }
    
    public boolean Method384() {
        return this.Field8087.equalsIgnoreCase("Void");
    }
    
    public boolean Method385() {
        return this.Field8087.equalsIgnoreCase("Combo");
    }
    
    public boolean Method386() {
        return this.Field8087.equalsIgnoreCase("Check");
    }
    
    public boolean Method387() {
        return this.Field8087.equalsIgnoreCase("Slider");
    }
    
    public boolean Method388() {
        return this.Field8087.equalsIgnoreCase("Line");
    }
    
    public boolean Method389() {
        return this.Field8087.equalsIgnoreCase("ColorPicker");
    }
    
    public boolean Method390() {
        return this.Field8113;
    }
    
    @NotNull
    @NotNull
    @Override
    public Class955 Method12() {
        return this.Field8082;
    }
    
    @Override
    public void Method13(@NotNull @NotNull final Class955 field8082) {
        this.Field8082 = field8082;
    }
    
    @Override
    public boolean Method14() {
        return this.Field8083;
    }
    
    @Override
    public void Method15(final boolean field8083) {
        this.Field8083 = field8083;
    }
    
    @Override
    public int Method8() {
        return this.Field8080;
    }
    
    @Override
    public void Method9(final int field8080) {
        this.Field8080 = field8080;
    }
    
    @Override
    public int Method10() {
        return this.Field8081;
    }
    
    @Override
    public void Method11(final int field8081) {
        this.Field8081 = field8081;
    }
    
    public Supplier Method391() {
        return this::Method402;
    }
    
    public Supplier Method392() {
        return this::Method335;
    }
    
    public Supplier Method393() {
        return this::Method401;
    }
    
    public Supplier Method394() {
        return this::Method368;
    }
    
    public Supplier Method395() {
        return this::Method369;
    }
    
    public Supplier Method396() {
        return this::Method341;
    }
    
    public Supplier Method397() {
        return this::Method400;
    }
    
    private ArrayList Method398(final Class44 class44) {
        final ArrayList<String> list = new ArrayList<String>();
        list.add("->" + class44.Method354());
        if (class44.Field8086 != null) {
            list.addAll(this.Method398(class44.Field8086));
        }
        return list;
    }
    
    public String Method399() {
        String s = this.Method358().Method40();
        if (this.Field8086 != null) {
            final ArrayList method398 = this.Method398(this.Field8086);
            Collections.reverse(method398);
            s += Class886.Method3708((List)method398);
        }
        return s + "->" + this.Method356();
    }
    
    private Boolean Method400() {
        return this.Field8094;
    }
    
    private Double Method401() {
        return this.Field8100;
    }
    
    private String Method402() {
        return this.Field8089;
    }
    
    private static String[] Method403(final int n) {
        return new String[n];
    }
    
    private static Boolean Method404(final boolean b) {
        return b;
    }
    
    private static String[] Method405(final int n) {
        return new String[n];
    }
    
    private static String[] Method406(final int n) {
        return new String[n];
    }
    
    private static String Method407() {
        return "";
    }
    
    private static Boolean Method408() {
        return true;
    }
    
    private static String Method409(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5FFB ^ 0x7B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
