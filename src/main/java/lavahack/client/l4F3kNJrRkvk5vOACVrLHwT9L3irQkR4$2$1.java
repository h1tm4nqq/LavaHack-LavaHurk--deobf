//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.google.common.collect.AbstractIterator;
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$2;

class l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$2$1
extends AbstractIterator {
    private EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Field13577;
    private int Field13578;
    private int Field13579;
    private int Field13580;
    final l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$2 Field13581;
    private String Field13582 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$2$1(l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$2 var1_1) {
        this.Field13581 = var1_1;
        this.Field13577 = null;
    }

    protected EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Method4945() {
        if (this.Field13577 == null) {
            this.Field13578 = this.Field13581.Field9903.getX();
            this.Field13579 = this.Field13581.Field9903.getY();
            this.Field13580 = this.Field13581.Field9903.getZ();
            this.Field13577 = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(this.Field13578, this.Field13579, this.Field13580);
            return this.Field13577;
        }
        if (this.Field13577.equals(this.Field13581.Field9904)) {
            return (EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN)((Object)this.endOfData());
        }
        if (this.Field13578 < this.Field13581.Field9904.getX()) {
            this.Field13578 += (int)((long)398359375 ^ (long)398359374);
        } else if (this.Field13580 < this.Field13581.Field9904.getZ()) {
            this.Field13578 = this.Field13581.Field9903.getX();
            this.Field13580 += (int)-1904979763L ^ 0x8E7450CC;
        } else if (this.Field13579 < this.Field13581.Field9904.getY()) {
            this.Field13578 = this.Field13581.Field9903.getX();
            this.Field13580 = this.Field13581.Field9903.getZ();
            this.Field13579 += (int)((long)1141070950 ^ (long)1141070951);
        }
        this.Field13577.Field7895 = this.Field13578;
        this.Field13577.Field7896 = this.Field13579;
        this.Field13577.Field7897 = this.Field13580;
        return this.Field13577;
    }

    protected Object Method4946() {
        return this.Method4945();
    }
}

