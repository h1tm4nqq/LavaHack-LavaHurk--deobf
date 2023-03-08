//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public abstract class Class1514
{
    protected int Field15082;
    protected int Field15083;
    protected int Field15084;
    protected int Field15085;
    protected Class1876 Field15086;
    private int Field15087;
    private int Field15088;
    private boolean Field15089;
    private int Field15090;
    
    public Class1514(final Class1876 field15086) {
        this.Field15086 = field15086;
    }
    
    public abstract void Method668();
    
    public abstract void Method669();
    
    public int Method670() {
        return 0;
    }
    
    public int Method671() {
        return this.Field15082;
    }
    
    public void Method672(final int field15082) {
        if (this.Field15082 != field15082) {
            this.Method680(true);
        }
        this.Field15082 = field15082;
    }
    
    public int Method673() {
        return this.Field15083;
    }
    
    public void Method674(final int field15083) {
        if (this.Field15083 != field15083) {
            this.Method680(true);
        }
        this.Field15083 = field15083;
    }
    
    public int Method675() {
        return this.Field15087;
    }
    
    public void Method676(final int field15087) {
        if (this.Field15087 != field15087) {
            this.Method680(true);
        }
        this.Field15087 = field15087;
    }
    
    public int Method677() {
        return this.Field15088;
    }
    
    public void Method678(final int field15088) {
        if (this.Field15088 != field15088) {
            this.Method680(true);
        }
        this.Field15088 = field15088;
    }
    
    public boolean Method679() {
        return this.Field15089;
    }
    
    public void Method680(final boolean field15089) {
        this.Field15089 = field15089;
    }
    
    public boolean Method681(final int n, final char c) {
        return false;
    }
    
    public boolean Method682(final int n, final int n2, final int n3, final boolean b) {
        return false;
    }
    
    public boolean Method683(final int n, final int n2, final boolean b) {
        return false;
    }
    
    public boolean Method684(final int n, final int n2, final int n3, final boolean b) {
        return false;
    }
    
    public boolean Method685(final int n) {
        return false;
    }
}
