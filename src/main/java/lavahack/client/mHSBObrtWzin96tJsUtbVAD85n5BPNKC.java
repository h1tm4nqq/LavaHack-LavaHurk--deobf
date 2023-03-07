/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.CtVtyQkWPun0wJTOiNCcP66ptb2oORzD;
import lavahack.client.OXnmHkicoKSXO07qPVZZlEOZLMS63HK3;
import lavahack.client.VKswaMs8Qxm0K4Sninx8F7JXZylB2itm;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;

public class mHSBObrtWzin96tJsUtbVAD85n5BPNKC
implements VKswaMs8Qxm0K4Sninx8F7JXZylB2itm {
    private int Field9223;

    @Override
    public void Method193(ClassNode classNode, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        if (classNode.invisibleAnnotations != null) {
            for (AnnotationNode annotationNode : classNode.invisibleAnnotations) {
                this.Method1493(annotationNode, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
            }
        }
        if (classNode.visibleAnnotations == null) return;
        Iterator<AnnotationNode> iterator = classNode.visibleAnnotations.iterator();
        while (iterator.hasNext()) {
            AnnotationNode annotationNode;
            annotationNode = iterator.next();
            this.Method1493(annotationNode, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
        }
    }

    private void Method1493(AnnotationNode annotationNode, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        if (annotationNode.values == null) return;
        if (annotationNode.values.isEmpty()) {
            return;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(annotationNode.values.size());
        this.Method1494(annotationNode.values, arrayList, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
        annotationNode.values = arrayList;
    }

    private void Method1494(List list, List list2, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object instanceof Type) {
                object = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6586((Type)object, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
            } else if (object instanceof List) {
                List list3 = (List)object;
                object = new ArrayList(list3.size());
                this.Method1494(list3, (List)object, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
            }
            list2.add(object);
        }
    }
}

