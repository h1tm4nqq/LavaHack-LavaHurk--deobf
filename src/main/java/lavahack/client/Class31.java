//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class31
{
    private final Object Field7943;
    private final boolean Field7944;
    private String Field7945 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class31(final Object field7943, final boolean field7944) {
        this.Field7943 = field7943;
        this.Field7944 = field7944;
    }
    
    public Object Method249() {
        if (this.Field7944) {
            throw new IllegalStateException();
        }
        return this.Field7943;
    }
    
    public Object Method250(final Object o) {
        if (this.Field7944) {
            return o;
        }
        return this.Field7943;
    }
    
    public Object Method251() {
        if (this.Field7944) {
            return null;
        }
        return this.Field7943;
    }
}
