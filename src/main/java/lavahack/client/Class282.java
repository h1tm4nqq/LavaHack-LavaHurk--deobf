//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.objectweb.asm.tree.*;
import java.util.*;
import org.objectweb.asm.*;

public class Class282 implements Class24
{
    private int Field9223;
    
    public void Method193(final ClassNode classNode, final Class1790 class1790) {
        if (classNode.invisibleAnnotations != null) {
            final Iterator<AnnotationNode> iterator = classNode.invisibleAnnotations.iterator();
            while (iterator.hasNext()) {
                this.Method1493(iterator.next(), class1790);
            }
        }
        if (classNode.visibleAnnotations != null) {
            final Iterator<AnnotationNode> iterator2 = classNode.visibleAnnotations.iterator();
            while (iterator2.hasNext()) {
                this.Method1493(iterator2.next(), class1790);
            }
        }
    }
    
    private void Method1493(final AnnotationNode annotationNode, final Class1790 class1790) {
        if (annotationNode.values == null || annotationNode.values.isEmpty()) {
            return;
        }
        final ArrayList values = new ArrayList(annotationNode.values.size());
        this.Method1494(annotationNode.values, values, class1790);
        annotationNode.values = values;
    }
    
    private void Method1494(final List list, final List list2, final Class1790 class1790) {
        for (Object o : list) {
            if (o instanceof Type) {
                o = Class1722.Method6586((Type)o, class1790);
            }
            else if (o instanceof List) {
                final List list3 = (List)o;
                o = new ArrayList(list3.size());
                this.Method1494(list3, (List)o, class1790);
            }
            list2.add(o);
        }
    }
}
