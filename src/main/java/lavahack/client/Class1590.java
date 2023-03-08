//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public abstract class Class1590
{
    private final String Field15437;
    private final Class1763 Field15438;
    private int Field15439;
    
    public Class1590(final String field15437, final Class1763 field15438) {
        this.Field15437 = field15437;
        this.Field15438 = field15438;
    }
    
    public final String Method6245() {
        return this.Field15437;
    }
    
    public final Class1763 Method6246() {
        return this.Field15438;
    }
    
    public abstract Class1590[] Method6247();
    
    public Class1590 Method6248(final String anObject) {
        for (final Class1590 class1590 : this.Method6247()) {
            if (class1590.Field15437.equals(anObject)) {
                return class1590;
            }
        }
        return null;
    }
}
