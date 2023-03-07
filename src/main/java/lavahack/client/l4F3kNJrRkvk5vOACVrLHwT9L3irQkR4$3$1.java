//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.google.common.collect.AbstractIterator;
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$3;

class l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$3$1
extends AbstractIterator {
    private EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Field10866;
    private int Field10867;
    private int Field10868;
    private int Field10869;
    final l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$3 Field10870;
    private String Field10871 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$3$1(l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$3 var1_1) {
        this.Field10870 = var1_1;
        this.Field10866 = null;
    }

    protected EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Method2859() {
        if (this.Field10866 == null) {
            this.Field10867 = this.Field10870.Field9900.getX();
            this.Field10868 = this.Field10870.Field9900.getY();
            this.Field10869 = this.Field10870.Field9900.getZ();
            this.Field10866 = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(this.Field10867, this.Field10868, this.Field10869);
            return this.Field10866;
        }
        if (this.Field10866.equals(this.Field10870.Field9901)) {
            return (EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN)((Object)this.endOfData());
        }
        if (this.Field10868 < this.Field10870.Field9901.getY()) {
            this.Field10868 += (int)-875154474L ^ 0xCBD633D7;
        } else if (this.Field10867 < this.Field10870.Field9901.getX()) {
            this.Field10868 = this.Field10870.Field9900.getY();
            this.Field10867 += (int)-1198051516L ^ 0xB8972F45;
        } else if (this.Field10869 < this.Field10870.Field9901.getZ()) {
            this.Field10868 = this.Field10870.Field9900.getY();
            this.Field10867 = this.Field10870.Field9900.getX();
            this.Field10869 += (int)1340704864L ^ 0x4FE98861;
        }
        this.Field10866.Field7895 = this.Field10867;
        this.Field10866.Field7896 = this.Field10868;
        this.Field10866.Field7897 = this.Field10869;
        return this.Field10866;
    }

    protected Object Method2860() {
        return this.Method2859();
    }
}

