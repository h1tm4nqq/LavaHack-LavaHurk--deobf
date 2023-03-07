//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.google.common.collect.AbstractIterator;
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$1;

class l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$1$1
extends AbstractIterator {
    private EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Field16435;
    private int Field16436;
    private int Field16437;
    private int Field16438;
    final l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$1 Field16439;
    private String Field16440 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$1$1(l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$1 var1_1) {
        this.Field16439 = var1_1;
        this.Field16435 = null;
    }

    protected EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Method6881() {
        if (this.Field16435 == null) {
            this.Field16436 = this.Field16439.Field9897.getX();
            this.Field16437 = this.Field16439.Field9897.getY();
            this.Field16438 = this.Field16439.Field9897.getZ();
            this.Field16435 = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(this.Field16436, this.Field16437, this.Field16438);
            return this.Field16435;
        }
        if (this.Field16435.equals(this.Field16439.Field9898)) {
            return (EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN)((Object)this.endOfData());
        }
        if (this.Field16436 < this.Field16439.Field9898.getX()) {
            this.Field16436 += (int)-262283940L ^ 0xF05DDD5D;
        } else if (this.Field16437 < this.Field16439.Field9898.getY()) {
            this.Field16436 = this.Field16439.Field9897.getX();
            this.Field16437 += (int)((long)-1144302641 ^ (long)-1144302642);
        } else if (this.Field16438 < this.Field16439.Field9898.getZ()) {
            this.Field16436 = this.Field16439.Field9897.getX();
            this.Field16437 = this.Field16439.Field9897.getY();
            this.Field16438 += (int)1386099951L ^ 0x529E34EE;
        }
        this.Field16435.Field7895 = this.Field16436;
        this.Field16435.Field7896 = this.Field16437;
        this.Field16435.Field7897 = this.Field16438;
        return this.Field16435;
    }

    protected Object Method6882() {
        return this.Method6881();
    }
}

