//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public abstract class Class1763
{
    private final Class[] Field16063;
    private String Field16064 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1763(final Class... field16063) {
        this.Field16063 = field16063;
    }
    
    protected abstract Object Method1725(final Class424 p0);
    
    public final Object Method1726(final Object... array) {
        return this.Method1725(new Class2021(array, this.Field16063));
    }
    
    public static Class2124 Method1727(final Class clazz, final Class... array) {
        return new Class2124(array);
    }
    
    public static Class2124 Method1728(final Class... array) {
        return new Class2124(array);
    }
    
    public static Class1763 Method1729(final Class clazz, final Object o) {
        return new Class1820(new Class[0], o);
    }
    
    public static Class1763 Method1730(final Class clazz, final Class735 class735) {
        return new Class1822(new Class[0], class735);
    }
}
