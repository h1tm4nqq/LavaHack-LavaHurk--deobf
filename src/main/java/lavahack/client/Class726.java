//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import net.minecraft.entity.player.*;

public class Class726
{
    public static Class726 Field11086;
    private ArrayList Field11087;
    private String Field11088 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class726() {
        this.Field11087 = new ArrayList();
        Class726.Field11086 = this;
    }
    
    public ArrayList Method3039() {
        return this.Field11087;
    }
    
    public void Method3040(final String s) {
        if (!this.Field11087.contains(s.toLowerCase())) {
            this.Field11087.add(s.toLowerCase());
            Class1796.Field16242.Method715(new Class1477(s.toLowerCase(), Class96.Field8334));
        }
    }
    
    public void Method3041(final String s) {
        if (!this.Field11087.isEmpty() && this.Field11087.contains(s.toLowerCase())) {
            this.Field11087.remove(s.toLowerCase());
            Class1796.Field16242.Method715(new Class1477(s.toLowerCase(), Class96.Field8335));
        }
    }
    
    public boolean Method3042(final EntityPlayer entityPlayer) {
        return this.Field11087.contains(entityPlayer.getName().toLowerCase()) && null.Field11779.Method365();
    }
    
    public boolean Method3043(final String s) {
        return this.Field11087.contains(s.toLowerCase()) && null.Field11779.Method365();
    }
    
    public void Method3044(final ArrayList field11087) {
        this.Field11087 = field11087;
    }
}
