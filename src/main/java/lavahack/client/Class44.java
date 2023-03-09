/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class736;
import com.kisman.cc.util.Class886;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import lavahack.client.Class1193;
import lavahack.client.Class1373;
import lavahack.client.Class1796;
import lavahack.client.Class1929;
import lavahack.client.Class42;
import lavahack.client.Class467;
import lavahack.client.Class695;
import lavahack.client.Class955;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Class44
implements Class695 {
    public Supplier Field8073 = Class44::Method408;
    public boolean Field8074 = false;
    public Supplier Field8075 = Class44::Method407;
    private Class2027 Field8076;
    private Class2027 Field8077;
    private Entity Field8078;
    private int Field8079 = 0;
    private int Field8080 = 0;
    public int Field8081 = -1;
    public Class955 Field8082 = Class955.Field12068;
    public boolean Field8083 = false;
    private String Field8084;
    public Class42 Field8085;
    public Class44 Field8086 = null;
    public String Field8087 = "";
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
    private boolean Field8099 = false;
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
    private boolean Field8113 = false;
    private Class467 Field8114 = Class467.Field9944;
    public final HashMap Field8115 = new HashMap();
    private int Field8116;

    public Class44(String string) {
        this.Field8087 = string;
    }

    public Class44(String string, Class42 class42, int n) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string;
        this.Field8080 = n;
        this.Field8087 = "Bind";
    }

    public Class44(String string, Class42 class42, String string2, String string3, boolean bl) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string;
        this.Field8089 = string2;
        this.Field8091 = string3;
        this.Field8097 = false;
        this.Field8098 = false;
        this.Field8087 = "String";
    }

    public Class44(String string, Class42 class42, String string2, ArrayList arrayList) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string;
        this.Field8089 = string2;
        this.Field8090 = string2;
        this.Field8092 = arrayList;
        this.Field8093 = null;
        this.Field8087 = "Combo";
        this.Method304(arrayList);
    }

    public Class44(String string, Class42 class42, String string2, List list) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string;
        this.Field8089 = string2;
        this.Field8090 = string2;
        this.Field8092 = new ArrayList(list);
        this.Field8093 = null;
        this.Field8087 = "Combo";
        this.Method304(list);
    }

    public Class44(String string, Class42 class42, Enum enum_) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string;
        this.Field8090 = this.Field8089 = enum_.name();
        this.Field8092 = null;
        this.Field8093 = enum_;
        this.Field8099 = true;
        this.Field8087 = "Combo";
        this.Method304(Arrays.asList(Arrays.stream(enum_.getClass().getEnumConstants()).map(Enum::toString).toArray(Class44::Method406)));
    }

    public Class44(String string, Class42 class42, boolean bl) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string;
        this.Field8094 = bl;
        this.Field8095 = bl;
        this.Field8087 = "Check";
    }

    public Class44(String string, Class42 class42, double d, double d2, double d3, Class467 class467) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string;
        this.Field8100 = d;
        this.Field8101 = d;
        this.Field8102 = d2;
        this.Field8103 = d3;
        this.Field8113 = class467.equals((Object)Class467.Field9945);
        this.Field8087 = "Slider";
        this.Field8114 = class467;
    }

    public Class44(String string, Class42 class42, double d, double d2, double d3, boolean bl) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string;
        this.Field8100 = d;
        this.Field8101 = d;
        this.Field8102 = d2;
        this.Field8103 = d3;
        this.Field8113 = bl;
        this.Field8087 = "Slider";
        this.Field8114 = bl ? Class467.Field9945 : Class467.Field9944;
    }

    public Class44(String string, Class42 class42, String string2, Class2027 class2027) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string2;
        this.Field8076 = class2027;
        this.Field8077 = class2027;
        this.Field8087 = "ColorPicker";
    }

    public Class44(String string, Class42 class42, Class2027 class2027) {
        this(string, class42, string, class2027);
    }

    public Class44(String string, Class42 class42, String string2, Entity entity) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string2;
        this.Field8078 = entity;
        this.Field8087 = "Preview";
    }

    public Class44(String string, Class42 class42, String string2, ItemStack[] itemStackArray) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string2;
        this.Field8104 = itemStackArray;
        this.Field8087 = "Items";
    }

    public Class44(String string, Class42 class42) {
        this(string, class42, string);
    }

    public Class44(String string, Class42 class42, String string2) {
        this.Field8084 = string;
        this.Field8085 = class42;
        this.Field8088 = string2;
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
        if (!this.Method389()) return;
        this.Field8076 = this.Field8077;
    }

    public Class44 Method303(Supplier supplier) {
        this.Field8075 = supplier;
        this.Field8074 = true;
        return this;
    }

    protected void Method304(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            this.Field8115.put(string, new Class1929(string, Class955.Field12068, -1, -1, false));
        }
    }

    public Class44 Method305(String string) {
        return this.Method303((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi(java.lang.String ), ()Ljava/lang/String;)((String)string));
    }

    public String Method306() {
        if (!this.Field8074) return "";
        String string = (String)this.Field8075.get();
        return string;
    }

    public Enum Method307() {
        if (this.Field8093 == null) {
            return null;
        }
        Enum enum_ = this.Field8093;
        String[] stringArray = (String[])Arrays.stream(enum_.getClass().getEnumConstants()).map(Enum::toString).toArray(Class44::Method405);
        return Enum.valueOf(enum_.getClass(), stringArray[this.Field8079]);
    }

    public boolean equals(Object object) {
        if (!this.Method385()) return false;
        return this.Field8089.equals(object);
    }

    public String toString() {
        if (this.Method385()) {
            return this.Method359();
        }
        if (this.Method386()) {
            return String.valueOf(this.Method365());
        }
        if (this.Method387()) {
            double d;
            if (this.Field8113) {
                d = this.Method335();
                return String.valueOf(d);
            }
            d = this.Method367();
            return String.valueOf(d);
        }
        if (this.Method383()) {
            return this.Method359();
        }
        if (!this.Method389()) return super.toString();
        return Class736.Field11115.Method6139(this.Field8076);
    }

    public boolean Method308() {
        if (this.Field8080 != 0) return false;
        return true;
    }

    public boolean Method309(String string) {
        return this.Field8089.equalsIgnoreCase(string);
    }

    public boolean Method310(Enum enum_) {
        return this.Method309(enum_.toString());
    }

    public boolean Method311() {
        return (Boolean)this.Field8073.get();
    }

    public Class44 Method312(Class44 class44) {
        this.Field8073 = class44::Method365;
        return this;
    }

    public Class44 Method313(Supplier supplier) {
        this.Field8073 = supplier;
        return this;
    }

    public Class44 Method314(boolean bl) {
        this.Field8073 = () -> Class44.Method404(bl);
        return this;
    }

    public String[] Method315() {
        if (this.Field8099) return (String[])Arrays.stream(this.Field8093.getClass().getEnumConstants()).map(Enum::toString).toArray(Class44::Method403);
        return this.Field8092.toArray(new String[this.Field8092.size()]);
    }

    public ArrayList Method316() {
        return new ArrayList<String>(Arrays.asList(this.Method315()));
    }

    public String Method317(int n) {
        if (n == -1) return "";
        return this.Method315()[n];
    }

    public int Method318() {
        String[] stringArray = this.Method315();
        int n = 0;
        int n2 = 0;
        while (n2 < stringArray.length) {
            String string = stringArray[n2];
            if (string.equalsIgnoreCase(this.Field8089)) {
                n = n2;
            }
            ++n2;
        }
        return n;
    }

    public boolean Method319() {
        return this.Field8113;
    }

    public Class467 Method320() {
        return this.Field8114;
    }

    public void Method321(Class467 class467) {
        this.Field8114 = class467;
    }

    public float Method322() {
        return this.Field8109;
    }

    public void Method323(float f) {
        this.Field8109 = f;
    }

    public float Method324() {
        return this.Field8110;
    }

    public void Method325(float f) {
        this.Field8110 = f;
    }

    public float Method326() {
        return this.Field8111;
    }

    public void Method327(float f) {
        this.Field8111 = f;
    }

    public float Method328() {
        return this.Field8112;
    }

    public void Method329(float f) {
        this.Field8112 = f;
    }

    public boolean Method330() {
        return this.Field8098;
    }

    public Class44 Method331(boolean bl) {
        this.Field8098 = bl;
        return this;
    }

    public ItemStack[] Method332() {
        return this.Field8104;
    }

    public void Method333(ItemStack[] itemStackArray) {
        this.Field8104 = itemStackArray;
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

    public void Method338(int n) {
        this.Field8080 = n;
    }

    public Class2027 Method339() {
        return this.Field8076;
    }

    public void Method340(Class2027 class2027) {
        this.Field8076 = class2027;
        Class1193 class1193 = new Class1193(this);
        Class1796.Field16242.Method715(class1193);
    }

    public Enum Method341() {
        return Enum.valueOf(this.Field8093.getClass(), this.Field8089);
    }

    public void Method342(Enum enum_) {
        this.Field8089 = enum_.name();
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

    public void Method348(int n) {
        this.Field8105 = n;
    }

    public void Method349(int n) {
        this.Field8106 = n;
    }

    public void Method350(int n) {
        this.Field8107 = n;
    }

    public void Method351(int n) {
        this.Field8108 = n;
    }

    public int Method352() {
        return this.Field8079;
    }

    public void Method353(int n) {
        this.Field8079 = n;
    }

    public String Method354() {
        return this.Field8088;
    }

    public Class44 Method355(String string) {
        this.Field8088 = string;
        return this;
    }

    @Override
    @NotNull
    @NotNull
    public String Method16() {
        if (!this.Method380()) return "Bind";
        String string = this.Field8084;
        return string;
    }

    public String Method356() {
        return this.Field8084;
    }

    public Class44 Method357(String string) {
        this.Field8084 = string;
        return this;
    }

    public Class42 Method358() {
        return this.Field8085;
    }

    public String Method359() {
        return this.Field8089;
    }

    public Class44 Method360(String string) {
        this.Field8089 = string;
        Class1193 class1193 = new Class1193(this);
        Class1796.Field16242.Method715(class1193);
        return this;
    }

    public ArrayList Method361() {
        return this.Field8092;
    }

    public Class44 Method362(String ... stringArray) {
        this.Field8092 = new ArrayList<String>(Arrays.asList(stringArray));
        return this;
    }

    public Class44 Method363(List list) {
        this.Field8092 = new ArrayList(list);
        return this;
    }

    public Class44 Method364(Class42 class42) {
        Class1796.Field16241.Field16258.Method7569(this);
        return this;
    }

    public boolean Method365() {
        return this.Field8094;
    }

    public Class44 Method366(boolean bl) {
        this.Field8094 = bl;
        Class1193 class1193 = new Class1193(this);
        Class1796.Field16242.Method715(class1193);
        return this;
    }

    public double Method367() {
        if (!this.Field8113) return this.Field8100;
        this.Field8100 = (int)this.Field8100;
        return this.Field8100;
    }

    public float Method368() {
        if (!this.Field8113) return (float)this.Field8100;
        this.Field8100 = (int)this.Field8100;
        return (float)this.Field8100;
    }

    public long Method369() {
        if (!this.Field8113) return (long)this.Field8100;
        this.Field8100 = (int)this.Field8100;
        return (long)this.Field8100;
    }

    public Class44 Method370(double d) {
        this.Field8100 = d;
        Class1193 class1193 = new Class1193(this);
        Class1796.Field16242.Method715(class1193);
        return this;
    }

    public double Method371() {
        return this.Field8102;
    }

    public double Method372() {
        return this.Field8103;
    }

    public Class44 Method373(double d) {
        this.Field8102 = d;
        return this;
    }

    public Class44 Method374(double d) {
        this.Field8103 = d;
        return this;
    }

    public Class44 Method375(String string) {
        this.Field8114 = Class1373.Method5471(string);
        return this;
    }

    public boolean Method376() {
        return this.Field8096;
    }

    public void Method377(boolean bl) {
        this.Field8096 = bl;
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

    @Override
    @NotNull
    @NotNull
    public Class955 Method12() {
        return this.Field8082;
    }

    @Override
    public void Method13(@NotNull @NotNull Class955 class955) {
        this.Field8082 = class955;
    }

    @Override
    public boolean Method14() {
        return this.Field8083;
    }

    @Override
    public void Method15(boolean bl) {
        this.Field8083 = bl;
    }

    @Override
    public int Method8() {
        return this.Field8080;
    }

    @Override
    public void Method9(int n) {
        this.Field8080 = n;
    }

    @Override
    public int Method10() {
        return this.Field8081;
    }

    @Override
    public void Method11(int n) {
        this.Field8081 = n;
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

    private ArrayList Method398(Class44 class44) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("->" + class44.Method354());
        if (class44.Field8086 == null) return arrayList;
        arrayList.addAll(this.Method398(class44.Field8086));
        return arrayList;
    }

    public String Method399() {
        String string = this.Method358().Method40();
        if (this.Field8086 == null) return string + "->" + this.Method356();
        ArrayList arrayList = this.Method398(this.Field8086);
        Collections.reverse(arrayList);
        string = string + Class886.Method3708(arrayList);
        return string + "->" + this.Method356();
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

    private static String[] Method403(int n) {
        return new String[n];
    }

    private static Boolean Method404(boolean bl) {
        return bl;
    }

    private static String[] Method405(int n) {
        return new String[n];
    }

    private static String[] Method406(int n) {
        return new String[n];
    }

    private static String Method407() {
        return "";
    }

    private static Boolean Method408() {
        return true;
    }

    private static String Method409(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 123;
            cArray2[n] = (char)(cArray[n] ^ (0x5FFB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

