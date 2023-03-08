//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.objectweb.asm.tree.*;

public class Class1387
{
    private final Class24[] Field14291;
    private String Field14292 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1387() {
        (this.Field14291 = new Class24[5])[0] = (Class24)new Class1221();
        this.Field14291[1] = (Class24)new Class1017();
        this.Field14291[2] = (Class24)new Class1009();
        this.Field14291[3] = (Class24)new Class1063();
        this.Field14291[4] = new Class282();
    }
    
    public byte[] Method5495(final byte[] array, final Class1790 class1790) {
        final ClassNode method5516 = Class1396.Method5516(array, new int[0]);
        final Class24[] field14291 = this.Field14291;
        for (int length = field14291.length, i = 0; i < length; ++i) {
            field14291[i].Method193(method5516, class1790);
        }
        return Class1396.Method5517(method5516, new int[0]);
    }
}
