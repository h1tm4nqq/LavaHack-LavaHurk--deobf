/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1722;
import lavahack.client.Class1790;
import lavahack.client.Class24;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;

public class Class282
implements Class24 {
    private int Field9223;

    @Override
    public void Method193(ClassNode classNode, Class1790 class1790) {
        if (classNode.invisibleAnnotations != null) {
            for (AnnotationNode annotationNode : classNode.invisibleAnnotations) {
                this.Method1493(annotationNode, class1790);
            }
        }
        if (classNode.visibleAnnotations == null) return;
        Iterator<AnnotationNode> iterator = classNode.visibleAnnotations.iterator();
        while (iterator.hasNext()) {
            AnnotationNode annotationNode;
            annotationNode = iterator.next();
            this.Method1493(annotationNode, class1790);
        }
    }

    private void Method1493(AnnotationNode annotationNode, Class1790 class1790) {
        if (annotationNode.values == null) return;
        if (annotationNode.values.isEmpty()) {
            return;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(annotationNode.values.size());
        this.Method1494(annotationNode.values, arrayList, class1790);
        annotationNode.values = arrayList;
    }

    private void Method1494(List list, List list2, Class1790 class1790) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object instanceof Type) {
                object = Class1722.Method6586((Type)object, class1790);
            } else if (object instanceof List) {
                List list3 = (List)object;
                object = new ArrayList(list3.size());
                this.Method1494(list3, (List)object, class1790);
            }
            list2.add(object);
        }
    }
}

