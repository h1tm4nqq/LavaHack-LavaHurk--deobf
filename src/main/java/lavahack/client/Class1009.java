//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.objectweb.asm.tree.*;
import java.util.*;

public class Class1009 implements Class24
{
    private int Field12389;
    
    @Override
    public void Method193(final ClassNode classNode, final Class1790 class1790) {
        for (final MethodNode methodNode : classNode.methods) {
            methodNode.desc = Class1722.Method6589(methodNode.desc, class1790);
            methodNode.name = Class1722.Method6582(null, methodNode.name, methodNode.desc, class1790);
            if (methodNode.signature != null) {
                methodNode.signature = Class1722.Method6590(methodNode.signature, class1790);
            }
            if (methodNode.tryCatchBlocks != null) {
                for (final TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
                    tryCatchBlockNode.type = class1790.Method6769().getOrDefault(tryCatchBlockNode.type, tryCatchBlockNode.type);
                }
            }
            if (methodNode.exceptions != null && !methodNode.exceptions.isEmpty()) {
                final ArrayList exceptions = new ArrayList<String>(methodNode.exceptions.size());
                for (final String s : methodNode.exceptions) {
                    exceptions.add(class1790.Method6769().getOrDefault(s, s));
                }
                methodNode.exceptions = exceptions;
            }
            if (methodNode.localVariables != null) {
                for (final LocalVariableNode localVariableNode : methodNode.localVariables) {
                    localVariableNode.desc = Class1722.Method6589(localVariableNode.desc, class1790);
                    if (localVariableNode.signature != null) {
                        localVariableNode.signature = Class1722.Method6590(localVariableNode.signature, class1790);
                    }
                }
            }
        }
    }
}
