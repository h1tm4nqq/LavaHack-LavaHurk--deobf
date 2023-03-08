//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;

public class Class2125
{
    protected Class1240 Field17667;
    protected Color Field17668;
    protected Color Field17669;
    protected float Field17670;
    protected Class2008 Field17671;
    private int Field17672;
    
    protected Class2125() {
        this.Field17667 = null;
        this.Field17668 = Class815.Field11486.Method3625();
        this.Field17669 = Class815.Field11486.Method3625();
        this.Field17670 = 1.0f;
        this.Field17671 = null;
    }
    
    public static Class2125 Method7307() {
        return new Class2125();
    }
    
    public Class2125 Method7308(final Class1240 field17667) {
        this.Field17667 = field17667;
        return this;
    }
    
    public Class2125 Method7309(final AxisAlignedBB axisAlignedBB) {
        this.Field17667 = new Class1240(axisAlignedBB);
        return this;
    }
    
    public Class2125 Method7310(final BlockPos blockPos) {
        this.Field17667 = new Class1240(blockPos);
        return this;
    }
    
    public Class2125 Method7311(final Color field17668) {
        this.Field17668 = field17668;
        return this;
    }
    
    public Class2125 Method7312(final Class2027 class2027) {
        this.Field17668 = class2027.Method3625();
        return this;
    }
    
    public Class2125 Method7313(final Color field17668, final Color field17669) {
        this.Field17668 = field17668;
        this.Field17669 = field17669;
        return this;
    }
    
    public Class2125 Method7314(final Class2027 class2027, final Class2027 class2028) {
        this.Field17668 = class2027.Method3625();
        this.Field17669 = class2028.Method3625();
        return this;
    }
    
    public Class2125 Method7315(final float field17670) {
        this.Field17670 = field17670;
        return this;
    }
    
    public Class2125 Method7316(final Class2008 field17671) {
        this.Field17671 = field17671;
        return this;
    }
    
    public void Method7317() {
        if (this.Field17667 == null || this.Field17671 == null) {
            return;
        }
        Class815.Method3446(Class815.Method3447(this.Field17667.Method4989()), this.Field17670, new Class2027(this.Field17668), new Class2027(this.Field17669), this.Field17671);
    }
}
