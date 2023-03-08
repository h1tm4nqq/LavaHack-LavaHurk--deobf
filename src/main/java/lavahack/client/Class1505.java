//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public abstract class Class1505
{
    private final Class[] Field15052;
    private Class798 Field15053;
    private String Field15054 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1505(final Class... field15052) {
        this.Field15052 = field15052;
    }
    
    public Class798 Method3848() {
        return this.Field15053;
    }
    
    public void Method3849(final Class798 field15053) {
        this.Field15053 = field15053;
    }
    
    protected abstract Object Method3850(final Class424 p0);
    
    public final Object Method3851(final Object... array) {
        return this.Method3850(this.Field15053.Method3313(array, this.Field15052));
    }
    
    public static Class269 Method3852(final Class clazz, final Class... array) {
        return new Class269(array);
    }
    
    public static Class269 Method3853(final Class... array) {
        return new Class269(array);
    }
    
    public static Class1505 Method3854(final Class clazz, final Object o) {
        return new Class1545(new Class[0], o);
    }
    
    public static Class1505 Method3855(final Class clazz, final Class584 class584) {
        return new Class1544(new Class[0], class584);
    }
}
