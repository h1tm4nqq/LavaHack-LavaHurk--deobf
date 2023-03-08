//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

public abstract class Class1548 implements Class977
{
    private Class1683 Field15225;
    private String Field15226 = "TheKisDevs & LavaHack Development owns you";
    
    @Override
    public Class1333 Method2659(final Class1966 class1966, final Class26 class1967, final Class359 class1968) throws Class902 {
        return (Class1333)new Class1230();
    }
    
    @Override
    public void Method2660(final Class1966 class1966, final Class359 class1967, final Class1236 class1968) throws Class902 {
    }
    
    @Override
    public void Method2661(final Class1966 class1966, final Class359 class1967) throws Class902 {
    }
    
    @Override
    public void Method2669(final Class1966 class1966, final Class1926 class1967) {
        class1966.Method3325((Class1926)new Class1252((Class1683)class1967));
    }
    
    @Override
    public void Method2671(final Class1966 class1966, final Class1926 class1967) {
    }
    
    @Override
    public Class1683 Method2670(final Class1966 class1966) {
        if (this.Field15225 == null) {
            this.Field15225 = new Class1683();
        }
        return this.Field15225;
    }
}
