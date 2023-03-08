//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import java.util.*;

public class Class1215
{
    private String Field13502;
    private String Field13503;
    private String Field13504;
    private Color Field13505;
    private Class106 Field13506;
    private Class1798 Field13507;
    private Class1223 Field13508;
    private Class374 Field13509;
    private List Field13510;
    private int Field13511;
    
    public Class1215() {
        this.Field13510 = new ArrayList();
    }
    
    public String Method4895() {
        return this.Field13502;
    }
    
    public String Method4896() {
        return this.Field13503;
    }
    
    public String Method4897() {
        return this.Field13504;
    }
    
    public Color Method4898() {
        return this.Field13505;
    }
    
    public Class106 Method4899() {
        return this.Field13506;
    }
    
    public Class1798 Method4900() {
        return this.Field13507;
    }
    
    public Class1223 Method4901() {
        return this.Field13508;
    }
    
    public Class374 Method4902() {
        return this.Field13509;
    }
    
    public List Method4903() {
        return this.Field13510;
    }
    
    public Class1215 Method4904(final String field13502) {
        this.Field13502 = field13502;
        return this;
    }
    
    public Class1215 Method4905(final String field13503) {
        this.Field13503 = field13503;
        return this;
    }
    
    public Class1215 Method4906(final String field13504) {
        this.Field13504 = field13504;
        return this;
    }
    
    public Class1215 Method4907(final Color field13505) {
        this.Field13505 = field13505;
        return this;
    }
    
    public Class1215 Method4908(final String s, final String s2) {
        this.Field13506 = new Class106(this, s, s2, (Class1383)null);
        return this;
    }
    
    public Class1215 Method4909(final String s) {
        this.Field13507 = new Class1798(this, s, null);
        return this;
    }
    
    public Class1215 Method4910(final String s) {
        this.Field13508 = new Class1223(this, s, null);
        return this;
    }
    
    public Class1215 Method4911(final String s, final String s2, final String s3) {
        this.Field13509 = new Class374(this, s, s2, s3, null);
        return this;
    }
    
    public Class1215 Method4912(final String s, final String s2, final boolean b) {
        this.Field13510.add(new Class1184(this, s, s2, b, (Class1383)null));
        return this;
    }
    
    static Color Method4913(final Class1215 class1215) {
        return class1215.Field13505;
    }
}
