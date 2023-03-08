//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.objectweb.asm.tree.*;
import java.util.*;

public class Class1221 implements Class24
{
    private int Field13538;
    
    @Override
    public void Method193(final ClassNode classNode, final Class1790 class1790) {
        if (classNode.superName != null) {
            classNode.superName = class1790.Method6769().getOrDefault(classNode.superName, classNode.superName);
        }
        if (classNode.interfaces != null && !classNode.interfaces.isEmpty()) {
            final ArrayList<String> interfaces = new ArrayList<String>(classNode.interfaces.size());
            for (final String s : classNode.interfaces) {
                interfaces.add(class1790.Method6769().getOrDefault(s, s));
            }
            classNode.interfaces = interfaces;
        }
        if (classNode.signature != null) {
            classNode.signature = Class1722.Method6590(classNode.signature, class1790);
        }
    }
}
